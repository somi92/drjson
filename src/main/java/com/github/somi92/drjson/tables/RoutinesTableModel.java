/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.drjson.tables;

import com.github.somi92.drjson.domain.Routine;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author milos
 */
public class RoutinesTableModel extends AbstractTableModel {

    private List<Routine> routines;
    
    public RoutinesTableModel(List<Routine> routines) {
        this.routines = routines;
    }
    
    public void setRoutines(List<Routine> routines) {
        this.routines = routines;
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return routines.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Routine r = routines.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return r.getId();
            case 1:
                return r.getTitle();
            case 2:
                return r.getDescription();
            case 3:
                return r.getImageResource();
            case 4:
                return r.getAudioResource();
            case 5:
                return r.getSteps().size();
            default:
                return "Greška";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "ID";
            case 1:
                return "Naslov";
            case 2:
                return "Opis";
            case 3:
                return "Grafički resurs";
            case 4:
                return "Audio resurs";
            case 5:
                return "Broj koraka";
            default:
                return "Greška";
        }
    }
    
}
