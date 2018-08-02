package mz.co.sintaxe.mpesa;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {


    public static void main(String[] args) {


        ArrayList<Produto> listaDeBebidas = new ArrayList<>();

        listaDeBebidas.add(new Produto("Fanta",40));
        listaDeBebidas.add(new Produto("Coco-Cola",60));


        System.out.println(new Produto("Banana", 400));

        Scanner scanner = new Scanner(System.in);


        menuPrinciapal();

        int escolha = scanner.nextInt();

        switch (escolha) {

            case 1:

                menuPedido();

                int escolhaMenuPedido = scanner.nextInt(); //Pede ao utilizador para escolher um opcao no menu Pedido

                if (escolhaMenuPedido == 1){

                    Pedido pedido = new Pedido();

                    menuBebidas();

                    int escolhaMenuBebidas = scanner.nextInt();

                    if (escolhaMenuBebidas == 1){

                        //Colocar metodo para adicionar bebida 1 no pedido do cliente

                        pedido.adiconarProduto(listaDeBebidas.get(0));
                        System.out.println("Fanta adiconada");

                    } else if (escolhaMenuBebidas == 2) {

                        pedido.adiconarProduto(listaDeBebidas.get(1));
                        System.out.println("Coca adiconada");

                        pedido.imprimirPedido();

                        //Colocar metodo para adicionar bebida 2 no pedido do cliente
                    }else {

                        System.out.println("Nao existe essa opcao");

                        menuBebidas();

                    }

                }else if (escolhaMenuPedido == 2){



                }

            case 2:

                menuListaPedentes();

            case 3:

                pedidosPagos();

        }


    }


    private static void menuPrinciapal() {
        System.out.println("----------Menu Princiapl-----------");
        System.out.println("1. Criar Pedido");
        System.out.println("2. Lista de Pedido Pendentes");
        System.out.println("3. Lista de Pedidos Pagos");
        System.out.println("Escoha uma opcao");
    }


    private static void menuPedido() {
        System.out.println("----------Menu Pedidos-----------");
        System.out.println("1. Adicionar Bebidas");
        System.out.println("2. Adicionar Pratos");
        System.out.println("3. Voltar");
        System.out.println("Escoha uma opcao");
    }



    private static void menuBebidas() {
        System.out.println("----------Menu Bebidas-----------");
        System.out.println("1. Fanta");
        System.out.println("2. Coca-Cola");
        System.out.println("3. Voltar");
        System.out.println("Escoha uma opcao");
    }

    private static void pedidosPagos() {
    }

    private static void menuListaPedentes() {
    }

    private static void menuPratos() {
        System.out.println("----------Menu Pratos-----------");
        System.out.println("1. Bife");
        System.out.println("2. Carne de Porco");
        System.out.println("3. Voltar");
        System.out.println("Escoha uma opcao");
    }





}
