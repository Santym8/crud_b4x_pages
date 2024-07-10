B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Public ApiUrl As String
End Sub

' Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	ApiUrl = "https://utn-cloud-animales.azurewebsites.net/api/Animals"
End Sub

Public Sub Create(animal As Animal) As ResumableSub
	Dim json As JSONGenerator
	json.Initialize(CreateMap("nombre": animal.nombre, "especieId": animal.especieId))

	Dim apijob As HttpJob
	apijob.Initialize("", Me)
	apijob.PostString(ApiUrl, json.ToString)
	apijob.GetRequest.SetContentType("application/json")

	wait for (apijob) JobDone(resultado As HttpJob)

	If resultado.Success = False Then
		Log("Error: " & resultado.ErrorMessage)
		Return Null
	End If

	Dim jsonParser As JSONParser
	jsonParser.Initialize(resultado.GetString)
	Dim map As Map = jsonParser.NextObject

	animal.id = map.Get("id")
	animal.nombre = map.Get("nombre")
	animal.especieId = map.Get("especieId")

	Return animal
End Sub

Public Sub ReadById(id As Int) As ResumableSub
	Dim animal As Animal
	animal.Initialize

	Dim apijob As HttpJob
	apijob.Initialize("", Me)
	apijob.Download(ApiUrl & "/" & id)
	Wait For (apijob) JobDone(resultado As HttpJob)

	If resultado.Success = False Then
		Log("Error: " & resultado.ErrorMessage)
		Return Null
	End If

	Dim jsonParser As JSONParser
	jsonParser.Initialize(resultado.GetString)
	Dim map As Map = jsonParser.NextObject

	animal.id = map.Get("id")
	animal.nombre = map.Get("nombre")
	animal.especieId = map.Get("especieId")

	Return animal
End Sub

Public Sub Update(id As Int, animal As Animal) As ResumableSub
	Dim json As JSONGenerator
	json.Initialize(CreateMap("id": animal.id, "nombre": animal.nombre, "especieId": animal.especieId))

	Dim apijob As HttpJob
	apijob.Initialize("", Me)
	apijob.PutString(ApiUrl & "/" & id, json.ToString)
	apijob.GetRequest.SetContentType("application/json")

	wait for (apijob) JobDone(resultado As HttpJob)

	If resultado.Success = False Then
		Log("Error: " & resultado.ErrorMessage)
	End If

	Return resultado.Success
End Sub

Public Sub Delete(id As Int) As ResumableSub
	Dim apijob As HttpJob
	apijob.Initialize("", Me)
	apijob.Delete(ApiUrl & "/" & id)
	Wait For (apijob) JobDone(resultado As HttpJob)

	If resultado.Success = False Then
		Log("Error: " & resultado.ErrorMessage)
	End If

	Return resultado.Success
End Sub
