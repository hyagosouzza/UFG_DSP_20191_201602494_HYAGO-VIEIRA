package br.com.hyagosouzza.dsp20191.aulas2124.ead;

import java.io.*;

public class ReadDatFile {

    private BufferedReader reader;

    public ReadDatFile(String filename) throws IOException {
        this.reader = new BufferedReader(new FileReader(filename));
    }

    public void readFile() throws IOException {
        String line;

        while ((line = this.reader.readLine()) != null) {
            String array[] = line.split(",");

            System.out.println((new Aluno(array[0], Long.parseLong(array[1]), array[2], Double.parseDouble(array[3]),
                    Double.parseDouble(array[4]), Double.parseDouble(array[5]))).aprovado());
        }
    }
}
