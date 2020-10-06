import java.util.Scanner;

public class ex1 {
    public static int tiGia(int dola) {

        int tienviet;
        return tienviet = dola * 23000;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter $: ");
        int x = in.nextInt();
        System.out.println("Money_Viet : " + tiGia(x));
    }
}
