
package classes;

import javax.swing.JOptionPane;


 // @author Bruno

public class Luz extends Escritorio{
    
    private boolean luz;

    // Construtor
    public Luz() {
        this.luz = false;
    }

    public boolean isLuz() {
        return luz;
    }

    public void setLuz(boolean pLuz) {
        this.luz = pLuz;
    }
    
    //Para sobrescrever o método ligar do Escritório.
    @Override
    public void ligar(){
        JOptionPane.showMessageDialog(null, "Luz Ligada.");
    }
    
    //Para sobrescrever o método Desligar do Escritório.
    @Override
    public void desligar(){
        JOptionPane.showMessageDialog(null, "Luz Desligada.");
    }
    
}
