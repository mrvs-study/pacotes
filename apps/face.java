package mensagem;

public class face extends mensageminst {

    public void enviarmensagem() {
        conectado();
        System.out.println("enviando mensagem pelo facebook");
    }
    public void recebermensagem() {
        System.out.println("recebendo mensagem pelo facebook");
    }

}
