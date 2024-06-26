package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
