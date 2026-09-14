import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOuput {
    public static void main(String[] args) {

//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);

//        int num = Integer.parseInt(bf.readLine());
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

        sc.close();
    }
}
