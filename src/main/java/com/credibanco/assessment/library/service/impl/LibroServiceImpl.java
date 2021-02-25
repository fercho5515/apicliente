package com.credibanco.assessment.library.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.library.dao.IEditorialDao;
import com.credibanco.assessment.library.dao.ILibroDao;
import com.credibanco.assessment.library.dto.LibroDto;
import com.credibanco.assessment.library.model.Libro;
import com.credibanco.assessment.library.service.ILibroService;
import com.credibanco.assessment.library.exceptions.MaxLibroException;


@Service
public class LibroServiceImpl implements ILibroService{

	ModelMapper modelMapper = new ModelMapper();
	
	public List<Libro> libroList = new ArrayList<Libro>();
	
	public List <LibroDto> libroDtoList = new ArrayList<LibroDto>();
	
	public Libro libro = new Libro();
	
	public LibroDto libroDto = new LibroDto();
	
	@Autowired
	private ILibroDao iLibroDao;
	
	@Autowired
	private IEditorialDao iEditorialDao;
	
	@Override
	public List<LibroDto> findAll() {
		// TODO Auto-generated method stub
		libroList = (List<Libro>) iLibroDao.findAll();
		libroDtoList = modelMapper.map(libroList, new TypeToken<List<LibroDto>>(){}.getType());
		return (List<LibroDto>) libroDtoList;
	}

	@Override
	@Transactional
	public LibroDto save(LibroDto libroDtoLocal) throws MaxLibroException {
		// TODO Auto-generated method stub
		if(iLibroDao.findByEditorial_Id(libroDtoLocal.editorial.id).size() >= iEditorialDao.findById(libroDtoLocal.editorial.id).getIntMaxLibros() ) {
			throw new MaxLibroException("No es posible registrar el libro, se alcanzó el máximo permitido.");
		}
		try{
			
			libro = modelMapper.map(libroDtoLocal, Libro.class);
			libro = iLibroDao.save(libro);
			libroDtoLocal = modelMapper.map(libro, LibroDto.class);
			return libroDtoLocal;
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}
	
}
