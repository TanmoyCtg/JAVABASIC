import java.util.Scanner;

public class SimpleArray {

    public static void main(String[] args){
        System.out.println("Enter three numbers: ");
        double x, y, z;
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        double avg = Average(x,y,z);
        double a = addition(x,y,z);
        System.out.println("The total average is: "+avg);
        System.out.println("The total sum is: "+a);
    }

    private static double Average(double num1,double num2,double num3){
        double avg = num1+num2+num3/3.0;
        return avg;
    }
    private static double addition(double num1,double num2, double num3){
        return num1 + num2 + num3;
    }
}
