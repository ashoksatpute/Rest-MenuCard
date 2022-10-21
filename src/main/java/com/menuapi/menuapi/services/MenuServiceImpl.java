package com.menuapi.menuapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.menuapi.menuapi.dao.MenuDao;
import com.menuapi.menuapi.entities.Menu;

@Service
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private MenuDao menuDao;

	@Override
	public List<Menu> getMenu() {
		
		return menuDao.findAll();
	}

	@Override
	public Menu getMenu(long menuId) {
		
		return menuDao.getOne(menuId);
	}

	@Override
	public Menu addMenu(Menu menu) {
		
		menuDao.save(menu);
		return menu;
	}

	@Override
	public Menu updateMenu(Menu menu) {
		
        menuDao.save(menu);
		
		return menu;
	}

	@Override
	public void deleteMenu(long parseLong) {
		
		Menu deleteme=menuDao.getOne(parseLong);
		menuDao.delete(deleteme);
		
	}

}
