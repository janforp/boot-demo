package com.janita.weekly.dto;

import lombok.Data;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-05 - 18:34
 */
@Data
public class ErrorResultDTO {

    private String name;

    private String num;

    @Override
    public String toString() {
        return name + " " + num;
    }
}
