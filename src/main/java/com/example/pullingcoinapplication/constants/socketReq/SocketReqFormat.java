package com.example.pullingcoinapplication.constants.socketReq;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SocketReqFormat {
    SIMPLE("SIMPLE"), DEFAULT("DEFAULT");
    private String format;
}
