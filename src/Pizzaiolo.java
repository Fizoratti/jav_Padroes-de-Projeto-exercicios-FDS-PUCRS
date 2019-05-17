import java.util.ArrayList;

public class Pizzaiolo extends Pessoa {
    public ArrayList<Semana> escala;

    public Pizzaiolo(String nome, int escala) {
        super(nome);
        this.escala = new ArrayList<Semana>();
        escalar(escala);
    }

    public void escalar(int escala) {
        switch(escala) {
            case 1:
                this.escala.add(Semana.SEG);
                this.escala.add(Semana.QUA);
                this.escala.add(Semana.SEX);
                break;
            case 2:
                this.escala.add(Semana.TER);
                this.escala.add(Semana.QUI);
                this.escala.add(Semana.SAB);
                break;
            default:
                break;
        }
    }
}