package com.ruoyi.spj.service;

import java.util.List;
import com.ruoyi.spj.domain.SPJ;

/**
 * 供应情况表SPJService接口
 * 
 * @author keyuan
 * @date 2023-04-16
 */
public interface ISPJService 
{
    /**
     * 查询供应情况表SPJ
     * 
     * @param sno 供应情况表SPJ主键
     * @return 供应情况表SPJ
     */
    public SPJ selectSPJBySno(String sno);

    /**
     * 查询供应情况表SPJ列表
     * 
     * @param sPJ 供应情况表SPJ
     * @return 供应情况表SPJ集合
     */
    public List<SPJ> selectSPJList(SPJ sPJ);

    /**
     * 新增供应情况表SPJ
     * 
     * @param sPJ 供应情况表SPJ
     * @return 结果
     */
    public int insertSPJ(SPJ sPJ);

    /**
     * 修改供应情况表SPJ
     * 
     * @param sPJ 供应情况表SPJ
     * @return 结果
     */
    public int updateSPJ(SPJ sPJ);

    /**
     * 批量删除供应情况表SPJ
     * 
     * @param snos 需要删除的供应情况表SPJ主键集合
     * @return 结果
     */
    public int deleteSPJBySnos(String[] snos);

    /**
     * 删除供应情况表SPJ信息
     * 
     * @param sno 供应情况表SPJ主键
     * @return 结果
     */
    public int deleteSPJBySno(String sno);
}
