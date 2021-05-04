package com.sites.controller.site;

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
    public Site querySiteInfo(@PathVariable String siteId) {
        Site stringObjectHashMap = siteService.querySiteInfo(siteId);
        System.out.println(stringObjectHashMap);
        return stringObjectHashMap;
    }
}
