package com.moderneinstein.logical.algorithms  ; 


import java.util.Arrays ; 
import java.util.Vector ; 
import java.util.List ; 
import java.util.Set ;  
import java.util.ArrayList ; 
import java.util.Collection ; 

public class Permutations{

    public static <C> void compute(List<C> present,List<C> source,boolean[] signs,Collection<List<C>> nested){
         if(present.size( )==source.size()){
        nested.add(new Vector<C>(present))  ; 
        return  ; 
         }  
        for(int  fc=0 ;fc<signs.length;fc++){
            if(signs[fc]==false){
                signs[fc] = true  ;
                 present.add(source.get( fc)) ; 
                compute( present,source,signs,nested ) ; 
                signs[fc] = false ; 
                present.remove(present.size()-1) ; 
             }
        }
    }
    
    public static <T>  List<List<T>> permute(List<T> input){
        int length  =input.size() ; 
        List<List<T>> created = new Vector<List<T>>( ); 
        List<T> begin =  new ArrayList<T> () ;    
        boolean[] lines = new boolean[length] ;   
        List<T> clone = new ArrayList<T>(input) ; 
        compute(begin,clone,lines,created) ; 
        return created ;  
    }
}