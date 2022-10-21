package com.menuapi.menuapi.services;

import java.util.List;

import com.menuapi.menuapi.entities.Menu;

public interface MenuService {
	
public List<Menu> getMenu();
	
	public Menu getMenu(long menuId);
	
	public Menu addMenu(Menu menu);
	
	public Menu updateMenu(Menu menu);
	
	public void deleteMenu(long parseLong);

}
