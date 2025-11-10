package org.krishna.Basics.OOPS;

public class UPI implements PaymentMethod{

    private String upiID;

    public UPI(String upiID) {
        this.upiID = upiID;
    }

    @Override
    public void pay() {
        System.out.println("Making payment via UPI: "+ upiID);
    }
}
