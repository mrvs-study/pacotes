package scola;

public class escola {
    public static void main(String[] args) {
        aluno felipe = new aluno();
        felipe.setaluno("felipe junior");
        felipe.setIdade(17);
        System.out.println("o aluno "+ felipe.getAluno() + " tem "+ felipe.getIdade() );
    }
}
