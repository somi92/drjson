/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.drjson.tables;

import com.github.somi92.drjson.domain.RoutineStep;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author milos
 */
public class RoutineStepsTableModel extends AbstractTableModel {
    
    private List<RoutineStep> steps;
    
    public RoutineStepsTableModel(List<RoutineStep> steps) {
        this.steps = steps;
    }

    public void setSteps(List<RoutineStep> steps) {
        this.steps = steps;
        
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return steps.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RoutineStep rs = steps.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return rs.getStepNumber();
            case 1:
                return rs.getDescription();
            case 2:
                return rs.getImageResource();
            case 3:
                return rs.getAudioResource();
            default:
                return "Greška";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "Redni broj";
            case 1:
                return "Opis";
            case 2:
                return "Grafički resurs";
            case 3:
                return "Audio resurs";
            default:
                return "Greška";
        }
    }
}
