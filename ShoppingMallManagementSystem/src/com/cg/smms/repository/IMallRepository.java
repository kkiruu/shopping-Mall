package com.cg.smms.repository;

import com.cg.smms.entities.Mall;

public interface IMallRepository {
public Mall addMall(Mall mall);
public Mall updateMall(Mall mall);
public Mall searchMall(long ID);
}
