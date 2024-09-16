public class validarOMS {

    public static boolean validar(Robo robo) {

        return (robo instanceof RoboSaude) && ((RoboSaude) robo).isSegueRegraRobotica();
    }

}
