package br.com.hyagosouzza.dsp20191.aulas0912.ap.json;

import br.com.hyagosouzza.dsp20191.aulas0912.ap.models.Aula;
import br.com.hyagosouzza.dsp20191.aulas0912.ap.models.Faculdade;
import br.com.hyagosouzza.dsp20191.aulas0912.ap.models.Student;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class GerarJson {

    public static void criarArquivoJson(Student item) {
        try {
            Gson gsonReader = new Gson();
            String json = gsonReader.toJson(item);
            FileWriter writer = new FileWriter("src/main/resources/hyago.json");
            writer.write(json);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
