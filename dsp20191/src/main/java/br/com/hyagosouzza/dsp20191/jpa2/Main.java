package br.com.hyagosouzza.dsp20191.jpa2;

import br.com.hyagosouzza.dsp20191.jpa2.entidades.Carro;
import br.com.hyagosouzza.dsp20191.jpa2.entidades.Endereco;
import br.com.hyagosouzza.dsp20191.jpa2.entidades.Loja;
import br.com.hyagosouzza.dsp20191.jpa2.entidades.Pessoa;
import br.com.hyagosouzza.dsp20191.jpa2.persistencia.carro.CarroRepositoryImpl;
import br.com.hyagosouzza.dsp20191.jpa2.persistencia.endereco.EnderecoRepositoryImpl;
import br.com.hyagosouzza.dsp20191.jpa2.persistencia.loja.LojaRepositoryImpl;
import br.com.hyagosouzza.dsp20191.jpa2.persistencia.pessoa.PessoaRepositoryImpl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        CarroRepositoryImpl carroRepository = new CarroRepositoryImpl();
        PessoaRepositoryImpl pessoaRepository = new PessoaRepositoryImpl();
        EnderecoRepositoryImpl enderecoRepository = new EnderecoRepositoryImpl();
        LojaRepositoryImpl lojaRepository = new LojaRepositoryImpl();

        //Setando Objetos
        Endereco endereco = new Endereco("11", "10B", "Francisco Barbosa", "SN");
        Pessoa pessoa = new Pessoa("08749278808", "Hyago", "hyagosouzza@hotmail.com", endereco);
        List<Pessoa> clientes = new List<Pessoa>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Pessoa> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Pessoa pessoa) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Pessoa> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Pessoa> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Pessoa get(int index) {
                return null;
            }

            @Override
            public Pessoa set(int index, Pessoa element) {
                return null;
            }

            @Override
            public void add(int index, Pessoa element) {

            }

            @Override
            public Pessoa remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Pessoa> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Pessoa> listIterator(int index) {
                return null;
            }

            @Override
            public List<Pessoa> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        clientes.add(pessoa);
        Loja loja = new Loja("Loja 1", "Goiás", "GO", clientes);
        Carro carro = new Carro("FIAT", "Uno", pessoa);

        //Criando objetos no banco
        enderecoRepository.create(endereco);
        pessoaRepository.create(pessoa);
        lojaRepository.create(loja);
        carroRepository.create(carro);

        //Fecha conexão com o banco
        System.out.println("Encerrando conexão...");
        carroRepository.close();
        pessoaRepository.close();
        enderecoRepository.close();
        lojaRepository.close();
    }

}
