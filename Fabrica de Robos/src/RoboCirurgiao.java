public class RoboCirurgiao extends RoboSaude{
    private int nivel;

    public RoboCirurgiao(String nome, boolean SRR, int nivel){
        super(nome, SRR);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void recarregar(){
        System.out.printf("O robô cirurgião %s está dormindo.\n", super.getNome());
    }

    public boolean fazerCirurgia(int nivel){
        if (this.nivel == nivel){
            System.out.printf("O robô %s está fazendo a cirurgia.\n", super.getNome());
            return true;
        }
        return false;
    }
}
