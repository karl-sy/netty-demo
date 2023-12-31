package com.karl.pre.server.codec;

import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.karl.pre.common.ResponseMessage;
import io.netty.handler.codec.MessageToMessageEncoder;

public class OrderProtocolEncoder extends MessageToMessageEncoder<ResponseMessage> {


    @Override
    protected void encode(ChannelHandlerContext ctx, ResponseMessage responseMessage, List<Object> out) throws Exception {
        ByteBuf buffer = ctx.alloc().buffer();

        responseMessage.encode(buffer);

        out.add(buffer);
    }
}
