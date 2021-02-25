package com.credibanco.assessment.library.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.library.model.Autor;
import com.credibanco.assessment.library.service.IAutorService;
import com.credibanco.assessment.library.dao.IAutorDao;
import com.credibanco.assessment.library.dto.AutorDto;


@Service
public class AutorServiceImpl implements IAutorService  {
	
	ModelMapper modelMapper = new ModelMapper();
	
	public List<Autor> autorList = new ArrayList<Autor>();
	
	public List <AutorDto> autorDtoList = new ArrayList<AutorDto>();
	
	public Autor autor = new Autor();
	
	public AutorDto autorDto = new AutorDto();
	
	@Autowired
	private IAutorDao iAutorDao;
	
	@Override
	public List<AutorDto> findAll() {
		// TODO Auto-generated method stub
		autorList = (List<Autor>) iAutorDao.findAll();
		autorDtoList = modelMapper.map(autorList, new TypeToken<List<AutorDto>>(){}.getType());
		return (List<AutorDto>) autorDtoList;
	}

	@Override
	@Transactional
	public AutorDto save(AutorDto autorDtoLocal) {
		// TODO Auto-generated method stub
		try{
			autor = modelMapper.map(autorDtoLocal, Autor.class);
			autor = iAutorDao.save(autor);
			autorDtoLocal = modelMapper.map(autor, AutorDto.class);
			return autorDtoLocal;
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}

}
