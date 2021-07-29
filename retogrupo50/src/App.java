
public class App {
    public static void main(String[] args) throws Exception {
        Enseres enser[]=new Enseres[5];
        enser[0]=new Enseres(200.0, "rojo", 1);
        enser[1]=new Asiento(150.0, 5);
        enser[2]=new Pupitres(500.0, 10, "verde", 4, false);
        enser[3]=new Enseres();
        enser[4]=new Enseres(600.0, "morado", 4);
        PrecioTotal analisis1 = new PrecioTotal(enser);
        analisis1.mostrarTotales();
        Enseres enser1[]=new Enseres[9];
        enser1[0]=new Enseres(0.0,"azul",0);
        enser1[1]=new Asiento(150.0, 1,"cafe", 65);
        enser1[2]=new Pupitres(700.0, 3, "negro", 4, true);
        enser1[3]=new Enseres(0.0, "blanco", 0);
        enser1[4]=new Asiento(300.0, 1);
        enser1[5]=new Pupitres(700.0, 3);
        enser1[6]=new Enseres();
        enser1[7]=new Asiento();
        enser1[8]=new Pupitres();
        PrecioTotal analisis2 = new PrecioTotal(enser1);
        analisis2.mostrarTotales();
            }
}
