package com.chloe.workSheet.template;

import com.chloe.util.Utility;

public class DivTemplate extends Template {
    public DivTemplate() {
        addTemplate();
    }

    @Override
    public void addTemplate() {
        for (String template: Utility.DIV_TEPLATES) {
            sentences.add(template);
        }
    }
}
