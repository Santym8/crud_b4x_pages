package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class animalpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (animalpage) ","animalpage",8,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "animalpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 18;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Root = Root1";
Debug.ShouldStop(262144);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 21;BA.debugLine="Root.LoadLayout(\"AnimalPage\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("AnimalPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btndelete_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (animalpage) ","animalpage",8,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("btndelete_click")) { __ref.runUserSub(false, "animalpage","btndelete_click", __ref); return;}
ResumableSub_btnDelete_Click rsub = new ResumableSub_btnDelete_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnDelete_Click extends BA.ResumableSub {
public ResumableSub_btnDelete_Click(b4a.example.animalpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.animalpage parent;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDelete_Click (animalpage) ","animalpage",8,__ref.getField(false, "ba"),__ref,48);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 49;BA.debugLine="Try";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 50;BA.debugLine="Wait For (animalService.Delete(txtId.Text)) Comp";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "animalpage", "btndelete_click"), __ref.getField(false,"_animalservice" /*RemoteObject*/ ).runClassMethod (b4a.example.animalesservice.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 51;BA.debugLine="If success Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 9;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 52;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 53;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 54;BA.debugLine="txtEspecieId.Text = \"\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtespecieid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 56;BA.debugLine="Msgbox(\"Eliminación Exitosa\",\"Éxito\")";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Eliminación Exitosa")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 58;BA.debugLine="Msgbox(\"No se encontro el registro\",\"Error\")";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se encontro el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 62;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","815073294",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 63;BA.debugLine="Msgbox(\"Error\",\"Error\")";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static void  _btnread_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnRead_Click (animalpage) ","animalpage",8,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("btnread_click")) { __ref.runUserSub(false, "animalpage","btnread_click", __ref); return;}
ResumableSub_btnRead_Click rsub = new ResumableSub_btnRead_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnRead_Click extends BA.ResumableSub {
public ResumableSub_btnRead_Click(b4a.example.animalpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.animalpage parent;
RemoteObject _animal = RemoteObject.declareNull("b4a.example.animal");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnRead_Click (animalpage) ","animalpage",8,__ref.getField(false, "ba"),__ref,27);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 28;BA.debugLine="Try";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 29;BA.debugLine="Wait For (animalService.ReadById(txtId.Text)) Co";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "animalpage", "btnread_click"), __ref.getField(false,"_animalservice" /*RemoteObject*/ ).runClassMethod (b4a.example.animalesservice.class, "_readbyid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_animal = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("animal", _animal);
;
 BA.debugLineNum = 31;BA.debugLine="If animal.id <> 0 Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("!",_animal.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 32;BA.debugLine="txtId.Text = animal.id";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_animal.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 33;BA.debugLine="txtNombre.Text = animal.nombre";
Debug.ShouldStop(1);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_animal.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 34;BA.debugLine="txtEspecieId.Text = animal.especieId";
Debug.ShouldStop(2);
__ref.getField(false,"_txtespecieid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_animal.getField(true,"_especieid" /*RemoteObject*/ )));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 37;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(16);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 41;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","815007758",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 42;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(512);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btnsave_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSave_Click (animalpage) ","animalpage",8,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("btnsave_click")) { __ref.runUserSub(false, "animalpage","btnsave_click", __ref); return;}
ResumableSub_btnSave_Click rsub = new ResumableSub_btnSave_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSave_Click extends BA.ResumableSub {
public ResumableSub_btnSave_Click(b4a.example.animalpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.animalpage parent;
RemoteObject _animaltocreate = RemoteObject.declareNull("b4a.example.animal");
RemoteObject _animalresult = RemoteObject.declareNull("b4a.example.animal");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSave_Click (animalpage) ","animalpage",8,__ref.getField(false, "ba"),__ref,89);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 90;BA.debugLine="Try";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 91;BA.debugLine="Dim animalToCreate As Animal";
Debug.ShouldStop(67108864);
_animaltocreate = RemoteObject.createNew ("b4a.example.animal");Debug.locals.put("animalToCreate", _animaltocreate);
 BA.debugLineNum = 93;BA.debugLine="animalToCreate.nombre = txtNombre.Text";
Debug.ShouldStop(268435456);
_animaltocreate.setField ("_nombre" /*RemoteObject*/ ,__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 94;BA.debugLine="animalToCreate.especieId = txtEspecieId.Text";
Debug.ShouldStop(536870912);
_animaltocreate.setField ("_especieid" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtespecieid" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 96;BA.debugLine="Wait For (animalService.Create(animalToCreate))";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "animalpage", "btnsave_click"), __ref.getField(false,"_animalservice" /*RemoteObject*/ ).runClassMethod (b4a.example.animalesservice.class, "_create" /*RemoteObject*/ ,(Object)(_animaltocreate)));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_animalresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("animalResult", _animalresult);
;
 BA.debugLineNum = 97;BA.debugLine="If animalResult <> Null Then";
Debug.ShouldStop(1);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("N",_animalresult)) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 98;BA.debugLine="txtId.Text = animalResult.id";
Debug.ShouldStop(2);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_animalresult.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 99;BA.debugLine="Msgbox(\"Creación Exitosa\",\"Éxito\")";
Debug.ShouldStop(4);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Creación Exitosa")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 101;BA.debugLine="Msgbox(\"No se pudo crear el registro\",\"Error\")";
Debug.ShouldStop(16);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo crear el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 105;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","815204368",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 106;BA.debugLine="Msgbox(\"Error\",\"Error\")";
Debug.ShouldStop(512);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btnupdate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnUpdate_Click (animalpage) ","animalpage",8,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("btnupdate_click")) { __ref.runUserSub(false, "animalpage","btnupdate_click", __ref); return;}
ResumableSub_btnUpdate_Click rsub = new ResumableSub_btnUpdate_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnUpdate_Click extends BA.ResumableSub {
public ResumableSub_btnUpdate_Click(b4a.example.animalpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.animalpage parent;
RemoteObject _animaltoupdate = RemoteObject.declareNull("b4a.example.animal");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnUpdate_Click (animalpage) ","animalpage",8,__ref.getField(false, "ba"),__ref,68);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 69;BA.debugLine="Try";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 70;BA.debugLine="Dim animalToUpdate As Animal";
Debug.ShouldStop(32);
_animaltoupdate = RemoteObject.createNew ("b4a.example.animal");Debug.locals.put("animalToUpdate", _animaltoupdate);
 BA.debugLineNum = 72;BA.debugLine="animalToUpdate.id = txtId.Text";
Debug.ShouldStop(128);
_animaltoupdate.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 73;BA.debugLine="animalToUpdate.nombre = txtNombre.Text";
Debug.ShouldStop(256);
_animaltoupdate.setField ("_nombre" /*RemoteObject*/ ,__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 74;BA.debugLine="animalToUpdate.especieId = txtEspecieId.Text";
Debug.ShouldStop(512);
_animaltoupdate.setField ("_especieid" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtespecieid" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 76;BA.debugLine="Wait For (animalService.Update(txtId.Text, anima";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "animalpage", "btnupdate_click"), __ref.getField(false,"_animalservice" /*RemoteObject*/ ).runClassMethod (b4a.example.animalesservice.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(_animaltoupdate)));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 77;BA.debugLine="If success Then";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//if
this.state = 9;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 78;BA.debugLine="Msgbox(\"Actualización Exitosa\",\"Éxito\")";
Debug.ShouldStop(8192);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Actualización Exitosa")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 80;BA.debugLine="Msgbox(\"No se encontro el registro\",\"Error\")";
Debug.ShouldStop(32768);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se encontro el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 84;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","815138832",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 85;BA.debugLine="Msgbox(\"Error\",\"Error\")";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
animalpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",animalpage._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
animalpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",animalpage._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private animalService As AnimalesService";
animalpage._animalservice = RemoteObject.createNew ("b4a.example.animalesservice");__ref.setField("_animalservice",animalpage._animalservice);
 //BA.debugLineNum = 6;BA.debugLine="Private txtId As EditText";
animalpage._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",animalpage._txtid);
 //BA.debugLineNum = 7;BA.debugLine="Private txtNombre As EditText";
animalpage._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtnombre",animalpage._txtnombre);
 //BA.debugLineNum = 8;BA.debugLine="Private txtEspecieId As EditText";
animalpage._txtespecieid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtespecieid",animalpage._txtespecieid);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (animalpage) ","animalpage",8,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "animalpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="animalService.Initialize";
Debug.ShouldStop(4096);
__ref.getField(false,"_animalservice" /*RemoteObject*/ ).runClassMethod (b4a.example.animalesservice.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 14;BA.debugLine="Return Me";
Debug.ShouldStop(8192);
if (true) return __ref;
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}