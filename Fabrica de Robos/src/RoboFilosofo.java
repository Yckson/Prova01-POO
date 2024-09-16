public class RoboFilosofo extends Robo{

    public RoboFilosofo (String nome){
        super(nome);
    }

    public void filosofar(){
        System.out.printf("O robô %s está filosofando\n", super.getNome());
    }

    public void recarregar(){
        System.out.printf("O robô filósofo %s está lendo.\n", super.getNome());
    }
}
