public class CalcularBonificacion {

    private Double totalBonificacion;

    public double bonificacion1(Double valorVenta){
        totalBonificacion = (double) 0;
        totalBonificacion = valorVenta*0.08;

        if(valorVenta>1000000){
            totalBonificacion+=50000;
        }
        return totalBonificacion;
    }


}
