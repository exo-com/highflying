package com.highflying.project.common;

import javax.annotation.Resource;

import com.ibatis.sqlmap.client.SqlMapClient;

public abstract class HighflyJdbcDaoSupport {
	@Resource(name="sqlMapClient")
	  protected SqlMapClient sqlMapClient;
	  
	  protected SqlMapClient getSqlMapClient(){
		  return sqlMapClient;
	  }
}