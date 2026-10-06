package com.bikash.service;

import com.bikash.models.Bill;
import com.bikash.models.Doctors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorsService {

    private static final Logger logger= LoggerFactory.getLogger(DoctorsService.class);

    public List<Doctors> getAllDoctors()
    {
        try {
            System.out.println(" into service layer ");
            return  null;
        }
        catch (Exception e)
        {
            System.out.println(" Error message :"+e.getMessage());
            logger.error(" An error occured while fetching doctors : {}",e.getMessage(),e);
            return null;
        }
    }

    public Doctors createDoctors(Doctors doctors)
    {
        try
        {
            return null;

        }
        catch (Exception e)
        {
            System.out.println(" Error message :"+e.getMessage());
            logger.error(" An error occured while creating Doctors : {}",e.getMessage(),e);
            return null;
        }
    }

    public Doctors getDoctorsById(long id)
    {
        try
        {
            return null;
        }
        catch(Exception e)
        {
            System.out.println(" Error message :"+e.getMessage());
            logger.error(" An error occured while fetching doctor by id : {}",e.getMessage(),e);
            return null;
        }
    }

    public void deleteDoctors(long id)
    {
        try {

        }
        catch (Exception e)
        {
            System.out.println("Error message :"+e.getMessage());
            logger.error(" An error occured while deleting doctor by id: {}",e.getMessage(),e);

        }
    }

    public Doctors updateDoctors(long id, Doctors doctors)
    {
        try {
            return null;
        }
        catch (Exception e)
        {
            System.out.println(" Error message :"+e.getMessage());
            logger.error(" An error occured while updating docctor by id : {}",e.getMessage(),e);
            return null;
        }
    }

}
