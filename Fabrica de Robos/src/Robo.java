public abstract class Robo {
    private String nome;

    public void andar(){
        System.out.printf("O robô %s está andando!", this.nome);
    }

    public void falar(){
        System.out.printf("O robô %s está falando!", this.nome);
    }

    public abstract void recarregar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //construtor
    public Robo (String nome){
        this.nome = nome;
    }
}
