package carro;

public class Garagem {

    private static Carro carroPasseio;
    private static Carro carroUtilitario;
    private static Garagem garagem;

    public static void main(String[] args) {

        carroPasseio = new Carro();
        carroUtilitario = new Carro();

        garagem = new Garagem();

        garagem.carroPasseio.setCor("azul");
        garagem.carroPasseio.setModelo("uno");
        garagem.carroPasseio.setPotenciaDoMotor(1.0);

        garagem.carroUtilitario.setCor("azul");
        garagem.carroUtilitario.setModelo("uno");
        garagem.carroUtilitario.setPotenciaDoMotor(1.0);

        System.out.println("Carro de Passeio: ");
        System.out.println("Cor: " + garagem.carroPasseio.getCor());
        System.out.println("Modelo: " + garagem.carroPasseio.getModelo());
        System.out.println("Potência: " + garagem.carroPasseio.getPotenciaDoMotor());

        System.out.println("Carro de Utilitário: ");
        System.out.println("Cor: " + garagem.carroUtilitario.getCor());
        System.out.println("Modelo: " + garagem.carroUtilitario.getModelo());
        System.out.println("Potência: " + garagem.carroUtilitario.getPotenciaDoMotor());
    }
}
