package com.airport.Airport.Controller;


import com.airport.Airport.Model.Plane;
import com.airport.Airport.Service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/planes")
public class PlaneController {

    @Autowired
    private PlaneService planeService;






    @GetMapping("/{id}")
    public ResponseEntity<Plane> getPlaneById(@PathVariable Integer id) {
        return planeService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }



    @PostMapping
    public Plane createPlane(@RequestBody Plane plane) {
        return planeService.savePlane(plane);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plane> updatePlane(@PathVariable Integer id, @RequestBody Plane  plane){
        return planeService.findById(id)
                .map(existingPlane -> {
                    plane.setId(id);
                    return ResponseEntity.ok(planeService.savePlane(plane));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlane(@PathVariable Integer id) {
        return planeService.findById(id)
                .map(plane  -> {
                    planeService.deleteById(id);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/search")
    public List<Plane> searchPlane(@RequestParam String keyword) {
        return planeService.searchPlane(keyword);

    }



}