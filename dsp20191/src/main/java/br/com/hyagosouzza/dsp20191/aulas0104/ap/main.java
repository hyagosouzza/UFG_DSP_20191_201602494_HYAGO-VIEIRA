package br.com.hyagosouzza.dsp20191.aulas0104.ap;

import br.com.hyagosouzza.dsp20191.aulas0104.ap.crud;

import java.io.IOException;

public class main {

    public static void main(String[] args) {
        try {
            crud.createFile();
            System.out.println("Arquivo simplefile.txt criado!");
            try {
                crud.readFile();
            } catch (IOException err) {
                err.printStackTrace();
                System.out.println("Houve um erro ao ler o arquivo simplefile.txt");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Houve um erro ao criar o arquivo simplefile.txt");
        }
    }
}
