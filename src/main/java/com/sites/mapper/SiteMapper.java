package com.sites.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sites.entity.Site;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteMapper extends BaseMapper<Site> {
    Site querySiteInfo(String siteId);
}
