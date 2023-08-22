package com.karl.pre.common.auth;

import com.karl.pre.common.OperationResult;
import lombok.Data;

@Data
public class AuthOperationResult extends OperationResult {

    private final boolean passAuth;

}
