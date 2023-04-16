package com.ruoyi.spj.mapper;

import java.util.List;
import com.ruoyi.spj.domain.P;

/**
 * 零件表PMapper接口
 * 
 * @author keyuan
 * @date 2023-04-16
 */
public interface PMapper 
{
    /**
     * 查询零件表P
     * 
     * @param pno 零件表P主键
     * @return 零件表P
     */
    public P selectPByPno(String pno);

    /**
     * 查询零件表P列表
     * 
     * @param p 零件表P
     * @return 零件表P集合
     */
    public List<P> selectPList(P p);

    /**
     * 新增零件表P
     * 
     * @param p 零件表P
     * @return 结果
     */
    public int insertP(P p);

    /**
     * 修改零件表P
     * 
     * @param p 零件表P
     * @return 结果
     */
    public int updateP(P p);

    /**
     * 删除零件表P
     * 
     * @param pno 零件表P主键
     * @return 结果
     */
    public int deletePByPno(String pno);

    /**
     * 批量删除零件表P
     * 
     * @param pnos 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePByPnos(String[] pnos);
}
