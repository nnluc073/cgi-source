package com.cgi.common.filter.custom;

import com.cgi.common.constants.enums.ERole;
import com.cgi.common.filter.basic.Filter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RoleFilter extends Filter<ERole> {

    public RoleFilter(RoleFilter filter) {
        super(filter);
    }

    @Override
    public RoleFilter copy() {
        return new RoleFilter(this);
    }

}