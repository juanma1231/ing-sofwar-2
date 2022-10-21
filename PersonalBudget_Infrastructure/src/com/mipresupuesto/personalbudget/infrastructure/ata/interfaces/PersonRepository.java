package com.mipresupuesto.personalbudget.infrastructure.ata.interfaces;

import javax.persistence.JoinColumn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, UUID>{

}
