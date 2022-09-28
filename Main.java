import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Produto prod1 = new Produto(sc.nextLine(),sc.nextLine(),sc.nextInt());

        Lote lote1 = new Lote(sc.nextInt(),sc.nextLine(),prod1);


    }
}
