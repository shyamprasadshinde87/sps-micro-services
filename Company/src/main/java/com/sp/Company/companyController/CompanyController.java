package com.sp.Company.companyController;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sp.Company.companyModel.CompanyModel;
import com.sp.Company.feignclient.CompanyClient;

@RestController
public class CompanyController {

	// private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

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

	@PostMapping("/companyemployees")
	public CompanyModel createEmployeeModel(@Valid @RequestBody CompanyModel companyModel) {
		return companyClient.createCompanyModel(companyModel);
	}

	@PutMapping("/companyemployees/{id}")
	public CompanyModel updateEmployeeModel(@PathVariable("id") Long id, @RequestBody CompanyModel companyModel) {
		return companyClient.updateCompanyModel(id, companyModel);

	}

	@DeleteMapping("/companyemployees/{id}")
	public String deleteemployeesfromcompanyById(@PathVariable("id") Long id) {
		return companyClient.deleteEmployeeById(id);

	}

}