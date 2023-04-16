package com.ruoyi.spj.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.spj.domain.P;
import com.ruoyi.spj.service.IPService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 零件表PController
 * 
 * @author keyuan
 * @date 2023-04-16
 */
@RestController
@RequestMapping("/spj/P")
public class PController extends BaseController
{
    @Autowired
    private IPService pService;

    /**
     * 查询零件表P列表
     */
    @PreAuthorize("@ss.hasPermi('spj:P:list')")
    @GetMapping("/list")
    public TableDataInfo list(P p)
    {
        startPage();
        List<P> list = pService.selectPList(p);
        return getDataTable(list);
    }

    /**
     * 导出零件表P列表
     */
    @PreAuthorize("@ss.hasPermi('spj:P:export')")
    @Log(title = "零件表P", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, P p)
    {
        List<P> list = pService.selectPList(p);
        ExcelUtil<P> util = new ExcelUtil<P>(P.class);
        util.exportExcel(response, list, "零件表P数据");
    }

    /**
     * 获取零件表P详细信息
     */
    @PreAuthorize("@ss.hasPermi('spj:P:query')")
    @GetMapping(value = "/{pno}")
    public AjaxResult getInfo(@PathVariable("pno") String pno)
    {
        return success(pService.selectPByPno(pno));
    }

    /**
     * 新增零件表P
     */
    @PreAuthorize("@ss.hasPermi('spj:P:add')")
    @Log(title = "零件表P", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody P p)
    {
        return toAjax(pService.insertP(p));
    }

    /**
     * 修改零件表P
     */
    @PreAuthorize("@ss.hasPermi('spj:P:edit')")
    @Log(title = "零件表P", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody P p)
    {
        return toAjax(pService.updateP(p));
    }

    /**
     * 删除零件表P
     */
    @PreAuthorize("@ss.hasPermi('spj:P:remove')")
    @Log(title = "零件表P", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pnos}")
    public AjaxResult remove(@PathVariable String[] pnos)
    {
        return toAjax(pService.deletePByPnos(pnos));
    }
}
