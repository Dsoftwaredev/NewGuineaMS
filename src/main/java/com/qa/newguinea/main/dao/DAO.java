package com.qa.newguinea.main.dao;

import java.sql.ResultSet;
import java.util.List;

public interface DAO <T>{
	
	public T read(int id);
	
	//public List<T> readAll();
	
	public T create(T t);
	
	public T update(T t);
	
	public int delete(int id);
	
	public T modelFromResult(ResultSet result);
	
	
}
