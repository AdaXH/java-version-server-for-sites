package com.sites.controller.site;

import com.sites.common.BizException;
import com.sites.common.CommonResponse;
import com.sites.entity.Site;
import com.sites.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SiteController {
    @Autowired
    private SiteService siteService;

    @GetMapping("/site-info/{siteId}")
    @ResponseBody
    public CommonResponse querySiteInfo(@PathVariable String siteId) {
        if (siteId == null) {
            throw new BizException("站点id不能为空", "EMPTY_SITE_ID");
        }
        Site site = siteService.querySiteInfo(siteId);
        return CommonResponse.success(site);
    }
}
