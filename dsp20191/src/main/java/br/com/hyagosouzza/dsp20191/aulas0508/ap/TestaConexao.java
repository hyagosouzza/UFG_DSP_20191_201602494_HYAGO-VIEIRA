package br.com.hyagosouzza.dsp20191.aulas0508.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestaConexao {

    public static void main(String[] args) {
        String dados[] = lerArquivo();
        Usuario usuario = new Usuario(dados);
        Conexao conexao = new Conexao(dados);

        System.out.println(usuario.toString());
        System.out.println(conexao.toString());
    }

    public static String[] lerArquivo() {

        String dados[] = new String[8];

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("src/main/resources/conexao.properties"));
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                String atributos[] = line.split("=");
                dados[i] = atributos[1];
                i++;
            }
            return dados;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return dados;
        } catch (IOException e) {
            e.printStackTrace();
            return dados;
        }

    }
}
