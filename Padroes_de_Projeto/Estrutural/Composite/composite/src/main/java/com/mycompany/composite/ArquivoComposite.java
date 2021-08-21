/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.composite;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class ArquivoComposite extends AbsArquivo {

    private final ArrayList<AbsArquivo> listaDeArquivos;

    public ArquivoComposite(String nome) {
        super(nome);
        this.listaDeArquivos = new ArrayList<>();
    }
    
    
    
    @Override
    public void adicionarArquivo(AbsArquivo novoArquivo) {
        this.listaDeArquivos.add(novoArquivo);
    }

    @Override
    public void removerArquivo(int index) {
        this.listaDeArquivos.remove(index);
    }

    @Override
    public AbsArquivo getArquivo(int index) {
        return this.listaDeArquivos.get(index);
    }
    
}
