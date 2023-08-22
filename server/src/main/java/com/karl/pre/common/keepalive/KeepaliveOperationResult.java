package com.karl.pre.common.keepalive;

import com.karl.pre.common.OperationResult;
import lombok.Data;

@Data
public class KeepaliveOperationResult extends OperationResult {

    private final long time;

}
