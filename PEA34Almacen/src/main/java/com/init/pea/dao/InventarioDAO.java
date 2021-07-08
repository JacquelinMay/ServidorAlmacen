package com.init.pea.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.pea.modelo.Inventario;

public interface InventarioDAO extends JpaRepository<Inventario,Integer> {

}
