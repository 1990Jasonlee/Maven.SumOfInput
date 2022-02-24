/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main_object = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        //System.out.println(main_object.sumOfNum(3));
        //System.out.println(1+2+3);

        int newN = scanner.nextInt();
        int result = main_object.sumOfNum(newN);
        System.out.println(result);
        scanner.close();
    }

    int sumOfNum ( int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;

        }

    }
}
