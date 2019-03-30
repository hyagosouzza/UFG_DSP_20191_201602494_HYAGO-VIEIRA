package br.com.hyagosouzza.dsp20191.aulas0912.ap.json;

import br.com.hyagosouzza.dsp20191.aulas0912.ap.models.Aula;
import br.com.hyagosouzza.dsp20191.aulas0912.ap.models.Faculdade;
import br.com.hyagosouzza.dsp20191.aulas0912.ap.models.Student;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.List;

import static br.com.hyagosouzza.dsp20191.aulas0912.ap.json.GerarJson.criarArquivoJson;

public class EditarJson {

    public static void editArquivoJson() {

        try {
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("src/main/resources/students.json"));
            Faculdade faculdade = gson.fromJson(bufferedReader, Faculdade.class);

            for (Student student : faculdade.getClasses().getStudents()){
                if (student.getMatricula().equals("201602494")) {
                    List<Aula> aulas = student.getFrequencia().getAulas();

                    for (Aula aula : aulas) {
                        if (aula.getNome().equals("0104")) {
                            if (aula.getText().equals("P")) {
                                aula.setText("F");
                            } else {
                                aula.setText("P");
                            }
                        }
                    }
                }
            }

            Gson gsonReader = new Gson();
            String json = gsonReader.toJson(faculdade);
            FileWriter writer = new FileWriter("src/main/resources/students.json");
            writer.write(json);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
