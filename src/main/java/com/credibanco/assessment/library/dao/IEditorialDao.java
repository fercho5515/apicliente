package com.credibanco.assessment.library.dao;


import org.springframework.data.repository.CrudRepository;

import com.credibanco.assessment.library.model.Editorial;

public interface IEditorialDao extends CrudRepository <Editorial, Long>{

	public Editorial findById(int id);

}
