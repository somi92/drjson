/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.drjson.main;

import com.github.somi92.drjson.domain.Routine;
import com.github.somi92.drjson.domain.RoutineStep;
import com.github.somi92.drjson.gui.MainWindow;
import com.google.gson.Gson;

/**
 *
 * @author milos
 */
public class Main {
    
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
        
//        RoutineStep rs1 = new RoutineStep("step 1 description", "imageres1", "audiores1");
//        RoutineStep rs2 = new RoutineStep("step 2 description", "imageres2", "audiores2");
//        Routine r = new Routine();
//        r.setDescription("Routine desc");
//        r.setTitle("Title");
//        r.setImageResource("!!!");
//        r.setAudioResource("???");
//        r.addStep(rs1);
//        r.addStep(rs2);
        Gson gson = new Gson();
//        String s = gson.toJson(r);
//        System.out.println(s);
        
//        String json = "{\"title\":\"Title\",\"description\":\"Routine desc\",\"imageResource\":\"!!!\",\"audioResource\":\"???\",\"steps\":[{\"description\":\"step 1 description\",\"imageResource\":\"imageres1\",\"audioResource\":\"audiores1\"},{\"description\":\"step 2 description\",\"imageResource\":\"imageres2\",\"audioResource\":\"audiores2\"}]}";
//        Routine r = gson.fromJson(json, Routine.class);
//        System.out.println(r.getTitle()+" "+r.getDescription()+" "+r.getImageResource()+" "+r.getAudioResource()+" step 1: "+r.getSteps().get(0).getDescription());
    }
}
