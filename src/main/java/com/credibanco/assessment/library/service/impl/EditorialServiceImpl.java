package com.credibanco.assessment.library.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.library.dao.IEditorialDao;
import com.credibanco.assessment.library.dto.EditorialDto;
import com.credibanco.assessment.library.model.Editorial;
import com.credibanco.assessment.library.service.IEditorialService;

@Service
public class EditorialServiceImpl implements IEditorialService{

	ModelMapper modelMapper = new ModelMapper();
	
	public List<Editorial> editorialList = new ArrayList<Editorial>();
	
	public List <EditorialDto> editorialDtoList = new ArrayList<EditorialDto>();
	
	public Editorial editorial = new Editorial();
	
	public EditorialDto editorialDto = new EditorialDto();
	
	@Autowired
	private IEditorialDao iEditorialDao;
	
	@Override
	public List<EditorialDto> findAll() {
		// TODO Auto-generated method stub
		editorialList = (List<Editorial>) iEditorialDao.findAll();
		System.out.print("======>"+editorialList.get(0).getStrDireccion());
		editorialDtoList = modelMapper.map(editorialList, new TypeToken<List<EditorialDto>>(){}.getType());
		return (List<EditorialDto>) editorialDtoList;
	}

	@Override
	public EditorialDto save(EditorialDto editorialDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
