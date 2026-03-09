public class Main {
    public static void main(String[] args){
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




    }
}
