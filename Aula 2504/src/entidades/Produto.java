package entidades;

import java.util.Scanner;

public class Produto {

    Scanner leia = new Scanner(System.in);
    private String nomeProduto;
    private double precoProduto;
    private int qtdeProduto;

    public int getQtdeProduto() {
        return qtdeProduto;
    }

    public void setQtdeProduto(int qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void

    public Produto(){};

    public Produto(String nomeProduto, double precoProduto, int qtdeProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.qtdeProduto = qtdeProduto;
    }
    public void addProduto(int qtde){
        System.out.println("Quantidade de produtos a serem adicionados: ");
        int adicionar = leia.nextInt();
        qtdeProduto += adicionar;

        System.out.println("Nome: "+nomeProduto+"\n"+"Preço: "+precoProduto+"\n"+
                "Quantidade em Estoque: "+qtdeProduto);
    }

    public void removProduto(int qtde){
        System.out.println("Quantidade de produtos a serem removidos: ");
        int removido = leia.nextInt();
        qtdeProduto -= removido;

        System.out.println("Nome: "+nomeProduto+"\n"+"Preço: "+precoProduto+"\n"+
                "Quantidade em Estoque: "+qtdeProduto);
    }
}
