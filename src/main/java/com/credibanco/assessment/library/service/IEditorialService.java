package com.credibanco.assessment.library.service;

import java.util.List;

import com.credibanco.assessment.library.dto.EditorialDto;

public interface IEditorialService {

	public List<EditorialDto> findAll();
	
	public EditorialDto save(EditorialDto editorialDto);
}
