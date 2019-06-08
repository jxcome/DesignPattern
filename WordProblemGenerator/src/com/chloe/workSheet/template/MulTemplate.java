package com.chloe.workSheet.template;

import com.chloe.util.Utility;

public class MulTemplate extends Template {
    public MulTemplate() {
        addTemplate();
    }

    @Override
    public void addTemplate() {
        for (String template: Utility.MUL_TEPLATES) {
            sentences.add(template);
        }
    }
}
