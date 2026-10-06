package com.bikash.service;

import com.bikash.models.Patient;
import com.bikash.repository.PatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class PatientService {

           private static final Logger logger= LoggerFactory.getLogger(PatientService.class);

           @Autowired
           private PatientRepository patientRepository;

           public Page<Patient> getAllPatients(int page, int size)
           {
               try
               {
                   System.out.println("into service layer");

                   Pageable pageable= PageRequest.of(page,size);
                   return patientRepository.findAll(pageable);
               }
               catch (Exception e)
               {
                   System.out.println(" Error message :"+ e.getMessage());
                   logger.error(" An error occured while fetching all patients : {}",e.getMessage(),e);
                   return  null;
               }
           }

           public Patient getPatientById(long id)
           {
               try
               {
                   Optional<Patient> patient =patientRepository.findById(id);

                   return patient.orElse( null);

               }
               catch (Exception e)
               {
                   System.out.println(" Error message :"+ e.getMessage());
                   logger.error(" An error occured while fetching  patient by id : {}",e.getMessage());
                   return null;
               }
           }

           public Patient createPatient(Patient patient)
           {
               try
               {
                   patientRepository.save(patient);

                   return  patient;
               }
               catch (Exception e)
               {
                   System.out.println(" Error message :"+e.getMessage());
                   logger.error(" An error occured while creating patient : {}",e.getMessage());
                   return null;

               }
           }

           public void deletePatient(long id)
           {
               try{
                        patientRepository.deleteById(id);
               }
               catch (Exception e)
               {
                   System.out.println(" Error message :"+e.getMessage());
                   logger.error(" An error occured while deleting patient by id : {}",e.getMessage());
               }
           }

           public Patient updatePatient(long id,Patient patient)
           {
               try
               {
                   Optional<Patient> existingPatient= patientRepository.findById(id);
                   if (existingPatient.isPresent()) {
                       Patient p=existingPatient.get();
                       p.setName(patient.getName());
                       p.setAge(patient.getAge());
                       p.setGender(patient.getGender());

                       patientRepository.save(p);
                       return patient;

                   }
                   else {
                       logger.error(" Patient with Id {} not found", id);
                       return null;
                   }

               } catch (Exception e) {
                   System.out.println(" Error message :"+e.getMessage());
                   logger.error(" An error occured while update patient by id : {}",e.getMessage());
                   return null;
               }
           }
}
