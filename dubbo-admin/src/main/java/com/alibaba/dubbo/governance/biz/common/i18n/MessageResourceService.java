package com.alibaba.dubbo.governance.biz.common.i18n;

/**
 * 
 * @author shi
 * @date 2017年5月20日 下午12:57:23
 * @since 1.0
 */
public interface MessageResourceService {

	public String get(String key, Object... args);

	public String getMessage(String key, Object... args);

}
