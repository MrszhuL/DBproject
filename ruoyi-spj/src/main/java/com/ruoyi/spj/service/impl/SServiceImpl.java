package com.ruoyi.spj.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.spj.mapper.SMapper;
import com.ruoyi.spj.domain.S;
import com.ruoyi.spj.service.ISService;

import static com.ruoyi.common.utils.uuid.Seq.getId;

/**
 * 供应商SService业务层处理
 * 
 * @author keyuan
 * @date 2023-04-16
 */
@Service
public class SServiceImpl implements ISService 
{
    @Autowired
    private SMapper sMapper;

    /**
     * 查询供应商S
     * 
     * @param sno 供应商S主键
     * @return 供应商S
     */
    @Override
    public S selectSBySno(String sno)
    {
        return sMapper.selectSBySno(sno);
    }

    /**
     * 查询供应商S列表
     * 
     * @param s 供应商S
     * @return 供应商S
     */
    @Override
    public List<S> selectSList(S s)
    {
        return sMapper.selectSList(s);
    }

    /**
     * 新增供应商S
     * 
     * @param s 供应商S
     * @return 结果
     */
    @Override
    public int insertS(S s)
    {
        s.setCreateTime(DateUtils.getNowDate());
        return sMapper.insertS(s);
    }

    /**
     * 修改供应商S
     * 
     * @param s 供应商S
     * @return 结果
     */
    @Override
    public int updateS(S s)
    {
        s.setUpdateTime(DateUtils.getNowDate());
        return sMapper.updateS(s);
    }

    /**
     * 批量删除供应商S
     * 
     * @param snos 需要删除的供应商S主键
     * @return 结果
     */
    @Override
    public int deleteSBySnos(String[] snos)
    {
        return sMapper.deleteSBySnos(snos);
    }

    /**
     * 删除供应商S信息
     * 
     * @param sno 供应商S主键
     * @return 结果
     */
    @Override
    public int deleteSBySno(String sno)
    {
        return sMapper.deleteSBySno(sno);
    }
}
