package eci.arsw.weather.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class weatherController {
    
    @GetMapping(value = "/data")
    public ResponseEntity<?> getData(){
        try{
            return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(weatherController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Not found",HttpStatus.NOT_FOUND);            
        }
    }
}
