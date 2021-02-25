package com.credibanco.assessment.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credibanco.assessment.library.dto.EditorialDto;
import com.credibanco.assessment.library.service.IEditorialService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class EditorialController {

	@Autowired
	private IEditorialService iEditorialService;
	
	@GetMapping("/editorial")
	public List<EditorialDto> show() {
		return iEditorialService.findAll();
	}
}
