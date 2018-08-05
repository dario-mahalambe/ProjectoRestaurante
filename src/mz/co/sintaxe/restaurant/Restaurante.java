package mz.co.sintaxe.restaurant;

import java.util.ArrayList;
import java.util.Scanner;


public class Restaurante {

    static int escolhaMenuBebidas;

    static int escolhaMenuPratos;

    static int escolhaMenuPrincipal;

    static ArrayList<Produto> listaDeBebidas = new ArrayList<>();

    static ArrayList<Produto> listaDePratos = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    static boolean continua = true;

    static Pedido pedido;


    public static void main(String[] args) {

        listaDeBebidas.add(new Produto("Fanta",40));
        listaDeBebidas.add(new Produto("Coco-Cola",60));

        listaDePratos.add(new Produto("Frango a Zambeziana",400));
        listaDePratos.add(new Produto("Carne de Porco",600));


        menuPrinciapal();

        escolhaMenuPrincipal = scanner.nextInt();

        while (true) {

            switch (escolhaMenuPrincipal) {

                case 1:

                    pedido = new Pedido(); //Cria um novo pedido
                    menuPedido();

                case 2:

                    menuListaPedentes();

                case 3:

                    pedidosPagos();

            }

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
        System.out.println("3. Fechar Pedido");
        System.out.println("4. Voltar");
        System.out.println("Escoha uma opcao");


        int escolhaMenuPedido = scanner.nextInt(); //Pede ao utilizador para escolher um opcao no menu Pedido

        while (true){


            if (escolhaMenuPedido == 1){

                menuBebidas( pedido);

            }else if (escolhaMenuPedido == 2){

                menuPratos(pedido);

            }else if (escolhaMenuPedido == 3){

                pedido.imprimirPedido();

                break;
                // Fechar o pedido

            }else if (escolhaMenuPedido == 4){

                menuPrinciapal();
                break;

            }

        }


    }


    private static void menuBebidas(Pedido pedido) {

        System.out.println("----------Menu Bebidas-----------");
        System.out.println("1. Fanta");
        System.out.println("2. Coca-Cola");
        System.out.println("3. Voltar");
        System.out.println("Escoha uma opcao");

        escolhaMenuBebidas = scanner.nextInt();

        while (true){

            if (escolhaMenuBebidas == 1){

                //Colocar metodo para adicionar bebida 1 no pedido do cliente
                pedido.adiconarProduto(listaDeBebidas.get(0));
                System.out.println("Fanta adiconada");

                System.out.println("Pretende adicionar mais bebidas ? Se nao selecione 0.");
                escolhaMenuBebidas = scanner.nextInt();

            } else if (escolhaMenuBebidas == 2) {

                pedido.adiconarProduto(listaDeBebidas.get(1));
                System.out.println("Coca adiconada");

                System.out.println("Pretende adicionar mais bebidas ? Se nao selecione 0.");
                escolhaMenuBebidas = scanner.nextInt();

            }else if (escolhaMenuBebidas==3){

                System.out.println("Pedido terminado");
                menuPedido();
                break;

            }

        }



    }

    private static void menuPratos(Pedido pedido) {

        System.out.println("----------Menu Pratos-----------");
        System.out.println("1. Bife");
        System.out.println("2. Carne de Porco");
        System.out.println("3. Voltar");
        System.out.println("Escoha uma opcao");


        escolhaMenuPratos = scanner.nextInt();

        while (true){

            if (escolhaMenuPratos == 1){

                //Colocar metodo para adicionar bebida 1 no pedido do cliente
                pedido.adiconarProduto(listaDePratos.get(0));
                System.out.println("Frango a Zambeziana adiconada");

                System.out.println("Pretende adicionar mais pratos ? Se nao selecione 0.");
                escolhaMenuPratos = scanner.nextInt();

            } else if (escolhaMenuPratos == 2) {

                pedido.adiconarProduto(listaDePratos.get(1));
                System.out.println("Carne de Porco adiconada");

                System.out.println("Pretende adicionar mais pratos ? Se nao selecione 0.");
                escolhaMenuPratos = scanner.nextInt();

            }else if (escolhaMenuPratos == 3){

                System.out.println(" ");
                menuPedido();
                break;

            }

        }






    }

    private static void pedidosPagos() {
    }

    private static void menuListaPedentes() {
    }







}
