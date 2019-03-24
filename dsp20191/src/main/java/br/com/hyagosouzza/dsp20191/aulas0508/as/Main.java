package br.com.hyagosouzza.dsp20191.aulas0508.as;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        Aluno hyago = new Aluno("Hyago Vieira", (long) 201602494, 5.0, 4.1);
        Aluno pedro = new Aluno("Pedro Henrique", (long) 201602512, 6.8, 7.6);

        FileOutputStream fileOutputStream;
        try {
            //instanciando o arquivo
            fileOutputStream = new FileOutputStream("src/main/resources/avaliacao.dat");

            //gravando no arquivo
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeUTF(hyago.toString());
            dataOutputStream.writeUTF(pedro.toString());

            lerArquivo();

            //fechando o arquivo
            fileOutputStream.close();
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void lerArquivo() {

        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/main/resources/avaliacao.dat"));

            while(dataInputStream.available() > 0) {
                String linha = dataInputStream.readUTF();
                String atributos[] = linha.split(",");
                String resultado;
                if((Double.parseDouble(atributos[2]) + Double.parseDouble(atributos[3])) / 2 >= 5.0) {
                    resultado = " foi Aprovado \n";
                } else {
                    resultado = " foi Reprovado \n";
                }
                System.out.println(linha + resultado);
            }
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
