// package com.about.excel.util;
//
// import org.apache.poi.hssf.usermodel.HSSFDateUtil;
// import org.apache.poi.ss.usermodel.Cell;
//
// import java.math.BigDecimal;
//
// /**
//  * 类说明：
//  *
//  * @author zhucj
//  * @since 2019-07-22 - 11:08
//  */
// public class Utils {
//
//     /**
//      * 按相应格式得到单元格的值
//      *
//      * @return String
//      */
//     public static String getValue(Cell cell) {
//         if (null == cell) {
//             return "";
//         }
//         try {
//             String dataFormatString = cell.getCellStyle().getDataFormatString();
//             switch (cell.getCellType()) {
//                 case NUMERIC: {
//                     if (HSSFDateUtil.isCellDateFormatted(cell)) {
//                         String dateStr = DateUtils.format(cell.getDateCellValue(), XsbDateUtils.YYYY_MM_DD_HH_MM_SS);
//                         if (dateStr.endsWith(" 00:00:00")) {
//                             dateStr = dateStr.substring(0, XsbDateUtils.YYYY_MM_DD.length());
//                         }
//                         return dateStr;
//                     }
//                     return getBigDecimalVal(cell, dataFormatString);
//                 }
//                 case STRING: {
//                     return cell.getStringCellValue().trim();
//                 }
//                 case BOOLEAN: {
//                     return String.valueOf(cell.getBooleanCellValue()).trim();
//                 }
//                 case FORMULA: {
//                     return getVal(cell, dataFormatString);
//                 }
//                 case BLANK: {
//                     return "";
//                 }
//                 default: {
//                     return "";
//                 }
//             }
//         } catch (Exception e) {
//             log.info("异常：{}", e);
//             return "";
//         }
//     }
//
//     private static String getVal(Cell cell, String dataFormatString) {
//         try {
//             return String.valueOf(cell.getStringCellValue()).trim();
//         } catch (IllegalStateException e) {
//             log.info("异常：{}", e);
//             return getBigDecimalVal(cell, dataFormatString);
//         }
//     }
//
//     private static String getBigDecimalVal(Cell cell, String dataFormatString) {
//         BigDecimal bd = new BigDecimal(String.valueOf(cell.getNumericCellValue()));
//         if (dataFormatString.contains("0.0000")) {
//             bd = bd.setScale(4, BigDecimal.ROUND_HALF_UP);
//         } else if (dataFormatString.contains("0.000")) {
//             bd = bd.setScale(3, BigDecimal.ROUND_HALF_UP);
//         } else if (dataFormatString.contains("0.00")) {
//             bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
//         } else if (dataFormatString.contains("0.0")) {
//             bd = bd.setScale(1, BigDecimal.ROUND_HALF_UP);
//         } else if ("General".equals(dataFormatString) || dataFormatString.contains("0_") || dataFormatString.indexOf('0') > -1) {
//             if (bd.scale() > 4) {
//                 bd = bd.setScale(4, BigDecimal.ROUND_HALF_UP);
//             } else if (bd.scale() == 1 && bd.toString().endsWith(".0")) {
//                 bd = bd.setScale(0, BigDecimal.ROUND_HALF_UP);
//             }
//         } else if (bd.scale() > 6) {
//             bd = bd.setScale(4, BigDecimal.ROUND_HALF_UP);
//         }
//         //如果小数位数大于2位,去除最后的0
//         return XsbPattern.PATTERN_ZERO_SUFF.matcher(bd.toPlainString()).replaceAll("");
//     }
// }
