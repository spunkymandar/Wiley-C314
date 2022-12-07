package com.anno.beans;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class CustomerDAOImplNamedParameter implements CustomerDAO {

	@Autowired
	NamedParameterJdbcTemplate namedTemplate;
	
	@Override
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		String insertQuery="insert into customer values(::customerId,::customerName)";
		
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("customerId", customer.getCustomerId());
		params.put("customerName", customer.getCustomerName());
		
		int rows=namedTemplate.update(insertQuery, params);
		
		return rows;
	}

}
