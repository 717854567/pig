package com.yjkj.zzx.pig.bean;

import java.util.Date;

/**
 * 配种表t_mating
 * @author wangshoujian
 * @createDate 2017年11月27日
 *
 */
public class MatingBean {

    private String id;
	
	private String groupId;//所属集团
	
	private String farmId;//所属猪场
	
	private String pigsArchivesId;//猪只ID
	
	private String HouseId;//配种栋舍
		
	private String FieldId;// 配种栏位
	
	private String operatorId;//操作人
	
	private String createUser;//创建人

	private String createTime;//创建时间
	
	private String updateUser;//修改人
	
	private String updateTime;//修改时间
	
	private String matingDate;//配种时间
	
	private String remark;// 配种原因
	
	private String delFlag;// 删除标识
	
	
	private String parentPig1;//配种公猪1
	
	private String parentPig2;//配种公猪2
	
	private String parentPig3;//配种公猪3
	
	private String parentPig1Number;//配种公猪1
	
	private String parentPig2Number;//配种公猪2
	
	private String parentPig3Number;//配种公猪3
	
	private String operatorName;//操作人名
	
	private String pigNumbers;//猪只编号 
	
	private String groupName;//集团名称
	
	private String farmName;//猪场名称
	
	private String HouseName;//栋舍名称
	
	private String FieldName;// 栏位编码
	
	
	private int parity;//胎次
	
	private String isFarmPig;// 是否本场公猪标识
	
	private String nofarmParentPig1;//非本场配种公猪1
	
	private String nofarmParentPig2;//非本场配种公猪2
	
	private String nofarmParentPig3;//非本场配种公猪3


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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




	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPigsArchivesId() {
		return pigsArchivesId;
	}

	public void setPigsArchivesId(String pigsArchivesId) {
		this.pigsArchivesId = pigsArchivesId;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getPigNumbers() {
		return pigNumbers;
	}

	public void setPigNumbers(String pigNumbers) {
		this.pigNumbers = pigNumbers;
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

	public String getHouseId() {
		return HouseId;
	}

	public void setHouseId(String houseId) {
		HouseId = houseId;
	}

	public String getFieldId() {
		return FieldId;
	}

	public void setFieldId(String fieldId) {
		FieldId = fieldId;
	}

	public String getMatingDate() {
		return matingDate;
	}

	public void setMatingDate(String matingDate) {
		this.matingDate = matingDate;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public String getParentPig1() {
		return parentPig1;
	}

	public void setParentPig1(String parentPig1) {
		this.parentPig1 = parentPig1;
	}

	public String getParentPig2() {
		return parentPig2;
	}

	public void setParentPig2(String parentPig2) {
		this.parentPig2 = parentPig2;
	}

	public String getParentPig3() {
		return parentPig3;
	}

	public void setParentPig3(String parentPig3) {
		this.parentPig3 = parentPig3;
	}

	public String getHouseName() {
		return HouseName;
	}

	public void setHouseName(String houseName) {
		HouseName = houseName;
	}

	public String getFieldName() {
		return FieldName;
	}

	public void setFieldName(String fieldName) {
		FieldName = fieldName;
	}

	public String getParentPig1Number() {
		return parentPig1Number;
	}

	public void setParentPig1Number(String parentPig1Number) {
		this.parentPig1Number = parentPig1Number;
	}

	public String getParentPig2Number() {
		return parentPig2Number;
	}

	public void setParentPig2Number(String parentPig2Number) {
		this.parentPig2Number = parentPig2Number;
	}

	public String getParentPig3Number() {
		return parentPig3Number;
	}

	public void setParentPig3Number(String parentPig3Number) {
		this.parentPig3Number = parentPig3Number;
	}

	public int getParity() {
		return parity;
	}

	public void setParity(int parity) {
		this.parity = parity;
	}

	public String getIsFarmPig() {
		return isFarmPig;
	}

	public void setIsFarmPig(String isFarmPig) {
		this.isFarmPig = isFarmPig;
	}

	

	public String getNofarmParentPig1() {
		return nofarmParentPig1;
	}

	public void setNofarmParentPig1(String nofarmParentPig1) {
		this.nofarmParentPig1 = nofarmParentPig1;
	}

	public String getNofarmParentPig2() {
		return nofarmParentPig2;
	}

	public void setNofarmParentPig2(String nofarmParentPig2) {
		this.nofarmParentPig2 = nofarmParentPig2;
	}

	public String getNofarmParentPig3() {
		return nofarmParentPig3;
	}

	public void setNofarmParentPig3(String nofarmParentPig3) {
		this.nofarmParentPig3 = nofarmParentPig3;
	}

	


	

	
	

}
