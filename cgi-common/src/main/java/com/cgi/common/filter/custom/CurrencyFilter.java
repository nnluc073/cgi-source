package com.cgi.common.filter.custom;

import com.cgi.common.constants.enums.ECurrency;
import com.cgi.common.constants.enums.ERole;
import com.cgi.common.filter.basic.Filter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CurrencyFilter extends Filter<ECurrency> {

    public CurrencyFilter(CurrencyFilter filter) {
        super(filter);
    }

    @Override
    public CurrencyFilter copy() {
        return new CurrencyFilter(this);
    }

}