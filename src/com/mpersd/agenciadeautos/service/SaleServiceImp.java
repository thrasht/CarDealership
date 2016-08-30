package com.mpersd.agenciadeautos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mpersd.agenciadeautos.dao.SaleDao;
import com.mpersd.agenciadeautos.dao.UserDao;

@Service("saleService")
@Transactional
public class SaleServiceImp implements SaleService {

	@Autowired
	private SaleDao sdao;
	
	
}
