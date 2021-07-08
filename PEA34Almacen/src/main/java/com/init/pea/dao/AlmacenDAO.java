package com.init.pea.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.init.pea.modelo.Almacen;

public interface AlmacenDAO extends JpaRepository<Almacen, Integer> {

}
