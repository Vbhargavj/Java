import java.util.Scanner;
public class vbj_13_each_loop {
    public static void main(String[] args) {        
        int arr[] = { 12, 3, 45, 6, 8, 4096, 2, 56, 23, 78 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to search in the array");
        int flag = 0,key = sc.nextInt();
        for (int var : arr) {
            if (var == key) {
                flag = 1;
                System.out.println(var +" is found");
                break;
            }            
        }
        if (flag == 0) {
            System.out.println(key+" Is not found");
        }
        sc.close();
    }
}