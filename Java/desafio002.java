package Java;

import java.awt.Dimension;
import java.awt.Toolkit;

public class desafio002 {
    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) tela.getWidth();
        int altura = (int) tela.getHeight();
        System.out.println("A resolução da tela é " + largura + "x" + altura);
    }
}
