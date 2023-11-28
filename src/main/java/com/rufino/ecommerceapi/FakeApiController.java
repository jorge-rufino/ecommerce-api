package com.rufino.ecommerceapi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rufino.ecommerceapi.model.Product;
import com.rufino.ecommerceapi.service.FakeApiService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class FakeApiController {
	
	private final FakeApiService service;
	
	@GetMapping
	public List<Product> listarProdutos(){
		return service.listProducts();
	}
}
