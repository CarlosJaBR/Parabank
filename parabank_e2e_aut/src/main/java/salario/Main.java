package salario;

public class Main {
    public static void main(String[] args){
        EmpleadoTCompleto emp1 = new EmpleadoTCompleto("Jhon","Doe",1,2100000.00,"Indefinido",500000.00);
        EmpleadoTPorHoras emp2 = new EmpleadoTPorHoras("Ana","Doe",34,120,16000.0);

        System.out.println("Salario de: " + emp1.getNombreEmpleado() + " $ " + emp1.calcularSalario());
        System.out.println("Salario de: " + emp2.getNombreEmpleado() + " $ " + emp2.calcularSalario());

    }
}
