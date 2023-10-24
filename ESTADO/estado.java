public enum estado {
    SAO_PAULO = ("SP", "Sao Paulo"),
    MINAS_GERAIS("MG", "Minas Gerais"),
        ACRE ("AC", "Acre"),
            PERNAMBUCO ("PE", "Pernambuco");
    private String nome;
    private String sigla;
    private estado (String sigla, String nome){
        this.sigla=sigla;
        this.nome=nome;
    }
    public String getsigla(){
        return sigla;
    }
    public String getnome(){
        return nome;
    }
    public String getnomemaiusculo(){
        return nome.toUpperCase();
    }
}
