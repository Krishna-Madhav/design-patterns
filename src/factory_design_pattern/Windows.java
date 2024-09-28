package factory_design_pattern;

public class Windows implements OperatingSystem{

    @Override
    public void spec() {
        System.out.println("Nobody uses this OS");
    }
}
