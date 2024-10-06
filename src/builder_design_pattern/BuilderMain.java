package builder_design_pattern;

/*
        Let's say we have a class which has multiple parameters and we want to create and object of class.
        For such classes we can have different constructors with different parameters to create an object.
        For such scenarios a builder class pattern is used.
*/

public class BuilderMain {

    public static void main(String[] args) {


        Phone phone = new PhoneBuilder()
                .setBattery(5000)
                .setCompany("Google Pixel")
                .setProcessor("Qualcomm")
                .setRam(2)
                .build();

        System.out.println(phone);
    }
}
