package br.com.wcc;

import java.util.ArrayList;
import java.util.List;

public class Tabuada {
      public int i=0;
      public float t;
    public List <Integer> Tabuada(int t){

        List<Integer> tabuada = new ArrayList<>();
        for (int i=0;i<11;i++){
            tabuada.add(t*i);
        }
        return tabuada;



    }
}
