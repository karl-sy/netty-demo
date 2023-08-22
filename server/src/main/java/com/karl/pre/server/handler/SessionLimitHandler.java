package com.karl.pre.server.handler;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class SessionLimitHandler extends ChannelInboundHandlerAdapter {

    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        System.out.println("||-------------------->>>>>>>>>>>>>>");
        Entry entry = null;
        try {
            entry = SphU.entry("newSession");
        }catch (BlockException e){
            ctx.close();
            e.printStackTrace();
        }finally {
            if(entry != null){
                entry.exit();
            }
        }

        super.channelRegistered(ctx);
    }

}
