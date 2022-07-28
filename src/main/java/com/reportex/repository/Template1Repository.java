package com.reportex.repository;

import com.reportex.entity.Template1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Template1Repository extends JpaRepository<Template1, Integer> {
}
