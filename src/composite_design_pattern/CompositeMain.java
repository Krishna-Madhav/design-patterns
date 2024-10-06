package composite_design_pattern;

public class CompositeMain {

    public static void main(String[] args) {

        Component hdd = new Leaf(4000, "HDD");
        Component mouse = new Leaf(400, "Mouse");
        Component processor = new Leaf(16000, "Intel i5");
        Component monitor = new Leaf(8000, "Samsung Monitor 15R");
        Component speaker = new Leaf(1500, "Sony Speaker");
        Component ram = new Leaf(7000, "Sandisk RAM");

        Composite computer = new Composite("Computer");
        Composite cabinet = new Composite("Computer Cabinet");
        Composite mBoard = new Composite("MB");
        Composite peripheral = new Composite("Computer peripheral");

        peripheral.addComponent(speaker);
        peripheral.addComponent(monitor);
        peripheral.addComponent(mouse);

        mBoard.addComponent(processor);
        mBoard.addComponent(ram);

        cabinet.addComponent(hdd);
        cabinet.addComponent(mBoard);

        computer.addComponent(cabinet);
        computer.addComponent(peripheral);


        computer.price();
    }
}
