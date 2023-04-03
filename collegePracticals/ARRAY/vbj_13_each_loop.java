import java.util.Scanner;

public class vbj_13_each_loop {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int flag = 0,key = sc.nextInt();
        for (int var : arr) {
            if (var == key) {
                flag = 1;
                System.out.println(var +" is found");
                break;
            }
            
        }
        if (flag == 0) {
            System.out.println("Value not found");
        }
        sc.close();
    }
}
