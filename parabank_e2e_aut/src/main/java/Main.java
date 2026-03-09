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
    }
}
