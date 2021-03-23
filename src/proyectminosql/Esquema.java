/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectminosql;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author gabrielsanchez
 */
public class Esquema {
    private String name;
    private List<Tabla> tablas;
    
    public Esquema(String _name, ArrayList<Tabla> _tablas) {
        name = _name;
        tablas = _tablas;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public List<Tabla> getTablas() {
        return tablas;
    }
    
    public void setTablas(List<Tabla> _tablas) {
        tablas = _tablas;
    }
}
