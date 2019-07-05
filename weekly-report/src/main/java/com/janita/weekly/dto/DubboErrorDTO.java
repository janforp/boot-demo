package com.janita.weekly.dto;

import lombok.Data;

/**
 * 类说明：
 * "COUNT无": "758",
 * 					"MAXelapsed": "50295.0",
 * 					"AVGelapsed": "13017.77",
 * 					"serviceMethodName": "queryEmployeeTaxBillDetail",
 * 					"serviceAppName": "gaia",
 * 					"serviceName": "TaxApi"
 *
 * 			服务异常统计
 *
 * 	"COUNT无": "总量",
 * 				"MAXelapsed": "最大耗时",
 * 				"AVGelapsed": "平均耗时",
 * 				"serviceMethodName": "方法名",
 * 				"serviceAppName": "应用名",
 * 				"serviceName": "接口名"
 *
 * @author zhucj
 * @since 2019-07-05 - 16:11
 */
@Data
public class DubboErrorDTO {

    private Integer COUNT无;

    private Double MAXelapsed;

    private Double AVGelapsed;

    private String serviceMethodName;

    private String serviceName;
}
