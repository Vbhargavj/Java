import java.util.Scanner;
public class vbj_18_commas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of five numbers separated by commas: ");
        String str = sc.nextLine();
        String[] strArr = str.split(",");
        String lastNum = strArr[strArr.length - 1];
        System.out.println("The last number is: " + lastNum);
        sc.close();
    }
}
