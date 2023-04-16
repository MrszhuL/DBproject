package com.ruoyi.spj.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.spj.mapper.PMapper;
import com.ruoyi.spj.domain.P;
import com.ruoyi.spj.service.IPService;

/**
 * 零件表PService业务层处理
 * 
 * @author keyuan
 * @date 2023-04-16
 */
@Service
public class PServiceImpl implements IPService 
{
    @Autowired
    private PMapper pMapper;

    /**
     * 查询零件表P
     * 
     * @param pno 零件表P主键
     * @return 零件表P
     */
    @Override
    public P selectPByPno(String pno)
    {
        return pMapper.selectPByPno(pno);
    }

    /**
     * 查询零件表P列表
     * 
     * @param p 零件表P
     * @return 零件表P
     */
    @Override
    public List<P> selectPList(P p)
    {
        return pMapper.selectPList(p);
    }

    /**
     * 新增零件表P
     * 
     * @param p 零件表P
     * @return 结果
     */
    @Override
    public int insertP(P p)
    {
        p.setCreateTime(DateUtils.getNowDate());
        return pMapper.insertP(p);
    }

    /**
     * 修改零件表P
     * 
     * @param p 零件表P
     * @return 结果
     */
    @Override
    public int updateP(P p)
    {
        p.setUpdateTime(DateUtils.getNowDate());
        return pMapper.updateP(p);
    }

    /**
     * 批量删除零件表P
     * 
     * @param pnos 需要删除的零件表P主键
     * @return 结果
     */
    @Override
    public int deletePByPnos(String[] pnos)
    {
        return pMapper.deletePByPnos(pnos);
    }

    /**
     * 删除零件表P信息
     * 
     * @param pno 零件表P主键
     * @return 结果
     */
    @Override
    public int deletePByPno(String pno)
    {
        return pMapper.deletePByPno(pno);
    }
}
