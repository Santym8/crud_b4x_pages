package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Root = Root1";
Debug.ShouldStop(1048576);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
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
public static RemoteObject  _btnanimalpage_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnAnimalPage_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("btnanimalpage_click")) { return __ref.runUserSub(false, "b4xmainpage","btnanimalpage_click", __ref);}
 BA.debugLineNum = 36;BA.debugLine="Private Sub btnAnimalPage_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="If animalPage.IsInitialized = False Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_animalpage" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ),b4xmainpage.__c.getField(true,"False"))) { 
 BA.debugLineNum = 38;BA.debugLine="animalPage.Initialize";
Debug.ShouldStop(32);
__ref.getField(false,"_animalpage" /*RemoteObject*/ ).runClassMethod (b4a.example.animalpage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 39;BA.debugLine="B4XPages.AddPage(\"Animales\", animalPage)";
Debug.ShouldStop(64);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Animales")),(Object)((__ref.getField(false,"_animalpage" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 42;BA.debugLine="B4XPages.ShowPage(\"Animales\")";
Debug.ShouldStop(512);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Animales")));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnespeciespage_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnEspeciesPage_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("btnespeciespage_click")) { return __ref.runUserSub(false, "b4xmainpage","btnespeciespage_click", __ref);}
 BA.debugLineNum = 27;BA.debugLine="Private Sub btnEspeciesPage_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="If especiePage.IsInitialized = False Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_especiepage" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ),b4xmainpage.__c.getField(true,"False"))) { 
 BA.debugLineNum = 29;BA.debugLine="especiePage.Initialize";
Debug.ShouldStop(268435456);
__ref.getField(false,"_especiepage" /*RemoteObject*/ ).runClassMethod (b4a.example.especiepage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 30;BA.debugLine="B4XPages.AddPage(\"Especies\", especiePage)";
Debug.ShouldStop(536870912);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Especies")),(Object)((__ref.getField(false,"_especiepage" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 33;BA.debugLine="B4XPages.ShowPage(\"Especies\")";
Debug.ShouldStop(1);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Especies")));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private especiePage As EspeciePage";
b4xmainpage._especiepage = RemoteObject.createNew ("b4a.example.especiepage");__ref.setField("_especiepage",b4xmainpage._especiepage);
 //BA.debugLineNum = 12;BA.debugLine="Private animalPage As AnimalPage";
b4xmainpage._animalpage = RemoteObject.createNew ("b4a.example.animalpage");__ref.setField("_animalpage",b4xmainpage._animalpage);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}