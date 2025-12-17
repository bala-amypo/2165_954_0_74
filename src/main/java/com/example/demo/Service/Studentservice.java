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
import com.example.demo.Entity.Studententity;

public interface Studentservice {

    Studententity saveData(Studententity student);

    Studententity getStudent(Long id);

    List<Studententity> getAllStudents();

    Studententity updateStudent(Long id, Studententity student);

    void deleteStudent(Long id);
}
