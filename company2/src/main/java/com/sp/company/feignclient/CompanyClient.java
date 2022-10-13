package com.sp.company.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "employee", url = "http://localhost:8080")
public interface CompanyClient {

	@GetMapping(value = "/admin/employee")
	public String getAllemployees();

	@GetMapping(value = "/admin/employee/{id}")
	public String getEmployeeById(@PathVariable(value = "id") Long productId);

	@DeleteMapping("/admin/employee/{id}")
	public String deleteEmployeeById(@PathVariable(value = "id") Long productId);

}
