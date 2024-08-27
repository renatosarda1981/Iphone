package Aparelho;

import Canais.AparelhoTelefonico;
import Canais.NavegadorInternet;
import Canais.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private static Iphone iphone;
    public static void main(String[] args) {
        
        iphone = new Iphone();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();


    }

    
    @Override
    public void ligar() {
        System.out.println("Ligando");
        
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
        
    }

    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ligando para correio de voz");
    }

    
    @Override
    public void exibirPagina() {
        System.out.println("Abrindo Pagina Web");
    }

    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba Web");
    }

    
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina Web");
    }

    
    @Override
    public void tocar() {
        System.out.println("tocando musica");
    }

    
    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando nova musica");
    }

}
