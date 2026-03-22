import java.util.*;

public class InputArray {
    public static void main(String[] args) {
        int marks[] = new int[3];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Physics marks = " + marks[0]);
        System.out.println("Maths marks = " + marks[1]);
        System.out.println("Chemistry marks = " + marks[2]);
    }
}
