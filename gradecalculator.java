import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int[] a = new int[6];
        int t = 0, avg;
        System.out.println("Enter Your Marks out of 100:");
        for (int i = 0; i < 6; i++) {
            a[i] = c.nextInt();
            t += a[i];
        }
        avg = t / 6;
        char g;
        if (avg > 90) {
            g = 'A';
        } else if (avg > 80 && avg <= 90) {
            g = 'B';
        } else if (avg > 70 && avg <= 80) {
            g = 'C';
        } else {
            g = 'D';
        }
        System.out.println("Total Marks=" + t);
        System.out.println("Average Percentage: " + avg);
        System.out.println("Your Grade is: " + g);
    }
}
