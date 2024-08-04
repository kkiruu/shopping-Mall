package com.cg.smms.repository;

import com.cg.smms.entities.Shop;

public interface IShopRepository {
	public Shop addShop(Shop shop);
	public Shop updateShop(Shop shop);
	public Shop searchShopById(long ID);
	public boolean deleteShop(long ID);
}
