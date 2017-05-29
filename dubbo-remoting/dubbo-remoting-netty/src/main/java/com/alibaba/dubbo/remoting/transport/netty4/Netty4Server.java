package com.alibaba.dubbo.remoting.transport.netty4;

import java.net.InetSocketAddress;
import java.util.Collection;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.utils.ExecutorUtil;
import com.alibaba.dubbo.remoting.Channel;
import com.alibaba.dubbo.remoting.ChannelHandler;
import com.alibaba.dubbo.remoting.RemotingException;
import com.alibaba.dubbo.remoting.Server;
import com.alibaba.dubbo.remoting.transport.AbstractServer;
import com.alibaba.dubbo.remoting.transport.dispatcher.ChannelHandlers;

/**
 * 切换Netty4
 * 
 * @author shi
 *
 */
public class Netty4Server extends AbstractServer implements Server {

	/**
	 * 
	 * @param url
	 * @param handler
	 * @throws RemotingException
	 */
	public Netty4Server(URL url, ChannelHandler handler) throws RemotingException {
		super(url, ChannelHandlers.wrap(handler, ExecutorUtil.setThreadName(url, SERVER_THREAD_POOL_NAME)));
	}

	public boolean isBound() {
		return false;
	}

	public Collection<Channel> getChannels() {
		return null;
	}

	public Channel getChannel(InetSocketAddress remoteAddress) {
		return null;
	}

	@Override
	protected void doOpen() throws Throwable {

	}

	@Override
	protected void doClose() throws Throwable {

	}

}
