package br.com.hyagosouzza.dsp20191.aulas0912.ap;

import br.com.hyagosouzza.dsp20191.aulas0912.ap.json.LerJson;
import br.com.hyagosouzza.dsp20191.aulas0912.ap.xml.LerXml;

public class Main {

    public static void main(String[] args) {
        System.out.println("Começa XML ------- \n");
        LerXml ler = new LerXml();
        ler.lerXml();
        System.out.println(" ------- Fim XML \n");

        System.out.println("Começa JSON ------- \n");
        LerJson lerJson = new LerJson();
        lerJson.lerArquivoJson();
        System.out.println("\n -------- Fim JSON");
    }

}
