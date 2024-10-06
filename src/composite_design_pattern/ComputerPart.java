package composite_design_pattern;

import java.util.ArrayList;
import java.util.List;


class Leaf implements Component{

    int price;
    String name;

    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void price() {

        System.out.println(name + " : price :" +price);
    }
}

class Composite implements Component{

    String name;
    List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void price() {

        System.out.println("Name of component: "+ name);

        for(Component component : components){
            component.price();
        }
    }
}