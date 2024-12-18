package br.com.luiz.Class;

/**
 * A classe Carro representa um carro com atributos básicos como marca, modelo e ano.
 * Ela oferece métodos para ligar, desligar, acelerar e exibir as informações do carro.
 */
public class Carro {

    // Atributos (propriedades) do carro
    private String marca;  // Marca do carro
    private String modelo; // Modelo do carro
    private int ano;       // Ano de fabricação do carro
    private boolean ligado; // Indica se o carro está ligado ou desligado

    /**
     * Construtor para inicializar os atributos do carro.
     *
     * @param marca A marca do carro
     * @param modelo O modelo do carro
     * @param ano O ano de fabricação do carro
     */
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;  // Por padrão, o carro começa desligado
    }

    /**
     * Liga o carro se ele não estiver ligado.
     */
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    /**
     * Desliga o carro se ele estiver ligado.
     */
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    /**
     * Acelera o carro se ele estiver ligado.
     * Caso contrário, exibe uma mensagem de erro.
     */
    public void acelerar() {
        if (ligado) {
            System.out.println("O carro está acelerando.");
        } else {
            System.out.println("Não é possível acelerar, o carro está desligado.");
        }
    }

    /**
     * Exibe as informações do carro, como marca, modelo, ano e o status (ligado ou desligado).
     */
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }

    // Métodos getters e setters para os atributos

    /**
     * Obtém a marca do carro.
     *
     * @return A marca do carro
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define a marca do carro.
     *
     * @param marca A nova marca do carro
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtém o modelo do carro.
     *
     * @return O modelo do carro
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define o modelo do carro.
     *
     * @param modelo O novo modelo do carro
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtém o ano de fabricação do carro.
     *
     * @return O ano de fabricação do carro
     */
    public int getAno() {
        return ano;
    }

    /**
     * Define o ano de fabricação do carro.
     *
     * @param ano O novo ano de fabricação do carro
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
}
