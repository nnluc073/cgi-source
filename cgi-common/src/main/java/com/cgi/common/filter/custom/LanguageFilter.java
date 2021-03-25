package com.cgi.common.filter.custom;

import com.cgi.common.constants.enums.ECurrency;
import com.cgi.common.constants.enums.ELanguage;
import com.cgi.common.filter.basic.Filter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LanguageFilter extends Filter<ELanguage> {

    public LanguageFilter(LanguageFilter filter) {
        super(filter);
    }

    @Override
    public LanguageFilter copy() {
        return new LanguageFilter(this);
    }

}