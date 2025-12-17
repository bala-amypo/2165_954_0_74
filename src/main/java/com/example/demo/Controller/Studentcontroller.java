// package com.example.demo.Controller;

// import java.util.Map;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.demo.Entity.Studententity;
// import com.example.demo.Service.Studentservice;

// @RestController
// public class Studentcontroller{
//     @Autowired
//     Studentservice ser;
//     @PostMapping("/Postadd")
//     public Studententity post(@RequestBody Studententity st){
//         return ser.saveData(st);
//     }
//     @GetMapping("/Getadd/{id}")
//     public Studententity get(@PathVariable int id){
//         return ser.getStudent(id);
//     }
//     @GetMapping("/getAll")
//     public Map<Integer,Studententity>getAllStudents(){
//         return ser.getAllStudents();
//     }
//     @PutMapping("/update/{id}")
//     public Studententity update(@PathVariable int id,@RequestBody Studententity st){
//         return ser.updateStudent(id,st);
//     }
// }
package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.Studententity;
import com.example.demo.Service.Studentservice;

@RestController
@RequestMapping("/students")
public class Studentcontroller {

    @Autowired
    private Studentservice ser;

    @PostMapping
    public Studententity save(@RequestBody Studententity student) {
        return ser.saveData(student);
    }

    @GetMapping("/{id}")
    public Studententity getById(@PathVariable Long id) {
        return ser.getStudent(id);
    }

    @GetMapping
    public List<Studententity> getAll() {
        return ser.getAllStudents();
    }

    @PutMapping("/{id}")
    public Studententity update(
            @PathVariable Long id,
            @RequestBody Studententity student) {
        return ser.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        ser.deleteStudent(id);
        return "Deleted Successfully";
    }
}
