package com.boot.demo.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 类说明：
 *
 * @author janita
 * @since 2019-01-21 - 14:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill {

    private String userId;

    private int money;
}
