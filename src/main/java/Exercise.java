import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class Programmer {
    int salary = 40000;
}

public class Exercise extends Programmer {
    int bonus = 10000;

    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        System.out.println("Programmer salary is:" + exercise.salary);
        System.out.println("Programmer bonus is:" + exercise.bonus);


    }

}
