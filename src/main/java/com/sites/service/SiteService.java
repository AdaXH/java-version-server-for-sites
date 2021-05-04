package com.sites.service;

import com.sites.entity.Site;
import com.sites.mapper.SiteMapper;
import com.sites.service.impl.SiteImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SiteService implements SiteImpl {

    @Autowired
    private SiteMapper lifeSiteMapper;
    @Override
    public Site querySiteInfo(String siteId) {
        Site lifeSite = lifeSiteMapper.querySiteInfo(siteId);
        return lifeSite;
    }
}
