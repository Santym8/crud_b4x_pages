package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class animalesservice extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.animalesservice");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.animalesservice.class).invoke(this, new Object[] {null});
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
public String _apiurl = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals(b4a.example.animalesservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="animalesservice";
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="Public ApiUrl As String";
_apiurl = "";
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.animalesservice __ref,b4a.example.animal _animal) throws Exception{
RDebugUtils.currentModule="animalesservice";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_animal}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_animal);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.animalesservice parent,b4a.example.animalesservice __ref,b4a.example.animal _animal) {
this.parent = parent;
this.__ref = __ref;
this._animal = _animal;
this.__ref = parent;
}
b4a.example.animalesservice __ref;
b4a.example.animalesservice parent;
b4a.example.animal _animal;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="animalesservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="json.Initialize(CreateMap(\"nombre\": animal.nombre";
_json.Initialize(parent.__c.createMap(new Object[] {(Object)("nombre"),(Object)(_animal._nombre /*String*/ ),(Object)("especieId"),(Object)(_animal._especieid /*int*/ )}));
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=14286853;
 //BA.debugLineNum = 14286853;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=14286854;
 //BA.debugLineNum = 14286854;BA.debugLine="apijob.PostString(ApiUrl, json.ToString)";
_apijob._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_json.ToString());
RDebugUtils.currentLine=14286855;
 //BA.debugLineNum = 14286855;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
_apijob._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=14286857;
 //BA.debugLineNum = 14286857;BA.debugLine="wait for (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "animalesservice", "create"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14286859;
 //BA.debugLineNum = 14286859;BA.debugLine="If resultado.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=14286860;
 //BA.debugLineNum = 14286860;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("814286860","Error: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=14286861;
 //BA.debugLineNum = 14286861;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=14286864;
 //BA.debugLineNum = 14286864;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=14286865;
 //BA.debugLineNum = 14286865;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
_jsonparser.Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=14286866;
 //BA.debugLineNum = 14286866;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = _jsonparser.NextObject();
RDebugUtils.currentLine=14286868;
 //BA.debugLineNum = 14286868;BA.debugLine="animal.id = map.Get(\"id\")";
_animal._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=14286869;
 //BA.debugLineNum = 14286869;BA.debugLine="animal.nombre = map.Get(\"nombre\")";
_animal._nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre")));
RDebugUtils.currentLine=14286870;
 //BA.debugLineNum = 14286870;BA.debugLine="animal.especieId = map.Get(\"especieId\")";
_animal._especieid /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("especieId"))));
RDebugUtils.currentLine=14286872;
 //BA.debugLineNum = 14286872;BA.debugLine="Return animal";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_animal));return;};
RDebugUtils.currentLine=14286873;
 //BA.debugLineNum = 14286873;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.animalesservice __ref,int _id) throws Exception{
RDebugUtils.currentModule="animalesservice";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.animalesservice parent,b4a.example.animalesservice __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.animalesservice __ref;
b4a.example.animalesservice parent;
int _id;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="animalesservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=14483459;
 //BA.debugLineNum = 14483459;BA.debugLine="apijob.Delete(ApiUrl & \"/\" & id)";
_apijob._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "animalesservice", "delete"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14483462;
 //BA.debugLineNum = 14483462;BA.debugLine="If resultado.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=14483463;
 //BA.debugLineNum = 14483463;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("814483463","Error: "+_resultado._errormessage /*String*/ ,0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=14483466;
 //BA.debugLineNum = 14483466;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=14483467;
 //BA.debugLineNum = 14483467;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example.animalesservice __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="animalesservice";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="ApiUrl = \"https://utn-cloud-animales.azurewebsite";
