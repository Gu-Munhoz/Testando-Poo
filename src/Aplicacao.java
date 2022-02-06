public class Aplicacao {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(0001);
        p1.setDono("Marcelo");
        p1.abrirConta("CC");
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(0002);
        p2.setDono("Giovana");
        p2.abrirConta("CP");
        p2.estadoAtual();
    }
}
