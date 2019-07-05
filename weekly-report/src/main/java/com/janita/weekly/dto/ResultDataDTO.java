package com.janita.weekly.dto;

import lombok.Builder;
import lombok.Data;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-05 - 18:02
 */
@Data
@Builder
public class ResultDataDTO {

    private String className;

    private String methodName;

    private String currentWeekNum;

    private String lastWeekNum;

    private String numRiseRate;

    private String currentWeekTime;

    private String lastWeekTime;

    private String timeRiseRate;

    @Override
    public String toString() {
        return className + " " + " " + methodName + " " + currentWeekNum + " " + lastWeekNum + " " + numRiseRate + " " + currentWeekTime
            + " " + lastWeekTime + " " + timeRiseRate;
    }
}
