package com.alibaba.dubbo.remoting.zookeeper;

import java.util.List;

/**
 * 
 * @author shi
 * @date 2017年5月17日 下午6:29:22
 * @since 1.0
 */
public interface ZookeeperClient {

	void create(String path, boolean ephemeral);

	void delete(String path);

	List<String> getChildren(String path);

	List<String> addChildListener(String path, ChildListener listener);

	void removeChildListener(String path, ChildListener listener);

	void addStateListener(StateListener listener);

	void removeStateListener(StateListener listener);

	boolean isConnected();

	void close();

}
