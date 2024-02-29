package com.moderneinstein.logical.algorithms;


import java.util.Map ;
import java.util.TreeMap ;
import java.util.List ;
import java.util.Vector ; 
import java.util.ArrayList ; 
import java.util.ListIterator ; 
import java.util.Iterator ;
import java.util.Set ; 


public class Synthesis {
 
    
    public static Map<Integer,List<Integer>> insert(List<int[]> listed){
        int height = listed.size() ; 
        Map<Integer,List<Integer>> mapper =new TreeMap<Integer,List<Integer>>() ; 
        ListIterator<int[]> iterator =  listed.listIterator() ; 
        while(iterator.hasNext()){
            int[] present =iterator.next() ; 
            if(!mapper.containsKey(present[0])){mapper.put(present[0],new Vector<Integer>()) ; } 
            if(!mapper.containsKey(present[1])){mapper.put(present[1],new Vector<Integer>()) ; }  
            mapper.get( present[1]).add(present[0]) ; 
            mapper.get(present[0]).add(present[1]) ; 
        }
        return mapper ;
    }
    public static void  Synthesise(Set<Integer> input,Set<Map<Integer,List<Integer>>> output){  
        int  spans = input.size( ) ; 
        Vector<Integer>   serial = new Vector<Integer>(input) ; 
        List<int[]> edges =new ArrayList<int[]>() ; 
        for(int dy=0 ;dy<spans;dy++){
            for(int dx=dy+1;dx<spans;dx++){
                int[] lanes =new int[]{serial.get(dy),serial.get(dx)} ; 
                edges.add(lanes) ;  
            }
        }  
        List<List<int[]>> derived = Permutations.permute(edges) ; 
        Iterator<List<int[]>> dynamics =  derived.iterator() ; 
        while (dynamics.hasNext()){
            List<int[]> listed = dynamics.next() ;
            Map<Integer,List<Integer>> created =   insert(listed) ; 
             output.add(created) ; 
        }
    }   
}
 