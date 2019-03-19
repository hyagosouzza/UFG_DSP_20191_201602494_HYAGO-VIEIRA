package br.com.hyagosouzza.dsp20191.aulas0104.ap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Crud {

    private String filename;
    private BufferedReader reader;
    private BufferedWriter bufferedWriter;

    public Crud(String filename) throws IOException {
        this.filename = filename;
        this.bufferedWriter = new BufferedWriter(new FileWriter(filename));
        this.reader = new BufferedReader(new FileReader(filename));
    }

    public void createFile() throws IOException {
        String fileContent = "Hello Learner !! Estamos na aula de DSP.";

        this.bufferedWriter.write(fileContent);
    }

    public void readFile() throws IOException {
        String line;

        while ((line = this.reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
