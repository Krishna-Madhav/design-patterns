package adapter_design_pattern;

/*
 * Here in this case we don't have any implementation of Pen interface.
 * However, we do have a pen (FountainPen) from someone else.  This fountain pen is not of type 'pen' interface.
 * So we adapt the implementation of FoutainPen using an Adpater class called PenAdapter.
 * This class can convert or adapt any concrete implementation like GelPen, BallPen, PilotPen and so on to 'Pen' interface type
 *
 * Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
 */

public class School {

    public static void main(String[] args) {

        Pen adapter = new PenAdapter();
        Assignment assignment = new Assignment();
        assignment.setPen(adapter);
        assignment.writeAssignment("I'm writing my assignment");
    }
}
