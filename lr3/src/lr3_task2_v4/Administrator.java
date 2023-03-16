package lr3_task2_v4;

public class Administrator {
    private String NameOfAdministrator;
    public Administrator(String nameOfAdministrator){
        this.NameOfAdministrator = nameOfAdministrator;
    }
    public void blockedCreditCard(CreditCard creditCard){
        if(creditCard.getBalance() > creditCard.getCreditLimit()){
            System.out.println("Limit has been exceeded. CreditCard will be blocked...");
            creditCard.block();
        }else {
            System.out.println("Limit has not been exceeded");
        }
    }
}
