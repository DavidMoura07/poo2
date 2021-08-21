/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.composite;

/**
 *
 * @author david
 */
public abstract class AbsArquivo {
    private final String nome;

    public AbsArquivo(String nome) {
        this.nome = nome;
    }
    
    
    
    public void printNomeDoArquivo(){
        System.out.println(this.nome);
    }
    
    public abstract void adicionarArquivo(AbsArquivo novoArquivo);
    public abstract void removerArquivo(int index);
    public abstract AbsArquivo getArquivo(int index);
}
