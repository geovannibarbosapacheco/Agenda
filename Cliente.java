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
public class Cliente  extends Pessoa{
    
private final String telefone;

    public Cliente(String telefone, int id, String nome) {
        super(id, nome);
        this.telefone = telefone;
        
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
