package lr5_v2_task2;


import java.util.Scanner;

public class lr5_v2_task2 {
    public static void main(String[] args) throws CustomerNotFoundException {
        CustomerArray customerArray = new CustomerArray();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите кол-во покупателей:");
        String input_size = in.nextLine();

        try {
            Integer.parseInt(input_size);
        }
        catch (NumberFormatException e){
            System.out.println("Ошибка: введенное значение не является целым числом");
        }

        for (int i=0; i<Integer.parseInt(input_size); i++){
            System.out.println("Введите id, имя, фамилию, отчество покупателя:");
            String id = in.nextLine();
            String lastName = in.nextLine();
            String name = in.nextLine();
            String middleName = in.nextLine();
            try {
                Integer.parseInt(id);
            }
            catch (NumberFormatException e){
                System.out.println("Ошибка: id может быть только целым числом");
            }
            System.out.println("Введите номер карты и номер счёта покупателя:");
            String cardNumber = in.nextLine();
            String accountNumber = in.nextLine();
            try {
                Integer.parseInt(cardNumber);
                Integer.parseInt(accountNumber);
            }
            catch (NumberFormatException e){
                System.out.println("Ошибка: непаравильно указан номер карты или номер аккаунта покупателя");
            }
            customerArray.addCustomer(new Customer(Integer.parseInt(id), lastName, name, middleName,"Moscow", Integer.parseInt(cardNumber), Integer.parseInt(accountNumber)));

        }

        System.out.println("Полный список покупателей:");
        customerArray.ptintlAllCustomer();
        System.out.println();
        System.out.println("Покупатели в алфавитном порядке:");
        customerArray.printCustomersInAlphabeticalOrder();
        System.out.println();
        System.out.println("Номера кредитных карт в заданном диапазоне:");
        customerArray.printCreidtCardNumberInRange(20_000, 30_000);
    }
}
