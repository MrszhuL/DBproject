package com.ruoyi.spj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 零件表P对象 P
 * 
 * @author keyuan
 * @date 2023-04-16
 */
public class P extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 零件代码 */
    @Excel(name = "零件代码")
    private String pno;

    /** 零件名 */
    @Excel(name = "零件名")
    private String pname;

    /** 颜色 */
    @Excel(name = "颜色")
    private String color;

    /** 重量 */
    @Excel(name = "重量")
    private Long weight;

    public void setPno(String pno) 
    {
        this.pno = pno;
    }

    public String getPno() 
    {
        return pno;
    }
    public void setPname(String pname) 
    {
        this.pname = pname;
    }

    public String getPname() 
    {
        return pname;
    }
    public void setColor(String color) 
    {
        this.color = color;
    }

    public String getColor() 
    {
        return color;
    }
    public void setWeight(Long weight) 
    {
        this.weight = weight;
    }

    public Long getWeight() 
    {
        return weight;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pno", getPno())
            .append("pname", getPname())
            .append("color", getColor())
            .append("weight", getWeight())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
