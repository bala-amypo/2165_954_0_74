package com.example.demo.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.example.demo.Entity.Studententity;
@Service
public class Studentservice{
    Map<Integer,Studententity>details=new HashMap<>();
    public Studententity saveData(Studententity st){
        details.put(st.getId())
    }
}