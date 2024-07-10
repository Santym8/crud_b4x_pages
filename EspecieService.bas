B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private jsonParser As JSONParser
	Private apijob As HttpJob
	Public ApiUrl As String
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	ApiUrl = "https://utn-cloud-animales.azurewebsites.net/api/Especies"
End Sub

public Sub Create(especie As Especie) As ResumableSub
	Dim json As String
	
	json = "{'nombre':'"&especie.nombre&"','descripcion':'"&especie.descripcion&"'}"
	
	apijob.Initialize("", Me)
	apijob.PostString(ApiUrl,json)
	apijob.GetRequest.SetContentType("application/json")
	
	wait for (apijob) JobDone(resultado As HttpJob)
	
	If resultado.Success <> True Then
		Return Null
	End If
	
	jsonParser.Initialize(resultado.GetString)
	Dim map As Map = jsonParser.NextObject
		
	especie.id = map.Get("id")
	especie.nombre = map.Get("nombre")
	especie.descripcion = map.Get("descripcion")
	
	Return especie
End Sub

Public Sub ReadById(id As Int) As ResumableSub
	Dim especie As Especie
	especie.Initialize
	
	apijob.Initialize("", Me)
	apijob.Download( ApiUrl & "/" & id)
	Wait For (apijob) JobDone( resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		Dim map As Map = jsonParser.NextObject
		
		especie.id = map.Get("id")
		especie.nombre = map.Get("nombre")
		especie.descripcion = map.Get("descripcion")
	End If
	
	Return especie
End Sub


Public Sub Update(id As Int, especie As Especie) As ResumableSub
	Dim json As String
	
	json = "{'id':"& especie.id &",'nombre':'"&especie.nombre&"','descripcion':'"&especie.descripcion&"'}"
	
	apijob.Initialize("", Me)
	apijob.PutString(ApiUrl & "/" & id,json)
	apijob.GetRequest.SetContentType("application/json")
	
	wait for (apijob) JobDone(resultado As HttpJob)
	Return resultado.Success
End Sub

Public Sub Delete(id As Int) As ResumableSub
	apijob.Initialize("", Me)
	apijob.Delete( ApiUrl & "/" & id)
	Wait For (apijob) JobDone( resultado As HttpJob)
	Return resultado.Success
End Sub