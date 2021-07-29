public class PrecioTotal {
    //atributos
    private Double sumaEnseres;
    private Double sumaAsientos;
    private Double sumaPupitres;
    private Enseres[] listaEnseres;
    //Constructores
    public PrecioTotal(Enseres[] listaEnseres) {
        this.listaEnseres = listaEnseres;
    }
    //metodos
    public void mostrarTotales(){
        System.out.println("La suma del precio de los Enseres es de " + sumaEnseres);
        System.out.println("La suma del precio de los Asientos es de " + sumaAsientos);
        System.out.println("La suma del precio de los Pupitres es de " + sumaPupitres);
    }
}
