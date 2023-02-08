import computer.*;

class OSFactory {
    public OS getInstance(String str) {
        if (str.equals("Open"))
            return new Android();
        else if (str.equals("Secure"))
            return new IOS();
        else
            return new Windows();
    }
}

public class FactoryExample {
    public static void main(String[] args) {
        OSFactory osf = new OSFactory();
        OS obj = osf.getInstance("Secure");
        obj.spec();
    }
}
