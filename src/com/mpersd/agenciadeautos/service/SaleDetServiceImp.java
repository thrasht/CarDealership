package com.mpersd.agenciadeautos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mpersd.agenciadeautos.dao.SaleDetDao;

@Service("saleDetService")
@Transactional
public class SaleDetServiceImp implements SaleDetService {

	@Autowired
	private SaleDetDao sddao;
	
	
}
