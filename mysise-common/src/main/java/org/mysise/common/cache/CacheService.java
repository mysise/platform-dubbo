package org.mysise.common.cache;

/**
 *  缓存暴露接口
 *
 * @author fanwenjie
 * @since 2019/8/18 23:59
 */
public interface CacheService {

    /**
     * 设置缓存失效时间
     *
     * @author fanwenjie
     * @since 2019/8/19 0:00
     */
    boolean expire(String key,long time);

   /**
    * 根据key 获取过期时间
    * @param key 键 不能为null
    * @return 时间(秒) 返回0代表为永久有效
    *
    * @author fanwenjie
    * @since 2019/8/19 0:02
    */
    long getExpire(String key);
}
