package dominio;

import java.time.LocalDate;

public class Reserva {
    private Hospede hospede;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Quarto quarto;

    public Reserva(Hospede hospede, LocalDate checkIn, LocalDate checkOut, Quarto quarto) {
        this.hospede = hospede;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.quarto = quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "hospede=" + hospede +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", quarto=" + quarto +
                '}';
    }
}
