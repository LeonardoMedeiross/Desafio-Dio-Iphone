public class Iphone  implements Navegador , ReprodutorMusical , AparelhoTelefonico {
    @Override
    public void ligar(){
    System.out.println("Chamando...");
    }

    @Override
            public void atender(){

        System.out.println("Olá");
        }

    @Override
    public void correioDeVoz() {
        System.out.println("Você tem uma mensagem");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Abrindo navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Digite o site ");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Error 404");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando sua plalist de emo ");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolha uma que não seja nickelback");
    }
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atender();
        iphone.correioDeVoz();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}


