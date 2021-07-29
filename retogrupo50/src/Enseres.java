public class Enseres{
    //Atributos
    private Double precioBase;
    private String color;
    private Integer tamano;
    // private Double adicion =0.0;

    //constantes
    private final Double PRECIO_BASE=200.0;
    private final String COLOR_BASE="negro";
    private final Integer TAMANO_BASE=1;

    //constructor
    public Enseres() {
        this.precioBase=PRECIO_BASE;
        this.color=COLOR_BASE;
        this.tamano=TAMANO_BASE;
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

    private Double comprobarColor(String color){
        switch(color){
            case "negro" :
                return 100.0;
                break;
            case "cafe" :
                return 80.0;
                break;
            case "blanco":
                return 70.0;
                break;
            case "rojo" :
                return 50.0;
                break;
            default:
                return 0.0;
        }

    }

    private Double comprobarTamano(Integer tamano) throws Exception {
        try {
            if(tamano > 0 && tamano <= 1){
                return 200.0;
            } else if (tamano >1 && tamano <=2){
                return 300.0;
            } else if (tamano >2 && tamano <=3){
                return 400.0;
            } else if (tamano > 3 && tamano <=4 ){
                return 500.0;
            } else if (tamano > 4 && tamano <=5){
                return 600.0;
            } else if (tamano > 5 && tamano <=6){
                return 700.0;
            }else{
                return 0.0;
            }
        }catch(Exception e){
            System.err.println(e);
        }
    }

    public Double precioFinal(){
        //lo de los parentesis hace referencia a la adicion
        return precioBase + (this.comprobarTamano(tamano) + this.comprobarColor(color));

    }

    //Métodos publicos  Devuelve el precio base del enser 

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
