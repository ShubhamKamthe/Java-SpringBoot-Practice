package com.java.basics.loops;

import java.util.List;

public class TransactionProcessor {

    public static void main(String[] args) {

        List<String> transactions = List.of("TXN1001", "TXN1002", "TXN1003");

        // ENHANCED FOR LOOP – cleanest for collections
        for (String txn : transactions) {
            System.out.println("Processing transaction: " + txn);
        }

        // WHILE LOOP – polling until no transaction left (ex: message queue)
        int retry = 0;
        while (retry < 3) {
            boolean success = sendToExternalService();
            if (success) {
                System.out.println("External call success");
                break;
            }
            retry++;
            System.out.println("Retrying... Attempt " + retry);
        }

        // FOR LOOP – use for iterating with index
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println("Indexed access [" + i + "] -> " + transactions.get(i));
        }
    }

    // Simulated external API call
    static boolean sendToExternalService() {
        return Math.random() > 0.5; // Random success/failure
    }
}
