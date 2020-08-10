package com.upgrad.HireWheelsProject.service;

import com.upgrad.HireWheelsProject.dao.*;
import com.upgrad.HireWheelsProject.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("initService")
public class InitServiceImpl implements InitService{

    @Autowired
    @Qualifier("RoleDAO")
    RoleDAO RoleDAO;

    @Autowired
    @Qualifier("userDAO")
    UserDAO userDAO;

    @Autowired
    @Qualifier("Vehicle_category")
    Vehicle_categoryDAO Vehicle_categoryDAO;

    @Autowired
    @Qualifier("Fuel_type")
    Fuel_typeDAO fuel_typeDAO;

    @Autowired
    @Qualifier("Vehicle_subcategory")
    Vehicle_subcategoryDAO vehicle_subcategoryDAO;

    @Override
    public void insertData() {
        insertUserRoles();
        insertUsers();
    }

    private void insertUserRoles(){
        Role admin = new Role();
        admin.setRoleName("Admin");

        Role customer = new Role();
        customer.setRoleName("Customer");

        RoleDAO.save(admin);
        RoleDAO.save(customer);
    }

    private void insertUsers(){
        User user = new User();
        user.setFirst_name("Admin");
        user.setLast_name("Admin");
        user.setEmail("upgrad@gmail.com");
        user.setMobile_no("9999999999");
        user.setPassword("admin@123");
        user.setWallet_money(10000.00);
        user.setUserRole(RoleDAO.findByUserRoleName("Admin"));
        userDAO.save(user);
    }

    private void insertVehicleCategory(){
        Vehicle_category car = new Vehicle_category();
        Vehicle_category bike = new Vehicle_category();
        car.setVehicleCategoryName("car");
        bike.setVehicleCategoryName("bike");
        Vehicle_categoryDAO.save(car);
        Vehicle_categoryDAO.save(bike);

    }

    private void insertFuelType(){
        Fuel_type petrol= new Fuel_type();
        petrol.setFuel_type("petrol");
        Fuel_type diesel= new Fuel_type();
        petrol.setFuel_type("diesel");
        fuel_typeDAO.save(petrol);
        fuel_typeDAO.save(diesel);

    }

    private void insertvehiclesubcategory(){
        Vehicle_subcategory SUV = new Vehicle_subcategory();
        SUV.setVehicleTypeName("SUV");
        SUV.setCostPerHour(300);
        vehicle_subcategoryDAO.save(SUV);

        Vehicle_subcategory SEDAN = new Vehicle_subcategory();
        SEDAN.setVehicleTypeName("SEDAN");
        SEDAN.setCostPerHour(350);
        vehicle_subcategoryDAO.save(SEDAN);

        Vehicle_subcategory HATCHBACK = new Vehicle_subcategory();
        HATCHBACK.setVehicleTypeName("HATCHBACK");
        HATCHBACK.setCostPerHour(250);
        vehicle_subcategoryDAO.save(HATCHBACK);

        Vehicle_subcategory CRUISER = new Vehicle_subcategory();
        CRUISER.setVehicleTypeName("CRUISER");
        CRUISER.setCostPerHour(200);
        vehicle_subcategoryDAO.save(CRUISER);

        Vehicle_subcategory DIRTBIKE = new Vehicle_subcategory();
        DIRTBIKE.setVehicleTypeName("DIRTBIKE");
        DIRTBIKE.setCostPerHour(200);
        vehicle_subcategoryDAO.save(DIRTBIKE);

    }

}

