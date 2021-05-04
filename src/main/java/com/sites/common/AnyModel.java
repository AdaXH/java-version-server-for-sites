package com.sites.common;

import java.util.HashMap;

public class AnyModel<T> {
    private HashMap<String, T> AnyModel;

    public AnyModel(HashMap<String, T> anyModel) {
        AnyModel = anyModel;
    }
}
