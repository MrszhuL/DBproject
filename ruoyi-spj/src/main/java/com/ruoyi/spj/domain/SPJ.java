package com.ruoyi.spj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 供应情况表SPJ对象 SPJ
 * 
 * @author keyuan
 * @date 2023-04-16
 */
public class SPJ extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 供应商代码 */
    @Excel(name = "供应商代码")
    private String sno;

    /** 零件代码 */
    @Excel(name = "零件代码")
    private String pno;

    /** 工程项目代码 */
    @Excel(name = "工程项目代码")
    private String jno;

    /** 供应数量 */
    @Excel(name = "供应数量")
    private Long qty;

    public void setSno(String sno) 
    {
        this.sno = sno;
    }

    public String getSno() 
    {
        return sno;
    }
    public void setPno(String pno) 
    {
        this.pno = pno;
    }

    public String getPno() 
    {
        return pno;
    }
    public void setJno(String jno) 
    {
        this.jno = jno;
    }

    public String getJno() 
    {
        return jno;
    }
    public void setQty(Long qty) 
    {
        this.qty = qty;
    }

    public Long getQty() 
    {
        return qty;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sno", getSno())
            .append("pno", getPno())
            .append("jno", getJno())
            .append("qty", getQty())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
