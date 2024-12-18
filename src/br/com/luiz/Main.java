package br.com.luiz;

import br.com.luiz.Class.Carro;

public class Main {
    public static void main(String[] args) {

        // Criando um objeto do tipo Carro
        Carro meuCarro = new Carro("Ford", "Fusion", 2020);

        // Exibindo informações do carro
        meuCarro.exibirInformacoes();

        // Ligando o carro
        meuCarro.ligar();

        // Tentando acelerar com o carro ligado
        meuCarro.acelerar();

        // Desligando o carro
        meuCarro.desligar();

        // Tentando acelerar com o carro desligado
        meuCarro.acelerar();
    }
}
