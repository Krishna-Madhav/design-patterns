package org.krishna.Basics.OOPS;

public abstract class Card implements PaymentMethod{


    /*
       1. default/package private - Visible within same package
       2. public - visibility everywhere
       3. private - visibility only within class
       4. protected - within class and child classes

     */

    protected String cardNumber;

    protected String cardName;

    public Card(String cardNumber, String cardName) {
        this.cardNumber = cardNumber;
        this.cardName = cardName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }


}
