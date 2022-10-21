package com.menuapi.menuapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.menuapi.menuapi.entities.Menu;

public interface MenuDao extends JpaRepository<Menu, Long> {

}
