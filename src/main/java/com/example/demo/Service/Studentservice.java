// package com.example.demo.Service;

// import java.util.HashMap;
// import java.util.Map;

// import org.springframework.stereotype.Service;
// import com.example.demo.Entity.Studententity;
// @Service
// public interface Studentservice{
//     Map<Integer,Studententity>details=new HashMap<>();
//     public Studententity saveData(Studententity st){
//         details.put(st.getId(),st);
//         return st;
//     }
//     public Studententity getStudent(int id){
//         return details.get(id);
//     }
//     public Map<Integer,Studententity>getAllStudents(){
//         return details;
//     }
//     public Studententity updateStudent(int id,Studententity st){
//         if(details.containsKey(id)){
//             details.put(id,st);
//             return st;
//         }
//         return null;
//     }
// }
package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Entity.Studententity;

public interface Studentservice {

    Studententity insertStudent(Studententity st);

    List<Studententity> getAllStudents();

    Optional<Studententity> getOneStudent(Integer id);

    void deleteStudent(Integer id);
}
