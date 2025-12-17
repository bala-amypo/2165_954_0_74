package com.example.demo.Service.Impl;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Student;
@Service
public class StudentserviceImpl implements Studentservice{
    private final Map<Long,Student>store=new HashMap<>();
    private long counter=1;
    @Override
    public Student insertStudent(Student st){
        st.setId(counter++);
        store.put(st.getId(),st);
        return st;
    }
    @Override
    public List<Student>getAllStudents(){
        return new ArrayList<>(store.values());
    }
    @Override 
    public Opti
}