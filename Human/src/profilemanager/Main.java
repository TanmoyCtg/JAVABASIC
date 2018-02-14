package profilemanager;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Date today = new Date();
        int currentYear = today.getYear()+1900;
        int currentMonth = today.getMonth();
        System.out.println(currentMonth);
        System.out.println(currentYear);

    }
}
