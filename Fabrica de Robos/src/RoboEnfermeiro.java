public class RoboEnfermeiro extends RoboSaude{

    public RoboEnfermeiro (String nome, boolean SRR){
        super(nome, SRR);

    }

    public void recarregar(){
        System.out.printf("O robô enfermeiro %s está descansando!", super.getNome());
    }

    public boolean aplicarMedicacao (int qtd){

        if (qtd >= 1){
            for (int c = 0; c < qtd; c++){
                System.out.printf("O robô enfermeiro %s está aplicando a medicação %d\n", super.getNome(), c);
            }
            return true;
        }

        return false;

    }


}
