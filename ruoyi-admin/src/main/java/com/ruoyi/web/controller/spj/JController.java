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
import com.ruoyi.spj.domain.J;
import com.ruoyi.spj.service.IJService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工程项目表JController
 * 
 * @author keyuan
 * @date 2023-04-16
 */
@RestController
@RequestMapping("/spj/J")
public class JController extends BaseController
{
    @Autowired
    private IJService jService;

    /**
     * 查询工程项目表J列表
     */
    @PreAuthorize("@ss.hasPermi('spj:J:list')")
    @GetMapping("/list")
    public TableDataInfo list(J j)
    {
        startPage();
        List<J> list = jService.selectJList(j);
        return getDataTable(list);
    }

    /**
     * 导出工程项目表J列表
     */
    @PreAuthorize("@ss.hasPermi('spj:J:export')")
    @Log(title = "工程项目表J", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, J j)
    {
        List<J> list = jService.selectJList(j);
        ExcelUtil<J> util = new ExcelUtil<J>(J.class);
        util.exportExcel(response, list, "工程项目表J数据");
    }

    /**
     * 获取工程项目表J详细信息
     */
    @PreAuthorize("@ss.hasPermi('spj:J:query')")
    @GetMapping(value = "/{jno}")
    public AjaxResult getInfo(@PathVariable("jno") String jno)
    {
        return success(jService.selectJByJno(jno));
    }

    /**
     * 新增工程项目表J
     */
    @PreAuthorize("@ss.hasPermi('spj:J:add')")
    @Log(title = "工程项目表J", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody J j)
    {
        return toAjax(jService.insertJ(j));
    }

    /**
     * 修改工程项目表J
     */
    @PreAuthorize("@ss.hasPermi('spj:J:edit')")
    @Log(title = "工程项目表J", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody J j)
    {
        return toAjax(jService.updateJ(j));
    }

    /**
     * 删除工程项目表J
     */
    @PreAuthorize("@ss.hasPermi('spj:J:remove')")
    @Log(title = "工程项目表J", businessType = BusinessType.DELETE)
	@DeleteMapping("/{jnos}")
    public AjaxResult remove(@PathVariable String[] jnos)
    {
        return toAjax(jService.deleteJByJnos(jnos));
    }
}
