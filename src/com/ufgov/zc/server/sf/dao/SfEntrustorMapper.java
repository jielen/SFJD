package com.ufgov.zc.server.sf.dao;

import java.math.BigDecimal;
import java.util.List;

import com.ufgov.zc.common.sf.model.SfEntrustor;
import com.ufgov.zc.common.system.dto.ElementConditionDto;

public interface SfEntrustorMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SF_ENTRUSTOR
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	int deleteByPrimaryKey(BigDecimal entrustorId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SF_ENTRUSTOR
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	int insert(SfEntrustor record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SF_ENTRUSTOR
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	int insertSelective(SfEntrustor record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SF_ENTRUSTOR
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	SfEntrustor selectByPrimaryKey(BigDecimal entrustorId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SF_ENTRUSTOR
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	int updateByPrimaryKeySelective(SfEntrustor record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table SF_ENTRUSTOR
	 * @mbggenerated  Mon Jan 05 08:44:21 CST 2015
	 */
	int updateByPrimaryKey(SfEntrustor record);

  List getEntrustorLst(ElementConditionDto elementConditionDto);

  boolean isUsing(BigDecimal code);

  SfEntrustor selectByName(String name);
}