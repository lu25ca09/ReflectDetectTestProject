import AccessObject.AccessObjectFeatures;
import Array.ArrayFeatures;
import Casts.CastFeatures;
import ClassReachesTransitively.TransitiveReach;
import ConstructObject.ConstructObjectFeatures;
import InvokeMethod.InvokeMethodFeatures;
import LoadClass.LoadClassFeatures;
import ManipulateMetaObject.ManipulateMetaObjectFeatures;
import ManipulateObject.ManipulateObjectFeatures;
import ParameterSeverity.ParameterSeverityTest;
import Proxy.ProxyFeatures;

public class Main {
    public static void main(String[] args){
        try {

            AccessObjectFeatures accessObjectFeatures = new AccessObjectFeatures();
            ArrayFeatures arrayFeatures = new ArrayFeatures();

            ConstructObjectFeatures constructObjectFeatures = new ConstructObjectFeatures();
            InvokeMethodFeatures invokeMethodFeatures = new InvokeMethodFeatures();
            LoadClassFeatures loadClassFeatures = new LoadClassFeatures();
            ManipulateMetaObjectFeatures manipulateMetaObjectFeatures = new ManipulateMetaObjectFeatures();
            ManipulateObjectFeatures manipulateObjectFeatures = new ManipulateObjectFeatures();
            ProxyFeatures proxyFeatures = new ProxyFeatures();
            TransitiveReach transitiveReach = new TransitiveReach();


            CastFeatures castFeatures = new CastFeatures();

            ParameterSeverityTest parameterSeverityTest = new ParameterSeverityTest();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
