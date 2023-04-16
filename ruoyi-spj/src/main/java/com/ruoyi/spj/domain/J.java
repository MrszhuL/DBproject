package com.ruoyi.spj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工程项目表J对象 J
 * 
 * @author keyuan
 * @date 2023-04-16
 */
public class J extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 工程项目代码 */
    @Excel(name = "工程项目代码")
    private String jno;

    /** 工程项目名 */
    @Excel(name = "工程项目名")
    private String jname;

    /** 工程项目所在城市 */
    @Excel(name = "工程项目所在城市")
    private String city;

    public void setJno(String jno) 
    {
        this.jno = jno;
    }

    public String getJno() 
    {
        return jno;
    }
    public void setJname(String jname) 
    {
        this.jname = jname;
    }

    public String getJname() 
    {
        return jname;
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
            .append("jno", getJno())
            .append("jname", getJname())
            .append("city", getCity())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
