/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectminosql;

import java.util.ArrayList;
import java.util.List;

public class Tabla {
    private String name;
    private List<Columna> columnas;
    
    public Tabla(String _name, ArrayList<Columna> _columnas) {
        name = _name;
        columnas = _columnas;
    }
    
    public String getName () {
        return name;
    }
    
    public void setName(String newName) {
        name = newName;
    }
}
