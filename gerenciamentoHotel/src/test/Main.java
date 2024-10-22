package test;

import dominio.Hotel;
import dominio.Quarto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        executar();
    }

    public static void menu() {
        System.out.println("1- Cadastrar quarto");
        System.out.println("2- Realizar reserva");
        System.out.println("3- Realizar check-in");
        System.out.println("4- Realizar check-out");
        System.out.println("5- Relátorio de ocupação");
        System.out.println("6- Relatório de reservas");
        System.out.println("7- Sair");
    }

    public static void executar() {
        Scanner sc = new Scanner(System.in);
        int opc = 0;

        while (opc != 7) {
            menu();
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    Hotel.cadastrarQuarto();
                    break;
                case 2:
                    Hotel.cadastrarReserva();
                    break;
                case 3:
                    Hotel.realizarCheckIn();
                    break;
                case 4:
                    Hotel.realizarCheckOut();
                    break;
                case 5:
                    Hotel.relatorioOcupacao();
                    break;
                case 6:
                    Hotel.relatorioReserva();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    break;

            }
        }
    }
}
