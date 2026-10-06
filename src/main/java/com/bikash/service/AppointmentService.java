package com.bikash.service;

import com.bikash.models.Appointment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AppointmentService {

    private static final Logger logger= LoggerFactory.getLogger(AppointmentService.class);

    public List<Appointment> getAllAppointments()
    {
        try
        {
            System.out.println(" into service layer ");
            return null;
        }
        catch(Exception e)
        {
            System.out.println(" Error message :"+e.getMessage());
            logger.error(" An error occured while fetching all appointment : {}",e.getMessage(),e);
            return  null;

        }
    }

    public Appointment createAppointment(Appointment appointment)
    {
        try
        {
            return  null;
        }
        catch (Exception e)
        {
            System.out.println(" Error message :"+e.getMessage());
            logger.error(" An error occured while creating appointment : {}",e.getMessage(),e);
            return null;
        }
    }

    public Appointment getAppointmentById(long id)
    {
        try {
            return  null;
        }
        catch (Exception e)
        {
            System.out.println(" Error message :"+e.getMessage());
            logger.error(" An error occured while fetching appointment by id : {}",e.getMessage(),e);

            return null;
        }
    }

    public void deleteAppointment(long id)
    {
        try
        {

        }
        catch (Exception e)
        {
            System.out.println(" Error message :"+e.getMessage());
            logger.error(" An error occured while deleting appointment by id : {}",e.getMessage(),e);
        }
    }

    public Appointment updateAppointment(long id, Appointment appointment)
    {
        try
        {
            return  null;
        }
        catch (Exception e)
        {
            System.out.println(" Error message :"+e.getMessage());
            logger.error(" An error occured while updating appointment by id : {}",e.getMessage(),e);
            return null;
        }
    }

}
