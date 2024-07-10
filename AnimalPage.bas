B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	
	Private animalService As AnimalesService
	Private txtId As EditText
	Private txtNombre As EditText
	Private txtEspecieId As EditText
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	animalService.Initialize
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("AnimalPage")
	
End Sub



Private Sub btnRead_Click
	Try
		Wait For (animalService.ReadById(txtId.Text)) Complete (animal As Animal)
	
		If animal.id <> 0 Then
			txtId.Text = animal.id
			txtNombre.Text = animal.nombre
			txtEspecieId.Text = animal.especieId
		
		Else
			Msgbox("No hay datos","Error")
		End If
		
	Catch
		Log(LastException)
		Msgbox("No hay datos","Error")
	End Try
	
	
End Sub

Private Sub btnDelete_Click
	Try
		Wait For (animalService.Delete(txtId.Text)) Complete (success As Boolean)
		If success Then
			txtId.Text = ""
			txtNombre.Text = ""
			txtEspecieId.Text = ""
			
			Msgbox("Eliminación Exitosa","Éxito")
		Else
			Msgbox("No se encontro el registro","Error")
		End If
		
	Catch
		Log(LastException)
		Msgbox("Error","Error")
	End Try
	
End Sub

Private Sub btnUpdate_Click
	Try
		Dim animalToUpdate As Animal
		
		animalToUpdate.id = txtId.Text
		animalToUpdate.nombre = txtNombre.Text
		animalToUpdate.especieId = txtEspecieId.Text
		
		Wait For (animalService.Update(txtId.Text, animalToUpdate)) Complete (success As Boolean)
		If success Then
			Msgbox("Actualización Exitosa","Éxito")
		Else
			Msgbox("No se encontro el registro","Error")
		End If
		
	Catch
		Log(LastException)
		Msgbox("Error","Error")
	End Try
End Sub

Private Sub btnSave_Click
	Try
		Dim animalToCreate As Animal
		
		animalToCreate.nombre = txtNombre.Text
		animalToCreate.especieId = txtEspecieId.Text
		
		Wait For (animalService.Create(animalToCreate)) Complete (animalResult As Animal)
		If animalResult <> Null Then
			txtId.Text = animalResult.id
			Msgbox("Creación Exitosa","Éxito")
		Else
			Msgbox("No se pudo crear el registro","Error")
		End If
		
	Catch
		Log(LastException)
		Msgbox("Error","Error")
	End Try
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.