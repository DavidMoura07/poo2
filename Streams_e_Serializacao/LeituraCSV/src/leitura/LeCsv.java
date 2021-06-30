
package leitura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeCsv {
        
     public LinkedList<Cliente> leCsvClientes() throws IOException{         
      
         LinkedList<Cliente> clientes = new  LinkedList<Cliente>();             
        String current = new java.io.File( "." ).getCanonicalPath();        
        File inputFile = new File(current + "/src/arquivo.csv");                
        FileReader in = new FileReader(inputFile);
        BufferedReader lerArquivo = new BufferedReader(in);
        
        String linha = lerArquivo.readLine();
        linha = lerArquivo.readLine(); // descartando a primeira linha

        while (linha != null) {    
            String[] campo = linha.split(";");
            Cliente cliente = new Cliente();
            
            cliente.setId(campo[0]);
            cliente.setNome(campo[1]);
            cliente.setEmail(campo[2]);
            cliente.setTelefone(campo[4]);
            cliente.setTotalCompras(Double.parseDouble(campo[5]));
            
            clientes.add(cliente);
            
            linha = lerArquivo.readLine();
            
        }       
        in.close(); 
        
        
        return clientes;
     }
}
