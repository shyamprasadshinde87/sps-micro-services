package com.sp.company.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sp.company.feignclient.CompanyClient;

@RestController
@RequestMapping("/admin")
public class CompanyController {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CompanyClient companyClient;

	@GetMapping("/companyemployees")
	public String getemployeesfromCompany() {
		return companyClient.getAllemployees();
	}

	@GetMapping("/companyemployees/{id}")
	public String getemployeesfromCompanyById(@PathVariable("id") Long id) {
		return companyClient.getEmployeeById(id);

	}

	@DeleteMapping("/companyemployees/{id}")
	public String deleteemployeesfromcompanyById(@PathVariable("id") Long id) {
		return companyClient.deleteEmployeeById(id);

	}

}