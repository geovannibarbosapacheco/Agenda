package agendaa.controller;


import agendaa.view.AgendaP;
import agendaa.view.CadServico;
import agendaa.view.CadUsuario;
import agendaa.view.MenuPrincipal;



/**
 *
 * @author geova
 */
public class MenuPrincipalControlador {
    
    private final MenuPrincipal view;
    
    public MenuPrincipalControlador(MenuPrincipal view){
        
        this.view = view;
        
    } 
    
    AgendaP entradaAgendamento = new AgendaP();

    public MenuPrincipalControlador() {
        this.view = null;
    }
    
    public void NavegarAgenda(){
    AgendaP agenda = new AgendaP();
    entradaAgendamento.setVisible(true);
    }
    
   
    
    public void NavegarCadServico(){
    CadServico cadServico = new CadServico();
    cadServico.setVisible(true);
    }
    
    public void NavegarCadUsuario(){
   CadUsuario cadUsuario = new CadUsuario();
    cadUsuario.setVisible(true);
    }
    
}
