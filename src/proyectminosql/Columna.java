/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectminosql;

/**
 *
 * @author gabrielsanchez
 */
public class Columna {
    private String name;
    
    public Columna(String _name) {
        name = _name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        name = newName;
    }
}
