public abstract class RoboSaude extends Robo{
    boolean segueRegraRobotica;

    public boolean isSegueRegraRobotica() {
        return segueRegraRobotica;
    }

    public void setSegueRegraRobotica(boolean segueRegraRobotica) {
        this.segueRegraRobotica = segueRegraRobotica;
    }

    public RoboSaude(String nome, boolean segueRegra){
        super(nome);
        this.segueRegraRobotica = segueRegra;
    }

    public void cuidarDePessoa(){
        System.out.printf("O robô %s está cuidando das pessoas\n", super.getNome());
    }
}
