package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.model.Cliente;
import com.example.demo.repository.IClienteRepository;


@Controller
@RequestMapping("/cliente")

public class ClienteController {
	
	@Autowired
	private IClienteRepository clienteRepositor;
	
	@GetMapping("/registro")
	private String formularioRegistro (Cliente cliente) {
		return"formulario";
	}
	//
	
	@PostMapping("/registro")
	private String registroCliente (Cliente cliente) {
		System.out.print("inicio registro");
		clienteRepositor.save(cliente);
		
		
		return"formulario";
	}
	

}
