B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private especieService As EspecieService
	Private txtId As EditText
	Private txtNombre As EditText
	Private txtDescripcion As EditText
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	especieService.Initialize
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("EspeciePage")	
End Sub



'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub btnRead_Click
	Try
		Wait For (especieService.ReadById(txtId.Text)) Complete (especie As Especie)
	
		If especie.id <> 0 Then
			txtId.Text = especie.id
			txtNombre.Text = especie.nombre
			txtDescripcion.Text = especie.descripcion
		
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
		Wait For (especieService.Delete(txtId.Text)) Complete (success As Boolean)
		If success Then
			txtId.Text = ""
			txtNombre.Text = ""
			txtDescripcion.Text = ""
			
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
		Dim especieToUpdate As Especie
		
		especieToUpdate.id = txtId.Text
		especieToUpdate.nombre = txtNombre.Text
		especieToUpdate.descripcion = txtDescripcion.Text
		
		Wait For (especieService.Update(txtId.Text, especieToUpdate)) Complete (success As Boolean)
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
		Dim especieToCreate As Especie
		
		especieToCreate.nombre = txtNombre.Text
		especieToCreate.descripcion = txtDescripcion.Text
		
		Wait For (especieService.Create(especieToCreate)) Complete (especieResult As Especie)
		If especieResult <> Null Then
			txtId.Text = especieResult.id
			Msgbox("Creación Exitosa","Éxito")
		Else
			Msgbox("No se pudo crear el registro","Error")
		End If
		
	Catch
		Log(LastException)
		Msgbox("Error","Error")
	End Try
	
End Sub