package com.ruoyi.spj.mapper;

import java.util.List;
import com.ruoyi.spj.domain.J;

/**
 * 工程项目表JMapper接口
 * 
 * @author keyuan
 * @date 2023-04-16
 */
public interface JMapper 
{
    /**
     * 查询工程项目表J
     * 
     * @param jno 工程项目表J主键
     * @return 工程项目表J
     */
    public J selectJByJno(String jno);

    /**
     * 查询工程项目表J列表
     * 
     * @param j 工程项目表J
     * @return 工程项目表J集合
     */
    public List<J> selectJList(J j);

    /**
     * 新增工程项目表J
     * 
     * @param j 工程项目表J
     * @return 结果
     */
    public int insertJ(J j);

    /**
     * 修改工程项目表J
     * 
     * @param j 工程项目表J
     * @return 结果
     */
    public int updateJ(J j);

    /**
     * 删除工程项目表J
     * 
     * @param jno 工程项目表J主键
     * @return 结果
     */
    public int deleteJByJno(String jno);

    /**
     * 批量删除工程项目表J
     * 
     * @param jnos 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteJByJnos(String[] jnos);
}
