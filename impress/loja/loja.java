package impress.loja;

import impress.copiadora.copiadora;
import impress.digitalizadora.digitalizadora;
import impress.digitalizadora.scaner;
import impress.impressora.eject;
import impress.impressora.impressora;
import impress.impressora.lasy;
import impress.multi.multitarefa;



public class loja {
    public static void main(String[] args) {

        scaner sc = new scaner();

        multitarefa em = new multitarefa();

        copiadora Copiadora = em;

        digitalizadora Digitalizadora = em;

        impressora pk = new multitarefa();

        pk.imprimir();
        Copiadora.copiar();
        Digitalizadora.digitalizar();
    }
}
