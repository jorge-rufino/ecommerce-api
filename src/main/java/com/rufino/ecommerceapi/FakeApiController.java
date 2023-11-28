package com.rufino.ecommerceapi;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rufino.ecommerceapi.model.Product;
import com.rufino.ecommerceapi.service.FakeApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
@Tag(name = "fake-api")
public class FakeApiController {
	
	private final FakeApiService service;
	
	@Operation(summary = "Busca todos os produtos.", method = "GET")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Busca realizada com sucesso."),			
			@ApiResponse(responseCode = "500", description = "Erro no servidor.")
	})
	@GetMapping
	public ResponseEntity<List<Product>> listarProdutos(){
		return ResponseEntity.ok(service.listProducts());
	}
}
