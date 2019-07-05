package com.janita.weekly.dto;

import lombok.Data;

/**
 * 类说明：
 *
 * "服务统计报表": {
 * 			"heads": [
 * 				"serviceAppName",
 * 				"serviceName",
 * 				"serviceMethodName",
 * 				"COUNT无",
 * 				"MAXelapsed",
 * 				"AVGelapsed"
 * 			],
 * 			"headMap": {
 * 				"COUNT无": "总量",
 * 				"MAXelapsed": "最大耗时",
 * 				"AVGelapsed": "平均耗时",
 * 				"serviceMethodName": "方法名",
 * 				"serviceAppName": "应用名",
 * 				"serviceName": "接口名"
 *                        },
 * 			"dataMapList": [{
 * 					"COUNT无": "2224758",
 * 					"MAXelapsed": "1470.0",
 * 					"AVGelapsed": "5.23",
 * 					"serviceMethodName": "queryRelationList",
 * 					"serviceAppName": "gaia",
 * 					"serviceName": "IndividualQueryApi"
 *                },
 *                {
 * 					"COUNT无": "1263981",
 * 					"MAXelapsed": "1217.0",
 * 					"AVGelapsed": "2.16",
 * 					"serviceMethodName": "queryWebUserById",
 * 					"serviceAppName": "gaia",
 * 					"serviceName": "IndividualQueryApi"
 *                },
 *
 * @author zhucj
 * @since 2019-07-05 - 16:14
 */
@Data
public class DubboAccessDTO {

    private Integer COUNT无;

    private Double MAXelapsed;

    private Double AVGelapsed;

    private String serviceMethodName;

    private String serviceName;
}
