package com.karl.pre.client.codec;

import io.netty.channel.ChannelHandlerContext;
import com.karl.pre.common.Operation;
import com.karl.pre.common.RequestMessage;
import com.karl.pre.util.IdUtil;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

public class OperationToRequestMessageEncoder extends MessageToMessageEncoder <Operation> {
    @Override
    protected void encode(ChannelHandlerContext ctx, Operation operation, List<Object> out) throws Exception {
          RequestMessage requestMessage = new RequestMessage(IdUtil.nextId(), operation);

          out.add(requestMessage);
     }
}
