package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class especiepage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.especiepage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.especiepage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.especieservice _especieservice = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnombre = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtdescripcion = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public Object  _initialize(b4a.example.especiepage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="especiepage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="especieService.Initialize";
__ref._especieservice /*b4a.example.especieservice*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=13500419;
 //BA.debugLineNum = 13500419;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.especiepage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="especiepage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=13565955;
 //BA.debugLineNum = 13565955;BA.debugLine="Root.LoadLayout(\"EspeciePage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("EspeciePage",ba);
RDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="End Sub";
return "";
}
public void  _btndelete_click(b4a.example.especiepage __ref) throws Exception{
RDebugUtils.currentModule="especiepage";
if (Debug.shouldDelegate(ba, "btndelete_click", false))
	 {Debug.delegate(ba, "btndelete_click", null); return;}
ResumableSub_btnDelete_Click rsub = new ResumableSub_btnDelete_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnDelete_Click extends BA.ResumableSub {
public ResumableSub_btnDelete_Click(b4a.example.especiepage parent,b4a.example.especiepage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.especiepage __ref;
b4a.example.especiepage parent;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="especiepage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="Wait For (especieService.Delete(txtId.Text)) Com";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "especiepage", "btndelete_click"), __ref._especieservice /*b4a.example.especieservice*/ ._delete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=13828099;
 //BA.debugLineNum = 13828099;BA.debugLine="If success Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_success) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="txtId.Text = \"\"";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="txtNombre.Text = \"\"";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="txtDescripcion.Text = \"\"";
__ref._txtdescripcion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=13828104;
 //BA.debugLineNum = 13828104;BA.debugLine="Msgbox(\"Eliminación Exitosa\",\"Éxito\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Eliminación Exitosa"),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=13828106;
 //BA.debugLineNum = 13828106;BA.debugLine="Msgbox(\"No se encontro el registro\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se encontro el registro"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=13828110;
 //BA.debugLineNum = 13828110;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("813828110",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=13828111;
 //BA.debugLineNum = 13828111;BA.debugLine="Msgbox(\"Error\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=13828114;
 //BA.debugLineNum = 13828114;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _btnread_click(b4a.example.especiepage __ref) throws Exception{
RDebugUtils.currentModule="especiepage";
if (Debug.shouldDelegate(ba, "btnread_click", false))
	 {Debug.delegate(ba, "btnread_click", null); return;}
ResumableSub_btnRead_Click rsub = new ResumableSub_btnRead_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnRead_Click extends BA.ResumableSub {
public ResumableSub_btnRead_Click(b4a.example.especiepage parent,b4a.example.especiepage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.especiepage __ref;
b4a.example.especiepage parent;
b4a.example.especie _especie = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="especiepage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="Wait For (especieService.ReadById(txtId.Text)) C";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "especiepage", "btnread_click"), __ref._especieservice /*b4a.example.especieservice*/ ._readbyid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_especie = (b4a.example.especie) result[1];
;
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="If especie.id <> 0 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_especie._id /*int*/ !=0) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=13762565;
 //BA.debugLineNum = 13762565;BA.debugLine="txtId.Text = especie.id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_especie._id /*int*/ ));
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="txtNombre.Text = especie.nombre";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_especie._nombre /*String*/ ));
RDebugUtils.currentLine=13762567;
 //BA.debugLineNum = 13762567;BA.debugLine="txtDescripcion.Text = especie.descripcion";
__ref._txtdescripcion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_especie._descripcion /*String*/ ));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=13762570;
 //BA.debugLineNum = 13762570;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=13762574;
 //BA.debugLineNum = 13762574;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("813762574",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=13762575;
 //BA.debugLineNum = 13762575;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=13762579;
 //BA.debugLineNum = 13762579;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _btnsave_click(b4a.example.especiepage __ref) throws Exception{
RDebugUtils.currentModule="especiepage";
if (Debug.shouldDelegate(ba, "btnsave_click", false))
	 {Debug.delegate(ba, "btnsave_click", null); return;}
