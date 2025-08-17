package co.devfoundry.bank;

public class AtmMachineFacade {
    private BankSystem bankSystem;
    private AtmMachine atmMachine;

    public AtmMachineFacade() {
        bankSystem = new BankSystem();
        atmMachine = new AtmMachine();
    }

    public void withdrawMoney(){
        atmMachine.enterPin();
        if(bankSystem.validatePin() && bankSystem.validateTransaction()){
            atmMachine.withdrawCash();
        }
    }
}
