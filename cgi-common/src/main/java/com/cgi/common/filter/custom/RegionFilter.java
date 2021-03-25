package com.cgi.common.filter.custom;

import com.cgi.common.constants.enums.ERegion;
import com.cgi.common.constants.enums.ERole;
import com.cgi.common.filter.basic.Filter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RegionFilter extends Filter<ERegion> {

    public RegionFilter(RegionFilter filter) {
        super(filter);
    }

    @Override
    public RegionFilter copy() {
        return new RegionFilter(this);
    }

}