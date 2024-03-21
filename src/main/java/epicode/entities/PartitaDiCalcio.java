package epicode.entities;
import javax.persistence.Entity;


@Entity
public class PartitaDiCalcio extends Event {
    private String squadraInCasa;
    private String dquadraFuoriCasa;
    private String squadraVincente;
    private int golSquadraInCasa;
    private int golSquadraFuoriCasa;

    public PartitaDiCalcio(){

    }

    public PartitaDiCalcio(String squadraInCasa, String dquadraFuoriCasa, String squadraVincente, int golSquadraInCasa, int golSquadraFuoriCasa) {
        this.squadraInCasa = squadraInCasa;
        this.dquadraFuoriCasa = dquadraFuoriCasa;
        this.squadraVincente = squadraVincente;
        this.golSquadraInCasa = golSquadraInCasa;
        this.golSquadraFuoriCasa = golSquadraFuoriCasa;
    }

    public String getSquadraInCasa() {
        return squadraInCasa;
    }

    public void setSquadraInCasa(String squadraInCasa) {
        this.squadraInCasa = squadraInCasa;
    }

    public String getDquadraFuoriCasa() {
        return dquadraFuoriCasa;
    }

    public void setDquadraFuoriCasa(String dquadraFuoriCasa) {
        this.dquadraFuoriCasa = dquadraFuoriCasa;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getGolSquadraInCasa() {
        return golSquadraInCasa;
    }

    public void setGolSquadraInCasa(int golSquadraInCasa) {
        this.golSquadraInCasa = golSquadraInCasa;
    }

    public int getGolSquadraFuoriCasa() {
        return golSquadraFuoriCasa;
    }

    public void setGolSquadraFuoriCasa(int golSquadraFuoriCasa) {
        this.golSquadraFuoriCasa = golSquadraFuoriCasa;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraInCasa='" + squadraInCasa + '\'' +
                ", dquadraFuoriCasa='" + dquadraFuoriCasa + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", golSquadraInCasa=" + golSquadraInCasa +
                ", golSquadraFuoriCasa=" + golSquadraFuoriCasa +
                '}';
    }
}


