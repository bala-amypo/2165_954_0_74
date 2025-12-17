// package com.example.demo.Service.Impl;
// import java.util.*;
// import org.springframework.stereotype.Service;

// import com.example.demo.Entity.Studententity;
// @Service
// public class StudentserviceImpl implements Studentservice{
//     private final Map<Long,Studententity>store=new HashMap<>();
//     private long counter=1;
//     @Override
//     public Studententity insertStudent(Studententity st){
//         st.setId(counter++);
//         store.put(st.getId(),st);
//         return st;
//     }
//     @Override
//     public List<Studententity>getAllStudents(){
//         return new ArrayList<>(store.values());
//     }
//     @Override 
//     public Optional<Studententity>getOneStudent(Long id){
//         return Optional.ofNullable(store.get(id));
//     }
//     @Override
//     public void deleteStudent(Long id){
//         store.remove(id);
//     }
// }
package com.example.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Studententity;
import com.example.demo.Repository.Studentrepository;
import com.example.demo.Service.Studentservice;

@Service
public class StudentserviceImpl implements Studentservice {

    @Autowired
    private Studentrepository repo;

    @Override
    public Studententity saveData(Studententity student) {
        return repo.save(student);
    }

    @Override
    public Studententity getStudent(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Studententity> getAllStudents() {
        return repo.findAll();
    }

    @Override
    public Studententity updateStudent(Long id, Studententity student) {
        Studententity existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(student.getName());
            existing.setAge(student.getAge());
            return repo.save(existing);
        }
        return null;
    }

    @Override
    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }
}
