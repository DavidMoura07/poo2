/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapters;

import adaptercliente.model.ICliente;
import lib.ClienteExterno;

/**
 *
 * @author david
 */
public class ClienteExternoAdapter implements ICliente {
    
    private ClienteExterno ce = new ClienteExterno();

    public ClienteExternoAdapter(ClienteExterno ce) {
        this.ce = ce;
    }
    
    @Override
    public String getNomeCompleto() {
        String nomeCompleto = ce.getNome() + " " + ce.getSobreNome();
        return nomeCompleto;
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        
        String[] nomeSobrenome = nomeCompleto.split(" ");
        
        String nome = nomeSobrenome[0];
        String sobrenome = "";
        for(int i = 1; i < nomeSobrenome.length; i++){
            sobrenome += " " + nomeSobrenome[i];
        }
        
        ce.setNome(nome);
        ce.setSobreNome(sobrenome);
    }

    @Override
    public String getTelefone() {
        String telefone = ce.getDddTelefone() + ce.getTelefone();
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        telefone = telefone.replaceAll("\\D+","");
        String ddd = telefone.substring(0, 2);
        String tel = telefone.substring(2);
        
        ce.setDddTelefone(ddd);
        ce.setTelefone(tel);
    }

    @Override
    public String getEmail() {
        return ce.getEmail();
    }

    @Override
    public void setEmail(String email) {
        ce.setEmail(email);
    }

    @Override
    public String getCelular() {
        String celular = ce.getDddCelular()+ ce.getCelular();
        return celular;
    }

    @Override
    public void setCelular(String celular) {
        celular = celular.replaceAll("\\D+","");
        String ddd = celular.substring(0, 2);
        String cel = celular.substring(2);
        
        ce.setDddCelular(ddd);
        ce.setCelular(cel);
    }
    
}
