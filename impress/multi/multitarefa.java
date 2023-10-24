package impress.multi;

import impress.copiadora.copiadora;
import impress.digitalizadora.digitalizadora;
import impress.impressora.impressora;

public class multitarefa implements copiadora, impressora, digitalizadora {

    public void digitalizar() {
System.out.println("digitalizando via equipamento multi funcao");
    }


    public void copiar() {
        System.out.println("copiando via equipamento multi funcao");
    }

    public void imprimir() {
        System.out.println("imprimindo via equipamento multi funcao");
    }
}
