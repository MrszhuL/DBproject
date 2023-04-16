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
import com.ruoyi.spj.domain.SPJ;
import com.ruoyi.spj.service.ISPJService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 供应情况表SPJController
 * 
 * @author keyuan
 * @date 2023-04-16
 */
@RestController
@RequestMapping("/spj/SPJ")
public class SPJController extends BaseController
{
    @Autowired
    private ISPJService sPJService;

    /**
     * 查询供应情况表SPJ列表
     */
    @PreAuthorize("@ss.hasPermi('spj:SPJ:list')")
    @GetMapping("/list")
    public TableDataInfo list(SPJ sPJ)
    {
        startPage();
        List<SPJ> list = sPJService.selectSPJList(sPJ);
        return getDataTable(list);
    }

    /**
     * 导出供应情况表SPJ列表
     */
    @PreAuthorize("@ss.hasPermi('spj:SPJ:export')")
    @Log(title = "供应情况表SPJ", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SPJ sPJ)
    {
        List<SPJ> list = sPJService.selectSPJList(sPJ);
        ExcelUtil<SPJ> util = new ExcelUtil<SPJ>(SPJ.class);
        util.exportExcel(response, list, "供应情况表SPJ数据");
    }

    /**
     * 获取供应情况表SPJ详细信息
     */
    @PreAuthorize("@ss.hasPermi('spj:SPJ:query')")
    @GetMapping(value = "/{sno}")
    public AjaxResult getInfo(@PathVariable("sno") String sno)
    {
        return success(sPJService.selectSPJBySno(sno));
    }

    /**
     * 新增供应情况表SPJ
     */
    @PreAuthorize("@ss.hasPermi('spj:SPJ:add')")
    @Log(title = "供应情况表SPJ", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SPJ sPJ)
    {
        return toAjax(sPJService.insertSPJ(sPJ));
    }

    /**
     * 修改供应情况表SPJ
     */
    @PreAuthorize("@ss.hasPermi('spj:SPJ:edit')")
    @Log(title = "供应情况表SPJ", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SPJ sPJ)
    {
        return toAjax(sPJService.updateSPJ(sPJ));
    }

    /**
     * 删除供应情况表SPJ
     */
    @PreAuthorize("@ss.hasPermi('spj:SPJ:remove')")
    @Log(title = "供应情况表SPJ", businessType = BusinessType.DELETE)
	@DeleteMapping("/{snos}")
    public AjaxResult remove(@PathVariable String[] snos)
    {
        return toAjax(sPJService.deleteSPJBySnos(snos));
    }
}
