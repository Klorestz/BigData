package lr5_v2_task2;

import java.util.Comparator;

public class CustomerCompare implements Comparator<Customer> {
    public int compare(Customer p1, Customer p2) {
        int result = p1.getLastName().compareTo(p2.getLastName());
        if (result != 0) {
            return result;
        }

        result = p1.getFirstName().compareTo(p2.getFirstName());
        if (result != 0) {
            return result;
        }

        return p1.getMiddleName().compareTo(p2.getMiddleName());
    }

}
