package tech.weichuangxin.chatbot.api.domain.zsxq.model.res;

import tech.weichuangxin.chatbot.api.domain.zsxq.model.vo.Topics;

import java.util.List;

/**
 * @author 浩西，微信：wei_chuang_xin
 * @description 结果数据
 * @github https://github.com/zhaosongli
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class RespData {

    private List<Topics> topics;

    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }

}
