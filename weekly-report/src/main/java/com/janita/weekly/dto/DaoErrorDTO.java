package com.janita.weekly.dto;

import lombok.Data;

/**
 * 类说明：
 * <p>
 * { "COUNT无": "460", "MAXelapsed": "5194.0", "AVGelapsed": "5016.39", "daoMethodName": "queryEmployeesTaxBill", "daoName":
 * "PersonalIncomeTaxDetailMapper" }
 *
 * 数据访问层异常统计
 *
 * @author zhucj
 * @since 2019-07-05 - 16:02
 */
@Data
public class DaoErrorDTO {

    private Integer COUNT无;

    private Double MAXelapsed;

    private String daoMethodName;

    private String daoName;
}
