package aplicacao;

import entidades.Produto;
import entidades.ServidorPublico;

public class Programa
{
    public static void main(String[] args) {

//        ServidorPublico isabela = new ServidorPublico();
//        isabela.setNome("Isabela");
//        isabela.setCargo("Auditor");
//        isabela.setOrgao("ANVISA");
//        isabela.setLotacao("Brasília");
//        isabela.setEmail("isabela@gmail.com");
//
//        System.out.println("Servidora: "+isabela.getNome());
//
//        ServidorPublico heila = new ServidorPublico();
//        ServidorPublico caio = new ServidorPublico();
//        isabela.CalcularHorasExtras(4, 6, 8);
//
//        ServidorPublico maria = new ServidorPublico(123, "Maria");
//
//        ServidorPublico jose = new ServidorPublico(134, "José", "Auditor");
//        System.out.println(jose.getNome());
//        System.out.println(jose.getMatricula());
//        System.out.println(jose.getCargo());

        Produto produto = new Produto("Coca Cola", 7.99, 50);
        produto.addProduto(50);
    }
}
