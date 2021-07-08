package com.init.pea.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.init.pea.modelo.Kardex;

public interface KardexDAO extends JpaRepository<Kardex, Integer> {

}
