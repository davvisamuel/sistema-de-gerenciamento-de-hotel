package dominio;

public class Quarto {
    private int numQuarto;
    private String tipoQuarto;
    private double precoDiario;
    private boolean disponivel;

    public Quarto(int numQuarto, String tipoQuarto, double precoDiario) {
        this.numQuarto = numQuarto;
        this.tipoQuarto = tipoQuarto;
        this.precoDiario = precoDiario;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public double getPrecoDiario() {
        return precoDiario;
    }

    public void setPrecoDiario(double precoDiario) {
        this.precoDiario = precoDiario;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "numQuarto=" + numQuarto +
                ", tipoQuarto='" + tipoQuarto + '\'' +
                '}';
    }
}
