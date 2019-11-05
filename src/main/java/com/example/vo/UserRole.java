package com.example.vo;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class UserRole implements Serializable {
    @ApiModelProperty(value = "用户代码")
    private String userCode;

    @ApiModelProperty(value = "用户级别代码")
    private String leverCode;

    @ApiModelProperty(value = "用户岗位名称")
    private String leverName;

    @ApiModelProperty(value = "父级岗位代码")
    private String superLeverCode;

    private static final long serialVersionUID = 1L;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getLeverCode() {
        return leverCode;
    }

    public void setLeverCode(String leverCode) {
        this.leverCode = leverCode == null ? null : leverCode.trim();
    }

    public String getLeverName() {
        return leverName;
    }

    public void setLeverName(String leverName) {
        this.leverName = leverName == null ? null : leverName.trim();
    }

    public String getSuperLeverCode() {
        return superLeverCode;
    }

    public void setSuperLeverCode(String superLeverCode) {
        this.superLeverCode = superLeverCode == null ? null : superLeverCode.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userCode=").append(userCode);
        sb.append(", leverCode=").append(leverCode);
        sb.append(", leverName=").append(leverName);
        sb.append(", superLeverCode=").append(superLeverCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}