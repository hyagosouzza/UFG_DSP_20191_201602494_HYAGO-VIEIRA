package br.com.hyagosouzza.dsp20191.aulas2124.ead;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        try {
            String filename = "src/main/resources/aluno.dat";
            WriteDatFile writeDatFile = new WriteDatFile(filename);
            ReadDatFile readDatFile = new ReadDatFile(filename);
            ArrayList<Aluno> alunos = new ArrayList<Aluno>();
            Random rnd = new Random();

            int rangeMin = 4;
            int rangeMax = 10;

            for (int i = 0; i < 3; i++) {
                Double nota1 = rangeMin + (rangeMax - rangeMin) * rnd.nextDouble();
                Double nota2 = rangeMin + (rangeMax - rangeMin) * rnd.nextDouble();
                Double freq = (rangeMin + (rangeMax - rangeMin) * rnd.nextDouble()) / 10;
                alunos.add(new Aluno("Aluno " + i, rnd.nextLong(), "Disciplina X", freq,
                        nota1, nota2));
            }

            writeDatFile.writeFile(alunos);
            readDatFile.readFile();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
