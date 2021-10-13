package VendoPacoteExterno.externo;


import VendoPacoteExterno.interno.Produto;

public class UTestePacoteExterno {
    public static void main(String[] args) {
        Produto produtoLuva = new Produto();
        produtoLuva.nomeProduto = "Luva";
        System.out.println(produtoLuva.getNomeProduto);
    }
}
