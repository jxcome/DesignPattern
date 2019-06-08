package com.chloe.workSheet.template;

import com.chloe.util.Utility;

public class SubTemplate extends Template {
    public SubTemplate() {
        addTemplate();
    }

    @Override
    public void addTemplate() {
        for (String template: Utility.SUB_TEPLATES) {
            sentences.add(template);
        }
    }
}
