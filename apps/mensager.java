package apps;

import apps.mensageminst;

public class mensager extends mensageminst {

    public void enviarmensagem() {
        conectado();
        System.out.println("enviando mensagem pelo mensager");
    }
    public void recebermensagem() {
        System.out.println("recebendo mensagem pelo mensager");
historico();
    }




}

