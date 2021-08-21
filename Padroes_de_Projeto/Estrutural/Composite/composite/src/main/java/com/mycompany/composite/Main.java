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
public class Main {
    public static void main(String[] args) {
        AbsArquivo arq1 = new Arquivo("arquivo 1");
        AbsArquivo arq2 = new Arquivo("arquivo 2");
        AbsArquivo arq3 = new Arquivo("arquivo 3");
        AbsArquivo folder1 = new ArquivoComposite("pasta 1");
        AbsArquivo folder2 = new ArquivoComposite("pasta 2");
        
        folder1.adicionarArquivo(arq1);
        folder1.adicionarArquivo(folder2);
        
        folder2.adicionarArquivo(arq2);
        folder2.adicionarArquivo(arq3);

        folder1.printNomeDoArquivo();
        System.out.println("Conteúdo: ");
        folder1.getArquivo(0).printNomeDoArquivo();
        folder1.getArquivo(1).printNomeDoArquivo();

        System.out.println("_____________________");
        System.out.println("");
        
        folder2.printNomeDoArquivo();
        System.out.println("Conteúdo: ");
        folder2.getArquivo(0).printNomeDoArquivo();
        folder2.getArquivo(1).printNomeDoArquivo();

    }
}
