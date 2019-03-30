package br.com.hyagosouzza.dsp20191.aulas0912.ap.xml;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import static br.com.hyagosouzza.dsp20191.aulas0912.ap.xml.EditarXml.editAula0104InXml;
import static br.com.hyagosouzza.dsp20191.aulas0912.ap.xml.GerarXml.gerarArquivoXml;

public class LerXml {

    public void lerXml() {
        try {
            File inputFile = new File("src/main/resources/students.xml");
            SAXReader reader = new SAXReader();
            Document document = reader.read( inputFile );

            System.out.println("Lendo XML... \n");

            List<Node> nodes = document.selectNodes("/class/student");

            for (Node node : nodes) {
                System.out.println("Matrícula : "
                        + node.selectSingleNode("matricula").getText());
                System.out.println("First Name : "
                        + node.selectSingleNode("firstname").getText());
                System.out.println("Last Name : "
                        + node.selectSingleNode("lastname").getText());
                System.out.println("First Name : "
                        + node.selectSingleNode("nickname").getText());

                List<Node> freqs = node.selectSingleNode("frequencia").selectNodes("aulas");

                for (Node freq : freqs) {
                    System.out.println("Frequencia " + freq.valueOf("@numero") + " : "
                            + freq.getText());
                }

                System.out.println();
            }

            for(Node node : nodes) {
                if (node.selectSingleNode("matricula").getText().equals("201602494")) {
                    gerarArquivoXml(node);
                    editAula0104InXml();
                }
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

}
