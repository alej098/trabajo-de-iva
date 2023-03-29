import java.util.Scanner;
import java.util.Scanner;
public class funcion {
    public static double calcularIVA(int precio1){
        double Iva= precio1 * 0.20;
        return Iva;
    }
    public static void main(String[] args) {
        Scanner imform= new Scanner(System.in);
        int precioSinIva;
        double Iva;
        System.out.println("el precio sin iva es");
        precioSinIva= imform.nextInt();

        Iva= calcularIVA(precioSinIva);
        System.out.println("el precion con iva es"+(precioSinIva+Iva));
    }
}
