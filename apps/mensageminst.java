package apps;
//a classe MSNMessenger é ou representa
public abstract class mensageminst {

public abstract void enviarmensagem();
public abstract void recebermensagem();

protected void conectado(){
    System.out.println("verificando se esta conectado a internet");
}
public void historico(){
    System.out.println("adicionado ao historico");
}
}

