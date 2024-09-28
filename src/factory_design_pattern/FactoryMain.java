package factory_design_pattern;

public class FactoryMain {

    public static void main(String[] args) {

        /* Here in factory design pattern we get the object based on the parameter we pass.
        User doesn't get an idea how object is being created.
        Also, user doesn't need to create object on his own instead asks factory to provide and object based a specification
        */

        OperatingSystem os = OperatingSystemFactory.getInstance("OPEN-OS");
        os.spec();
    }
}
