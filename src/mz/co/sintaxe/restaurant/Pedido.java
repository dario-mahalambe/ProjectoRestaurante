package mz.co.sintaxe.restaurant;

import java.util.ArrayList;

public class Pedido {

    private String nome;

    private ArrayList<Produto> listaDeProductos;


    public Pedido() {

        int contador = 0 + 1;
        this.nome = "Pedido00"+contador;
        listaDeProductos = new ArrayList<>();

    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Produto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void adiconarProduto(Produto produto){

        this.listaDeProductos.add(produto);

    }


    public void imprimirPedido(){

        System.out.println(nome);

        double total = 0;

        for (int i = 0; i < listaDeProductos.size(); i++) {

            System.out.println(listaDeProductos.get(i));

            total += listaDeProductos.get(i).getPreco();

        }

        System.out.println("O valor total: " + total);


    }

}
