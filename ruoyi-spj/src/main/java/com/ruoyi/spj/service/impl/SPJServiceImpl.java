package com.ruoyi.spj.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.spj.mapper.SPJMapper;
import com.ruoyi.spj.domain.SPJ;
import com.ruoyi.spj.service.ISPJService;

/**
 * 供应情况表SPJService业务层处理
 * 
 * @author keyuan
 * @date 2023-04-16
 */
@Service
public class SPJServiceImpl implements ISPJService 
{
    @Autowired
    private SPJMapper sPJMapper;

    /**
     * 查询供应情况表SPJ
     * 
     * @param sno 供应情况表SPJ主键
     * @return 供应情况表SPJ
     */
    @Override
    public SPJ selectSPJBySno(String sno)
    {
        return sPJMapper.selectSPJBySno(sno);
    }

    /**
     * 查询供应情况表SPJ列表
     * 
     * @param sPJ 供应情况表SPJ
     * @return 供应情况表SPJ
     */
    @Override
    public List<SPJ> selectSPJList(SPJ sPJ)
    {
        return sPJMapper.selectSPJList(sPJ);
    }

    /**
     * 新增供应情况表SPJ
     * 
     * @param sPJ 供应情况表SPJ
     * @return 结果
     */
    @Override
    public int insertSPJ(SPJ sPJ)
    {
        sPJ.setCreateTime(DateUtils.getNowDate());
        return sPJMapper.insertSPJ(sPJ);
    }

    /**
     * 修改供应情况表SPJ
     * 
     * @param sPJ 供应情况表SPJ
     * @return 结果
     */
    @Override
    public int updateSPJ(SPJ sPJ)
    {
        sPJ.setUpdateTime(DateUtils.getNowDate());
        return sPJMapper.updateSPJ(sPJ);
    }

    /**
     * 批量删除供应情况表SPJ
     * 
     * @param snos 需要删除的供应情况表SPJ主键
     * @return 结果
     */
    @Override
    public int deleteSPJBySnos(String[] snos)
    {
        return sPJMapper.deleteSPJBySnos(snos);
    }

    /**
     * 删除供应情况表SPJ信息
     * 
     * @param sno 供应情况表SPJ主键
     * @return 结果
     */
    @Override
    public int deleteSPJBySno(String sno)
    {
        return sPJMapper.deleteSPJBySno(sno);
    }
}
