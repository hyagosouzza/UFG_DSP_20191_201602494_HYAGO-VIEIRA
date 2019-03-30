package br.com.hyagosouzza.dsp20191.aulas0912.ap.xml;

import org.dom4j.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class EditarXml {

    public static void editAula0104InXml() {

        try {
            File inputFile = new File("src/main/resources/students.xml");
            SAXReader reader = new SAXReader();
            Document document = reader.read(inputFile);

            List<Node> nodes = document.selectNodes("/class/student");

            for (Node node : nodes) {
                List<Node> aulas = node.selectSingleNode("frequencia").selectNodes("aulas");

                for (Node aula : aulas) {
                    if (node.selectSingleNode("matricula").getText().equals("201602494")) {
                        if (aula.valueOf("@numero").equals("0104")) {
                            if(aula.getText().equals("P")) {
                                aula.setText("F");
                            } else {
                                aula.setText("P");
                            }
                        }
                    }
                }
            }

            XMLWriter output = new XMLWriter(
                    new FileWriter(new File("src/main/resources/students.xml")));
            output.write(document);
            output.close();
            System.out.println("\nArquivo students.xml editado!\n");
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
