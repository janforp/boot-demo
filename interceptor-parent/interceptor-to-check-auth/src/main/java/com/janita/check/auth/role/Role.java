package com.janita.check.auth.role;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-25 - 14:27
 */
@AllArgsConstructor
public enum  Role {

    NORMAL_USER(1),

    ADMIN(2);

    @Getter
    private Integer roleCode;

    public static Role getByCode(Integer code) {
        for (final Role value : Role.values()) {
            if (value.roleCode.equals(code)) {
                return value;
            }
        }
        return null;
    }
}
