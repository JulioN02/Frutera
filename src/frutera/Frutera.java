package frutera;

import java.util.Scanner;

public class Frutera {

    public static void main(String[] args) {

        String[] Frutas = new String[5];
        Frutas[0] = "Pera";
        Frutas[1] = "Manzana";
        Frutas[2] = "Ciruela";
        Frutas[3] = "Banano";
        Frutas[4] = "Piñas";

        int[] Precios = new int[5];
        Precios[0] = 450;
        Precios[1] = 560;
        Precios[2] = 30;
        Precios[3] = 80;
        Precios[4] = 1000;

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Frutas disponibles y sus precios");
        for (int i = 0; i < 5; i++) {
            System.out.println("Fruta: "+Frutas[i]);
            System.err.println("Precio: "+Precios[i]);
        }
        System.out.println("Ingrese la fruta de su eleccion");
        String FrutaEscogida = sc.nextLine();
        int Pos=-1;
        for (int i = 0; i < 5; i++) {
            if (FrutaEscogida.equals(Frutas[i])) {
                System.out.println("Fruta escogida es: " + Frutas[i]);
                System.out.println("Precio de la fruta es: " + Precios[i]);
                Pos=i;
            }
        };
        System.out.println("Ingrese la cantidad de unidades que quiere llevar");
        int Cantidad = sc.nextInt();
        int PrecioTotal = Precios[Pos] * Cantidad;

        System.out.println("----------------FACTURA----------------");
        System.out.println("Fruta escogida: " + FrutaEscogida);
        System.out.println("Cantidad: " + Cantidad);
        System.out.println("Precio Total a Pagar: "+PrecioTotal);
        System.out.println("---------------------------------------");

    }

}
