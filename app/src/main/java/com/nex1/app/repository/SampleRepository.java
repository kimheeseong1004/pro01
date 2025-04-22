package com.nex1.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nex1.app.entity.Sample;

public interface SampleRepository extends JpaRepository<Sample, Long> {
	

}
