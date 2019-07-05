package com.janita.weekly.dto;

import lombok.Data;

/**
 * 类说明：
 * "COUNT无": "总量",
 * 				"MAXelapsed": "最大耗时",
 * 				"AVGelapsed": "平均耗时",
 * 				"daoMethodName": "方法名",
 * 				"daoName": "类名"
 *
 * @author zhucj
 * @since 2019-07-05 - 16:09
 */
@Data
public class DaoAccessDTO {

    private Integer COUNT无;

    private Double MAXelapsed;

    private Double AVGelapsed;

    private String daoMethodName;

    private String daoName;
}
