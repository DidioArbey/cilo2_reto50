public class Pupitres extends Enseres{
    //atributos
    private Integer compartimiento;
    private Boolean mesaTipoUniversitaria;
    private final Integer COMPARTIMIENTO_BASE=2;
    //Constructores
    public Pupitres() {
        super();
        this.compartimiento=COMPARTIMIENTO_BASE;
        this.mesaTipoUniversitaria=false;
    }
    public Pupitres(Double precioBase, Integer tamano){
        super(precioBase, tamano);
        this.compartimiento=COMPARTIMIENTO_BASE;
        this.mesaTipoUniversitaria=false;
    }
    public Pupitres(Double precioBase, Integer tamano, String color, Integer compartimiento, Boolean mesaTipoUniversitaria){
        super(precioBase, color, tamano);
        this.compartimiento=COMPARTIMIENTO_BASE;
        this.mesaTipoUniversitaria=false;
    }

    //metodos

    private Double comprobarAdicion(Integer compartimiento,Boolean mesaTipoUniversitaria){
        Double adicion=0.0;
        if(mesaTipoUniversitaria==true){
            adicion += 100.0;
        }
        if(compartimiento > 3){
            adicion += 50.0;
        }
        return adicion;

    }
    
    @Override
    public Double precioFinal(){
        return super.precioFinal()+comprobarAdicion(compartimiento, mesaTipoUniversitaria);
    }
}
