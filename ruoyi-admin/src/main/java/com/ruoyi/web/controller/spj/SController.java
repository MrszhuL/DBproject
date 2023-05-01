package com.ruoyi.web.controller.spj;

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
import com.ruoyi.spj.domain.S;
import com.ruoyi.spj.service.ISService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 供应商SController
 * 
 * @author keyuan
 * @date 2023-04-16
 */
@RestController
@RequestMapping("/spj/S")
public class SController extends BaseController
{
    @Autowired
    private ISService sService;

    /**
     * 查询供应商S列表
     */
    @PreAuthorize("@ss.hasPermi('spj:S:list')")
    @GetMapping("/list")
    public TableDataInfo list(S s)
    {
        startPage();
        List<S> list = sService.selectSList(s);
        return getDataTable(list);
    }

    /**
     * 导出供应商S列表
     */
    @PreAuthorize("@ss.hasPermi('spj:S:export')")
    @Log(title = "供应商S", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, S s)
    {
        List<S> list = sService.selectSList(s);
        ExcelUtil<S> util = new ExcelUtil<S>(S.class);
        util.exportExcel(response, list, "供应商S数据");
    }

    /**
     * 获取供应商S详细信息
     */
    @PreAuthorize("@ss.hasPermi('spj:S:query')")
    @GetMapping(value = "/{sno}")
    public AjaxResult getInfo(@PathVariable("sno") String sno)
    {
        return success(sService.selectSBySno(sno));
    }

    /**
     * 新增供应商S
     */
    @PreAuthorize("@ss.hasPermi('spj:S:add')")
    @Log(title = "供应商S", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody S s)
    {
        return toAjax(sService.insertS(s));
    }

    /**
     * 修改供应商S
     */
    @PreAuthorize("@ss.hasPermi('spj:S:edit')")
    @Log(title = "供应商S", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody S s)
    {
        return toAjax(sService.updateS(s));
    }

    /**
     * 删除供应商S
     */
    @PreAuthorize("@ss.hasPermi('spj:S:remove')")
    @Log(title = "供应商S", businessType = BusinessType.DELETE)
    @DeleteMapping("/{snos}")
    public AjaxResult remove(@PathVariable String[] snos)
    {
        return toAjax(sService.deleteSBySnos(snos));
    }
}
