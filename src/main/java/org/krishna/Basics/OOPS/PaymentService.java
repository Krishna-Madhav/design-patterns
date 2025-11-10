package org.krishna.Basics.OOPS;

import java.util.HashMap;
import java.util.Map;

/**
 *  PaymentService is responsible for storing the payment types and perform payments
 */
public class PaymentService {

    Map<String, PaymentMethod> paymentMethodMap;

    PaymentService() {
        paymentMethodMap = new HashMap<>();

        paymentMethodMap.put("DefaultDebitCard", new DebitCard("1111", "DefaultDebitCard"));
        paymentMethodMap.put("DefaultCreditCard", new CreditCard("2222", "DefaultCreditCard"));

    }

    public void addPaymentMethods(String name, PaymentMethod paymentMethod){
        paymentMethodMap.put(name, paymentMethod);
    }

    // Here we pass name of the payment type like UPI, Debit Card, credit card
    public void makePayment(String name){
        // Here we fetch payment method using Map
        // The reason for choosing this is that if we make it like CreditCard/DebitCard/UPI etc. then we won't be having dynamic dispatch or run time polymorphism.
        // This also makes software loosely coupled

        PaymentMethod paymentMethod = paymentMethodMap.get(name);

        // call the payment method // this is also run time polymorphism
        paymentMethod.pay();
    }
}
