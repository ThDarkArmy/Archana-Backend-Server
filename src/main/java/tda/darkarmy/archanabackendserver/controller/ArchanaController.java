package tda.darkarmy.archanabackendserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/archana")
public class ArchanaController {

    @GetMapping
    public ResponseEntity<?> getArchanaBackendServer(){
        return status(200).body("This is Archana Website");
    }
}
