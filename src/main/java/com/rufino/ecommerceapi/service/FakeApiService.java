package com.rufino.ecommerceapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rufino.ecommerceapi.infra.FakeApiClient;
import com.rufino.ecommerceapi.model.Product;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FakeApiService {

	private final FakeApiClient client;
	
	public List<Product> listProducts(){
		return client.listProducts();
	}
}
