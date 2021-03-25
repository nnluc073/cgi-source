package com.cgi.starter.service.criteria;

import com.cgi.common.filter.Criteria;
import com.cgi.common.filter.basic.StringFilter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserCriteria extends BaseCriteria implements Criteria {

    private StringFilter username;
    private StringFilter fullName;
    private StringFilter phoneNumber;
    private StringFilter email;

    public UserCriteria(UserCriteria other) {
        this.username = other.username == null ? null : other.username.copy();
        this.phoneNumber = other.phoneNumber == null ? null : other.phoneNumber.copy();
        this.email = other.email == null ? null : other.email.copy();
        this.fullName = other.fullName == null ? null : other.fullName.copy();
    }

    @Override
    public Criteria copy() {
        return new UserCriteria(this);
    }
}
