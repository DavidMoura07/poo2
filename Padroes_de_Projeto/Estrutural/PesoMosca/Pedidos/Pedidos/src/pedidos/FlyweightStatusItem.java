/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

import java.util.HashMap;

/**
 *
 * @author david
 */
class FlyweightStatusItem {
   
    public static HashMap<StatusItem.Estado, StatusItem> status = new HashMap();
   
    public static StatusItem get(StatusItem.Estado estado){
        if(status.get(estado) == null){

           if(estado == StatusItem.Estado.CARRINHO){
               status.put(estado, new StatusItem(estado, true, false));
           }else if(estado == StatusItem.Estado.FECHADO){
               status.put(estado, new StatusItem(estado, true, false));
           }else if(estado == StatusItem.Estado.PAGO){
               status.put(estado, new StatusItem(estado, true, true));
           }else if(estado == StatusItem.Estado.ENVIADO){
               status.put(estado, new StatusItem(estado, false, true));
           }else if(estado == StatusItem.Estado.ENTREGUE){
               status.put(estado, new StatusItem(estado, false, true));
           }

        }
        return status.get(estado);
    }
}
