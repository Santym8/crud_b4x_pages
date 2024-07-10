package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class animalpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.animalpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.animalpage.class).invoke(this, new Object[] {null});
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
public b4a.example.animalesservice _animalservice = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnombre = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtespecieid = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public Object  _initialize(b4a.example.animalpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="animalpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="animalService.Initialize";
__ref._animalservice /*b4a.example.animalesservice*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.animalpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="animalpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=14680067;
 //BA.debugLineNum = 14680067;BA.debugLine="Root.LoadLayout(\"AnimalPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("AnimalPage",ba);
RDebugUtils.currentLine=14680069;
 //BA.debugLineNum = 14680069;BA.debugLine="End Sub";
return "";
}
public void  _btndelete_click(b4a.example.animalpage __ref) throws Exception{
RDebugUtils.currentModule="animalpage";
if (Debug.shouldDelegate(ba, "btndelete_click", false))
	 {Debug.delegate(ba, "btndelete_click", null); return;}
ResumableSub_btnDelete_Click rsub = new ResumableSub_btnDelete_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnDelete_Click extends BA.ResumableSub {
public ResumableSub_btnDelete_Click(b4a.example.animalpage parent,b4a.example.animalpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.animalpage __ref;
b4a.example.animalpage parent;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="animalpage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="Try";
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
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="Wait For (animalService.Delete(txtId.Text)) Comp";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "animalpage", "btndelete_click"), __ref._animalservice /*b4a.example.animalesservice*/ ._delete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="If success Then";
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
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="txtId.Text = \"\"";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=15073285;
 //BA.debugLineNum = 15073285;BA.debugLine="txtNombre.Text = \"\"";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=15073286;
 //BA.debugLineNum = 15073286;BA.debugLine="txtEspecieId.Text = \"\"";
__ref._txtespecieid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=15073288;
 //BA.debugLineNum = 15073288;BA.debugLine="Msgbox(\"Eliminación Exitosa\",\"Éxito\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Eliminación Exitosa"),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=15073290;
 //BA.debugLineNum = 15073290;BA.debugLine="Msgbox(\"No se encontro el registro\",\"Error\")";
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
RDebugUtils.currentLine=15073294;
 //BA.debugLineNum = 15073294;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("815073294",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=15073295;
 //BA.debugLineNum = 15073295;BA.debugLine="Msgbox(\"Error\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=15073298;
 //BA.debugLineNum = 15073298;BA.debugLine="End Sub";
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
public void  _btnread_click(b4a.example.animalpage __ref) throws Exception{
RDebugUtils.currentModule="animalpage";
if (Debug.shouldDelegate(ba, "btnread_click", false))
	 {Debug.delegate(ba, "btnread_click", null); return;}
ResumableSub_btnRead_Click rsub = new ResumableSub_btnRead_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnRead_Click extends BA.ResumableSub {
public ResumableSub_btnRead_Click(b4a.example.animalpage parent,b4a.example.animalpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.animalpage __ref;
b4a.example.animalpage parent;
b4a.example.animal _animal = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="animalpage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="Try";
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
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="Wait For (animalService.ReadById(txtId.Text)) Co";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "animalpage", "btnread_click"), __ref._animalservice /*b4a.example.animalesservice*/ ._readbyid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_animal = (b4a.example.animal) result[1];
;
RDebugUtils.currentLine=15007748;
 //BA.debugLineNum = 15007748;BA.debugLine="If animal.id <> 0 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_animal._id /*int*/ !=0) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=15007749;
 //BA.debugLineNum = 15007749;BA.debugLine="txtId.Text = animal.id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_animal._id /*int*/ ));
RDebugUtils.currentLine=15007750;
 //BA.debugLineNum = 15007750;BA.debugLine="txtNombre.Text = animal.nombre";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_animal._nombre /*String*/ ));
RDebugUtils.currentLine=15007751;
 //BA.debugLineNum = 15007751;BA.debugLine="txtEspecieId.Text = animal.especieId";
__ref._txtespecieid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_animal._especieid /*int*/ ));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=15007754;
 //BA.debugLineNum = 15007754;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
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
RDebugUtils.currentLine=15007758;
 //BA.debugLineNum = 15007758;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("815007758",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=15007759;
 //BA.debugLineNum = 15007759;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=15007763;
 //BA.debugLineNum = 15007763;BA.debugLine="End Sub";
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
public void  _btnsave_click(b4a.example.animalpage __ref) throws Exception{
RDebugUtils.currentModule="animalpage";
if (Debug.shouldDelegate(ba, "btnsave_click", false))
	 {Debug.delegate(ba, "btnsave_click", null); return;}
ResumableSub_btnSave_Click rsub = new ResumableSub_btnSave_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSave_Click extends BA.ResumableSub {
public ResumableSub_btnSave_Click(b4a.example.animalpage parent,b4a.example.animalpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.animalpage __ref;
b4a.example.animalpage parent;
b4a.example.animal _animaltocreate = null;
b4a.example.animal _animalresult = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="animalpage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="Try";
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
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="Dim animalToCreate As Animal";
_animaltocreate = new b4a.example.animal();
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="animalToCreate.nombre = txtNombre.Text";
_animaltocreate._nombre /*String*/  = __ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="animalToCreate.especieId = txtEspecieId.Text";
_animaltocreate._especieid /*int*/  = (int)(Double.parseDouble(__ref._txtespecieid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=15204359;
 //BA.debugLineNum = 15204359;BA.debugLine="Wait For (animalService.Create(animalToCreate))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "animalpage", "btnsave_click"), __ref._animalservice /*b4a.example.animalesservice*/ ._create /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_animaltocreate));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_animalresult = (b4a.example.animal) result[1];
;
RDebugUtils.currentLine=15204360;
 //BA.debugLineNum = 15204360;BA.debugLine="If animalResult <> Null Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_animalresult!= null) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=15204361;
 //BA.debugLineNum = 15204361;BA.debugLine="txtId.Text = animalResult.id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_animalresult._id /*int*/ ));
RDebugUtils.currentLine=15204362;
 //BA.debugLineNum = 15204362;BA.debugLine="Msgbox(\"Creación Exitosa\",\"Éxito\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Creación Exitosa"),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=15204364;
 //BA.debugLineNum = 15204364;BA.debugLine="Msgbox(\"No se pudo crear el registro\",\"Error\")";
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
RDebugUtils.currentLine=15204368;
 //BA.debugLineNum = 15204368;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("815204368",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=15204369;
 //BA.debugLineNum = 15204369;BA.debugLine="Msgbox(\"Error\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=15204372;
 //BA.debugLineNum = 15204372;BA.debugLine="End Sub";
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
public void  _btnupdate_click(b4a.example.animalpage __ref) throws Exception{
RDebugUtils.currentModule="animalpage";
if (Debug.shouldDelegate(ba, "btnupdate_click", false))
	 {Debug.delegate(ba, "btnupdate_click", null); return;}
ResumableSub_btnUpdate_Click rsub = new ResumableSub_btnUpdate_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnUpdate_Click extends BA.ResumableSub {
public ResumableSub_btnUpdate_Click(b4a.example.animalpage parent,b4a.example.animalpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.animalpage __ref;
b4a.example.animalpage parent;
b4a.example.animal _animaltoupdate = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="animalpage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="Try";
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
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="Dim animalToUpdate As Animal";
_animaltoupdate = new b4a.example.animal();
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="animalToUpdate.id = txtId.Text";
_animaltoupdate._id /*int*/  = (int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=15138821;
 //BA.debugLineNum = 15138821;BA.debugLine="animalToUpdate.nombre = txtNombre.Text";
_animaltoupdate._nombre /*String*/  = __ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="animalToUpdate.especieId = txtEspecieId.Text";
_animaltoupdate._especieid /*int*/  = (int)(Double.parseDouble(__ref._txtespecieid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=15138824;
 //BA.debugLineNum = 15138824;BA.debugLine="Wait For (animalService.Update(txtId.Text, anima";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "animalpage", "btnupdate_click"), __ref._animalservice /*b4a.example.animalesservice*/ ._update /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),_animaltoupdate));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=15138825;
 //BA.debugLineNum = 15138825;BA.debugLine="If success Then";
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
RDebugUtils.currentLine=15138826;
 //BA.debugLineNum = 15138826;BA.debugLine="Msgbox(\"Actualización Exitosa\",\"Éxito\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Actualización Exitosa"),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=15138828;
 //BA.debugLineNum = 15138828;BA.debugLine="Msgbox(\"No se encontro el registro\",\"Error\")";
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
RDebugUtils.currentLine=15138832;
 //BA.debugLineNum = 15138832;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("815138832",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=15138833;
 //BA.debugLineNum = 15138833;BA.debugLine="Msgbox(\"Error\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Error"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=15138835;
 //BA.debugLineNum = 15138835;BA.debugLine="End Sub";
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
public String  _class_globals(b4a.example.animalpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="animalpage";
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=14548996;
 //BA.debugLineNum = 14548996;BA.debugLine="Private animalService As AnimalesService";
_animalservice = new b4a.example.animalesservice();
RDebugUtils.currentLine=14548997;
 //BA.debugLineNum = 14548997;BA.debugLine="Private txtId As EditText";
_txtid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=14548998;
 //BA.debugLineNum = 14548998;BA.debugLine="Private txtNombre As EditText";
_txtnombre = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=14548999;
 //BA.debugLineNum = 14548999;BA.debugLine="Private txtEspecieId As EditText";
_txtespecieid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=14549000;
 //BA.debugLineNum = 14549000;BA.debugLine="End Sub";
return "";
}
}