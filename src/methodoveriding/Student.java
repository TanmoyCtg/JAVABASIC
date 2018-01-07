package methodoveriding;

import java.util.Scanner;
import java.lang.String;

class Student {
     String getResult(){
        String category[] = new String[5];
        int weight [] = new int[5];
        int score [] = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        return name;

    }

}
class A extends Student{
    String getResult(){
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        return name;
    }
}

