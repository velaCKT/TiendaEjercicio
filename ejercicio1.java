import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Ingrese la cantidad de productos: ");
        int productos = sc.nextInt();

        System.out.print("Subtotal: ");
        double subtotal = sc.nextInt();

        System.out.println("¿Qué tipo de cliente eres?\n1-Frecuente\n2-Corporativo\n3-Subsidiado\n4-Salir");
        switch(sc.nextInt()){
            case (1):
                frecuente(productos, subtotal);
                
                break;
            case (2):
                corporativo(productos, subtotal);
                
                break;
            case (3):
                subsidiado(productos, subtotal);
                break;
            case (4):
                System.exit(0);
                break;
        }
        sc.close();
}


    private static void frecuente(int productos, double subtotal) {
        Scanner sc = new Scanner(System.in);
        if (productos >=10) {
            double descuento = 0.20;
            double valorDescuento = subtotal * descuento;
            double total = subtotal - valorDescuento;

            System.out.println("--------");
            System.out.println("Usted aplica para el descuento\nUsted tampoco paga IVA");
            System.out.println("Se le otorga un 20% de descuento");
            System.out.println("--------");
            System.out.println("Cantidad de productos:"+productos+"\nSubtotal:"+subtotal+"\nValor total:"+total);
            System.out.println("--------");
            
        
        }
        else {
            System.out.println("Usted no aplica para el descuento");
        }
        sc.close();
    }
    private static void corporativo(int productos, double subtotal) {
            double iva = 0.19;
            double valorIva = subtotal * iva;
            double total = subtotal + valorIva;

            System.out.println("--------");
            System.out.println("No aplica a ningun descuento y paga el 19% de IVA");
            System.out.println("--------");
            System.out.println("Cantidad de productos:"+productos+"\nSubtotal:"+subtotal+"\nValor total:"+total);
            System.out.println("--------");
    }


    private static void subsidiado(int productos, double subtotal) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué tipo de cliente subsidiado eres?\n1-Madre gestante\n2-Adulto mayor\n3-Primera infancia\n4-Salir");
        int sub = sc.nextInt();
        
        switch (sub) {
            case (1):
                mujerGestante(productos, subtotal);

                break;
            case (2):
                adultoMayor(productos, subtotal);

                break;
            case (3):
                primeraInfancia(productos, subtotal);

                break;
        }
        sc.close();
    }


    private static void mujerGestante(int productos, double subtotal) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Eres una mujer gestante?");
        String mujerGestante = sc.nextLine();


        System.out.print("Ingrese el nombre de la señora: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el teléfono: ");
        String telefono = sc.nextLine();

        System.out.print("Ingrese el equipo de fútbol del cual es hincha: ");
        String equipoFutbol = sc.nextLine();

        System.out.print("¿Cual es su edad?");
        int edadMujer = sc.nextInt();
        
        System.out.print("¿Tiene hijos? ");
        String tieneHijos = sc.nextLine();
        tieneHijos = sc.nextLine();

        System.out.print("¿Cuantos meses tiene el menor?");
        int edadHijo = sc.nextInt();
        

        double descuento = 0.25;

        double valorDescuento = subtotal * descuento;
        double total = subtotal - valorDescuento;

        boolean esMujer = mujerGestante.equalsIgnoreCase("Si");
        boolean esMayorDeEdad = edadMujer < 40;
        boolean hijos = tieneHijos.equalsIgnoreCase("Si");
        boolean edadHijos = edadHijo <= 24; 

        if ( esMujer && esMayorDeEdad && hijos && edadHijos ){
            System.out.println("--------");
            System.out.println("Se le otorga un 25% de descuento");
            System.out.println("Cantidad de productos:"+productos+"\nSubtotal:"+subtotal+"\nValor total:"+total);
            System.out.println("--------");
            System.out.println("Nombre:"+nombre+"\nTelefono:"+telefono+"\nHincha:"+equipoFutbol);
            System.out.println("--------");

        } 
        else{
            System.out.print("No aplica");
        }
        sc.close();
    }


    private static void adultoMayor(int productos, double subtotal) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del señor: ");
        String nombre = sc.nextLine();

        System.out.print("¿Cual es su edad?");
        int edadAdulto = sc.nextInt();

        System.out.print("Ingrese su direccion de recidencia: ");
        String direccion = sc.nextLine();
        direccion = sc.nextLine();


        double descuento = 0.40;

        double valorDescuento = subtotal * descuento;
        double total = subtotal - valorDescuento;


        boolean esMayorDeEdad = edadAdulto > 60;

        if (esMayorDeEdad){
            System.out.println("--------");
            System.out.println("Se le otorga un 40% de descuento");
            System.out.println("Cantidad de productos:"+productos+"\nSubtotal:"+subtotal+"\nValor total:"+total);
            System.out.println("--------");
            System.out.println("Nombre:"+nombre+"\nEdad:"+edadAdulto+"\nDireccion:"+direccion);
            System.out.println("--------");
        }
        else{
            System.out.println("No aplica al descuento");
        }

    }
    private static void primeraInfancia(int productos, double subtotal) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del acudiente: ");
        String nombreAcudiente = sc.nextLine();

        System.out.print("Ingrese el teléfono del acudiente: ");
        String telefonoAcudiente = sc.nextLine();

        System.out.print("Ingrese el nombre del niño: ");
        String nombreNiño = sc.nextLine();

        System.out.print("Ingrese el nombre del personaje favorito del niño: ");
        String nombrePersonaje = sc.nextLine();

        System.out.print("¿Los productos contienen azucar?");
        String productosAzucar = sc.nextLine();

        double descuento = 0.15;

        double valorDescuento = subtotal * descuento;
        double total = subtotal - valorDescuento;

        boolean azucar = productosAzucar.equalsIgnoreCase("No");

        if (azucar){
            System.out.println("--------");
            System.out.println("Se le otorga un 15% de descuento");
            System.out.println("Cantidad de productos:"+productos+"\nSubtotal:"+subtotal+"\nValor total:"+total);
            System.out.println("--------");
            System.out.println("Nombre del acudiente:"+nombreAcudiente+"\nTelefono del acudiente:"+telefonoAcudiente+"\nNombre del niño:"+nombreNiño+"\nNombre personaje favorito: "+nombrePersonaje);
            System.out.println("--------");
        }
        else{
            System.out.println("No aplica al descuento");
    }

}
}
