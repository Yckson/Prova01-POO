public class SSC {
    private Robo[] robos;
    private int qtdRobos;

    public SSC(){
        this.robos = new Robo[1000];
    }

    public boolean fabricarRoboFilosofo(String nome){
        RoboFilosofo robo = new RoboFilosofo(nome);
        if (this.qtdRobos == 1000){
            System.err.println("O número limite de robôs criados foi atingido (1000)!");
            return false;
        }

        this.robos[qtdRobos] = robo;
        this.qtdRobos ++;
        return true;
    }

    public boolean fabricarRoboCirurgiao(String nome, boolean SRR, int nivel){
        RoboCirurgiao robo = new RoboCirurgiao(nome, SRR, nivel);
        if (this.qtdRobos == 1000){
            System.err.println("O número limite de robôs criados foi atingido (1000)!");
            return false;
        }

        this.robos[qtdRobos] = robo;
        this.qtdRobos ++;
        return true;

    }

    public boolean fabricarRoboEnfermeiro(String nome, boolean SRR){
        RoboEnfermeiro robo = new RoboEnfermeiro(nome, SRR);
        if (this.qtdRobos == 1000){
            System.err.println("O número limite de robôs criados foi atingido (1000)!");
            return false;
        }

        this.robos[qtdRobos] = robo;
        this.qtdRobos ++;
        return true;
    }

    public Robo[] analisarNaoValidosOMS (){
        Robo[] robosNaoValidos = new Robo[this.qtdRobos];
        String tipoDoRobo;

        int posRobosNaoValidos = 0;
        for (int c = 0; c < this.qtdRobos; c++){
            if (validarOMS.validar(robos[c])){
                robosNaoValidos[posRobosNaoValidos] = robos[c];
                posRobosNaoValidos++;

                tipoDoRobo = robos[c].getClass().getSimpleName();

                switch (tipoDoRobo){
                    case "RoboCirurgiao":
                        tipoDoRobo = "Cirurgião";
                        break;
                    case "RoboFilosofo":
                        tipoDoRobo = "Filosofo";
                        break;
                    case "RoboEnfermeiro":
                        tipoDoRobo = "Enfermeiro";
                        break;
                    default:
                        tipoDoRobo = "Robo";
                }

                System.out.printf("O robô %s do tipo %s não é aceito pela OMS!\n", robos[c].getNome(), tipoDoRobo);
            }
        }
        return robosNaoValidos;
    }

}
