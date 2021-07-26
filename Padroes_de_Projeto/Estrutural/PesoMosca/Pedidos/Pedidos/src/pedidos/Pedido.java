/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class Pedido {
    private final List<Item> items;

    public Pedido() {
        items = new ArrayList<>();
    }
    
    public void addItemPedido(Item item){
        this.items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
    
    
    
}
