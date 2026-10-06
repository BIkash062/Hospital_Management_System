package com.bikash.repository;

import com.bikash.models.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository  extends JpaRepository<Doctors,Long> {
}
