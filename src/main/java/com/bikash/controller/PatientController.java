package com.bikash.controller;

import com.bikash.models.Patient;
import com.bikash.service.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public Page<Patient> getAllPatients(@RequestParam(defaultValue = "0") int page,
                                        @RequestParam(defaultValue = "2") int size)
    {
        System.out.println("Fetching the patients");

        return patientService.getAllPatients(page,size);
    }

    @PostMapping
    public  Patient createpatient(@RequestBody Patient patient)
    {
        System.out.println("Creating patient ");

        return patientService.createPatient(patient);
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable long id)
    {
        System.out.println("Fetching patient by ID");
        return  patientService.getPatientById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable long id)
    {
        patientService.deletePatient(id);
    }

    @PutMapping("/{id}")
    public void updatePatient(@PathVariable long id, @RequestBody Patient patient)
    {
        patientService.updatePatient(id, patient);
    }
}
