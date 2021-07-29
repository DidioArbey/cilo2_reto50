import org.graalvm.compiler.virtual.phases.ea.PartialEscapeBlockState.Final;

public class Asiento extends Enseres {

    // atributos
    private Integer peso;
    private final Integer PESO_BASE =30;
    // constructores
    public Asiento(){
        super();//invocar el constructor de la clase padre
        this.peso=PESO_BASE;
    }
    public Asiento(Double precioBase, Integer tamano){
        super(precioBase, tamano);//invocamos el constructor que tiene los parametros que necesitamos
        this.peso=PESO_BASE;
    }
    public Asiento(Double precioBase, Integer tamano, String color, Integer peso){
        super(precioBase, color, tamano);
        this.peso=peso;
    }
    //
}
