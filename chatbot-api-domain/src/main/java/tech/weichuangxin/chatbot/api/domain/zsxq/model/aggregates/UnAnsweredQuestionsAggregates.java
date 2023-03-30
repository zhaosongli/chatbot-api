package tech.weichuangxin.chatbot.api.domain.zsxq.model.aggregates;

import tech.weichuangxin.chatbot.api.domain.zsxq.model.res.RespData;

/**
 * @author 浩西，微信：wei_chuang_xin
 * @description 未回答问题的聚合信息
 * @github https://github.com/zhaosongli
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class UnAnsweredQuestionsAggregates {

    private boolean succeeded;
    private RespData resp_data;

    public boolean isSucceeded() {
        return succeeded;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }

    public RespData getResp_data() {
        return resp_data;
    }

    public void setResp_data(RespData resp_data) {
        this.resp_data = resp_data;
    }

}
