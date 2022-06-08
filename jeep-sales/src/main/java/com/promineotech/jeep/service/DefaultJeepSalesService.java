package com.promineotech.jeep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.promineotech.jeep.dao.JeepSalesDao;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;


import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultJeepSalesService implements JeepSalesService {


	//@Autowired private JeepSalesService jeepSalesService;

	@Autowired
	private JeepSalesDao jeepSalesDao;

	//@Transactional(readOnly = true)
	public List<Jeep> fetchJeeps(JeepModel model, String trim) {
		List<Jeep> jeeps = jeepSalesDao.fetchJeeps(model, trim);
		return jeeps;
	}

	
}

