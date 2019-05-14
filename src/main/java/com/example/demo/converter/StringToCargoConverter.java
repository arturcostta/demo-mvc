package com.example.demo.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Cargo;
import com.example.demo.service.CargoService;

@Component
public class StringToCargoConverter implements Converter<String, Cargo> {
	
	@Autowired
	CargoService service;

	@Override
	public Cargo convert(String source) {
		if(source.isEmpty()) {
			return null;
		}
		return service.buscarPorId(Long.valueOf(source));
	}
}
