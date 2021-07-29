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
    // get del atributo peso
    public Integer getPeso() {
        return peso;
    }
    //Metodos

    private Double comprobarPeso(Integer peso){
        if(peso > 65){
            return 50.0;
        }else{
            return 0.0;
        }

    }

    @Override
    public Double precioFinal(){
        return super.precioFinal()+ comprobarPeso(peso);

    }

}
