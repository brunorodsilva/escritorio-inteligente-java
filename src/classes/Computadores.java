
package classes;

import javax.swing.JOptionPane;


 //@author Bruno

public class Computadores extends Escritorio{
    
    private boolean pc01;
    private boolean pc02;
    private boolean pc03;
    private boolean pc04;
    private boolean pc05;
    private boolean pc06;
    private boolean pc07;
    private boolean pc08;
    private boolean pc09;
    private boolean pc10;

    //Construtores
    public Computadores() {
        this.pc01 = false;
        this.pc02 = false;
        this.pc03 = false;
        this.pc04 = false;
        this.pc05 = false;
        this.pc06 = false;
        this.pc07 = false;
        this.pc08 = false;
        this.pc09 = false;
        this.pc10 = false;
    }
    
    //Métodos Get e Set
    public boolean isPc01() {
        return pc01;
    }

    public void setPc01(boolean pPc01) {
        this.pc01 = pPc01;
    }

    public boolean isPc02() {
        return pc02;
    }

    public void setPc02(boolean pPc02) {
        this.pc02 = pPc02;
    }

    public boolean isPc03() {
        return pc03;
    }

    public void setPc03(boolean pPc03) {
        this.pc03 = pPc03;
    }

    public boolean isPc04() {
        return pc04;
    }

    public void setPc04(boolean pPc04) {
        this.pc04 = pPc04;
    }

    public boolean isPc05() {
        return pc05;
    }

    public void setPc05(boolean pPc05) {
        this.pc05 = pPc05;
    }

    public boolean isPc06() {
        return pc06;
    }

    public void setPc06(boolean pPc06) {
        this.pc06 = pPc06;
    }

    public boolean isPc07() {
        return pc07;
    }

    public void setPc07(boolean pPc07) {
        this.pc07 = pPc07;
    }

    public boolean isPc08() {
        return pc08;
    }

    public void setPc08(boolean pPc08) {
        this.pc08 = pPc08;
    }

    public boolean isPc09() {
        return pc09;
    }

    public void setPc09(boolean pPc09) {
        this.pc09 = pPc09;
    }

    public boolean isPc10() {
        return pc10;
    }

    public void setPc10(boolean pPc10) {
        this.pc10 = pPc10;
    }   

    //Sobrescreve o método: Ligar (String pLigarOque), da Classe Escritório.
    @Override
    public void ligar(String pc) {
        
        //Switch para informar o estado de cada computador que for ligado.
        switch (pc){
            case "pc1":
                JOptionPane.showMessageDialog(null, "Computador 01 ligado.");
                break;
            case "pc2":
                JOptionPane.showMessageDialog(null, "Computador 02 ligado.");
                break;
            case "pc3":
                JOptionPane.showMessageDialog(null, "Computador 03 ligado.");
                break;
            case "pc4":
                JOptionPane.showMessageDialog(null, "Computador 04 ligado.");
                break;
            case "pc5":
                JOptionPane.showMessageDialog(null, "Computador 05 ligado.");
                break;
            case "pc6":
                JOptionPane.showMessageDialog(null, "Computador 06 ligado.");
                break;
            case "pc7":
                JOptionPane.showMessageDialog(null, "Computador 07 ligado.");
                break;
            case "pc8":
                JOptionPane.showMessageDialog(null, "Computador 08 ligado.");
                break;
            case "pc9":
                JOptionPane.showMessageDialog(null, "Computador 09 ligado.");
                break;
            case "pc10":
                JOptionPane.showMessageDialog(null, "Computador 10 ligado.");
                break;
        }
    }
    
    //Sobrescreve o método: Desligar (String pDesligarOque), da Classe Escritório.
    @Override
    public void desligar(String pc) {
        
        //Switch para informar o estado de cada computador que for desligado.
        switch (pc){
            case "pc1":
                JOptionPane.showMessageDialog(null, "Computador 01 desligado.");
                break;
            case "pc2":
                JOptionPane.showMessageDialog(null, "Computador 02 desligado.");
                break;
            case "pc3":
                JOptionPane.showMessageDialog(null, "Computador 03 desligado.");
                break;
            case "pc4":
                JOptionPane.showMessageDialog(null, "Computador 04 desligado.");
                break;
            case "pc5":
                JOptionPane.showMessageDialog(null, "Computador 05 desligado.");
                break;
            case "pc6":
                JOptionPane.showMessageDialog(null, "Computador 06 desligado.");
                break;
            case "pc7":
                JOptionPane.showMessageDialog(null, "Computador 07 desligado.");
                break;
            case "pc8":
                JOptionPane.showMessageDialog(null, "Computador 08 desligado.");
                break;
            case "pc9":
                JOptionPane.showMessageDialog(null, "Computador 09 desligado.");
                break;
            case "pc10":
                JOptionPane.showMessageDialog(null, "Computador 10 desligado.");
                break;
        }
    }

    
}
