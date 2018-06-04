package com.pattern.chainofresponsibility.user;

import com.pattern.chainofresponsibility.IMessenger;
import com.pattern.chainofresponsibility.PermissionLevel;

public class NormalUser implements IMessenger {

    @Override
    public int getPermissionLevel() {
        return PermissionLevel.USER;
    }

    @Override
    public String getRequest() {
        return "Add comment";
    }
}
