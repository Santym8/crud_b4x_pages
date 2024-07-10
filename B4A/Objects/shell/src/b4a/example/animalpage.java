
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class animalpage {
    public static RemoteObject myClass;
	public animalpage() {
	}
    public static PCBA staticBA = new PCBA(null, animalpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _animalservice = RemoteObject.declareNull("b4a.example.animalesservice");
public static RemoteObject _txtid = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtnombre = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtespecieid = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"animalService",_ref.getField(false, "_animalservice"),"Root",_ref.getField(false, "_root"),"txtEspecieId",_ref.getField(false, "_txtespecieid"),"txtId",_ref.getField(false, "_txtid"),"txtNombre",_ref.getField(false, "_txtnombre"),"xui",_ref.getField(false, "_xui")};
}
}