import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        String luzSemaforo = "Rojo";
        if(luzSemaforo.equals("Verde")){
            System.out.println("Avanzar");
        } else if (luzSemaforo.equals("Amarillo")) {
            System.out.println("Reducir velocidad");
        } else if (luzSemaforo.equals("Rojo")) {
            System.out.println("Parar");
        }

        for(int i = 0; i <= 13;i+=3){
            System.out.println(i); // Incremento definido de 3 en 3.
        }
        System.out.println("-----------");
        int tabla = 2;
        for(int i = 0; i < 10;i++){ // este incremento es de 1 en 1.
            System.out.println("el resultado de "+ i +"x"+tabla + " = " + i*tabla);
        }

        System.out.println("------while-----");
        int contador= 0;
        while(contador<=10){
            if((contador%2) == 0) {
                System.out.println("Resultado de " + tabla + "x" + contador + " =" + tabla * contador);
            }
            contador++;
        }
        System.out.println("--Sucesión---");
        int limite = 8;
        int a = 0;
        int b = 1;
        for(int i = 1;i<=limite; i++){  // Para planeación en HU - Sprints.
            System.out.println("Valor:" + a );
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        int n= 10;
        double sumatoria = 0;

        System.out.println("---promedio---");
        for(int i = 5; i<=n;i++){
            sumatoria += i;
        }
        double promedio = sumatoria/5;
        System.out.println("Promedio:" + promedio);


        System.out.println("Creación cuenta");
        String nombre = "Carlos Bolaños";
        String correo = "Carlos@gmail.com";
        String DNI = "1001010";
        int monto = 40000;
        int edad = 18;

        if(edad >= 18 && monto >= 50000){
            Cuenta miCuenta = new Cuenta(nombre,correo,DNI,monto,edad);
            System.out.println("Cuenta Creada Exitosamente " + miCuenta.getNumeroCuenta());
        }

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.remove(1);
        System.out.println(cars);
        System.out.println(cars.size());
        //cars.clear();
        //System.out.println(cars);
        cars.add("Mercedes");
        cars.add("Kia");
        for(int j = 0; j < cars.size(); j++){
            System.out.println(cars.get(j));
        }
        ArrayList<String> myCars = new ArrayList<String>();
        for(int i = 0; i< cars.size();i++){
            myCars.add(cars.get(i));
        }
        System.out.println(myCars);


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
        */

        Cliente cliente = new Cliente("Carlos",1500000.0);
        Cliente ana = new Cliente("Ana",900000.0);
        CalcularBonificacion calculo = new CalcularBonificacion();
        double comisionJuan = calculo.bonificacion(cliente.getTotalCompras());
        System.out.println(comisionJuan);
        //System.out.println("Total bonificaciones: "+ calculo.bonificacion(ana.getTotalCompras()));
        Vendedor vendedor = new Vendedor("Juanito");
        System.out.println(vendedor.infoSalario(comisionJuan));
    }
}
