package com.ruoyi.spj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 供应商S对象 S
 * 
 * @author keyuan
 * @date 2023-04-16
 */
public class S extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 供应商代码 */
    @Excel(name = "供应商代码")
    private String sno;

    /** 供应商姓名 */
    @Excel(name = "供应商姓名")
    private String sname;

    /** 供应商状态 */
    @Excel(name = "供应商状态")
    private String status;

    /** 供应商所在城市 */
    @Excel(name = "供应商所在城市")
    private String city;

    public void setSno(String sno) 
    {
        this.sno = sno;
    }

    public String getSno() 
    {
        return sno;
    }
    public void setSname(String sname) 
    {
        this.sname = sname;
    }

    public String getSname() 
    {
        return sname;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sno", getSno())
            .append("sname", getSname())
            .append("status", getStatus())
            .append("city", getCity())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
