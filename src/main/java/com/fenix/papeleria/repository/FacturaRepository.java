package com.fenix.papeleria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fenix.papeleria.model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer>{

}
