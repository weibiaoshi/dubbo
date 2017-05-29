package com.alibaba.dubbo.remoting.transport.netty4;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.remoting.ChannelHandler;
import com.alibaba.dubbo.remoting.Client;
import com.alibaba.dubbo.remoting.RemotingException;
import com.alibaba.dubbo.remoting.Server;
import com.alibaba.dubbo.remoting.Transporter;

/**
 * 
 * @author shi
 *
 */
public class Netty4Transporter implements Transporter {

	public static final String NAME = "netty4";

	public Server bind(URL url, ChannelHandler handler) throws RemotingException {
		return null;
	}

	public Client connect(URL url, ChannelHandler handler) throws RemotingException {
		return null;
	}

}
