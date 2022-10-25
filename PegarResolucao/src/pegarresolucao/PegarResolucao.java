package pegarresolucao;

import java.awt.Dimension;
import java.awt.Toolkit;

public class PegarResolucao {
    public static void main(String[] args) throws Exception {

        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();

        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();

        System.out.println("A altura é: " + alt + " E a largura é: " + lar);
    }
}
