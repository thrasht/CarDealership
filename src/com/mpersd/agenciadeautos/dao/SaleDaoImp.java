package com.mpersd.agenciadeautos.dao;

import org.springframework.stereotype.Repository;

import com.mpersd.agenciadeautos.domain.Sale;

@Repository("saleDao")
public class SaleDaoImp extends AbstractDao<Integer, Sale> implements SaleDao {

}
