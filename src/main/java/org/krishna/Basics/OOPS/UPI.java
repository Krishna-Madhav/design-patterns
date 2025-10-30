package org.krishna.Basics.OOPS;

public class UPI implements PaymentMethod{

    private String upiID;

    @Override
    public void pay() {
        System.out.println("Making payment via UPI "+ upiID);
    }
}
