package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class especieservice extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.especieservice");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.especieservice.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
public b4a.example.httpjob _apijob = null;
public String _apiurl = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals(b4a.example.especieservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="especieservice";
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Private jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="Private apijob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="Public ApiUrl As String";
_apiurl = "";
RDebugUtils.currentLine=10158085;
 //BA.debugLineNum = 10158085;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.especieservice __ref,b4a.example.especie _especie) throws Exception{
RDebugUtils.currentModule="especieservice";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_especie}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_especie);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.especieservice parent,b4a.example.especieservice __ref,b4a.example.especie _especie) {
this.parent = parent;
this.__ref = __ref;
this._especie = _especie;
this.__ref = parent;
}
b4a.example.especieservice __ref;
b4a.example.especieservice parent;
b4a.example.especie _especie;
String _json = "";
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="especieservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="json = \"{'nombre':'\"&especie.nombre&\"','descripci";
_json = "{'nombre':'"+_especie._nombre /*String*/ +"','descripcion':'"+_especie._descripcion /*String*/ +"'}";
RDebugUtils.currentLine=13172741;
 //BA.debugLineNum = 13172741;BA.debugLine="apijob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13172742;
 //BA.debugLineNum = 13172742;BA.debugLine="apijob.PostString(ApiUrl,json)";
__ref._apijob /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_json);
RDebugUtils.currentLine=13172743;
 //BA.debugLineNum = 13172743;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=13172745;
 //BA.debugLineNum = 13172745;BA.debugLine="wait for (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "especieservice", "create"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13172747;
 //BA.debugLineNum = 13172747;BA.debugLine="If resultado.Success <> True Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ !=parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13172748;
 //BA.debugLineNum = 13172748;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13172751;
 //BA.debugLineNum = 13172751;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=13172752;
 //BA.debugLineNum = 13172752;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=13172754;
 //BA.debugLineNum = 13172754;BA.debugLine="especie.id = map.Get(\"id\")";
_especie._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=13172755;
 //BA.debugLineNum = 13172755;BA.debugLine="especie.nombre = map.Get(\"nombre\")";
_especie._nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre")));
RDebugUtils.currentLine=13172756;
 //BA.debugLineNum = 13172756;BA.debugLine="especie.descripcion = map.Get(\"descripcion\")";
_especie._descripcion /*String*/  = BA.ObjectToString(_map.Get((Object)("descripcion")));
RDebugUtils.currentLine=13172758;
 //BA.debugLineNum = 13172758;BA.debugLine="Return especie";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_especie));return;};
RDebugUtils.currentLine=13172759;
 //BA.debugLineNum = 13172759;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.especieservice __ref,int _id) throws Exception{
RDebugUtils.currentModule="especieservice";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.especieservice parent,b4a.example.especieservice __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.especieservice __ref;
b4a.example.especieservice parent;
int _id;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="especieservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="apijob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="apijob.Delete( ApiUrl & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="Wait For (apijob) JobDone( resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "especieservice", "delete"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=13369349;
 //BA.debugLineNum = 13369349;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example.especieservice __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="especieservice";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="ApiUrl = \"https://utn-cloud-animales.azurewebsite";
__ref._apiurl /*String*/  = "https://utn-cloud-animales.azurewebsites.net/api/Especies";
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _readbyid(b4a.example.especieservice __ref,int _id) throws Exception{
RDebugUtils.currentModule="especieservice";
if (Debug.shouldDelegate(ba, "readbyid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "readbyid", new Object[] {_id}));}
ResumableSub_ReadById rsub = new ResumableSub_ReadById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ReadById extends BA.ResumableSub {
public ResumableSub_ReadById(b4a.example.especieservice parent,b4a.example.especieservice __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.especieservice __ref;
b4a.example.especieservice parent;
int _id;
b4a.example.especie _especie = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="especieservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Dim especie As Especie";
_especie = new b4a.example.especie();
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="especie.Initialize";
_especie._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="apijob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13238277;
 //BA.debugLineNum = 13238277;BA.debugLine="apijob.Download( ApiUrl & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=13238278;
 //BA.debugLineNum = 13238278;BA.debugLine="Wait For (apijob) JobDone( resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "especieservice", "readbyid"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13238279;
 //BA.debugLineNum = 13238279;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13238280;
 //BA.debugLineNum = 13238280;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=13238281;
 //BA.debugLineNum = 13238281;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=13238283;
 //BA.debugLineNum = 13238283;BA.debugLine="especie.id = map.Get(\"id\")";
_especie._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=13238284;
 //BA.debugLineNum = 13238284;BA.debugLine="especie.nombre = map.Get(\"nombre\")";
_especie._nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre")));
RDebugUtils.currentLine=13238285;
 //BA.debugLineNum = 13238285;BA.debugLine="especie.descripcion = map.Get(\"descripcion\")";
_especie._descripcion /*String*/  = BA.ObjectToString(_map.Get((Object)("descripcion")));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13238288;
 //BA.debugLineNum = 13238288;BA.debugLine="Return especie";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_especie));return;};
RDebugUtils.currentLine=13238289;
 //BA.debugLineNum = 13238289;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.especieservice __ref,int _id,b4a.example.especie _especie) throws Exception{
RDebugUtils.currentModule="especieservice";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_especie}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_especie);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.especieservice parent,b4a.example.especieservice __ref,int _id,b4a.example.especie _especie) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._especie = _especie;
this.__ref = parent;
}
b4a.example.especieservice __ref;
b4a.example.especieservice parent;
int _id;
b4a.example.especie _especie;
String _json = "";
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="especieservice";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="json = \"{'id':\"& especie.id &\",'nombre':'\"&especi";
_json = "{'id':"+BA.NumberToString(_especie._id /*int*/ )+",'nombre':'"+_especie._nombre /*String*/ +"','descripcion':'"+_especie._descripcion /*String*/ +"'}";
RDebugUtils.currentLine=13303813;
 //BA.debugLineNum = 13303813;BA.debugLine="apijob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=13303814;
 //BA.debugLineNum = 13303814;BA.debugLine="apijob.PutString(ApiUrl & \"/\" & id,json)";
__ref._apijob /*b4a.example.httpjob*/ ._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),_json);
RDebugUtils.currentLine=13303815;
 //BA.debugLineNum = 13303815;BA.debugLine="apijob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=13303817;
 //BA.debugLineNum = 13303817;BA.debugLine="wait for (apijob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "especieservice", "update"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=13303818;
 //BA.debugLineNum = 13303818;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=13303819;
 //BA.debugLineNum = 13303819;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}