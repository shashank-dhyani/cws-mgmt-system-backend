package com.cwsms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cwsms.model.office.type.OfficeType;

@Repository
public interface OfficeTypeRepository extends JpaRepository<OfficeType, Long>{

}
