/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.utils.managers;

/**
 *
 * @author aguan
 */
public abstract class ManagerDeRecursos {
    
    protected int count = 1;
    
    public void addReference(){
        count++;
    }
    public boolean removeReference(){
        count--;
        return count == 0;
    }
}
