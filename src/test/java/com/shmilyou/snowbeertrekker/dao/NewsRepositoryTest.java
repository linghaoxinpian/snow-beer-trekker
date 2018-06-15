package com.shmilyou.snowbeertrekker.dao;

import com.shmilyou.snowbeertrekker.entity.News;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml", "classpath:spring-mvc.xml"})
public class NewsRepositoryTest {
    private static Logger logger = LoggerFactory.getLogger(NewsRepositoryTest.class);
    @Autowired
    NewsRepository newsRepository;

    @Test
    public void insertOne_test() {
        News news = new News("雪花啤酒勇闯天涯 冲破雪线活动全国启动 2012-07-15", "2012年7月，全国持续时间最长、规模最大的原创品牌活动“雪花勇闯天涯——冲破雪线”正式启动，并在全国火热招募。" +
                "高原、雪山、荒野，携手勇闯队伍的极限任务，已成为雪花啤酒一年一度的户外饕餮盛宴。自2005年起，雪花勇闯天涯活动共计行走10余万公里，足迹遍及中国人迹罕至、极具挑战的天涯。此次目标直指世界极高峰的雪线之极，也是勇闯活动首次从地理地貌特征解密雪域高寒的震撼体验。" +
                "所谓雪线，就是永久性积雪的下限。中国是雪线极为丰富的冰雪国度，雪线高度自北向南逐渐递增，至青藏高原海拔最高可达6000多米。雪线之上，是严苛恶劣的生命禁区，是勇闯精神的艰苦磨砺，更是咫尺天涯的人生巅峰。" +
                "成功“冲破雪线”，意味着对体能、技巧和意志力的全方位考验。为甄选各路勇士，本届活动招募将在全国20多个省份、60多个城市全面落地，登陆雪花啤酒官方网站(www.snowbeer.com.cn)和官方微博(@雪花啤酒勇闯天涯)，即可了解活动详情。荒岛求生、攀岩速降、高空断桥、负重徒步……通过层层严酷选拔，最终将在全国招募数十位勇士加入雪花勇闯队伍，于9月中下旬共同奔赴雪线。" +
                "据活动主办方华润雪花啤酒透露，此次冲破雪线的勇闯队伍，将由专业户外领队、地理学家、专业摄制组、高原医生及招募队员共同组成。活动期间，在保障活动安全性、专业性的同时，还将对地理地貌、环境保护、户外技巧等知识进行更深入的科学普及，实践智慧与勇气的双重历练，传承雪花啤酒“进取、挑战、创新”的品牌理念。");
        newsRepository.insertOne(news);
        Assert.notNull(news.getId());
    }
}
