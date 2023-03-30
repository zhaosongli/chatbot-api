package tech.weichuangxin.chatbot.api.domain.zsxq.model.req;

/**
 * @author 浩西，微信：wei_chuang_xin
 * @description 请求问答接口信息
 * @github https://github.com/zhaosongli
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class AnswerReq {

    private ReqData req_data;

    public AnswerReq(ReqData req_data) {
        this.req_data = req_data;
    }

    public ReqData getReq_data() {
        return req_data;
    }

    public void setReq_data(ReqData req_data) {
        this.req_data = req_data;
    }

}
