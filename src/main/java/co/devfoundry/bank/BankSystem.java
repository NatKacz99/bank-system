package co.devfoundry.bank;

class BankSystem {
    void transferMoney(){
        System.out.println("Transfer money.");
    }
    boolean validatePin(){
        System.out.println("Validate PIN - PIN is correct");
        return true;
    }
    boolean validateTransaction(){
        System.out.println("Validated transaction.");
        return true;
    }
    void getTransactionHistory(){
        System.out.println("Transaction history");
    }
}
