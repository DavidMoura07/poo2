/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public abstract class Observable {
    private final ArrayList<Observer> monitores = new ArrayList<>();
    
    public void addObserver(Observer ob){
        this.monitores.add(ob);
    }
    
    public void deleteObserver(Observer ob){
        this.monitores.remove(ob);
    }
    
    public void notifyObserver(){
        this.monitores.forEach(ob -> {
            ob.update(this);
        });
    }
}
