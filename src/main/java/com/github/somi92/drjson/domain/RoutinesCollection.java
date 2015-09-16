/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.drjson.domain;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author milos
 */
public class RoutinesCollection implements Serializable {
    
    @SerializedName("routines")
    private List<Routine> routines;

    public RoutinesCollection(List<Routine> routines) {
        this.routines = routines;
    }

    public List<Routine> getRoutines() {
        return routines;
    }

    public void setRoutines(List<Routine> routines) {
        this.routines = routines;
    }
    
}
