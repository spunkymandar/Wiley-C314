package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private  JdbcTemplate jdbcTemplate=null;

	public UserService(JdbcTemplate jdbcTemplate) {
		//super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public void insert(UserDto userDto) {
			
	        int rowsInserted = jdbcTemplate.update("insert into user_entity (id,first_name,last_name) values (?,?,?)",userDto.getId(),userDto.getFirstName(),userDto.getLastName());
	        
	        System.out.println("Number of rows updated = " + rowsInserted);
	    }
}
