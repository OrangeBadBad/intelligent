package com.coinsoft.common.constants;

/**
 * @fun
 */
public interface ConstantsKey {
    //公共常量
    interface commonConfig {
        int defaultValue = 1;//默认值
        int failCode = 1;
        int successCode = 200;
        int defaultRespCode = 0;
    }

    //首页常量
    interface indexConfig {
        int getIndexListFail = 100;
    }

    interface userConfig {
        int LOGIN_FAIL = 20000;
        String RESET_PASSWORD = "123456";
        String defaultPassword = "88888888";
    }

    interface redisConfig {
        long TOKEN_EXPIRETIME = 300000000;
    }

    interface tokenConfig {
        int TOKEN_ERROR = 401;
    }

    interface memberConfig {
        String UP_MEMBER = "会员升级";
        String COMMONCASH = "佣金提现";
        String CURNUM = "目前人数";
    }

    interface resourcesConfig {
        String ROOT_NODE = "1";
        int RESOURCE_LEVEL = 1;
    }


}
