package com.qa.main.controllers;

import java.util.List;

public interface CrudController<t> {

	List<t> readAll();
	T read();
	T readLatest();
	T create();
	T update();
	int delete();
}
