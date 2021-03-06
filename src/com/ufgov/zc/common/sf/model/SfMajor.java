package com.ufgov.zc.common.sf.model;

import java.util.ArrayList;
import java.util.List;

import com.ufgov.zc.common.zc.model.ZcBaseBill;

public class SfMajor extends ZcBaseBill{

	/**
   * 
   */
  private static final long serialVersionUID = 4993199595925293038L;
  
  public static final String SF_VS_MAJOR="SF_VS_MAJOR";
  
  public static final String COL_MAJOR_CODE="SF_MAJOR_CODE";
  
  public static final String COL_MAJOR_NAME="SF_MAJOR_NAME";
  
  public static final String COL_MAJOR_PARENT_CODE ="SF_PARENT_CODE";
  
  public final static String TAB_ID_SF_MAJOR = "SF_MAJOR_TAB";
  
  private List jdPersonLst=new ArrayList();
  
  /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MAJOR.MAJOR_CODE
	 * @mbggenerated  Thu Jan 01 01:16:29 CST 2015
	 */
	private String majorCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MAJOR.MAJOR_NAME
	 * @mbggenerated  Thu Jan 01 01:16:29 CST 2015
	 */
	private String majorName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SF_MAJOR.PARENT_CODE
	 * @mbggenerated  Thu Jan 01 01:16:29 CST 2015
	 */
	private String parentCode;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MAJOR.MAJOR_CODE
	 * @return  the value of SF_MAJOR.MAJOR_CODE
	 * @mbggenerated  Thu Jan 01 01:16:29 CST 2015
	 */
	public String getMajorCode() {
		return majorCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MAJOR.MAJOR_CODE
	 * @param majorCode  the value for SF_MAJOR.MAJOR_CODE
	 * @mbggenerated  Thu Jan 01 01:16:29 CST 2015
	 */
	public void setMajorCode(String majorCode) {
		this.majorCode = majorCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MAJOR.MAJOR_NAME
	 * @return  the value of SF_MAJOR.MAJOR_NAME
	 * @mbggenerated  Thu Jan 01 01:16:29 CST 2015
	 */
	public String getMajorName() {
		return majorName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MAJOR.MAJOR_NAME
	 * @param majorName  the value for SF_MAJOR.MAJOR_NAME
	 * @mbggenerated  Thu Jan 01 01:16:29 CST 2015
	 */
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SF_MAJOR.PARENT_CODE
	 * @return  the value of SF_MAJOR.PARENT_CODE
	 * @mbggenerated  Thu Jan 01 01:16:29 CST 2015
	 */
	public String getParentCode() {
		return parentCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SF_MAJOR.PARENT_CODE
	 * @param parentCode  the value for SF_MAJOR.PARENT_CODE
	 * @mbggenerated  Thu Jan 01 01:16:29 CST 2015
	 */
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

  public List getJdPersonLst() {
    return jdPersonLst;
  }

  public void setJdPersonLst(List jdPersonLst) {
    this.jdPersonLst = jdPersonLst;
  }
}