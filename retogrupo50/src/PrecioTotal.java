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
    private void sumaPrecioPupitres(){
        sumaPupitres=0.0;
        for(int i = 0; i<listaEnseres.length;i++){
            if(listaEnseres[i] instanceof Pupitres){
                sumaPupitres += listaEnseres[i].precioFinal();
            }
        }
    }
    
    private void sumaPrecioAsientos(){
        sumaAsientos=0.0;
        for (Enseres enseres : listaEnseres) {
            if(enseres instanceof Asiento){
                sumaAsientos += enseres.precioFinal();
            }
        }
    }

    private void sumaPrecioEnseres(){
        sumaEnseres=0.0;
        for(int i =0; i<listaEnseres.length;i++){
            sumaEnseres += listaEnseres[i].precioFinal();
        }
        sumaEnseres -= (sumaAsientos + sumaPupitres);
    }

    public void mostrarTotales(){
        sumaPrecioPupitres();
        sumaPrecioAsientos();
        sumaPrecioEnseres();
        System.out.println("La suma del precio de los Enseres es de " + sumaEnseres);
        System.out.println("La suma del precio de los Asientos es de " + sumaAsientos);
        System.out.println("La suma del precio de los Pupitres es de " + sumaPupitres);
    }
}
