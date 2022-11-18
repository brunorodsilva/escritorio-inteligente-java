
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class ArCondicionado extends Escritorio{
    
    private boolean ar;

    // Construtor
    public ArCondicionado() {
        this.ar = false;
    }
    
    public boolean isAr() {
        return ar;
    }

    public void setAr(boolean pAr) {
        this.ar = pAr;
    }
    
    //Para sobrescrever o método ligar do Escritório.
    @Override
    public void ligar(){
        super.ligar();
        JOptionPane.showMessageDialog(null, "Ar Condicionado Ligado.");
    }
    
    //Para sobrescrever o método Desligar do escritório.
    @Override
    public void desligar(){
        super.desligar();
        JOptionPane.showMessageDialog(null, "Ar Condicionado Desligado.");
    }
    
}
