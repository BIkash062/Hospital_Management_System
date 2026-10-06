package com.bikash.controller;

import com.bikash.models.Doctors;
import com.bikash.models.Patient;
import com.bikash.service.DoctorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorsController {

    @Autowired
    private DoctorsService doctorsService;

    @GetMapping
    public List<Doctors> getAllDoctors()
    {
        System.out.println(" Fetching Doctors ");
        return doctorsService.getAllDoctors();
    }

    @PostMapping
    public Doctors createDoctors(@RequestBody Doctors doctors)
    {
        System.out.println(" Create Doctors ");
        return  doctorsService.createDoctors(doctors);
    }

    @GetMapping("/{id}")
    public Doctors getDoctorsById(@PathVariable long id)
    {
        System.out.println(" Fetch Doctors By Id ");
        return  doctorsService.getDoctorsById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctors(@PathVariable long id)
    {
        doctorsService.deleteDoctors(id);
    }

    @PutMapping("/{id}")
    public void updateDoctors(@PathVariable long id, @RequestBody Doctors doctors)
    {
        doctorsService.updateDoctors(id,doctors);
    }



}
