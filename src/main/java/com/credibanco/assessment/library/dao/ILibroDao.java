package com.credibanco.assessment.library.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.credibanco.assessment.library.model.Libro;

public interface ILibroDao extends JpaRepository <Libro, Long> {

	List<Libro> findByEditorial_Id(Integer id);
}
