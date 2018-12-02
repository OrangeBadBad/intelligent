package com.coinsoft.common.util;

import java.util.Collection;

/**
 * Created by wenhuan huang on  2018/10/17.
 */
public class CollectionUtil {
    /**
     * 判断一个集合是否为空
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection collection) {
        if (null == collection || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * 不为空
     *
     * @param collection
     * @return
     */
    public static boolean isNotEmpty(Collection collection) {
        return !isEmpty(collection);
    }
}
