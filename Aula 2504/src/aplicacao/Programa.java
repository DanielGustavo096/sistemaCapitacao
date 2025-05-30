package aplicacao;

import entidades.ServidorPublico;

public class Programa
{
    public static void main(String[] args) {

        ServidorPublico isabela = new ServidorPublico();
        isabela.setNome("Isabela");
        isabela.setCargo("Auditor");
        isabela.setOrgao("ANVISA");
        isabela.setLotacao("Brasília");
        isabela.setEmail("isabela@gmail.com");

        System.out.println("Servidora: "+isabela.getNome());

        ServidorPublico heila = new ServidorPublico();
        ServidorPublico maria = new ServidorPublico();
        ServidorPublico caio = new ServidorPublico();
        isabela.CalcularHorasExtras(4, 6, 8);
    }
}
