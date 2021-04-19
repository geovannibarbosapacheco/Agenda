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
public class Agendamento {

    private final int id;
    private final String cliente;
    private final String responsavel;
    private final String servico;
    private final String data;
    private final String hora;
    private final float valor;

    public Agendamento(int id, String cliente, String responsavel, String servico, String data, String hora, float valor) {
        this.id = id;
        this.cliente = cliente;
        this.responsavel = responsavel;
        this.servico = servico;
        this.data = data;
        this.hora = hora;
        this.valor = valor;
        
        
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getServico() {
        return servico;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public float getValor() {
        return valor;
    }

        
    }

    
    
