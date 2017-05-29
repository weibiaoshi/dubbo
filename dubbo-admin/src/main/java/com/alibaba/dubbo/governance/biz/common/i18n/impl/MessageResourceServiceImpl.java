package com.alibaba.dubbo.governance.biz.common.i18n.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

import com.alibaba.dubbo.governance.biz.common.i18n.MessageResourceService;
import com.alibaba.dubbo.governance.web.common.i18n.LocaleUtil;

/**
 * 
 * @author shi
 * @date 2017年5月20日 下午12:57:18
 * @since 1.0
 */
public class MessageResourceServiceImpl implements MessageResourceService {

	@Autowired
	private MessageSource messageSource;

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Override
	public String get(String key, Object... args) {
		try {
			if (messageSource != null) {
				return messageSource.getMessage(key, args, key, LocaleUtil.getLocale());
			}
			return key;
		} catch (NoSuchMessageException e) {
			return key;
		}
	}

	@Override
	public String getMessage(String key, Object... args) {
		return get(key, args);
	}

}
