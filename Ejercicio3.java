import java.util.Scanner;

/*Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa. */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        num[0] = sc.nextInt();
        num[1] = sc.nextInt(); 
        num[2] = sc.nextInt(); 
        num[3] = sc.nextInt(); 
        num[4] = sc.nextInt(); 
        num[5] = sc.nextInt(); 
        num[6] = sc.nextInt();
        num[7] = sc.nextInt(); 
        num[8] = sc.nextInt(); 
        num[9] = sc.nextInt(); 
        for (int i = 0;i<10;i++){
            System.out.println();
        }
    }
}
