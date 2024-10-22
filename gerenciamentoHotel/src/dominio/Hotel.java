package dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
    static List<Quarto> quartos = new ArrayList<Quarto>();
    static List<Reserva> reservas = new ArrayList<>();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void cadastrarQuarto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número do quarto");
        int numQuarto = sc.nextInt();
        System.out.println("Tipo do quarto (Solteiro, Casal, Suíte)");
        String tipo = sc.next();
        System.out.println("Preço do quarto (Diária)");
        double preco = sc.nextDouble();

        Quarto quarto = new Quarto(numQuarto, tipo, preco);
        quartos.add(quarto);
        System.out.println("Quarto cadastrado com sucesso!");
    }

    public static void cadastrarReserva() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do hóspede");
        String nome = sc.nextLine();
        System.out.println("Data de checkIn (DD/MM/AAAA)");
        String dataCheckIn = sc.nextLine();
        System.out.println("Data de checkOut (DD/MM/AAAA)");
        String dataCheckOut = sc.nextLine();

        LocalDate checkIn = LocalDate.parse(dataCheckIn, formatter);
        LocalDate checkOut = LocalDate.parse(dataCheckOut, formatter);

        System.out.println("Tipo do quarto (Solteiro, Casal, Suíte)");
        String tipoQuarto = sc.next();

        if (!quartos.isEmpty()) {
            for (Quarto quarto : quartos) {
                if (quarto.getTipoQuarto().equalsIgnoreCase(tipoQuarto)) {
                    Hospede hospede = new Hospede(nome);
                    Reserva reserva = new Reserva(hospede, checkIn, checkOut, quarto);
                    reservas.add(reserva);
                    System.out.println("Reserva realizada com sucesso!");
                } else {
                    System.out.println("Quarto indisponível");
                }
            }
        } else {
            System.out.println("Nenhum quarto disponivel");
        }
    }

    public static void realizarCheckIn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do hóspede");
        String nome = sc.nextLine();
        System.out.println("Número do quarto");
        int numQuarto = sc.nextInt();

        for (Reserva reserva : reservas) {
            if (reserva.getHospede().getNome().equalsIgnoreCase(nome) && reserva.getQuarto().getNumQuarto() == numQuarto) {
                reserva.getQuarto().setDisponivel(false);
                System.out.println("Check-in realizado");
            } else {
                System.out.println("Nenhuma reserva encontrada");
            }
        }
    }

    public static void realizarCheckOut() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do hóspede");
        String nome = sc.nextLine();
        System.out.println("Número do quarto");
        int numQuarto = sc.nextInt();

        for (Reserva reserva : reservas) {
            if (reserva.getHospede().getNome().equalsIgnoreCase(nome) && reserva.getQuarto().getNumQuarto() == numQuarto) {
                reserva.getQuarto().setDisponivel(true);
                reservas.remove(reserva);
                System.out.println("Check-out realizado");
                break;
            } else {
                System.out.println("Nenhuma reserva encontrada");
            }
        }
    }

    public static void relatorioOcupacao() {
        Scanner sc = new Scanner(System.in);
        if (!reservas.isEmpty()) {
            for (Reserva reserva : reservas) {
                System.out.println(reserva.getQuarto().toString());
                System.out.println("Perídodo de ocupação: " + reserva.getCheckOut().compareTo(reserva.getCheckIn()) + " dias");
                System.out.println("- - - - - - - - - -");
            }
        } else {
            System.out.println("Nenhuma reserva encontrada");
        }
    }

    public static void relatorioReserva() {
        Scanner sc = new Scanner(System.in);
        if (!reservas.isEmpty()) {
            for (Reserva reserva : reservas) {
                System.out.println(reserva.getQuarto().toString());
                System.out.println("- - - - - - - - - -");
            }
        } else {
            System.out.println("Nenhuma reserva encontrada");
        }
    }


}
