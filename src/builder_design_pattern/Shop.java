package builder_design_pattern;

public class Shop {

    public static void main(String[] args) {

        // Let's say we have a class (eg. Phone) which has multiple parameters.
        // If we want to create an object of phone we need to pass different parameters in constructors.
        // There might be scenario when users doesn't want to specify all the parameters.
        // So for that we will have to create different constructors for specific use-cases.
        // In such cases we go for builder design pattern where we have a Builder class which allows to set parameters one-by-one and finally returns an object of the required class using build method.

        /*
        Let's say we have a class which has multiple parameters and we want to create and object of class.
        For such classes we can have different constructors with different parameters to create an object.
        For such scenarios a builder class pattern is used.
         */
        Phone phone = new PhoneBuilder()
                .setBattery(5000)
                .setCompany("Google Pixel")
                .setProcessor("Qualcomm")
                .setRam(2)
                .build();

        System.out.println(phone);
    }
}
