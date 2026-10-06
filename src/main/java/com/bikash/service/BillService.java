package com.bikash.service;

import com.bikash.models.Bill;
import lombok.extern.java.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BillService {

    private static final Logger logger= LoggerFactory.getLogger(BillService.class);

    public List<Bill> getAllBills()
    {
        try {
            System.out.println(" into service layer ");
            return  null;
        }
        catch (Exception e)
        {
            System.out.println(" Error message :"+e.getMessage());
            logger.error(" An error occured while fetching Bill : {}",e.getMessage(),e);
            return null;
        }
    }

    public Bill createBill(Bill bill)
    {
        try
        {
            return null;

        }
        catch (Exception e)
        {
            System.out.println(" Error message :"+e.getMessage());
            logger.error(" An error occured while creating Bill : {}",e.getMessage(),e);
            return null;
        }
    }

    public Bill getBillById(long id)
    {
        try
        {
            return null;
        }
        catch(Exception e)
        {
            System.out.println(" Error message :"+e.getMessage());
            logger.error(" An error occured while fetching Bill by id : {}",e.getMessage(),e);
            return null;
        }
    }

    public void deleteBill(long id)
    {
        try {

        }
        catch (Exception e)
        {
            System.out.println("Error message :"+e.getMessage());
            logger.error(" An error occured while deleting bill by id : {}",e.getMessage(),e);

        }
    }

    public Bill updateBill(long id , Bill bill)
    {
        try {
            return null;
        }
        catch (Exception e)
        {
            System.out.println(" Error message :"+e.getMessage());
            logger.error(" An error occured while updating bill by id : {}",e.getMessage(),e);
            return null;
        }
    }
}
