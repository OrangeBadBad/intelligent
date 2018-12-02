package com.coinsoft.common.hystrix;

import com.coinsoft.common.constants.Constant;
import com.netflix.hystrix.*;

import java.util.Map;

public abstract class AbstractHystrixCommand extends HystrixCommand {
    /**
     * 格式：hystrix_event_key
     *
     */
    private static final String FORMAT = Constant.HYSTRIX_PREFIX;
    /**
     * 请求地址
     */
    public String url;
    /**
     * 请求超时时间
     */
    public int timeout;

    @Override
    protected Object run() throws Exception {
        return null;
    }

    public AbstractHystrixCommand(String event, Map<String, String> properties) {
        super(
                Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey(properties.get(String.format(FORMAT, event, "groupkey"))))
                        .andCommandKey(HystrixCommandKey.Factory.asKey(properties.get(String.format(FORMAT, event, "groupkey"))))
                        .andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey(properties.get(String.format(FORMAT, event, "threadpool"))))
                        .andCommandPropertiesDefaults(
                                HystrixCommandProperties.Setter().withExecutionIsolationStrategy(HystrixCommandProperties.ExecutionIsolationStrategy.THREAD)
                                        .withExecutionTimeoutInMilliseconds(1000 * Integer.valueOf(properties.get(String.format(FORMAT, event, "timeout"))))
                                        .withCircuitBreakerSleepWindowInMilliseconds(1000 * Integer.valueOf(properties.getOrDefault(String.format(FORMAT, event, "breaktime"), "10")))
                        )
                        .andThreadPoolPropertiesDefaults(
                                HystrixThreadPoolProperties.Setter()
                                        .withAllowMaximumSizeToDivergeFromCoreSize(true)
                                        .withCoreSize(Integer.valueOf(properties.getOrDefault(String.format(FORMAT, event, "coresize"), "5")))
                                        .withMaximumSize(Integer.valueOf(properties.getOrDefault(String.format(FORMAT, event, "maxsize"), "10")))
                                        .withMaxQueueSize(Integer.valueOf(properties.getOrDefault(String.format(FORMAT, event, "maxqueue"), "20")))
                                        .withQueueSizeRejectionThreshold(Integer.valueOf(properties.getOrDefault(String.format(FORMAT, event, "rejectqueue"), "10")))
                        )
        );
    }
}
