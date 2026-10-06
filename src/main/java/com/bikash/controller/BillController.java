package com.bikash.controller;

import com.bikash.models.Bill;
import com.bikash.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bills")
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping
    public List<Bill> getAllBill()
    {
        System.out.println(" Fetching Bill ");
        return billService.getAllBills();
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill)
    {
        System.out.println(" Create Bill");
        return billService.createBill(bill);
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable long id)
    {
        System.out.println(" Fetching Bill by Id");
        return  billService.getBillById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable long id)
    {
        billService.deleteBill(id);
    }

    @PutMapping("/{id}")
    public void updateBill(@PathVariable long id, @RequestBody Bill bill)
    {
        billService.updateBill(id,bill);
    }


}
