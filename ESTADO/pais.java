package ESTADO;

public class pais {
    public static void main(String[] args) {
        for (estado e: estado.values()){
            System.out.println(e.getsigla()+ " e " + e.getnome());
        }
        estado eb = estado.SAO_PAULO;
        System.out.println(eb.getsigla()+" " + eb.getnome()+" "+ eb.getnomemaiusculo());
    }
}
