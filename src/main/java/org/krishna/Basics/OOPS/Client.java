package org.krishna.Basics.OOPS;

public class Client {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        paymentService.addPaymentMethods("KrishnaDebitCard", new DebitCard("K1234", "Krishna Madhav"));
        paymentService.addPaymentMethods("KrishnaCreditCard", new CreditCard("K5678", "Krishna Madhav"));
        paymentService.addPaymentMethods("KrishnaUPI", new UPI("KrishnaUPI"));
        paymentService.addPaymentMethods("KrishnaWallet", new Wallet());

        paymentService.makePayment("KrishnaDebitCard");
        paymentService.makePayment("KrishnaCreditCard");
        paymentService.makePayment("KrishnaUPI");
        paymentService.makePayment("KrishnaWallet");
    }
}

