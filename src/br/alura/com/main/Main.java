package br.alura.com.main;

import br.alura.com.model.Endereco;
import br.alura.com.model.GeradorDeArquivo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ConsultaCep consulta = new ConsultaCep();
        System.out.println("Insira CEP que se deseja consultar");
        var cep = reader.nextLine();
        try {
            Endereco endereco = consulta.buscaEndereco(cep);
            System.out.println(endereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.generateJsonFile(endereco);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Erro detectado Finalizando Execução");
        }

    }
}