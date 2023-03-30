package tech.weichuangxin.chatbot.api.domain.ai;

import java.io.IOException;

/**
 * @author 浩西，微信：wei_chuang_xin
 * @description ChatGPT open ai 接口：https://beta.openai.com/account/api-keys
 * @github https://github.com/zhaosongli
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface IOpenAI {

    String doChatGPT(String openAiKey, String question) throws IOException;

}
