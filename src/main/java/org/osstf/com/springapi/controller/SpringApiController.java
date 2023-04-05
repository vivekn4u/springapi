package org.osstf.com.springapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SpringApiController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getApiID(@PathVariable("id") String id){
        return ResponseEntity.status( HttpStatus.OK).body("Your ID is "+id);
    }
}
