package com.yjkj.zzx.pig.bean;

import java.io.Serializable;

public class HogBatchBean implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String batchId;//商品猪批次ID
	

	private String groupId;//集团/公司ID
	
	private String farmId;//猪场ID
	
	private String groupName;//集团名称
	
	private String farmName;//猪场名称
	
	private String bornDate ;//出生日期
	
	private String batchStatus ;//批次状态
	
	private String batchCode ;//批次编号
	
	private String productionStatusId;//生产状态ID(小猪、仔猪、大猪，来自字典表)
	
	private String productionStatusName;//生产状态名称
	
	private String pigVarietyId;//品种ID
	
	private String strain;//品系
	
	private String pigVarietyName;//品种名称
	
	private String strainName;//品系名称
	
	private String createtime;//批次创建时间
	
	private String updateTime;//批次修改时间
	
	private String forecastEndTime;//批次预计结束时间
	
	private String endTime;//批次结束时间
	
	private String remark;//备注
	
	private String createUser;//创建人
	
	private String createUserName;//创建人
	
	private String updateUser;//修改人
	
	private String updateUserName;//修改人
	
	private String delFlag;//是否删除
	
	


	
	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getFarmId() {
		return farmId;
	}

	public void setFarmId(String farmId) {
		this.farmId = farmId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getFarmName() {
		return farmName;
	}

	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}

	public String getBornDate() {
		return bornDate;
	}

	public void setBornDate(String bornDate) {
		this.bornDate = bornDate;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getProductionStatusId() {
		return productionStatusId;
	}

	public void setProductionStatusId(String productionStatusId) {
		this.productionStatusId = productionStatusId;
	}

	public String getProductionStatusName() {
		return productionStatusName;
	}

	public void setProductionStatusName(String productionStatusName) {
		this.productionStatusName = productionStatusName;
	}

	public String getPigVarietyId() {
		return pigVarietyId;
	}

	public void setPigVarietyId(String pigVarietyId) {
		this.pigVarietyId = pigVarietyId;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public String getPigVarietyName() {
		return pigVarietyName;
	}

	public void setPigVarietyName(String pigVarietyName) {
		this.pigVarietyName = pigVarietyName;
	}

	public String getStrainName() {
		return strainName;
	}

	public void setStrainName(String strainName) {
		this.strainName = strainName;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getForecastEndTime() {
		return forecastEndTime;
	}

	public void setForecastEndTime(String forecastEndTime) {
		this.forecastEndTime = forecastEndTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getUpdateUserName() {
		return updateUserName;
	}

	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getBatchStatus() {
		return batchStatus;
	}

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

	


	
}
