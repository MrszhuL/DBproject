package com.ruoyi.spj.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.spj.mapper.JMapper;
import com.ruoyi.spj.domain.J;
import com.ruoyi.spj.service.IJService;

/**
 * 工程项目表JService业务层处理
 * 
 * @author keyuan
 * @date 2023-04-16
 */
@Service
public class JServiceImpl implements IJService 
{
    @Autowired
    private JMapper jMapper;

    /**
     * 查询工程项目表J
     * 
     * @param jno 工程项目表J主键
     * @return 工程项目表J
     */
    @Override
    public J selectJByJno(String jno)
    {
        return jMapper.selectJByJno(jno);
    }

    /**
     * 查询工程项目表J列表
     * 
     * @param j 工程项目表J
     * @return 工程项目表J
     */
    @Override
    public List<J> selectJList(J j)
    {
        return jMapper.selectJList(j);
    }

    /**
     * 新增工程项目表J
     * 
     * @param j 工程项目表J
     * @return 结果
     */
    @Override
    public int insertJ(J j)
    {
        j.setCreateTime(DateUtils.getNowDate());
        return jMapper.insertJ(j);
    }

    /**
     * 修改工程项目表J
     * 
     * @param j 工程项目表J
     * @return 结果
     */
    @Override
    public int updateJ(J j)
    {
        j.setUpdateTime(DateUtils.getNowDate());
        return jMapper.updateJ(j);
    }

    /**
     * 批量删除工程项目表J
     * 
     * @param jnos 需要删除的工程项目表J主键
     * @return 结果
     */
    @Override
    public int deleteJByJnos(String[] jnos)
    {
        return jMapper.deleteJByJnos(jnos);
    }

    /**
     * 删除工程项目表J信息
     * 
     * @param jno 工程项目表J主键
     * @return 结果
     */
    @Override
    public int deleteJByJno(String jno)
    {
        return jMapper.deleteJByJno(jno);
    }
}
