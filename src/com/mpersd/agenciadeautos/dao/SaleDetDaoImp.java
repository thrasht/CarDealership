package com.mpersd.agenciadeautos.dao;

import org.springframework.stereotype.Repository;

import com.mpersd.agenciadeautos.domain.SaleDet;


@Repository("saleDetDao")
public class SaleDetDaoImp extends AbstractDao<Integer, SaleDet> implements SaleDetDao {

}
