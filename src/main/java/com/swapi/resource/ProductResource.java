package com.swapi.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@Api(value="Product API")
@RequestMapping("/api/usuarios")
public class ProductResource {

    @GetMapping
    //public String find(@QueryVariable("senha") String usuario, @PathVariable("senha") String senha) {
    public String teste() {
    	return "OK";
    }

	/*
	 * @PostMapping
	 * 
	 * @ResponseStatus(HttpStatus.CREATED) public Product create(@Valid @RequestBody
	 * Product product, @ApiIgnore WebRequest webRequest) {
	 * webRequest.setAttribute("product", product, RequestAttributes.SCOPE_REQUEST);
	 * Product productPostCreated = productService.create(product); return
	 * productPostCreated; }
	 * 
	 * @PutMapping(value = "/{sku}")
	 * 
	 * @ResponseStatus(HttpStatus.OK) public Product update(@PathVariable("sku")
	 * Long sku, @Valid @RequestBody Product product, @ApiIgnore WebRequest
	 * webRequest) { webRequest.setAttribute("product", product,
	 * RequestAttributes.SCOPE_REQUEST); Product productPostCreated =
	 * productService.update(sku, product); return productPostCreated; }
	 * 
	 * @DeleteMapping(value = "/{sku}") public void delete(@PathVariable("sku") Long
	 * sku) { productService.delete(sku); }
	 */
}