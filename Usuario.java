/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendda.model;

/**
 *
 * @author geova
 */
public class Usuario extends Pessoa {
    
    private final String user;
    private final String senha;
    private final String grauAcesso;

    public Usuario(String user, String senha, String grauAcesso, int id, String nome) {
        super(id, nome);
        this.user = user;
        this.senha = senha;
        this.grauAcesso = grauAcesso;
        
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
}
