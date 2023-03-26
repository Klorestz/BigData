package lr5_v2_task2;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerArray {
    private ArrayList<Customer> CustomerArray;
    public CustomerArray(){
        CustomerArray = new ArrayList<Customer>();
    }
    public void addCustomer(Customer C){
        CustomerArray.add(C);
    }
    public void ptintlAllCustomer(){
        for (Customer customer : CustomerArray){
            System.out.println(customer.toString());
        }
    }
    public void printCustomersInAlphabeticalOrder(){
        Collections.sort(CustomerArray, new CustomerCompare());
        ptintlAllCustomer();
    }
    public void printCreidtCardNumberInRange(int n1, int n2) throws CustomerNotFoundException{
        boolean flag = false;
        for (Customer customer : CustomerArray){
            if (customer.getCreditCardNumber() >= n1 && customer.getCreditCardNumber() <= n2){
                System.out.println(customer.toString());
                flag = true;
            }
        }
        if (flag == false) {
            throw new CustomerNotFoundException("В предложенном диапазоне нет кредитных карт");
        }
    }
}
