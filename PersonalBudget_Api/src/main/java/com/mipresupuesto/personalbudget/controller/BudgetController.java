package com.mipresupuesto.personalbudget.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mipresupuesto.personalbudget.application.command.interfaces.CreateBudgetPort;
import com.mipresupuesto.personalbudget.controller.response.Response;
import com.mipresupuesto.personalbudget.controller.response.dto.Message;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;

@RestController
@RequestMapping("api/v1/budget")
public class BudgetController {

	@Autowired
	private  CreateBudgetPort createBudgetPort;
	
	@PostMapping
	public ResponseEntity<Response<BudgetDTO>> create(@RequestBody BudgetDTO budget) {
		final Response<BudgetDTO> response = new Response<>();
		HttpStatus statusCode = HttpStatus.OK;
		try {
			response.addMessage(Message.createSuccesMessage("El budget se ha creado de forma satisfactoria", null, null));
		}catch(final Exception exception){
			statusCode = HttpStatus.BAD_REQUEST;
			//Si excepcion tiene mensaje de usuarrio,
			response.addMessage(
					Message.createErrorMessage("Ha ocurrido ujn problema inesperado tratando de crea un presupuesto deseado...", null, null));
		}
		
		createBudgetPort.execute(budget);
		return new ResponseEntity<>(response, statusCode);
	}
	
	@GetMapping
	public ResponseEntity<Response<BudgetDTO>> create1(@RequestBody BudgetDTO budget) {
		final Response<BudgetDTO> response = new Response<>();
		HttpStatus statusCode = HttpStatus.OK;
		try {
			response.addMessage(Message.createSuccesMessage("El budget se ha creado de forma satisfactoria, null, null", "", ""));
		}catch(final Exception exception){
			statusCode = HttpStatus.BAD_REQUEST;
			//Si excepcion tiene mensaje de usuarrio,
			response.addMessage(
					Message.createErrorMessage("Ha ocurrido ujn problema inesperado tratando de crea un presupuesto deseado...", "", ""));
		}
		
		createBudgetPort.execute(budget);
		return new ResponseEntity<>(response, statusCode);
	}
}
