package br.com.hyagosouzza.dsp20191.aulas0104.ap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Write {

    private String filename;
    private BufferedReader reader;
    private BufferedWriter bufferedWriter;
    private Crud crud;

    public Write(String filename) throws IOException {
        this.filename = filename;
        this.bufferedWriter = new BufferedWriter(new FileWriter(filename));
        this.reader = new BufferedReader(new FileReader(filename));
        this.crud = new Crud(filename);
    }

    public void writeFile() {
        List<String> records = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            records.add(i, "Linha " + i + " adicionada ao arquivo");
        }
        try {
            for (String linha : records) {
                this.bufferedWriter.newLine();
                this.bufferedWriter.write(linha);
            }
            this.bufferedWriter.close();
            this.crud.readFile();
        } catch (Exception e) {
            System.err.format("Exception occurred trying to read '%s'.", filename);
            e.printStackTrace();
        }
    }
}
