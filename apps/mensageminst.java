package mensagem;
//a classe MSNMessenger é ou representa
public abstract class mensageminst {

public abstract void enviarmensagem();
public abstract void recebermensagem();
public abstract void salvarhistorico();
protected void conectado(){
    System.out.println("verificando se esta concetado a internet");
}
    }

