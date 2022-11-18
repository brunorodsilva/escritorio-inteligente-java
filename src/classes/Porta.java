
package classes;

import javax.swing.JOptionPane;


 //@author Bruno

public class Porta extends Escritorio{

    private boolean porta;
    
    //Construtor
    public Porta() {
        this.porta = false;
    }

    //Métodos Get e Set
    public boolean isPorta() {
        return porta;
    }

    public void setPorta(boolean pPorta) {
        this.porta = pPorta;
    }
        
    //Para sobrescrever o método ligar do Escritório.
    @Override
    public void abrir(){
        JOptionPane.showMessageDialog(null, "Porta Aberta.");
    }
    
    //Para sobrescrever o método Desligar do Escritório.
    @Override
    public void fechar(){
        JOptionPane.showMessageDialog(null, "Porta Fechada");
    }
    
    
}
