import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*
        System.out.println("Quiz");
        ArrayList<Double> compras = new ArrayList<Double>();
        Scanner scan = new Scanner(System.in);
        double total = 0;
        int mayores100 = 0;
        int menores100 = 0;
        for(int i = 0; i<5;i++){
            System.out.println("Ingresa el valor de la compra: " + (1+i));
            double compra = scan.nextDouble();
            compras.add(compra);
            total += compra;
            if(compra>=100){
                mayores100++;
            }else{
                menores100++;
            }
        }
        System.out.println("ventas totales: " + total);
        System.out.println("Ventas mayores o iguales a 100: " + mayores100);
        System.out.println("Ventanas menores a 100: " + menores100);


        Cliente cliente = new Cliente("Carlos",1500000.0);
        Cliente ana = new Cliente("Ana",900000.0);
        CalcularBonificacion calculo = new CalcularBonificacion();
        double comisionJuan = calculo.bonificacion(cliente.getTotalCompras());
        System.out.println(comisionJuan);
        double comision = calculo.bonificacion(ana.getTotalCompras());
        Vendedor vendedor = new Vendedor("Juanito");
        vendedor.infoSalario(comisionJuan);

        */

        Scanner sca = new Scanner(System.in);
        int sumaTotal = 0;
        int tamanoArray = 5;
        int contador = 0;
        int[] numeros = new int[tamanoArray];
        while(contador<tamanoArray){
            System.out.println("Ingrese número: " +(1+contador));
            numeros[contador] = sca.nextInt();
            contador++;
        }
        contador = 0;
        while(contador<tamanoArray){
            sumaTotal+=numeros[contador];
            contador++;
        }
        System.out.println("Suma total: " + sumaTotal);


    }
}
