import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        int x=5;
        int y=3;
        int z=8;
        switch(number) {
            case 6:
                System.out.print("Данное значение имеется в константах") ;
                break;
            case 2:
                System.out.print("Данное значение имеется в константах");
                break;
            case 5:
                System.out.print("Данное значение имеется в константах");
                break;
            default:
                System.out.print("Такой константы нет!");
                break;
        }

    }
}