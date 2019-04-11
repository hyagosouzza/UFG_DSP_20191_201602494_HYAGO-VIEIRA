package br.com.hyagosouzza.dsp20191.aulas0104.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Csv {

    public void run() {

        String arquivoCSV = "src/main/resources/UF.csv";
        BufferedReader bufferedReader = null;
        String linha = "";
        String csvDivisor = ",";

        try {
            List<UnidadeFederacao> ufs = new ArrayList<UnidadeFederacao>();
            bufferedReader = new BufferedReader(new FileReader(arquivoCSV));
            int i = 0;

            while ((linha = bufferedReader.readLine()) != null) {

                if (i != 0) {
                    UnidadeFederacao unidadeFederacao = new UnidadeFederacao(linha.split(csvDivisor));
                    ufs.add(unidadeFederacao);
                } else System.out.println();
                i++;

            }
            for (UnidadeFederacao uf : ufs) {
                System.out.println(uf.toString());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}