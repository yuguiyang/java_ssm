package org.ygy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.ygy.service.IChannelService;

@Controller
@RequestMapping("/channel")
public class ChannelController {
	
	@Autowired
	private IChannelService channelService;

	/**
	 * 获取渠道标题
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/columns" ,produces="text/html;charset=UTF-8")
	public String columns() {
		
		String result = channelService.queryColumns();
		
		return result;
	}
	
	/**
	 * 渠道明细信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/channel" ,produces="text/html;charset=UTF-8")	
	public String channel() {
		
		String result = channelService.queryChannelInfo();
		
		return result;
	}

	/**
	 * 获取渠道类型
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/type" ,produces="text/html;charset=UTF-8")	
	public String type() {
		
		String result = channelService.queryChannelType();
		
		return result;
	}
}