__ref._apiurl /*String*/  = "https://utn-cloud-animales.azurewebsites.net/api/Animals";
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _readbyid(b4a.example.animalesservice __ref,int _id) throws Exception{
RDebugUtils.currentModule="animalesservice";
if (Debug.shouldDelegate(ba, "readbyid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "readbyid", new Object[] {_id}));}
ResumableSub_ReadById rsub = new ResumableSub_ReadById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ReadById extends BA.ResumableSub {
public ResumableSub_ReadById(b4a.example.animalesservice parent,b4a.example.animalesservice __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.animalesservice __ref;
b4a.example.animalesservice parent;
int _id;
b4a.example.animal _animal = null;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="animalesservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="Dim animal As Animal";
_animal = new b4a.example.animal();
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="animal.Initialize";
_animal._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14352388;
 //BA.debugLineNum = 14352388;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=14352389;
 //BA.debugLineNum = 14352389;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=14352390;
 //BA.debugLineNum = 14352390;BA.debugLine="apijob.Download(ApiUrl & \"/\" & id)";
_apijob._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=14352391;
 //BA.debugLineNum = 14352391;BA.debugLine="Wait For (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "animalesservice", "readbyid"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14352393;
 //BA.debugLineNum = 14352393;BA.debugLine="If resultado.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=14352394;
 //BA.debugLineNum = 14352394;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("814352394","Error: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=14352395;
 //BA.debugLineNum = 14352395;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=14352398;
 //BA.debugLineNum = 14352398;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=14352399;
 //BA.debugLineNum = 14352399;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
_jsonparser.Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=14352400;
 //BA.debugLineNum = 14352400;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = _jsonparser.NextObject();
RDebugUtils.currentLine=14352402;
 //BA.debugLineNum = 14352402;BA.debugLine="animal.id = map.Get(\"id\")";
_animal._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=14352403;
 //BA.debugLineNum = 14352403;BA.debugLine="animal.nombre = map.Get(\"nombre\")";
_animal._nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre")));
RDebugUtils.currentLine=14352404;
 //BA.debugLineNum = 14352404;BA.debugLine="animal.especieId = map.Get(\"especieId\")";
_animal._especieid /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("especieId"))));
RDebugUtils.currentLine=14352406;
 //BA.debugLineNum = 14352406;BA.debugLine="Return animal";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_animal));return;};
RDebugUtils.currentLine=14352407;
 //BA.debugLineNum = 14352407;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.animalesservice __ref,int _id,b4a.example.animal _animal) throws Exception{
RDebugUtils.currentModule="animalesservice";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_animal}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_animal);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.animalesservice parent,b4a.example.animalesservice __ref,int _id,b4a.example.animal _animal) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._animal = _animal;
this.__ref = parent;
}
b4a.example.animalesservice __ref;
b4a.example.animalesservice parent;
int _id;
b4a.example.animal _animal;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
b4a.example.httpjob _apijob = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="animalesservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="json.Initialize(CreateMap(\"id\": animal.id, \"nombr";
_json.Initialize(parent.__c.createMap(new Object[] {(Object)("id"),(Object)(_animal._id /*int*/ ),(Object)("nombre"),(Object)(_animal._nombre /*String*/ ),(Object)("especieId"),(Object)(_animal._especieid /*int*/ )}));
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="Dim apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=14417925;
 //BA.debugLineNum = 14417925;BA.debugLine="apijob.Initialize(\"\", Me)";
_apijob._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=14417926;
 //BA.debugLineNum = 14417926;BA.debugLine="apijob.PutString(ApiUrl & \"/\" & id, json.ToString";
_apijob._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),_json.ToString());
RDebugUtils.currentLine=14417927;
 //BA.debugLineNum = 14417927;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
_apijob._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=14417929;
 //BA.debugLineNum = 14417929;BA.debugLine="wait for (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "animalesservice", "update"), (Object)(_apijob));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=14417931;
 //BA.debugLineNum = 14417931;BA.debugLine="If resultado.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=14417932;
 //BA.debugLineNum = 14417932;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("814417932","Error: "+_resultado._errormessage /*String*/ ,0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=14417935;
 //BA.debugLineNum = 14417935;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=14417936;
 //BA.debugLineNum = 14417936;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}