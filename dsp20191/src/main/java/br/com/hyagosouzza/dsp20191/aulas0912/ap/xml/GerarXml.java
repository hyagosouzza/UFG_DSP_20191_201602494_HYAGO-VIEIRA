package br.com.hyagosouzza.dsp20191.aulas0912.ap.xml;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.*;
import java.util.List;

import org.dom4j.Node;

public class GerarXml {

    public static void gerarArquivoXml(Node node) {
        try {
            Document document = DocumentHelper.createDocument();
            Element root = document.addElement("class");
            Element studentElement = root.addElement("student");

            studentElement.addElement("matricula").addText(node.selectSingleNode("matricula").getText());
            studentElement.addElement("firstname").addText(node.selectSingleNode("firstname").getText());
            studentElement.addElement("lastname").addText(node.selectSingleNode("lastname").getText());
            studentElement.addElement("nickname").addText(node.selectSingleNode("nickname").getText());
            studentElement.addElement("frequencia");

            List<Node> freqs = node.selectSingleNode("frequencia").selectNodes("aulas");

            for (Node freq : freqs) {
                studentElement.element("frequencia").addElement("aulas")
                        .addAttribute("numero", freq.valueOf("@numero")).addText(freq.getText());
            }

            XMLWriter output = new XMLWriter(
                    new FileWriter(new File("src/main/resources/hyago.xml")));
            output.write(document);
            output.close();
            System.out.println("Arquivo hyago.xml criado!");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
