package com.rufino.ecommerceapi.infra;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.rufino.ecommerceapi.model.Product;

@FeignClient(value ="fake-api", url = "${fake-api.url:#{null}}")
public interface FakeApiClient {
	
	@GetMapping("/products")
	List<Product> listProducts();
}
