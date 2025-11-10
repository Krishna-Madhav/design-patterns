package org.krishna.Basics.OOPS;

public class DebitCard extends Card{

    public DebitCard(String cardNumber, String cardName) {
        super(cardNumber, cardName);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via: " + this.getCardNumber() +" Debit card ");
    }
}
