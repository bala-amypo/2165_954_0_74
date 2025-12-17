package com.example.demo.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.example.demo.Entity.Studententity;
@Service
public class Studentservice{
    Map<Integer,Studententity>details=new HashMap<>();
    public Studententity saveData(Studententity st){
        details.put(st.getId(),st);
        retrun st;
    }
    public Studententity getStudent(int id){
        return details.get(id);
    }
    public Map<Integer,Studententity>getAllStudents(){
        return details;
    }
    public Studententity updateStudent(int id,Studententity st){
        if(details.containsKey(id)){
            details.put(id,st);
            return st;
        }
        return null;
    }
}