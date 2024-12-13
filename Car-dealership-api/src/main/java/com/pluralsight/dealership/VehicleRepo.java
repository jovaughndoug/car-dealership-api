//package com.pluralsight.dealership;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface VehicleRepo extends JpaRepository<Vehicle, String> {
//    List<Vehicle> findbyMake(String make);
//    List<Vehicle> findbyModel(String model);
//    List<Vehicle> findbyColor(String color);
//    List<Vehicle> findbyType(String type);
//
//@Query("Select v from vehicle v where"+ "(:minPrice is null or v.price >= :minPrice) AND"+
//"(:maxPrice is null or v.price <= :maxPrice) AND"
