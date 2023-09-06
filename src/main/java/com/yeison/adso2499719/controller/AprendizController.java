package com.casanova.adso2499719.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casanova.adso2499719.entities.Aprendiz;
import com.casanova.adso2499719.interfaces.IntAprendizService;

@RestController
@RequestMapping("appi/aprendiz")
public class AprendizController {
	
	@Autowired
	private IntAprendizService service;
	
	// GET/API/ESPECIALIDAD/1
	// POST URL - CUERPO DE LA PETICION
	// PUT
	// DELETE
	
	@GetMapping
	public ResponseEntity<?> getAll() throws Exception {
		try {
			return ResponseEntity.ok(service.getAll());				
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(e.getMessage());
		}
	}
	
	// appi/aprendiz/2
	@GetMapping("id")
	public ResponseEntity<?> getById(@PathVariable Long id) throws Exception {
		try {
			return ResponseEntity.ok(service.getById(id)); 			
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(e.getMessage()); 
		}
	}
	
	// GUARDAR
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Aprendiz aprendiz) throws Exception {
		try {
			return ResponseEntity.ok(service.save(aprendiz));			
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(e.getMessage()); 
		}
	}
	
	@PutMapping("{id}")
	public ResponseEntity<?> updated(@PathVariable Long id, @RequestBody Aprendiz aprendiz) throws Exception{
		try {
			service.updated(id, aprendiz);
			return ResponseEntity.ok("Registro actualizado"); 			
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(e.getMessage()); 
		}
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleted(@PathVariable Long id) throws Exception{
		try {
			service.deleted(id);
			return ResponseEntity.ok("Registro eliminado"); 			
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(e.getMessage()); 
		}
	}
} 

	
