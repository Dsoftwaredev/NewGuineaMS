package com.qa.main.controllers;

import java.util.List;

public interface CrudController<T> {

	List<T> readAll();
	T read();
	T readLatest();
	T create();
	T update();
	int delete();
}
