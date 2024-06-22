package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.entity.Menu;
@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer>{

}
