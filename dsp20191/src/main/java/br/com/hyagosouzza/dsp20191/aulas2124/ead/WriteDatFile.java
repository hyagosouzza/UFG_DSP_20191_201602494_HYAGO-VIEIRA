package br.com.hyagosouzza.dsp20191.aulas2124.ead;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteDatFile {
    private String filename;
    private BufferedReader reader;
    private BufferedWriter bufferedWriter;

    public WriteDatFile(String filename) throws IOException {
        this.filename = filename;
        this.bufferedWriter = new BufferedWriter(new FileWriter(filename));
        this.reader = new BufferedReader(new FileReader(filename));
    }

    public void writeFile(ArrayList<Aluno> alunos) {
        List<String> records = new ArrayList<String>();
        for (Aluno aluno: alunos) {
            records.add(aluno.toString());
        }
        try {
            for (String linha : records) {
                this.bufferedWriter.write(linha+"\n");
            }
            this.bufferedWriter.close();
            System.out.println("Arquivo " + filename + " criado com " + alunos.size() + " alunos.");
        } catch (Exception e) {
            System.err.format("Exception occurred trying to read '%s'.", filename);
            e.printStackTrace();
        }
    }

}
