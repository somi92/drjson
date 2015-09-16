/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.drjson.engine;

import com.github.somi92.drjson.domain.Routine;
import com.github.somi92.drjson.domain.RoutinesCollection;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milos
 */
public class RoutinesManager {
    
    private static RoutinesManager INSTANCE;
    private List<Routine> routines;
    
    private RoutinesManager() {
        routines = new ArrayList<>();
    }
    
    public static RoutinesManager getInstance() {
        if(INSTANCE==null) {
            INSTANCE = new RoutinesManager();
        }
        return INSTANCE;
    }
    
    public List<Routine> getRoutines() {
        return routines;
    }
    
    public void setRoutines(List<Routine> routines) {
        this.routines = routines;
    }
    
    public boolean addRoutine(Routine routine) {
        if(routines.contains(routine)) {
            return false;
        }
        routines.add(routine);
        return true;
    }
    
    public void editRoutine(Routine routine) {
        if(routines.contains(routine)) {
            routines.remove(routine);
        }
        routines.add(routine);
    }
    
    public boolean removeRoutine(Routine routine) {
        return routines.remove(routine);
    }
    
    public String generateJSON() {
        Gson gson = new Gson();
        RoutinesCollection rc = new RoutinesCollection(routines);
        String json = gson.toJson(rc);
        return json;
    }
    
    public void loadRoutines(String json) {
        Gson gson = new Gson();
        RoutinesCollection rc = gson.fromJson(json, RoutinesCollection.class);
        routines = rc.getRoutines();
    }
}
