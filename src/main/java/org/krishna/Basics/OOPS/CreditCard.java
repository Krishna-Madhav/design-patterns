package org.krishna.Basics.OOPS;

public class CreditCard extends Card{

    public CreditCard(String cardNumber, String cardName) {
        super(cardNumber, cardName);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via " + this.getCardName() + "'s Credit card " );
    }
}
