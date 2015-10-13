package com.nvee.websocket;

import zcu.xutil.web.WsockAction;

public class WebSocketTestAction implements WsockAction{

	@Override
	public void onMessage(Ctx ctx, String arg1) {
		
		ctx.replay("");
		ctx.getLoginName();
		
	}

}
