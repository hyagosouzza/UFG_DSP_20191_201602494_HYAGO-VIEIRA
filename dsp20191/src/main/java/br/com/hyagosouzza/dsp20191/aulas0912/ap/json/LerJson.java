package br.com.hyagosouzza.dsp20191.aulas0912.ap.json;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import br.com.hyagosouzza.dsp20191.aulas0912.ap.models.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import static br.com.hyagosouzza.dsp20191.aulas0912.ap.json.EditarJson.editArquivoJson;
import static br.com.hyagosouzza.dsp20191.aulas0912.ap.json.GerarJson.criarArquivoJson;

public class LerJson {

    public void lerArquivoJson() {

        try {
            int i = 0;
            int posicao = 0;
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("src/main/resources/students.json"));
            Faculdade faculdade = gson.fromJson(bufferedReader, Faculdade.class);
            System.out.println(faculdade.getClasses());
            for (Student student : faculdade.getClasses().getStudents()){
                if (student.getMatricula().equals("201602494")) {
                    System.out.println("------------------------");
                    System.out.println(student.getMatricula());
                    System.out.println(student.getFirstname());
                    System.out.println(student.getLastname());
                    System.out.println(student.getNickname());
                    for (Aula aula : student.getFrequencia().getAulas()) {
                        System.out.println(aula.getNome());
                        System.out.println(aula.getText());
                    }
                    System.out.println("------------------------");
                    posicao = i;
                }
                else {
                    i++;
                }
            }
            criarArquivoJson(faculdade.getClasses().getStudents().get(posicao));
            editArquivoJson();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
