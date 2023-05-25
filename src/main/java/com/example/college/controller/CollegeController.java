package com.example.college.controller;

import com.example.college.entity.College;
import com.example.college.repo.Collegerepo;
import com.example.college.repo.Collegerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/c")
public class CollegeController {
@Autowired
    private Collegerepo collegerepo;
@PostMapping("/s")
    public ResponseEntity<College> addCollege(@RequestBody College college){
    College college1=collegerepo.save(college);
    return ResponseEntity.ok().build();
}
@GetMapping("/j")
    public ResponseEntity<College> getCollege(){
    collegerepo.findAll();
    return ResponseEntity.ok().build();
}
@GetMapping("/j")
    public ResponseEntity<College> getCollege(@PathVariable Long id){
    Optional<College> college=collegerepo.findById(id);
    if(college.isPresent()){
        return ResponseEntity.ok().body(college.get());
    }
    else{
        return ResponseEntity.noContent().build();
    }
}
@PutMapping("/j")
    public ResponseEntity<College> updateCollege(@RequestBody College college){
    collegerepo.save(college);
    return ResponseEntity.ok().build();
}
@DeleteMapping("/m")
    public ResponseEntity<College> deleteCollege(@PathVariable Long id){
    collegerepo.deleteById(id);
    return ResponseEntity.ok().build();
}
}
