package com.janita.check.auth.utils;

import lombok.Data;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-25 - 14:40
 */
@Data
public class WebTokenParam {

    private String userId;

    private String companyId;

    private String webToken;
}
