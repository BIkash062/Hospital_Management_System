package com.bikash.controller;

import com.bikash.models.Appointment;
import com.bikash.service.AppointmentService;
import com.bikash.service.WebhookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

      @Autowired
      private AppointmentService appointmentService;

      @Autowired
      private WebhookService webhookService;

      @GetMapping
      public  List<Appointment> getAllAppointment(){
            System.out.println(" Fetching all appointments....");
            return appointmentService.getAllAppointments();
      }

      @PostMapping
      public Appointment createAppointment(@RequestBody Appointment appointment)
      {
            System.out.println(" Create appointment...");
            Appointment appointment1 =appointmentService.createAppointment(appointment);

            Map<String, Object> payload=new HashMap<>();
            payload.put("appointmentId",appointment1.getId());
            payload.put("patientId",appointment1.getPatient_id());
            payload.put("doctorsId",appointment1.getDoctors_id());
            payload.put("appointmentDate",appointment1.getDate());

            String webhookUrl="http://localhost:9091/webhook";
            webhookService.sendWebhook(webhookUrl,payload);
            return appointment1;
      }

      @GetMapping("/{id}")
      public Appointment getAppointmentById(@PathVariable long id)
      {
            System.out.println("Fetching appointment by Id...");
            return appointmentService.getAppointmentById(id);
      }

      @DeleteMapping("/{id}")
      public void deleteAppointment(@PathVariable long id)
      {
            appointmentService.deleteAppointment(id);
      }

      @PutMapping("/{id}")
      public void updateAppointment(@PathVariable long id, @RequestBody Appointment appointment )
      {
            appointmentService.updateAppointment(id,appointment);
      }
}

