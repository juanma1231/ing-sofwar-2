package com.mipresupuesto.personalbudget.infrastructure.ata.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface YearRepository extends JpaRepository<YearEnity, UUID>{
	

}
