package com.sample.functionalinterface;

import java.util.Arrays;

/**
 * Created by tarun on 07/09/2017.
 */
public class UseVarArgInterface {

    static String useOp() {
        VarArgInterface var = Arrays::toString;
        var = args -> String.valueOf(args.length);

        return var.op(new String[]{"", ""});

    }
}