ResumableSub_btnSave_Click rsub = new ResumableSub_btnSave_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSave_Click extends BA.ResumableSub {
public ResumableSub_btnSave_Click(b4a.example.especiepage parent,b4a.example.especiepage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.especiepage __ref;
b4a.example.especiepage parent;
b4a.example.especie _especietocreate = null;
b4a.example.especie _especieresult = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="especiepage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="Dim especieToCreate As Especie";
_especietocreate = new b4a.example.especie();
RDebugUtils.currentLine=13959172;
 //BA.debugLineNum = 13959172;BA.debugLine="especieToCreate.nombre = txtNombre.Text";
_especietocreate._nombre /*String*/  = __ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=13959173;
 //BA.debugLineNum = 13959173;BA.debugLine="especieToCreate.descripcion = txtDescripcion.Tex";
_especietocreate._descripcion /*String*/  = __ref._txtdescripcion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=13959175;
 //BA.debugLineNum = 13959175;BA.debugLine="Wait For (especieService.Create(especieToCreate)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "especiepage", "btnsave_click"), __ref._especieservice /*b4a.example.especieservice*/ ._create /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_especietocreate));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_especieresult = (b4a.example.especie) result[1];
;
RDebugUtils.currentLine=13959176;
 //BA.debugLineNum = 13959176;BA.debugLine="If especieResult <> Null Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_especieresult!= null) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=13959177;
 //BA.debugLineNum = 13959177;BA.debugLine="txtId.Text = especieResult.id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_especieresult._id /*int*/ ));
RDebugUtils.currentLine=13959178;
 //BA.debugLineNum = 13959178;BA.debugLine="Msgbox(\"Creación Exitosa\",\"Éxito\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Creación Exitosa"),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=13959180;
 //BA.debugLineNum = 13959180;BA.debugLine="Msgbox(\"No se pudo crear el registro\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo crear el registro"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=13959184;
 //BA.debugLineNum = 13959184;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("813959184",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=13959185;
 //BA.debugLineNum = 13959185;BA.debugLine="Msgbox(\"Error\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=13959188;
 //BA.debugLineNum = 13959188;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _btnupdate_click(b4a.example.especiepage __ref) throws Exception{
RDebugUtils.currentModule="especiepage";
if (Debug.shouldDelegate(ba, "btnupdate_click", false))
	 {Debug.delegate(ba, "btnupdate_click", null); return;}
ResumableSub_btnUpdate_Click rsub = new ResumableSub_btnUpdate_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnUpdate_Click extends BA.ResumableSub {
public ResumableSub_btnUpdate_Click(b4a.example.especiepage parent,b4a.example.especiepage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.especiepage __ref;
b4a.example.especiepage parent;
b4a.example.especie _especietoupdate = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="especiepage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="Dim especieToUpdate As Especie";
_especietoupdate = new b4a.example.especie();
RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="especieToUpdate.id = txtId.Text";
_especietoupdate._id /*int*/  = (int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=13893637;
 //BA.debugLineNum = 13893637;BA.debugLine="especieToUpdate.nombre = txtNombre.Text";
_especietoupdate._nombre /*String*/  = __ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=13893638;
 //BA.debugLineNum = 13893638;BA.debugLine="especieToUpdate.descripcion = txtDescripcion.Tex";
_especietoupdate._descripcion /*String*/  = __ref._txtdescripcion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=13893640;
 //BA.debugLineNum = 13893640;BA.debugLine="Wait For (especieService.Update(txtId.Text, espe";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "especiepage", "btnupdate_click"), __ref._especieservice /*b4a.example.especieservice*/ ._update /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),_especietoupdate));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=13893641;
 //BA.debugLineNum = 13893641;BA.debugLine="If success Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_success) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=13893642;
 //BA.debugLineNum = 13893642;BA.debugLine="Msgbox(\"Actualización Exitosa\",\"Éxito\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Actualización Exitosa"),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=13893644;
 //BA.debugLineNum = 13893644;BA.debugLine="Msgbox(\"No se encontro el registro\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se encontro el registro"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=13893648;
 //BA.debugLineNum = 13893648;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("813893648",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=13893649;
 //BA.debugLineNum = 13893649;BA.debugLine="Msgbox(\"Error\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=13893651;
 //BA.debugLineNum = 13893651;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _class_globals(b4a.example.especiepage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="especiepage";
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="Private especieService As EspecieService";
_especieservice = new b4a.example.especieservice();
RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="Private txtId As EditText";
_txtid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="Private txtNombre As EditText";
_txtnombre = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13434886;
 //BA.debugLineNum = 13434886;BA.debugLine="Private txtDescripcion As EditText";
_txtdescripcion = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13434887;
 //BA.debugLineNum = 13434887;BA.debugLine="End Sub";
return "";
}
}