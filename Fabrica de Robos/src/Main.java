public class Main {
    public static void main(String[] args) {
        SSC ssc1 = new SSC();

        ssc1.fabricarRoboFilosofo("Lucas");
        ssc1.fabricarRoboCirurgiao("Tio", true, 1);
        ssc1.fabricarRoboEnfermeiro("Davi", true);
        ssc1.fabricarRoboCirurgiao("Will", false, 1);

        ssc1.analisarNaoValidosOMS();
    }
}