package com.cg.smms.service;

import com.cg.smms.entities.Employee;
import com.cg.smms.entities.Item;
import com.cg.smms.entities.Shop;

public interface IShopService {
public Shop addShop(Shop shop);
public Shop updateShop(Shop shop);
public Shop searchShopById(long ID);
public boolean deleteShop(long ID);
public boolean addEmployee(Employee employee);
public boolean updateEmployee(Employee employee);
public Item addItem(Item item);
}
 