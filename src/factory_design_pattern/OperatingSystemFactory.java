package factory_design_pattern;

/**
 * Class which provides object of different class based on a parameter
 */
public class OperatingSystemFactory {

    public static OperatingSystem getInstance(String str){
        if(str.equals("OPEN-OS")){
            return new Android();
        } else if (str.equals("CLOSED-OS")) {
            return new IOS();
        } else
            return new Windows();
    }
}
