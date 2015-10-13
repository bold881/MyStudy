/**    
 * PrimaryAcctVo.java Create on 2014年3月28日.
 * Copyright (c) by YeePay. All rights reserved.  
 */
package com.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Description: 主账户VO对象
 * @author Caining
 * @Createdate 2014年3月28日.
 **/

public class PrimaryAcctVo implements Serializable {

	private static final long serialVersionUID = 2963265008289948517L;
	private String primaryAcctNo;// 主账户编号
	private String primaryAcctName;// 主账户名称
	private String primaryAcctType;// 主账户类型
	private String custNo;// 客户编号
	private String merchantNo;// 主账户类型为商户会员账户时，对应商户的客户号
	private Integer freezeFlag;// 冻结标识（1是，0否）
	private String pnoArray; // 产品编号序列(用,分隔)
	private String remark;// 描述信息
	private Integer status;// 状态标识(1有效，0失效)
	private String creater;// 操作创建人
	private Date createTime;// 创建时间
	private String updater;// 更新操作人
	private Date updateTime;// 跟新时间
	
	/**
	 * 是否参与跨账户冻结
	 */
	private Integer crossAcctFreeze;

	public String getPrimaryAcctNo() {
		return primaryAcctNo;
	}

	public void setPrimaryAcctNo(String primaryAcctNo) {
		this.primaryAcctNo = primaryAcctNo;
	}

	public String getPrimaryAcctName() {
		return primaryAcctName;
	}

	public void setPrimaryAcctName(String primaryAcctName) {
		this.primaryAcctName = primaryAcctName;
	}

	public String getPrimaryAcctType() {
		return primaryAcctType;
	}

	public void setPrimaryAcctType(String primaryAcctType) {
		this.primaryAcctType = primaryAcctType;
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public Integer getFreezeFlag() {
		return freezeFlag;
	}

	public void setFreezeFlag(Integer freezeFlag) {
		this.freezeFlag = freezeFlag;
	}

	public String getPnoArray() {
		return pnoArray;
	}

	public void setPnoArray(String pnoArray) {
		this.pnoArray = pnoArray;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public Integer getCrossAcctFreeze() {
		return crossAcctFreeze;
	}

	public void setCrossAcctFreeze(Integer crossAcctFreeze) {
		this.crossAcctFreeze = crossAcctFreeze;
	}
}
