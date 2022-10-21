package com.menuapi.menuapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.menuapi.menuapi.entities.Menu;
import com.menuapi.menuapi.services.MenuService;


@RestController
public class MyController {
	
	//creating object for MenuService interface
	@Autowired
	private MenuService menuService;
	
	//fetching all menu available
	@GetMapping("/menu")
	public List<Menu> getMenu() {
		
		return this.menuService.getMenu();
	}
	
	//fetching specific course
		@GetMapping("/menu/{menuId}")
		public Menu getMenu(@PathVariable String menuId){
			
			return this.menuService.getMenu(Long.parseLong(menuId));	
		}
	
	//Adding new menu
		@PostMapping("/menu")
		public Menu addMenu(@RequestBody Menu menu) {
			return this.menuService.addMenu(menu);
		}
		
	////update menu details
		@PutMapping("/menu")
		public Menu updateMenu(@RequestBody Menu menu) {
			return this.menuService.updateMenu(menu);
		}	
		
		//delete the course
		@DeleteMapping("/menu/{menuId}")
		public ResponseEntity<HttpStatus> deleteMenu(@PathVariable String menuId){
			
			try {
				this.menuService.deleteMenu(Long.parseLong(menuId));
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}	
	
	
}
