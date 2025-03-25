package com.airport.Airport.Service;


import com.airport.Airport.Model.Plane;
import com.airport.Airport.Repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaneService {

    @Autowired
    private PlaneRepository PlaneRepository;

    public List<Plane> getAllPlane() {
        return PlaneRepository.findAll();
    }

    public Optional<AppUser> getUserById(String id) {
        return appUserRepository.findById(id);
    }

    public AppUser createUser(AppUser user) {
        return appUserRepository.save(user);
    }

    public AppUser updateUser(AppUser user) {
        return appUserRepository.save(user);
    }

    public void deleteUser(String id) {
        appUserRepository.deleteById(id);
    }

    public void deleteAllUsers() {
        appUserRepository.deleteAll();
    }

    public boolean existsById(String id) {
        return appUserRepository.existsById(id);
    }

    public long getUserCount() {
        return appUserRepository.count();
    }

    // Additional business logic can be added here
    public List<AppUser> getActiveUsers() {
        return appUserRepository.findByIsActiveTrue();
    }

    public AppUser getUserByEmail(String email) {
        return appUserRepository.findByEmail(email);
    }

    public List<AppUser> getUsersByAgeGreaterThan(int age) {
        return appUserRepository.findByAgeGreaterThan(age);
    }


}