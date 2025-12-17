// package com.example.demo.Entity;

// public class Studententity{
//     private int id;
//     private String name;
//     private String email;
//     public int getId(){
//         return id;

//     }
//     public void setId(int id){
//         this.id=id;

//     }
//     public String getName(){
//         return name;

//     }
//     public void setName(String name){
//         this.name=name;   
//     }
//     public String getEmail(){
//         return email;
//     }
//     public void setEmail(String email){
//         this.email=email;
//     }
//     public Studententity(int id,String name,String email){
//         this.id=id;
//         this.name=name;
//         this.email=email;
//     }
//     public Studententity(){

//     }
// }
package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Studententity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;

    public Studententity() {}

    public Studententity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
