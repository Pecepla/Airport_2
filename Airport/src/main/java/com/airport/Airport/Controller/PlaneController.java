package com.airport.Airport.Controller;



import com.airport.Airport.Model.Plane;
import com.airport.Airport.Service.PlaneService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/planes")
public class PlaneController {



    @GetMapping("/{id}")
    public ResponseEntity<Plane> getWordById(@PathVariable Long id) {
        Optional<Plane> word = PlaneService.getPlaneById(id);





}