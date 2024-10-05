package adapter_design_pattern;

import adapter_design_pattern.adaptee.FountainPen;

/**
 * Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
 */

public class PenAdapter implements Pen{

    FountainPen fountainPen = new FountainPen();

    @Override
    public void write(String str) {
        fountainPen.mark(str);
    }
}
