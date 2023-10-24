package mensagem;

import apps.face;
import apps.mensageminst;
import apps.mensager;
import apps.telegram;

public  class pc {
                public static void main(String[] args) {

                         mensageminst smi = null;

                        String appEscolhido="tlg";

                        if(appEscolhido.equals("msn"))
                                smi = new mensager();
                        else if(appEscolhido.equals("fbm"))
                                smi = new face();
                        else if(appEscolhido.equals("tlg"))
                                smi = new telegram();


                        smi.enviarmensagem();
                        smi.recebermensagem();

                }
        }


