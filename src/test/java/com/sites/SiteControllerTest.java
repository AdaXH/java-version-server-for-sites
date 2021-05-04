package com.sites;

import com.sites.entity.Site;
import com.sites.entity.model.site.MessageVO;
import com.sites.entity.model.site.MessageVOList;
import com.sites.entity.model.site.SiteStatusEnum;
import com.sites.mapper.MessageVoMapper;
import com.sites.mapper.MessageVoListMapper;
import com.sites.mapper.SiteMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class SiteControllerTest {

    @Autowired
    private SiteMapper siteMapper;
    @Autowired
    private MessageVoListMapper messageVoListMapper;
    @Autowired
    private MessageVoMapper messageVoMapper;

    @Test
    public void testInsert() {
        Site site = new Site();
//        Message message = new Message();
//        message.setMessageContent("test content");
        System.out.println("lifeSite"+site);
        site.setSiteIcon("https://111.img");
        site.setSiteName("Ada-site");
        site.setSiteVerify(SiteStatusEnum.INIT);
        site.setMasterId("1388780233398550529");
        site.setMessageVoListId("message_iiid");
        int insert = siteMapper.insert(site);
        System.out.println("insert" + insert);
    }

    @Test
    public void testQuery() {
//        LifeSite lifeSite = lifeSiteMapper.selectById("1389086634840305665");
        System.out.println(siteMapper.selectById("1389086634840305665"));
//        System.out.println(lifeSite);
    }

    @Test
    public void testUpdate() {
        // userId: 1389439709790777345
        // siteId: 1389457218103312385
        Site site = siteMapper.selectById("1389457218103312385");
        site.setMessageVoListId("1389464554444328962");
        site.setSiteVerify(SiteStatusEnum.VERIFIED);
        site.setSiteName("not-verify");
        int i = siteMapper.updateById(site);
        System.out.println(i);
    }

    @Test void queryInfo() {
        System.out.println(siteMapper.querySiteInfo("1389457218103312385"));
//        System.out.println(lifeSiteInfoMapper.querySiteInfoWithUser("1389086634840305665"));
    }

    @Test void messageTestInsert() {
        MessageVOList messageVOList = new MessageVOList();
        MessageVO messageVO = new MessageVO();
        messageVO.setFromUserId("1389457218103312385");
        messageVO.setToUserId("1389457218103312385");
        messageVoMapper.insert(messageVO);
        ArrayList<MessageVO> messageVOS = new ArrayList<>();
        messageVOS.add(messageVO);
//        messages.setMessageVoId();
        messageVOList.setMessages(messageVOS);
        messageVoListMapper.insert(messageVOList);
    }

    @Test void updMsgVoList() {
        MessageVOList messageVOList = messageVoListMapper.selectById("1389464554444328962");
        messageVOList.setSiteId("1389457218103312385");
        messageVoListMapper.updateById(messageVOList);
    }
    @Test void updMsgVO() {
        // listId: 1389464554444328962
        MessageVO messageVO = messageVoMapper.selectById("1389462632706502658");
        messageVO.setMessageVoListId("1389464554444328962");
        messageVoMapper.updateById(messageVO);
    }
}
