package tech.weichuangxin.chatbot.api.domain.zsxq;

import tech.weichuangxin.chatbot.api.domain.zsxq.model.aggregates.UnAnsweredQuestionsAggregates;
import java.io.IOException;

/**
 * @author 浩西，微信：wei_chuang_xin
 * @description 知识星球 API 接口
 * @github https://github.com/zhaosongli
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface IZsxqApi {

    UnAnsweredQuestionsAggregates queryUnAnsweredQuestionsTopicId(String groupId, String cookie) throws IOException;

    boolean answer(String groupId, String cookie, String topicId, String text, boolean silenced) throws IOException;

}