package com.moderneinstein.logical.algorithms;


import java.util.ListIterator ; 
import java.util.function.Function ; 
import java.util.Set ; 
import java.util.Arrays  ; 
import java.util.stream.IntStream ; 
import java.util.stream.Stream  ; 
import java.util.List ;
import java.util.HashSet ; 
import java.util.Map; 
 import java.util.TreeSet ;
 import java.util.HashMap ; 

 import com.moderneinstein.logical.algorithms.Synthesis  ; 

public class GraphTest1 {
    
    public static int[][] types = {new int[]{4,5,6,7} } ;
    @Test
    public void  test1(){
        int[] serve = (int[])types[0].clone() ;
         IntStream straps = Arrays.stream(serve) ;
        Stream<Integer> boxes =  straps.boxed( ) ; 
        List<Integer> linear =  boxes.toList() ; 
        Set<Integer> setty  = new HashSet<Integer>(linear) ; 
        Set<Map<Integer,List<Integer>>> contains = new TreeSet<Map<Integer,List<Integer>>>() ; 
        Synthesis.Synthesise(setty,contains) ; 

    }

}
