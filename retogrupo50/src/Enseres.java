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
    public Enseres() {
    }

    public Enseres(Double precioBase, String color, Integer tamano) {
        this.precioBase = precioBase;
        this.color = color;
        this.tamano = tamano;
    }

    public Enseres(Double precioBase, Integer tamano) {
        this.precioBase = precioBase;
        this.tamano = tamano;
        this.color = COLOR_BASE;
    }
    //Metodos

    private void comprobarColor(String color){

    }
    public void comprobarTamano(Integer tamano){

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
