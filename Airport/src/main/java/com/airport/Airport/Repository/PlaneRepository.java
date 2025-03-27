package com.airport.Airport.Repository;



import com.airport.Airport.Model.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PlaneRepository extends JpaRepository<Plane, Long> {


}