public class Enseres{
    //Atributos
    private Double precioBase;
    private String color;
    private Integer tamano;

    //constantes
    private final Double PRECIO_BASE=200.0;
    private final String COLOR_BASE="negro";
    private final Integer TAMANO_BASE=1;

    //constructor
    public Enseres(){
        //this(PRECIO_BASE,TAMANO_BASE,COLOR_BASE);
        precioBase=PRECIO_BASE;
        color=COLOR_BASE;
        tamano=TAMANO_BASE;
    }
    // public Enseres(Double precioBase, Double tamano){
    //     //this(precioBase,tamano,COLOR_BASE);
    //     this.precioBase=precioBase;
    //     this.tamano=tamano;
    //     this.color=COLOR_BASE;
    // }
    // public Enseres(Double precioBase, Double tamano, String color){
    //     this.precioBase=precioBase;
    //     this.tamano=tamano;
    //     this.color=color;
    // }
    //Metodos
    private void comprobarColor(String color){

    }
    public void comprobarTamano(double tamano){

    }
    //Métodos publicos 
    /** Devuelve el precio base del enser */ 
    public Double getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Integer getTamano() {
        return tamano;
    }
    public void setTamano(Integer tamano) {
        this.tamano = tamano;
    }
    
}
