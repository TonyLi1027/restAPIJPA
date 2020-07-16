package com.flexon.restAPIJPA;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JAVAStudentControllerJPA {

    @Autowired
    private JAVAStudentRespo studentRespo;

    //get all students from the array list
    @GetMapping(path="/jpa/getAllStudents")
    public List<JAVAStudent> getAllStudents(){
        return studentRespo.findAll();
    }

    //Adding a new student into classroom
    @PostMapping(path="/jpa/addNewStudent")
    public ResponseEntity addNewStudent(@Validated @RequestBody JAVAStudent newStudent){
        studentRespo.save(newStudent);

        return new ResponseEntity<>("Created new student", HttpStatus.CREATED);
    }
}
