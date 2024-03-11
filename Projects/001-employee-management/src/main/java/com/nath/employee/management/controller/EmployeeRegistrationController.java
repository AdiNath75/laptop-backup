package com.nath.employee.management.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nath.employee.management.service.EmployeeService;
import com.nath.employee.management.web.dto.EmployeeRegistrationDto;

@Controller
@RequestMapping("/registration")
public class EmployeeRegistrationController {

	private EmployeeService employeeService;

	public EmployeeRegistrationController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@ModelAttribute("employee")
	public EmployeeRegistrationDto employeeRegistrationDto() {
		return new EmployeeRegistrationDto();
	}

	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}

	@PostMapping
	public String registerEmployeeAccount(@Valid @ModelAttribute("employee") EmployeeRegistrationDto registrationDto,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "registration";
		} else {

			employeeService.save(registrationDto);
			return "register_success";
		}
	}

}
