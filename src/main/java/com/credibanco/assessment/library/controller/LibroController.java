package com.credibanco.assessment.library.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credibanco.assessment.library.dto.LibroDto;
import com.credibanco.assessment.library.exceptions.MaxLibroException;
import com.credibanco.assessment.library.service.ILibroService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class LibroController {

	
	@Autowired
	private ILibroService iLibroService;
	
	@GetMapping("/libro")
	public List<LibroDto> show() {
		return iLibroService.findAll();
	}
		
	
	@PostMapping("/libro")
	public ResponseEntity<?> create(@RequestBody LibroDto libroDto, BindingResult result) throws MaxLibroException {
		LibroDto libroDtoNew = null;
		Map<String, Object> response = new HashMap<>();
		
		if(result.hasErrors()) {

			List<String> errors = result.getFieldErrors()
					.stream()
					.map(err -> "El campo '" + err.getField() +"' "+ err.getDefaultMessage())
					.collect(Collectors.toList());
			
			response.put("errors", errors);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		
		try {
			
			libroDtoNew = iLibroService.save(libroDto);
		} catch(DataAccessException e) {
			response.put("message", "Error al realizar el insert en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if(libroDtoNew == null) {
			response.put("message", "El libro no cumple con los requisitos");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}else {
			response.put("mensaje", "la orden ha sido creada con éxito!");
			response.put("libro", libroDtoNew);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
		}
		
	}
}
