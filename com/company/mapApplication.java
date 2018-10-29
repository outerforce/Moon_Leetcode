package com.company;

import java.util.*;

/**
 * Created by somexoh on 2017/3/15.
 */
/*
* "actor" =>"x,10","y,20"
* "director"=>"a,10", "b,30"
* */
public class mapApplication {
    public static void main(String[] args) {
        HashMap<String, String> actor = new HashMap<>();
        actor.put("01", "amber");
        actor.put("02", "ben");
        HashMap<String, String> director = new HashMap<>();
        director.put("05", "cal");
        director.put("06", "daniel");

        HashMap<String, HashMap<String, String>> hm = new HashMap<>();
        hm.put("actor", actor);
        hm.put("director", director);

        Iterator<String> iter = hm.keySet().iterator();
        while (iter.hasNext()) {
            String actorname = iter.next();
            System.out.println(actorname);
            HashMap<String, String> list = hm.get(actorname);
            getInfo(list);

        }
    }

    public static void getInfo(HashMap<String, String> hm) {
        Iterator<String> iter = hm.keySet().iterator();
        while (iter.hasNext()) {
            String id = iter.next();
            String name = hm.get(id);
            System.out.println(id + "..." + name);
        }
    }
}
