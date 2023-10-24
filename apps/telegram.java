package mensagem;

public class telegram extends mensageminst {

    public void enviarmensagem() {
        conectado();
        System.out.println("enviando mensagem pelo telegram");
    }
    public void recebermensagem() {
        System.out.println("recebendo mensagem pelo telegram");
    }

}
