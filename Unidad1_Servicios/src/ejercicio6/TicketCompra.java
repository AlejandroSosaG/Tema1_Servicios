package ejercicio6;

import java.util.Scanner;

public class TicketCompra {
    public static void main(String[] args) {
        int codProd, cant;
        double precio, total;
        Scanner sc = new Scanner(System.in);
        //System.out.println("Introduzca el código del producto");
        codProd = sc.nextInt();
        //System.out.println("Introduzca el precio del producto");
        precio = sc.nextDouble();
        //System.out.println("Introduzca el cantidad del producto");
        cant = sc.nextInt();
        total = precio * cant;
        //System.out.printf("%d - %.2f -%d - %.2f\n",codProd, precio, cant, total);
        System.out.print("Codigo: " + codProd + " , precio: " + precio + " , cantidad: " + cant + " , total: " + total);
        sc.close();
    }
}
