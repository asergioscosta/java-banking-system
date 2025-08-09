package org.example;

public class Aplicacao2 {

    public static void main(String[] args) {

        Endereco e1 = new Endereco("36037882", "Rua Congonhas", "80", "Casa", "São Pedro", "Juiz de Fora", "MG");
        Endereco e2 = new Endereco("36037863", "Rua Ibirité", "1541", "Casa", "São Pedro", "Juiz de Fora", "MG");
        Endereco e3 = new Endereco("36037894", "Rua Além Paraíba", "40", "Casa", "São Pedro", "Juiz de Fora", "MG");

        Cliente c = new Cliente("65485420553", "Augusto", "32987765391");

        c.getListaEndereco().add(e1);
        c.getListaEndereco().add(e2);
        c.getListaEndereco().add(e3);
        c.retornaValidacao();

        System.out.println("O Cliente é " + c.getNome() + " e os endereços são: ");
        System.out.println("O Endereço 1 é: " + formatarEndereco(e1));
        System.out.println("O Endereço 2 é: " + formatarEndereco(e2));
        System.out.println("O Endereço 3 é: " + formatarEndereco(e3));
    }

    private static String formatarEndereco(Endereco e) {
        return e.getLogradouro() + ", " + e.getNumero()
                + " - " + e.getComplemento()
                + " - " + e.getBairro()
                + ", " + e.getCidade()
                + " - " + e.getUf();
    }
}