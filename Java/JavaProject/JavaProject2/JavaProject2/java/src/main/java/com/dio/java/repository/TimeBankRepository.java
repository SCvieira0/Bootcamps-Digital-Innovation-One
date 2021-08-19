package com.dio.java.repository;

import com.dio.java.model.TimeBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeBankRepository extends JpaRepository<TimeBank, Long> {
}
