package com.cg.smms.repository;

import com.cg.smms.entities.MallAdmin;

public interface IMallAdminRepository {
	public MallAdmin addMallAdmin(MallAdmin mallAdmin);
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin);
	public MallAdmin searchMallAdmin(long ID);
	public MallAdmin deleteMallAdmin(long ID);
	
}
