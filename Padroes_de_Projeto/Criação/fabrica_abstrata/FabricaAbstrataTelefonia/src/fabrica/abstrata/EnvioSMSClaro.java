/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata;

/**
 *
 * @author david
 */
public class EnvioSMSClaro implements EnvioSMS{
    public EnvioSMSClaro(String config){
        //realiza configuracao especifica para Claro.
    }
    
    @Override
    public boolean enviar(Mensagem msg, int telefone) {
        System.out.println("Enviando mensagem:" +  msg.texto + 
                " para o telefone Claro:" + telefone );
        return true;
    }
}
