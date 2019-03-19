package br.com.hyagosouzza.dsp20191.aulas0104.ap;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //Primeira parte, trabalhando com arquivo .txt
        Crud crud = new Crud("src/main/resources/samplefile.txt");

        Write write = new Write("src/main/resources/samplefile.txt");

        try {
            crud.createFile();
            System.out.println("Arquivo simplefile.txt criado!\n");
            write.writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Houve um erro ao criar o arquivo simplefile.txt");
        }

        //Segunda parte, arquivo csv
        Csv csv = new Csv();
        csv.run();
    }
}
