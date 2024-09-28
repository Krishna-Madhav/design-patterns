package builder_design_pattern;

/**
    This class is responsible for building phone object for us.
*/
public class PhoneBuilder {

    private String os;
    private int ram;
    private String processor;
    private String company;
    private int battery;

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone build(){
      return new Phone(os,ram, processor,company,battery);
    }
}
