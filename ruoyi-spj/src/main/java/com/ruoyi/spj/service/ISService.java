package com.ruoyi.spj.service;

import java.util.List;
import com.ruoyi.spj.domain.S;

/**
 * 供应商SService接口
 * 
 * @author keyuan
 * @date 2023-04-16
 */
public interface ISService 
{
    /**
     * 查询供应商S
     * 
     * @param sno 供应商S主键
     * @return 供应商S
     */
    public S selectSBySno(String sno);

    /**
     * 查询供应商S列表
     * 
     * @param s 供应商S
     * @return 供应商S集合
     */
    public List<S> selectSList(S s);

    /**
     * 新增供应商S
     * 
     * @param s 供应商S
     * @return 结果
     */
    public int insertS(S s);

    /**
     * 修改供应商S
     * 
     * @param s 供应商S
     * @return 结果
     */
    public int updateS(S s);

    /**
     * 批量删除供应商S
     * 
     * @param snos 需要删除的供应商S主键集合
     * @return 结果
     */
    public int deleteSBySnos(String[] snos);

    /**
     * 删除供应商S信息
     * 
     * @param sno 供应商S主键
     * @return 结果
     */
    public int deleteSBySno(String sno);
}
