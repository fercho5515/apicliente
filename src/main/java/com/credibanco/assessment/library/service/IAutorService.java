package com.credibanco.assessment.library.service;

import java.util.List;

import com.credibanco.assessment.library.dto.AutorDto;

public interface IAutorService {

	public List<AutorDto> findAll();
	
	public AutorDto save(AutorDto autorDto);
}
