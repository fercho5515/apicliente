package com.credibanco.assessment.library.service;

import java.util.List;

import com.credibanco.assessment.library.dto.LibroDto;
import com.credibanco.assessment.library.exceptions.MaxLibroException;

public interface ILibroService {

	public List<LibroDto> findAll();
	
	public LibroDto save(LibroDto libroDto) throws MaxLibroException;
}
