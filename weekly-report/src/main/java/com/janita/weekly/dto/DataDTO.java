package com.janita.weekly.dto;

import lombok.Data;

import java.util.List;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-05 - 16:24
 */
@Data
public class DataDTO {


    /**
     * head : {"code":"00000000","description":"成功","msg":"成功","time":"2019-07-05 16:20:36","status":"Y"} body :
     * {"数据访问层异常统计":{"heads":["daoName","daoMethodName","COUNT无","MAXelapsed","AVGelapsed"],"headMap":{"COUNT无":"总量","MAXelapsed":"最大耗时","AVGelapsed":"平均耗时","daoMethodName":"方法名","daoName":"类名"},"dataMapList":[{"COUNT无":"1009","MAXelapsed":"806665.0","AVGelapsed":"119623.45","daoMethodName":"findByWebUserId","daoName":"WebMobileRelationMapper"},{"COUNT无":"308","MAXelapsed":"120468.0","AVGelapsed":"118631.29","daoMethodName":"queryWebUser","daoName":"WebUserMapper"},{"COUNT无":"1","MAXelapsed":"18.0","AVGelapsed":"18.0","daoMethodName":"insertSelective","daoName":"WebUserMapper"},{"COUNT无":"1","MAXelapsed":"15.0","AVGelapsed":"15.0","daoMethodName":"updateByPrimaryKeySelective","daoName":"WebUserMapper"},{"COUNT无":"208","MAXelapsed":"805639.0","AVGelapsed":"123058.4","daoMethodName":"queryPayrollDetailByEmployeeId","daoName":"PayrollDetailMapper"},{"COUNT无":"18","MAXelapsed":"120003.0","AVGelapsed":"73367.94","daoMethodName":"queryDetailByEmployeeIdAndMonthInterval","daoName":"PayrollDetailMapper"},{"COUNT无":"1","MAXelapsed":"13.0","AVGelapsed":"13.0","daoMethodName":"updatePayrollDetail","daoName":"PayrollDetailMapper"},{"COUNT无":"145","MAXelapsed":"805640.0","AVGelapsed":"122128.79","daoMethodName":"statisticsTodolist","daoName":"TodolistItemMapper"},{"COUNT无":"1","MAXelapsed":"120007.0","AVGelapsed":"120007.0","daoMethodName":"selectByPrimaryKey","daoName":"TodolistItemMapper"},{"COUNT无":"38","MAXelapsed":"3722.0","AVGelapsed":"563.66","daoMethodName":"insert","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"18","MAXelapsed":"120003.0","AVGelapsed":"107840.89","daoMethodName":"queryEmployeesTaxBill","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"33","MAXelapsed":"144.0","AVGelapsed":"41.12","daoMethodName":"insert","daoName":"PayrollRawDetailMapper"},{"COUNT无":"2","MAXelapsed":"120001.0","AVGelapsed":"120001.0","daoMethodName":"queryPayrollDetail","daoName":"PayrollRawDetailMapper"},{"COUNT无":"34","MAXelapsed":"120005.0","AVGelapsed":"110825.24","daoMethodName":"insert","daoName":"BonusPersonalMapper"},{"COUNT无":"31","MAXelapsed":"805639.0","AVGelapsed":"142118.9","daoMethodName":"findByWebUserId","daoName":"WechatConfigMapper"},{"COUNT无":"12","MAXelapsed":"805643.0","AVGelapsed":"153195.5","daoMethodName":"selectByEmployeeId","daoName":"EmployeeMapper"},{"COUNT无":"2","MAXelapsed":"120001.0","AVGelapsed":"120001.0","daoMethodName":"selectAllByCompanyId","daoName":"EmployeeMapper"},{"COUNT无":"2","MAXelapsed":"120001.0","AVGelapsed":"120001.0","daoMethodName":"selectByCondition","daoName":"EmployeeMapper"},{"COUNT无":"2","MAXelapsed":"120004.0","AVGelapsed":"100189.5","daoMethodName":"selectByOtherCondition","daoName":"EmployeeMapper"},{"COUNT无":"1","MAXelapsed":"80.0","AVGelapsed":"80.0","daoMethodName":"insert","daoName":"EmployeeMapper"},{"COUNT无":"9","MAXelapsed":"120003.0","AVGelapsed":"120002.78","daoMethodName":"queryPayrollByPayrollIdList","daoName":"PayrollMapper"},{"COUNT无":"4","MAXelapsed":"120006.0","AVGelapsed":"120003.0","daoMethodName":"queryPayrollByCondition","daoName":"PayrollMapper"},{"COUNT无":"4","MAXelapsed":"120002.0","AVGelapsed":"120001.25","daoMethodName":"queryPayrollByMonth","daoName":"PayrollMapper"},{"COUNT无":"1","MAXelapsed":"120002.0","AVGelapsed":"120002.0","daoMethodName":"queryHasPayrollMonth","daoName":"PayrollMapper"},{"COUNT无":"1","MAXelapsed":"120001.0","AVGelapsed":"120001.0","daoMethodName":"queryPayrollByPayrollId","daoName":"PayrollMapper"},{"COUNT无":"9","MAXelapsed":"120003.0","AVGelapsed":"120002.22","daoMethodName":"queryPayrollRawByExcelCacheId","daoName":"PayrollRawMapper"},{"COUNT无":"6","MAXelapsed":"15.0","AVGelapsed":"13.67","daoMethodName":"insert","daoName":"DeductionLoanMapper"},{"COUNT无":"3","MAXelapsed":"120001.0","AVGelapsed":"80009.67","daoMethodName":"insert","daoName":"DeductionSerialMapper"},{"COUNT无":"3","MAXelapsed":"120002.0","AVGelapsed":"120001.33","daoMethodName":"selectByCompanyId","daoName":"RemindDaysMapper"},{"COUNT无":"2","MAXelapsed":"120001.0","AVGelapsed":"60007.0","daoMethodName":"selectByCompanyId","daoName":"EmployeeDepartmentMapper"},{"COUNT无":"1","MAXelapsed":"805640.0","AVGelapsed":"805640.0","daoMethodName":"listDimissionInfo","daoName":"EmployeeDimissionMapper"},{"COUNT无":"1","MAXelapsed":"120001.0","AVGelapsed":"120001.0","daoMethodName":"getPayrollRule","daoName":"PayrollRuleMapper"},{"COUNT无":"1","MAXelapsed":"120003.0","AVGelapsed":"120003.0","daoMethodName":"queryPersonalIncomeTaxByDeclareIdList","daoName":"PersonalIncomeTaxMapper"},{"COUNT无":"1","MAXelapsed":"120002.0","AVGelapsed":"120002.0","daoMethodName":"insertIgnore","daoName":"StiSalaryRulesMapper"}]},"数据访问层统计":{"heads":["daoName","daoMethodName","COUNT无","MAXelapsed","AVGelapsed"],"headMap":{"COUNT无":"总量","MAXelapsed":"最大耗时","AVGelapsed":"平均耗时","daoMethodName":"方法名","daoName":"类名"},"dataMapList":[{"COUNT无":"681277","MAXelapsed":"805639.0","AVGelapsed":"53.55","daoMethodName":"queryPayrollDetailByEmployeeId","daoName":"PayrollDetailMapper"},{"COUNT无":"187958","MAXelapsed":"120003.0","AVGelapsed":"22.79","daoMethodName":"queryDetailByEmployeeIdAndMonthInterval","daoName":"PayrollDetailMapper"},{"COUNT无":"113665","MAXelapsed":"9682.0","AVGelapsed":"15.2","daoMethodName":"updatePayrollDetail","daoName":"PayrollDetailMapper"},{"COUNT无":"28252","MAXelapsed":"886.0","AVGelapsed":"20.35","daoMethodName":"queryPayrollDetail","daoName":"PayrollDetailMapper"},{"COUNT无":"9438","MAXelapsed":"389.0","AVGelapsed":"9.83","daoMethodName":"statistics","daoName":"PayrollDetailMapper"},{"COUNT无":"9355","MAXelapsed":"244.0","AVGelapsed":"9.44","daoMethodName":"getEmpIdList","daoName":"PayrollDetailMapper"},{"COUNT无":"7940","MAXelapsed":"13688.0","AVGelapsed":"51.39","daoMethodName":"getRepeatPayrollEmployee","daoName":"PayrollDetailMapper"},{"COUNT无":"6407","MAXelapsed":"1556.0","AVGelapsed":"27.47","daoMethodName":"queryPayrollDetailByPage","daoName":"PayrollDetailMapper"},{"COUNT无":"5554","MAXelapsed":"2227.0","AVGelapsed":"58.43","daoMethodName":"insert","daoName":"PayrollDetailMapper"},{"COUNT无":"3253","MAXelapsed":"887.0","AVGelapsed":"47.87","daoMethodName":"queryPayrollDetailByPayrollIdList","daoName":"PayrollDetailMapper"},{"COUNT无":"1506","MAXelapsed":"337.0","AVGelapsed":"17.51","daoMethodName":"updateByPayrollIdUnvalid","daoName":"PayrollDetailMapper"},{"COUNT无":"1391","MAXelapsed":"619.0","AVGelapsed":"20.98","daoMethodName":"checkPayrollDelete","daoName":"PayrollDetailMapper"},{"COUNT无":"1362","MAXelapsed":"303.0","AVGelapsed":"29.06","daoMethodName":"getInvidualPayrollEmployeeIdList","daoName":"PayrollDetailMapper"},{"COUNT无":"386","MAXelapsed":"77.0","AVGelapsed":"7.47","daoMethodName":"getSalaryEmpIdList","daoName":"PayrollDetailMapper"},{"COUNT无":"110","MAXelapsed":"127.0","AVGelapsed":"12.2","daoMethodName":"queryPayrollDetailByPayrollDetailId","daoName":"PayrollDetailMapper"},{"COUNT无":"850048","MAXelapsed":"120003.0","AVGelapsed":"11.87","daoMethodName":"queryPayrollByPayrollIdList","daoName":"PayrollMapper"},{"COUNT无":"66616","MAXelapsed":"120006.0","AVGelapsed":"22.35","daoMethodName":"queryPayrollByCondition","daoName":"PayrollMapper"},{"COUNT无":"34604","MAXelapsed":"120001.0","AVGelapsed":"11.88","daoMethodName":"queryPayrollByPayrollId","daoName":"PayrollMapper"},{"COUNT无":"11762","MAXelapsed":"120002.0","AVGelapsed":"51.78","daoMethodName":"queryPayrollByMonth","daoName":"PayrollMapper"},{"COUNT无":"8437","MAXelapsed":"120002.0","AVGelapsed":"23.59","daoMethodName":"queryHasPayrollMonth","daoName":"PayrollMapper"},{"COUNT无":"5552","MAXelapsed":"199.0","AVGelapsed":"11.88","daoMethodName":"saveOrUpdate","daoName":"PayrollMapper"},{"COUNT无":"2892","MAXelapsed":"341.0","AVGelapsed":"11.45","daoMethodName":"updatePayroll","daoName":"PayrollMapper"},{"COUNT无":"1506","MAXelapsed":"158.0","AVGelapsed":"10.57","daoMethodName":"updatePayrollUnvalid","daoName":"PayrollMapper"},{"COUNT无":"1425","MAXelapsed":"20.0","AVGelapsed":"6.68","daoMethodName":"queryMaxPayrollByMonth","daoName":"PayrollMapper"},{"COUNT无":"323731","MAXelapsed":"806665.0","AVGelapsed":"417.23","daoMethodName":"findByWebUserId","daoName":"WebMobileRelationMapper"},{"COUNT无":"7747","MAXelapsed":"248.0","AVGelapsed":"19.5","daoMethodName":"insertSelective","daoName":"WebMobileRelationMapper"},{"COUNT无":"6125","MAXelapsed":"307.0","AVGelapsed":"12.7","daoMethodName":"queryRelationByEmployee","daoName":"WebMobileRelationMapper"},{"COUNT无":"936","MAXelapsed":"204.0","AVGelapsed":"17.27","daoMethodName":"updateByPrimaryKeySelective","daoName":"WebMobileRelationMapper"},{"COUNT无":"317730","MAXelapsed":"805639.0","AVGelapsed":"34.49","daoMethodName":"findByWebUserId","daoName":"WechatConfigMapper"},{"COUNT无":"7482","MAXelapsed":"213.0","AVGelapsed":"13.2","daoMethodName":"insertSelective","daoName":"WechatConfigMapper"},{"COUNT无":"261707","MAXelapsed":"805640.0","AVGelapsed":"82.65","daoMethodName":"statisticsTodolist","daoName":"TodolistItemMapper"},{"COUNT无":"30035","MAXelapsed":"360.0","AVGelapsed":"10.52","daoMethodName":"queryTodolist","daoName":"TodolistItemMapper"},{"COUNT无":"2174","MAXelapsed":"120007.0","AVGelapsed":"64.44","daoMethodName":"selectByPrimaryKey","daoName":"TodolistItemMapper"},{"COUNT无":"203","MAXelapsed":"29.0","AVGelapsed":"10.89","daoMethodName":"dealTodolist","daoName":"TodolistItemMapper"},{"COUNT无":"109","MAXelapsed":"41.0","AVGelapsed":"15.84","daoMethodName":"insert","daoName":"TodolistItemMapper"},{"COUNT无":"90945","MAXelapsed":"120001.0","AVGelapsed":"36.44","daoMethodName":"selectByCondition","daoName":"EmployeeMapper"},{"COUNT无":"57312","MAXelapsed":"805643.0","AVGelapsed":"44.74","daoMethodName":"selectByEmployeeId","daoName":"EmployeeMapper"},{"COUNT无":"55750","MAXelapsed":"120001.0","AVGelapsed":"54.67","daoMethodName":"selectAllByCompanyId","daoName":"EmployeeMapper"},{"COUNT无":"20402","MAXelapsed":"23885.0","AVGelapsed":"44.21","daoMethodName":"update","daoName":"EmployeeMapper"},{"COUNT无":"10724","MAXelapsed":"3581.0","AVGelapsed":"35.92","daoMethodName":"selectByEmployeeIds","daoName":"EmployeeMapper"},{"COUNT无":"6792","MAXelapsed":"120004.0","AVGelapsed":"51.74","daoMethodName":"selectByOtherCondition","daoName":"EmployeeMapper"},{"COUNT无":"4304","MAXelapsed":"6293.0","AVGelapsed":"26.61","daoMethodName":"insert","daoName":"EmployeeMapper"},{"COUNT无":"778","MAXelapsed":"6960.0","AVGelapsed":"86.87","daoMethodName":"deleteByEmployeeId","daoName":"EmployeeMapper"},{"COUNT无":"147802","MAXelapsed":"120003.0","AVGelapsed":"31.66","daoMethodName":"queryEmployeesTaxBill","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"15710","MAXelapsed":"243.0","AVGelapsed":"16.52","daoMethodName":"updateTaxDetailSawState","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"539","MAXelapsed":"3831.0","AVGelapsed":"137.92","daoMethodName":"insert","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"526","MAXelapsed":"1092.0","AVGelapsed":"32.39","daoMethodName":"queryPersonalIncomeTaxDetailList","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"394","MAXelapsed":"123.0","AVGelapsed":"12.89","daoMethodName":"queryPushDetailCollection","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"120","MAXelapsed":"167.0","AVGelapsed":"23.27","daoMethodName":"queryGroupByIdentification","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"117","MAXelapsed":"30.0","AVGelapsed":"19.15","daoMethodName":"updateEmployeeId","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"72","MAXelapsed":"48.0","AVGelapsed":"14.38","daoMethodName":"deleteTaxDetailByDeclareId","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"116887","MAXelapsed":"120468.0","AVGelapsed":"353.97","daoMethodName":"queryWebUser","daoName":"WebUserMapper"},{"COUNT无":"15263","MAXelapsed":"413.0","AVGelapsed":"10.91","daoMethodName":"updateByPrimaryKeySelective","daoName":"WebUserMapper"},{"COUNT无":"7857","MAXelapsed":"233.0","AVGelapsed":"18.91","daoMethodName":"insertSelective","daoName":"WebUserMapper"},{"COUNT无":"2887","MAXelapsed":"373.0","AVGelapsed":"15.66","daoMethodName":"queryByIdList","daoName":"WebUserMapper"},{"COUNT无":"51294","MAXelapsed":"120001.0","AVGelapsed":"27.08","daoMethodName":"queryPayrollDetail","daoName":"PayrollRawDetailMapper"},{"COUNT无":"36153","MAXelapsed":"437.0","AVGelapsed":"9.1","daoMethodName":"getEmpIdList","daoName":"PayrollRawDetailMapper"},{"COUNT无":"26731","MAXelapsed":"49666.0","AVGelapsed":"312.47","daoMethodName":"updateByPrimaryKeySelective","daoName":"PayrollRawDetailMapper"},{"COUNT无":"12570","MAXelapsed":"3770.0","AVGelapsed":"64.2","daoMethodName":"insert","daoName":"PayrollRawDetailMapper"},{"COUNT无":"7047","MAXelapsed":"129.0","AVGelapsed":"9.73","daoMethodName":"getEmpIdSetByExcelCacheIds","daoName":"PayrollRawDetailMapper"},{"COUNT无":"130877","MAXelapsed":"120003.0","AVGelapsed":"10.19","daoMethodName":"queryPersonalIncomeTaxByDeclareIdList","daoName":"PersonalIncomeTaxMapper"},{"COUNT无":"1065","MAXelapsed":"206.0","AVGelapsed":"8.36","daoMethodName":"queryPersonalIncomeTaxByMonth","daoName":"PersonalIncomeTaxMapper"},{"COUNT无":"467","MAXelapsed":"198.0","AVGelapsed":"11.08","daoMethodName":"insert","daoName":"PersonalIncomeTaxMapper"},{"COUNT无":"302","MAXelapsed":"104.0","AVGelapsed":"14.41","daoMethodName":"queryPersonalIncomeTaxPage","daoName":"PersonalIncomeTaxMapper"},{"COUNT无":"72","MAXelapsed":"31.0","AVGelapsed":"11.54","daoMethodName":"updateByPrimaryKeySelective","daoName":"PersonalIncomeTaxMapper"},{"COUNT无":"66725","MAXelapsed":"120003.0","AVGelapsed":"25.42","daoMethodName":"queryPayrollRawByExcelCacheId","daoName":"PayrollRawMapper"},{"COUNT无":"24084","MAXelapsed":"318.0","AVGelapsed":"15.95","daoMethodName":"updateByPrimaryKeySelective","daoName":"PayrollRawMapper"},{"COUNT无":"12537","MAXelapsed":"217.0","AVGelapsed":"10.18","daoMethodName":"insert","daoName":"PayrollRawMapper"},{"COUNT无":"44895","MAXelapsed":"438.0","AVGelapsed":"9.4","daoMethodName":"queryComputeRule","daoName":"StiSalaryRulesMapper"},{"COUNT无":"9447","MAXelapsed":"120002.0","AVGelapsed":"29.74","daoMethodName":"insertIgnore","daoName":"StiSalaryRulesMapper"},{"COUNT无":"1955","MAXelapsed":"50.0","AVGelapsed":"16.19","daoMethodName":"updateByRuleId","daoName":"StiSalaryRulesMapper"},{"COUNT无":"20282","MAXelapsed":"191.0","AVGelapsed":"8.6","daoMethodName":"selectBeEmployee","daoName":"EmployeeProbationMapper"},{"COUNT无":"15598","MAXelapsed":"152.0","AVGelapsed":"9.13","daoMethodName":"deleteByCompanyIdAndEmployeeIdList","daoName":"EmployeeProbationMapper"},{"COUNT无":"13258","MAXelapsed":"153.0","AVGelapsed":"5.88","daoMethodName":"getProbation","daoName":"EmployeeProbationMapper"},{"COUNT无":"253","MAXelapsed":"35.0","AVGelapsed":"9.4","daoMethodName":"insert","daoName":"EmployeeProbationMapper"},{"COUNT无":"226","MAXelapsed":"31.0","AVGelapsed":"10.35","daoMethodName":"update","daoName":"EmployeeProbationMapper"},{"COUNT无":"20316","MAXelapsed":"150.0","AVGelapsed":"8.86","daoMethodName":"selectBeDimissionCount","daoName":"EmployeeDimissionMapper"},{"COUNT无":"11937","MAXelapsed":"216.0","AVGelapsed":"6.28","daoMethodName":"selectByCompanyIdAndEmployeeIdList","daoName":"EmployeeDimissionMapper"},{"COUNT无":"8628","MAXelapsed":"805640.0","AVGelapsed":"104.13","daoMethodName":"listDimissionInfo","daoName":"EmployeeDimissionMapper"},{"COUNT无":"1940","MAXelapsed":"205.0","AVGelapsed":"9.24","daoMethodName":"insert","daoName":"EmployeeDimissionMapper"},{"COUNT无":"1671","MAXelapsed":"7601.0","AVGelapsed":"42.14","daoMethodName":"deleteDimission","daoName":"EmployeeDimissionMapper"},{"COUNT无":"824","MAXelapsed":"92.0","AVGelapsed":"9.28","daoMethodName":"updateByEmployeeIdSelective","daoName":"EmployeeDimissionMapper"},{"COUNT无":"200","MAXelapsed":"44.0","AVGelapsed":"10.19","daoMethodName":"updateByPrimaryKey","daoName":"EmployeeDimissionMapper"},{"COUNT无":"43","MAXelapsed":"30.0","AVGelapsed":"13.16","daoMethodName":"selectDimissionExport","daoName":"EmployeeDimissionMapper"},{"COUNT无":"2","MAXelapsed":"33.0","AVGelapsed":"22.0","daoMethodName":"updateByCompanyIdAndEmployeeIdSelective","daoName":"EmployeeDimissionMapper"},{"COUNT无":"43414","MAXelapsed":"479.0","AVGelapsed":"9.17","daoMethodName":"selectEmployeeEducationDetail","daoName":"EmployeeEducationExperienceMapper"},{"COUNT无":"742","MAXelapsed":"7539.0","AVGelapsed":"83.11","daoMethodName":"deleteEducationList","daoName":"EmployeeEducationExperienceMapper"},{"COUNT无":"416","MAXelapsed":"93.0","AVGelapsed":"10.71","daoMethodName":"updateByPrimaryKeySelective","daoName":"EmployeeEducationExperienceMapper"},{"COUNT无":"90","MAXelapsed":"29.0","AVGelapsed":"9.83","daoMethodName":"insert","daoName":"EmployeeEducationExperienceMapper"},{"COUNT无":"43414","MAXelapsed":"184.0","AVGelapsed":"8.64","daoMethodName":"selectByEmployeeId","daoName":"EmployeeFamilyMemberMapper"},{"COUNT无":"742","MAXelapsed":"7492.0","AVGelapsed":"81.01","daoMethodName":"deleteByEmployeeId","daoName":"EmployeeFamilyMemberMapper"},{"COUNT无":"227","MAXelapsed":"33.0","AVGelapsed":"11.46","daoMethodName":"update","daoName":"EmployeeFamilyMemberMapper"},{"COUNT无":"71","MAXelapsed":"20.0","AVGelapsed":"9.87","daoMethodName":"insertSelective","daoName":"EmployeeFamilyMemberMapper"},{"COUNT无":"2","MAXelapsed":"9.0","AVGelapsed":"8.5","daoMethodName":"deleteByMemberIds","daoName":"EmployeeFamilyMemberMapper"},{"COUNT无":"43414","MAXelapsed":"189.0","AVGelapsed":"8.71","daoMethodName":"selectByEmployeeId","daoName":"EmployeeWorkExperienceMapper"},{"COUNT无":"742","MAXelapsed":"7593.0","AVGelapsed":"80.67","daoMethodName":"deleteByEmployeeId","daoName":"EmployeeWorkExperienceMapper"},{"COUNT无":"167","MAXelapsed":"30.0","AVGelapsed":"10.7","daoMethodName":"update","daoName":"EmployeeWorkExperienceMapper"},{"COUNT无":"51","MAXelapsed":"24.0","AVGelapsed":"9.37","daoMethodName":"insert","daoName":"EmployeeWorkExperienceMapper"},{"COUNT无":"44156","MAXelapsed":"145.0","AVGelapsed":"8.61","daoMethodName":"getByEmployeeId","daoName":"EmployeePersonnelDocumentMapper"},{"COUNT无":"52","MAXelapsed":"23.0","AVGelapsed":"10.35","daoMethodName":"update","daoName":"EmployeePersonnelDocumentMapper"}]},"服务异常统计":{"heads":["serviceAppName","serviceName","serviceMethodName","COUNT无","MAXelapsed","AVGelapsed"],"headMap":{"COUNT无":"总量","MAXelapsed":"最大耗时","AVGelapsed":"平均耗时","serviceMethodName":"方法名","serviceAppName":"应用名","serviceName":"接口名"},"dataMapList":[{"COUNT无":"1009","MAXelapsed":"806665.0","AVGelapsed":"119625.84","serviceMethodName":"queryRelationList","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"307","MAXelapsed":"120468.0","AVGelapsed":"118630.82","serviceMethodName":"queryWebUserByOpenId","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"31","MAXelapsed":"805641.0","AVGelapsed":"142128.29","serviceMethodName":"queryUserConfig","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"215","MAXelapsed":"805641.0","AVGelapsed":"124103.33","serviceMethodName":"queryEmployeePayrollList","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"20","MAXelapsed":"199408.0","AVGelapsed":"84833.1","serviceMethodName":"queryEmployeePayrollDetailList","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"2","MAXelapsed":"120001.0","AVGelapsed":"60010.0","serviceMethodName":"updatePayrollOrDetail","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"145","MAXelapsed":"805641.0","AVGelapsed":"122129.1","serviceMethodName":"statisticsTodolist","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"1","MAXelapsed":"120007.0","AVGelapsed":"120007.0","serviceMethodName":"getTodolistItem","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"38","MAXelapsed":"4400.0","AVGelapsed":"634.34","serviceMethodName":"saveDeclarationInfo","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"33","MAXelapsed":"173976.0","AVGelapsed":"93171.42","serviceMethodName":"queryEmployeeTaxBillDetail","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"2","MAXelapsed":"120003.0","AVGelapsed":"60008.0","serviceMethodName":"statisticalEmployeeTaxBill","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"1","MAXelapsed":"120008.0","AVGelapsed":"120008.0","serviceMethodName":"saveComputeRule","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"26","MAXelapsed":"29.0","AVGelapsed":"14.5","serviceMethodName":"saveEmployeeReportFeedback","serviceAppName":"gaia","serviceName":"DeductionApi"},{"COUNT无":"6","MAXelapsed":"57.0","AVGelapsed":"49.17","serviceMethodName":"saveAdditionalDTOFromG2","serviceAppName":"gaia","serviceName":"DeductionApi"},{"COUNT无":"3","MAXelapsed":"120005.0","AVGelapsed":"80012.0","serviceMethodName":"addSerial","serviceAppName":"gaia","serviceName":"DeductionApi"},{"COUNT无":"34","MAXelapsed":"120014.0","AVGelapsed":"110828.71","serviceMethodName":"compute","serviceAppName":"gaia","serviceName":"TaxV2Api"},{"COUNT无":"33","MAXelapsed":"186.0","AVGelapsed":"62.94","serviceMethodName":"savePayrollRaw","serviceAppName":"gaia","serviceName":"PayrollRawApi"},{"COUNT无":"13","MAXelapsed":"120008.0","AVGelapsed":"110773.31","serviceMethodName":"chooseDefaultCompany","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"10","MAXelapsed":"120002.0","AVGelapsed":"120001.2","serviceMethodName":"updateSubscribeStatus","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"2","MAXelapsed":"120013.0","AVGelapsed":"60028.0","serviceMethodName":"wechatBind","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"4","MAXelapsed":"120003.0","AVGelapsed":"120001.5","serviceMethodName":"getPreferPayrollName","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"4","MAXelapsed":"120015.0","AVGelapsed":"120007.0","serviceMethodName":"queryPayrollInfo","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"1","MAXelapsed":"120001.0","AVGelapsed":"120001.0","serviceMethodName":"getPayrollInfo","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"1","MAXelapsed":"120001.0","AVGelapsed":"120001.0","serviceMethodName":"getPayrollRule","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"1","MAXelapsed":"120008.0","AVGelapsed":"120008.0","serviceMethodName":"queryHasPayrollMonth","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"9","MAXelapsed":"120003.0","AVGelapsed":"120002.33","serviceMethodName":"getPayrollInfo","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"2","MAXelapsed":"120011.0","AVGelapsed":"120006.0","serviceMethodName":"queryPayrollDetail","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"3","MAXelapsed":"120026.0","AVGelapsed":"120014.67","serviceMethodName":"statistic","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"2","MAXelapsed":"120004.0","AVGelapsed":"100195.0","serviceMethodName":"queryDeductEmployee","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"1","MAXelapsed":"120004.0","AVGelapsed":"120004.0","serviceMethodName":"countUnsyncEmployee","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"1","MAXelapsed":"805644.0","AVGelapsed":"805644.0","serviceMethodName":"queryEmployeeByEmployeeId","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"1","MAXelapsed":"120024.0","AVGelapsed":"120024.0","serviceMethodName":"queryPageByCondition","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"2","MAXelapsed":"120017.0","AVGelapsed":"120009.0","serviceMethodName":"addEmployee","serviceAppName":"gaia","serviceName":"EmployeeApi"},{"COUNT无":"1","MAXelapsed":"216.0","AVGelapsed":"216.0","serviceMethodName":"addEmployeeList","serviceAppName":"gaia","serviceName":"EmployeeApi"},{"COUNT无":"1","MAXelapsed":"120006.0","AVGelapsed":"120006.0","serviceMethodName":"getRemindDaysByCompanyId","serviceAppName":"gaia","serviceName":"EmployeeApi"},{"COUNT无":"1","MAXelapsed":"120005.0","AVGelapsed":"120005.0","serviceMethodName":"updateEmployee","serviceAppName":"gaia","serviceName":"EmployeeApi"},{"COUNT无":"2","MAXelapsed":"120003.0","AVGelapsed":"60008.5","serviceMethodName":"getByCompanyId","serviceAppName":"gaia","serviceName":"EmployeeDepartmentApi"},{"COUNT无":"2","MAXelapsed":"120017.0","AVGelapsed":"120014.0","serviceMethodName":"addEntranceEmployee","serviceAppName":"gaia","serviceName":"EmployeeEntranceApi"},{"COUNT无":"1","MAXelapsed":"120003.0","AVGelapsed":"120003.0","serviceMethodName":"scopeStatistics","serviceAppName":"gaia","serviceName":"DeductionQueryApi"},{"COUNT无":"1","MAXelapsed":"805649.0","AVGelapsed":"805649.0","serviceMethodName":"queryDimission","serviceAppName":"gaia","serviceName":"EmployeeDimissionApi"}]},"服务统计报表":{"heads":["serviceAppName","serviceName","serviceMethodName","COUNT无","MAXelapsed","AVGelapsed"],"headMap":{"COUNT无":"总量","MAXelapsed":"最大耗时","AVGelapsed":"平均耗时","serviceMethodName":"方法名","serviceAppName":"应用名","serviceName":"接口名"},"dataMapList":[{"COUNT无":"1182835","MAXelapsed":"806665.0","AVGelapsed":"117.21","serviceMethodName":"queryRelationList","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"666701","MAXelapsed":"826.0","AVGelapsed":"2.57","serviceMethodName":"queryWebUserById","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"601465","MAXelapsed":"120468.0","AVGelapsed":"72.84","serviceMethodName":"queryWebUserByOpenId","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"587435","MAXelapsed":"1108.0","AVGelapsed":"2.41","serviceMethodName":"isWechatPass","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"583442","MAXelapsed":"805641.0","AVGelapsed":"22.27","serviceMethodName":"queryUserConfig","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"3151","MAXelapsed":"784.0","AVGelapsed":"42.63","serviceMethodName":"queryEmployeeWechatMap","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"405","MAXelapsed":"444.0","AVGelapsed":"9.4","serviceMethodName":"queryWebUserByMobile","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"680885","MAXelapsed":"805641.0","AVGelapsed":"66.32","serviceMethodName":"queryEmployeePayrollList","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"187869","MAXelapsed":"199408.0","AVGelapsed":"34.97","serviceMethodName":"queryEmployeePayrollDetailList","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"113276","MAXelapsed":"120001.0","AVGelapsed":"28.57","serviceMethodName":"updatePayrollOrDetail","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"6123","MAXelapsed":"1923.0","AVGelapsed":"60.99","serviceMethodName":"queryPayrollAndDetail","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"5558","MAXelapsed":"467.0","AVGelapsed":"17.05","serviceMethodName":"savePayrollRule","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"5553","MAXelapsed":"2551.0","AVGelapsed":"93.73","serviceMethodName":"savePayroll","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"1615","MAXelapsed":"1580.0","AVGelapsed":"219.43","serviceMethodName":"deletePayroll","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"280","MAXelapsed":"870.0","AVGelapsed":"176.39","serviceMethodName":"repealPayrollDetail","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"110","MAXelapsed":"379.0","AVGelapsed":"25.07","serviceMethodName":"queryPayrollByDetailId","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"81235","MAXelapsed":"120026.0","AVGelapsed":"64.33","serviceMethodName":"statistic","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"54905","MAXelapsed":"120024.0","AVGelapsed":"31.05","serviceMethodName":"queryPageByCondition","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"51532","MAXelapsed":"2737.0","AVGelapsed":"26.03","serviceMethodName":"queryAllEmployeeByCompanyId","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"49320","MAXelapsed":"120004.0","AVGelapsed":"45.95","serviceMethodName":"countUnsyncEmployee","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"43419","MAXelapsed":"805644.0","AVGelapsed":"63.45","serviceMethodName":"queryEmployeeByEmployeeId","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"25830","MAXelapsed":"407.0","AVGelapsed":"12.71","serviceMethodName":"queryAllEmployeeByEmployeeIds","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"6778","MAXelapsed":"120004.0","AVGelapsed":"61.78","serviceMethodName":"queryDeductEmployee","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"1771","MAXelapsed":"697.0","AVGelapsed":"13.33","serviceMethodName":"queryToSyncEmployee","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"857","MAXelapsed":"418.0","AVGelapsed":"15.01","serviceMethodName":"queryEmployeeByCompanyId","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"563","MAXelapsed":"469.0","AVGelapsed":"28.15","serviceMethodName":"contractStat","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"557","MAXelapsed":"828.0","AVGelapsed":"18.73","serviceMethodName":"getByCompanyIdWithoutDimission","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"261581","MAXelapsed":"805641.0","AVGelapsed":"83.32","serviceMethodName":"statisticsTodolist","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"30017","MAXelapsed":"482.0","AVGelapsed":"11.04","serviceMethodName":"queryTodolist","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"1974","MAXelapsed":"120007.0","AVGelapsed":"71.22","serviceMethodName":"getTodolistItem","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"206","MAXelapsed":"101.0","AVGelapsed":"47.5","serviceMethodName":"dealTodolist","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"36","MAXelapsed":"377.0","AVGelapsed":"102.17","serviceMethodName":"createTodolistItemByMaintainNotice","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"262400","MAXelapsed":"1039.0","AVGelapsed":"2.68","serviceMethodName":"queryClientServiceList","serviceAppName":"gaia","serviceName":"SelfServiceApi"},{"COUNT无":"5529","MAXelapsed":"486.0","AVGelapsed":"2.73","serviceMethodName":"queryBusinessServiceList","serviceAppName":"gaia","serviceName":"SelfServiceApi"},{"COUNT无":"155","MAXelapsed":"38.0","AVGelapsed":"5.72","serviceMethodName":"queryOrderCount","serviceAppName":"gaia","serviceName":"SelfServiceApi"},{"COUNT无":"27","MAXelapsed":"40.0","AVGelapsed":"32.41","serviceMethodName":"orderSelfService","serviceAppName":"gaia","serviceName":"SelfServiceApi"},{"COUNT无":"113379","MAXelapsed":"173976.0","AVGelapsed":"64.86","serviceMethodName":"queryEmployeeTaxBillDetail","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"32319","MAXelapsed":"478.0","AVGelapsed":"9.61","serviceMethodName":"queryComputeRule","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"25136","MAXelapsed":"1651.0","AVGelapsed":"28.83","serviceMethodName":"queryEmployeeTaxBill","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"9238","MAXelapsed":"120003.0","AVGelapsed":"34.55","serviceMethodName":"statisticalEmployeeTaxBill","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"3469","MAXelapsed":"120008.0","AVGelapsed":"61.12","serviceMethodName":"saveComputeRule","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"541","MAXelapsed":"4400.0","AVGelapsed":"175.48","serviceMethodName":"saveDeclarationInfo","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"523","MAXelapsed":"1119.0","AVGelapsed":"43.65","serviceMethodName":"getTaxBill","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"301","MAXelapsed":"550.0","AVGelapsed":"34.24","serviceMethodName":"statisticPushTaxBill","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"120","MAXelapsed":"212.0","AVGelapsed":"33.74","serviceMethodName":"queryPushTaxDetail","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"63738","MAXelapsed":"120015.0","AVGelapsed":"23.43","serviceMethodName":"queryPayrollInfo","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"28243","MAXelapsed":"1007.0","AVGelapsed":"21.69","serviceMethodName":"queryPayrollDetail","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"23860","MAXelapsed":"120001.0","AVGelapsed":"14.83","serviceMethodName":"getPayrollInfo","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"12293","MAXelapsed":"120001.0","AVGelapsed":"20.33","serviceMethodName":"getPayrollRule","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"11761","MAXelapsed":"120003.0","AVGelapsed":"52.52","serviceMethodName":"getPreferPayrollName","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"9431","MAXelapsed":"456.0","AVGelapsed":"10.31","serviceMethodName":"getPayrollStatistics","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"9350","MAXelapsed":"529.0","AVGelapsed":"10.01","serviceMethodName":"getEmpIdList","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"8424","MAXelapsed":"120008.0","AVGelapsed":"24.14","serviceMethodName":"queryHasPayrollMonth","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"3252","MAXelapsed":"1054.0","AVGelapsed":"53.67","serviceMethodName":"queryPayrollDetailByPayrollIdList","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"180","MAXelapsed":"32.0","AVGelapsed":"17.61","serviceMethodName":"removePayrollRule","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"12","MAXelapsed":"16.0","AVGelapsed":"11.25","serviceMethodName":"getTaxMonthRange","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"58684","MAXelapsed":"120003.0","AVGelapsed":"28.15","serviceMethodName":"getPayrollInfo","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"51264","MAXelapsed":"120011.0","AVGelapsed":"29.4","serviceMethodName":"queryPayrollDetail","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"36124","MAXelapsed":"538.0","AVGelapsed":"9.52","serviceMethodName":"getEmpIdList","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"7942","MAXelapsed":"13702.0","AVGelapsed":"64.3","serviceMethodName":"getPayrollInfoRepeat","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"7043","MAXelapsed":"520.0","AVGelapsed":"10.48","serviceMethodName":"getEmpIdSetByExcelCacheIds","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"64263","MAXelapsed":"505.0","AVGelapsed":"2.5","serviceMethodName":"saveWechatPassValidation","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"9272","MAXelapsed":"547.0","AVGelapsed":"46.79","serviceMethodName":"addCompanyRelation","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"8557","MAXelapsed":"120013.0","AVGelapsed":"83.29","serviceMethodName":"wechatBind","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"7479","MAXelapsed":"923.0","AVGelapsed":"25.91","serviceMethodName":"saveUserConfig","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"6916","MAXelapsed":"120002.0","AVGelapsed":"218.1","serviceMethodName":"updateSubscribeStatus","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"6365","MAXelapsed":"120008.0","AVGelapsed":"254.3","serviceMethodName":"chooseDefaultCompany","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"1206","MAXelapsed":"427.0","AVGelapsed":"27.69","serviceMethodName":"setWechatPassword","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"726","MAXelapsed":"432.0","AVGelapsed":"33.97","serviceMethodName":"wechatUnBind","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"272","MAXelapsed":"242.0","AVGelapsed":"57.33","serviceMethodName":"removeCompany","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"228","MAXelapsed":"94364.0","AVGelapsed":"445.74","serviceMethodName":"h5LoginIncludeRegister","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"114","MAXelapsed":"62.0","AVGelapsed":"24.92","serviceMethodName":"setH5Password","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"1","MAXelapsed":"49.0","AVGelapsed":"49.0","serviceMethodName":"certificateCompany","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"41962","MAXelapsed":"237.0","AVGelapsed":"1.08","serviceMethodName":"queryBusinessParameterValue","serviceAppName":"gaia","serviceName":"BusinessParameterApi"},{"COUNT无":"23762","MAXelapsed":"118.0","AVGelapsed":"4.8","serviceMethodName":"queryBusinessParameter","serviceAppName":"gaia","serviceName":"BusinessParameterApi"},{"COUNT无":"18343","MAXelapsed":"1176.0","AVGelapsed":"68.07","serviceMethodName":"queryHaveAdditionalSnapshootEmployeeIdList","serviceAppName":"gaia","serviceName":"SnapshootQueryApi"},{"COUNT无":"11969","MAXelapsed":"498.0","AVGelapsed":"10.4","serviceMethodName":"queryCompanyHaveAccumulativeMonthList","serviceAppName":"gaia","serviceName":"SnapshootQueryApi"},{"COUNT无":"11946","MAXelapsed":"520.0","AVGelapsed":"10.93","serviceMethodName":"queryHaveAccumulativeEmployeeIdList","serviceAppName":"gaia","serviceName":"SnapshootQueryApi"},{"COUNT无":"9351","MAXelapsed":"803.0","AVGelapsed":"16.88","serviceMethodName":"queryEmployeeAccumulativeInfo","serviceAppName":"gaia","serviceName":"SnapshootQueryApi"},{"COUNT无":"6180","MAXelapsed":"2648.0","AVGelapsed":"86.59","serviceMethodName":"queryAdditionalSpecialDeduct","serviceAppName":"gaia","serviceName":"SnapshootQueryApi"},{"COUNT无":"17798","MAXelapsed":"50247.0","AVGelapsed":"330.3","serviceMethodName":"updatePayrollDetail","serviceAppName":"gaia","serviceName":"PayrollRawApi"},{"COUNT无":"17622","MAXelapsed":"448.0","AVGelapsed":"19.91","serviceMethodName":"updatePayrollInfo","serviceAppName":"gaia","serviceName":"PayrollRawApi"},{"COUNT无":"12559","MAXelapsed":"4114.0","AVGelapsed":"106.41","serviceMethodName":"savePayrollRaw","serviceAppName":"gaia","serviceName":"PayrollRawApi"},{"COUNT无":"8929","MAXelapsed":"21019.0","AVGelapsed":"330.99","serviceMethodName":"matchPayrollRawEmployee","serviceAppName":"gaia","serviceName":"PayrollRawApi"},{"COUNT无":"53123","MAXelapsed":"805.0","AVGelapsed":"2.75","serviceMethodName":"getFunctionLimitByLocationCode","serviceAppName":"gaia","serviceName":"FunctionLimitApi"},{"COUNT无":"43158","MAXelapsed":"120003.0","AVGelapsed":"16.07","serviceMethodName":"getByCompanyId","serviceAppName":"gaia","serviceName":"EmployeeDepartmentApi"},{"COUNT无":"256","MAXelapsed":"199.0","AVGelapsed":"24.8","serviceMethodName":"addDepartment","serviceAppName":"gaia","serviceName":"EmployeeDepartmentApi"},{"COUNT无":"103","MAXelapsed":"69.0","AVGelapsed":"6.15","serviceMethodName":"getSubDepartments","serviceAppName":"gaia","serviceName":"EmployeeDepartmentApi"},{"COUNT无":"44","MAXelapsed":"62.0","AVGelapsed":"29.55","serviceMethodName":"updateDepartment","serviceAppName":"gaia","serviceName":"EmployeeDepartmentApi"},{"COUNT无":"3","MAXelapsed":"137.0","AVGelapsed":"70.67","serviceMethodName":"deleteDepartment","serviceAppName":"gaia","serviceName":"EmployeeDepartmentApi"},{"COUNT无":"42752","MAXelapsed":"12908.0","AVGelapsed":"9.06","serviceMethodName":"selectByCompanyId","serviceAppName":"gaia","serviceName":"EmployeePositionApi"},{"COUNT无":"265","MAXelapsed":"307.0","AVGelapsed":"49.72","serviceMethodName":"addPosition","serviceAppName":"gaia","serviceName":"EmployeePositionApi"},{"COUNT无":"40","MAXelapsed":"139.0","AVGelapsed":"100.38","serviceMethodName":"updatePosition","serviceAppName":"gaia","serviceName":"EmployeePositionApi"},{"COUNT无":"9","MAXelapsed":"139.0","AVGelapsed":"73.44","serviceMethodName":"deletePosition","serviceAppName":"gaia","serviceName":"EmployeePositionApi"},{"COUNT无":"30622","MAXelapsed":"272.0","AVGelapsed":"4.32","serviceMethodName":"getEmployees","serviceAppName":"gaia","serviceName":"GaiaEmployeeApi"},{"COUNT无":"9496","MAXelapsed":"457.0","AVGelapsed":"6.62","serviceMethodName":"getEmployeeList","serviceAppName":"gaia","serviceName":"GaiaEmployeeApi"},{"COUNT无":"1581","MAXelapsed":"1419.0","AVGelapsed":"24.35","serviceMethodName":"getByName","serviceAppName":"gaia","serviceName":"GaiaEmployeeApi"},{"COUNT无":"22505","MAXelapsed":"120005.0","AVGelapsed":"28.21","serviceMethodName":"addSerial","serviceAppName":"gaia","serviceName":"DeductionApi"},{"COUNT无":"5778","MAXelapsed":"649.0","AVGelapsed":"101.95","serviceMethodName":"deleteAllAdditionalInPhysical","serviceAppName":"gaia","serviceName":"DeductionApi"},{"COUNT无":"5630","MAXelapsed":"6005.0","AVGelapsed":"204.76","serviceMethodName":"saveAdditionalDTOFromG2","serviceAppName":"gaia","serviceName":"DeductionApi"}]}}
     */

    private HeadBean head;

    private BodyBean body;

    public HeadBean getHead() {
        return head;
    }

    public void setHead(HeadBean head) {
        this.head = head;
    }

    public BodyBean getBody() {
        return body;
    }

    public void setBody(BodyBean body) {
        this.body = body;
    }

    public static class HeadBean {
        /**
         * code : 00000000 description : 成功 msg : 成功 time : 2019-07-05 16:20:36 status : Y
         */

        private String code;

        private String description;

        private String msg;

        private String time;

        private String status;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    public static class BodyBean {
        /**
         * 数据访问层异常统计 : {"heads":["daoName","daoMethodName","COUNT无","MAXelapsed","AVGelapsed"],"headMap":{"COUNT无":"总量","MAXelapsed":"最大耗时","AVGelapsed":"平均耗时","daoMethodName":"方法名","daoName":"类名"},"dataMapList":[{"COUNT无":"1009","MAXelapsed":"806665.0","AVGelapsed":"119623.45","daoMethodName":"findByWebUserId","daoName":"WebMobileRelationMapper"},{"COUNT无":"308","MAXelapsed":"120468.0","AVGelapsed":"118631.29","daoMethodName":"queryWebUser","daoName":"WebUserMapper"},{"COUNT无":"1","MAXelapsed":"18.0","AVGelapsed":"18.0","daoMethodName":"insertSelective","daoName":"WebUserMapper"},{"COUNT无":"1","MAXelapsed":"15.0","AVGelapsed":"15.0","daoMethodName":"updateByPrimaryKeySelective","daoName":"WebUserMapper"},{"COUNT无":"208","MAXelapsed":"805639.0","AVGelapsed":"123058.4","daoMethodName":"queryPayrollDetailByEmployeeId","daoName":"PayrollDetailMapper"},{"COUNT无":"18","MAXelapsed":"120003.0","AVGelapsed":"73367.94","daoMethodName":"queryDetailByEmployeeIdAndMonthInterval","daoName":"PayrollDetailMapper"},{"COUNT无":"1","MAXelapsed":"13.0","AVGelapsed":"13.0","daoMethodName":"updatePayrollDetail","daoName":"PayrollDetailMapper"},{"COUNT无":"145","MAXelapsed":"805640.0","AVGelapsed":"122128.79","daoMethodName":"statisticsTodolist","daoName":"TodolistItemMapper"},{"COUNT无":"1","MAXelapsed":"120007.0","AVGelapsed":"120007.0","daoMethodName":"selectByPrimaryKey","daoName":"TodolistItemMapper"},{"COUNT无":"38","MAXelapsed":"3722.0","AVGelapsed":"563.66","daoMethodName":"insert","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"18","MAXelapsed":"120003.0","AVGelapsed":"107840.89","daoMethodName":"queryEmployeesTaxBill","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"33","MAXelapsed":"144.0","AVGelapsed":"41.12","daoMethodName":"insert","daoName":"PayrollRawDetailMapper"},{"COUNT无":"2","MAXelapsed":"120001.0","AVGelapsed":"120001.0","daoMethodName":"queryPayrollDetail","daoName":"PayrollRawDetailMapper"},{"COUNT无":"34","MAXelapsed":"120005.0","AVGelapsed":"110825.24","daoMethodName":"insert","daoName":"BonusPersonalMapper"},{"COUNT无":"31","MAXelapsed":"805639.0","AVGelapsed":"142118.9","daoMethodName":"findByWebUserId","daoName":"WechatConfigMapper"},{"COUNT无":"12","MAXelapsed":"805643.0","AVGelapsed":"153195.5","daoMethodName":"selectByEmployeeId","daoName":"EmployeeMapper"},{"COUNT无":"2","MAXelapsed":"120001.0","AVGelapsed":"120001.0","daoMethodName":"selectAllByCompanyId","daoName":"EmployeeMapper"},{"COUNT无":"2","MAXelapsed":"120001.0","AVGelapsed":"120001.0","daoMethodName":"selectByCondition","daoName":"EmployeeMapper"},{"COUNT无":"2","MAXelapsed":"120004.0","AVGelapsed":"100189.5","daoMethodName":"selectByOtherCondition","daoName":"EmployeeMapper"},{"COUNT无":"1","MAXelapsed":"80.0","AVGelapsed":"80.0","daoMethodName":"insert","daoName":"EmployeeMapper"},{"COUNT无":"9","MAXelapsed":"120003.0","AVGelapsed":"120002.78","daoMethodName":"queryPayrollByPayrollIdList","daoName":"PayrollMapper"},{"COUNT无":"4","MAXelapsed":"120006.0","AVGelapsed":"120003.0","daoMethodName":"queryPayrollByCondition","daoName":"PayrollMapper"},{"COUNT无":"4","MAXelapsed":"120002.0","AVGelapsed":"120001.25","daoMethodName":"queryPayrollByMonth","daoName":"PayrollMapper"},{"COUNT无":"1","MAXelapsed":"120002.0","AVGelapsed":"120002.0","daoMethodName":"queryHasPayrollMonth","daoName":"PayrollMapper"},{"COUNT无":"1","MAXelapsed":"120001.0","AVGelapsed":"120001.0","daoMethodName":"queryPayrollByPayrollId","daoName":"PayrollMapper"},{"COUNT无":"9","MAXelapsed":"120003.0","AVGelapsed":"120002.22","daoMethodName":"queryPayrollRawByExcelCacheId","daoName":"PayrollRawMapper"},{"COUNT无":"6","MAXelapsed":"15.0","AVGelapsed":"13.67","daoMethodName":"insert","daoName":"DeductionLoanMapper"},{"COUNT无":"3","MAXelapsed":"120001.0","AVGelapsed":"80009.67","daoMethodName":"insert","daoName":"DeductionSerialMapper"},{"COUNT无":"3","MAXelapsed":"120002.0","AVGelapsed":"120001.33","daoMethodName":"selectByCompanyId","daoName":"RemindDaysMapper"},{"COUNT无":"2","MAXelapsed":"120001.0","AVGelapsed":"60007.0","daoMethodName":"selectByCompanyId","daoName":"EmployeeDepartmentMapper"},{"COUNT无":"1","MAXelapsed":"805640.0","AVGelapsed":"805640.0","daoMethodName":"listDimissionInfo","daoName":"EmployeeDimissionMapper"},{"COUNT无":"1","MAXelapsed":"120001.0","AVGelapsed":"120001.0","daoMethodName":"getPayrollRule","daoName":"PayrollRuleMapper"},{"COUNT无":"1","MAXelapsed":"120003.0","AVGelapsed":"120003.0","daoMethodName":"queryPersonalIncomeTaxByDeclareIdList","daoName":"PersonalIncomeTaxMapper"},{"COUNT无":"1","MAXelapsed":"120002.0","AVGelapsed":"120002.0","daoMethodName":"insertIgnore","daoName":"StiSalaryRulesMapper"}]}
         * 数据访问层统计 : {"heads":["daoName","daoMethodName","COUNT无","MAXelapsed","AVGelapsed"],"headMap":{"COUNT无":"总量","MAXelapsed":"最大耗时","AVGelapsed":"平均耗时","daoMethodName":"方法名","daoName":"类名"},"dataMapList":[{"COUNT无":"681277","MAXelapsed":"805639.0","AVGelapsed":"53.55","daoMethodName":"queryPayrollDetailByEmployeeId","daoName":"PayrollDetailMapper"},{"COUNT无":"187958","MAXelapsed":"120003.0","AVGelapsed":"22.79","daoMethodName":"queryDetailByEmployeeIdAndMonthInterval","daoName":"PayrollDetailMapper"},{"COUNT无":"113665","MAXelapsed":"9682.0","AVGelapsed":"15.2","daoMethodName":"updatePayrollDetail","daoName":"PayrollDetailMapper"},{"COUNT无":"28252","MAXelapsed":"886.0","AVGelapsed":"20.35","daoMethodName":"queryPayrollDetail","daoName":"PayrollDetailMapper"},{"COUNT无":"9438","MAXelapsed":"389.0","AVGelapsed":"9.83","daoMethodName":"statistics","daoName":"PayrollDetailMapper"},{"COUNT无":"9355","MAXelapsed":"244.0","AVGelapsed":"9.44","daoMethodName":"getEmpIdList","daoName":"PayrollDetailMapper"},{"COUNT无":"7940","MAXelapsed":"13688.0","AVGelapsed":"51.39","daoMethodName":"getRepeatPayrollEmployee","daoName":"PayrollDetailMapper"},{"COUNT无":"6407","MAXelapsed":"1556.0","AVGelapsed":"27.47","daoMethodName":"queryPayrollDetailByPage","daoName":"PayrollDetailMapper"},{"COUNT无":"5554","MAXelapsed":"2227.0","AVGelapsed":"58.43","daoMethodName":"insert","daoName":"PayrollDetailMapper"},{"COUNT无":"3253","MAXelapsed":"887.0","AVGelapsed":"47.87","daoMethodName":"queryPayrollDetailByPayrollIdList","daoName":"PayrollDetailMapper"},{"COUNT无":"1506","MAXelapsed":"337.0","AVGelapsed":"17.51","daoMethodName":"updateByPayrollIdUnvalid","daoName":"PayrollDetailMapper"},{"COUNT无":"1391","MAXelapsed":"619.0","AVGelapsed":"20.98","daoMethodName":"checkPayrollDelete","daoName":"PayrollDetailMapper"},{"COUNT无":"1362","MAXelapsed":"303.0","AVGelapsed":"29.06","daoMethodName":"getInvidualPayrollEmployeeIdList","daoName":"PayrollDetailMapper"},{"COUNT无":"386","MAXelapsed":"77.0","AVGelapsed":"7.47","daoMethodName":"getSalaryEmpIdList","daoName":"PayrollDetailMapper"},{"COUNT无":"110","MAXelapsed":"127.0","AVGelapsed":"12.2","daoMethodName":"queryPayrollDetailByPayrollDetailId","daoName":"PayrollDetailMapper"},{"COUNT无":"850048","MAXelapsed":"120003.0","AVGelapsed":"11.87","daoMethodName":"queryPayrollByPayrollIdList","daoName":"PayrollMapper"},{"COUNT无":"66616","MAXelapsed":"120006.0","AVGelapsed":"22.35","daoMethodName":"queryPayrollByCondition","daoName":"PayrollMapper"},{"COUNT无":"34604","MAXelapsed":"120001.0","AVGelapsed":"11.88","daoMethodName":"queryPayrollByPayrollId","daoName":"PayrollMapper"},{"COUNT无":"11762","MAXelapsed":"120002.0","AVGelapsed":"51.78","daoMethodName":"queryPayrollByMonth","daoName":"PayrollMapper"},{"COUNT无":"8437","MAXelapsed":"120002.0","AVGelapsed":"23.59","daoMethodName":"queryHasPayrollMonth","daoName":"PayrollMapper"},{"COUNT无":"5552","MAXelapsed":"199.0","AVGelapsed":"11.88","daoMethodName":"saveOrUpdate","daoName":"PayrollMapper"},{"COUNT无":"2892","MAXelapsed":"341.0","AVGelapsed":"11.45","daoMethodName":"updatePayroll","daoName":"PayrollMapper"},{"COUNT无":"1506","MAXelapsed":"158.0","AVGelapsed":"10.57","daoMethodName":"updatePayrollUnvalid","daoName":"PayrollMapper"},{"COUNT无":"1425","MAXelapsed":"20.0","AVGelapsed":"6.68","daoMethodName":"queryMaxPayrollByMonth","daoName":"PayrollMapper"},{"COUNT无":"323731","MAXelapsed":"806665.0","AVGelapsed":"417.23","daoMethodName":"findByWebUserId","daoName":"WebMobileRelationMapper"},{"COUNT无":"7747","MAXelapsed":"248.0","AVGelapsed":"19.5","daoMethodName":"insertSelective","daoName":"WebMobileRelationMapper"},{"COUNT无":"6125","MAXelapsed":"307.0","AVGelapsed":"12.7","daoMethodName":"queryRelationByEmployee","daoName":"WebMobileRelationMapper"},{"COUNT无":"936","MAXelapsed":"204.0","AVGelapsed":"17.27","daoMethodName":"updateByPrimaryKeySelective","daoName":"WebMobileRelationMapper"},{"COUNT无":"317730","MAXelapsed":"805639.0","AVGelapsed":"34.49","daoMethodName":"findByWebUserId","daoName":"WechatConfigMapper"},{"COUNT无":"7482","MAXelapsed":"213.0","AVGelapsed":"13.2","daoMethodName":"insertSelective","daoName":"WechatConfigMapper"},{"COUNT无":"261707","MAXelapsed":"805640.0","AVGelapsed":"82.65","daoMethodName":"statisticsTodolist","daoName":"TodolistItemMapper"},{"COUNT无":"30035","MAXelapsed":"360.0","AVGelapsed":"10.52","daoMethodName":"queryTodolist","daoName":"TodolistItemMapper"},{"COUNT无":"2174","MAXelapsed":"120007.0","AVGelapsed":"64.44","daoMethodName":"selectByPrimaryKey","daoName":"TodolistItemMapper"},{"COUNT无":"203","MAXelapsed":"29.0","AVGelapsed":"10.89","daoMethodName":"dealTodolist","daoName":"TodolistItemMapper"},{"COUNT无":"109","MAXelapsed":"41.0","AVGelapsed":"15.84","daoMethodName":"insert","daoName":"TodolistItemMapper"},{"COUNT无":"90945","MAXelapsed":"120001.0","AVGelapsed":"36.44","daoMethodName":"selectByCondition","daoName":"EmployeeMapper"},{"COUNT无":"57312","MAXelapsed":"805643.0","AVGelapsed":"44.74","daoMethodName":"selectByEmployeeId","daoName":"EmployeeMapper"},{"COUNT无":"55750","MAXelapsed":"120001.0","AVGelapsed":"54.67","daoMethodName":"selectAllByCompanyId","daoName":"EmployeeMapper"},{"COUNT无":"20402","MAXelapsed":"23885.0","AVGelapsed":"44.21","daoMethodName":"update","daoName":"EmployeeMapper"},{"COUNT无":"10724","MAXelapsed":"3581.0","AVGelapsed":"35.92","daoMethodName":"selectByEmployeeIds","daoName":"EmployeeMapper"},{"COUNT无":"6792","MAXelapsed":"120004.0","AVGelapsed":"51.74","daoMethodName":"selectByOtherCondition","daoName":"EmployeeMapper"},{"COUNT无":"4304","MAXelapsed":"6293.0","AVGelapsed":"26.61","daoMethodName":"insert","daoName":"EmployeeMapper"},{"COUNT无":"778","MAXelapsed":"6960.0","AVGelapsed":"86.87","daoMethodName":"deleteByEmployeeId","daoName":"EmployeeMapper"},{"COUNT无":"147802","MAXelapsed":"120003.0","AVGelapsed":"31.66","daoMethodName":"queryEmployeesTaxBill","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"15710","MAXelapsed":"243.0","AVGelapsed":"16.52","daoMethodName":"updateTaxDetailSawState","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"539","MAXelapsed":"3831.0","AVGelapsed":"137.92","daoMethodName":"insert","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"526","MAXelapsed":"1092.0","AVGelapsed":"32.39","daoMethodName":"queryPersonalIncomeTaxDetailList","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"394","MAXelapsed":"123.0","AVGelapsed":"12.89","daoMethodName":"queryPushDetailCollection","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"120","MAXelapsed":"167.0","AVGelapsed":"23.27","daoMethodName":"queryGroupByIdentification","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"117","MAXelapsed":"30.0","AVGelapsed":"19.15","daoMethodName":"updateEmployeeId","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"72","MAXelapsed":"48.0","AVGelapsed":"14.38","daoMethodName":"deleteTaxDetailByDeclareId","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"116887","MAXelapsed":"120468.0","AVGelapsed":"353.97","daoMethodName":"queryWebUser","daoName":"WebUserMapper"},{"COUNT无":"15263","MAXelapsed":"413.0","AVGelapsed":"10.91","daoMethodName":"updateByPrimaryKeySelective","daoName":"WebUserMapper"},{"COUNT无":"7857","MAXelapsed":"233.0","AVGelapsed":"18.91","daoMethodName":"insertSelective","daoName":"WebUserMapper"},{"COUNT无":"2887","MAXelapsed":"373.0","AVGelapsed":"15.66","daoMethodName":"queryByIdList","daoName":"WebUserMapper"},{"COUNT无":"51294","MAXelapsed":"120001.0","AVGelapsed":"27.08","daoMethodName":"queryPayrollDetail","daoName":"PayrollRawDetailMapper"},{"COUNT无":"36153","MAXelapsed":"437.0","AVGelapsed":"9.1","daoMethodName":"getEmpIdList","daoName":"PayrollRawDetailMapper"},{"COUNT无":"26731","MAXelapsed":"49666.0","AVGelapsed":"312.47","daoMethodName":"updateByPrimaryKeySelective","daoName":"PayrollRawDetailMapper"},{"COUNT无":"12570","MAXelapsed":"3770.0","AVGelapsed":"64.2","daoMethodName":"insert","daoName":"PayrollRawDetailMapper"},{"COUNT无":"7047","MAXelapsed":"129.0","AVGelapsed":"9.73","daoMethodName":"getEmpIdSetByExcelCacheIds","daoName":"PayrollRawDetailMapper"},{"COUNT无":"130877","MAXelapsed":"120003.0","AVGelapsed":"10.19","daoMethodName":"queryPersonalIncomeTaxByDeclareIdList","daoName":"PersonalIncomeTaxMapper"},{"COUNT无":"1065","MAXelapsed":"206.0","AVGelapsed":"8.36","daoMethodName":"queryPersonalIncomeTaxByMonth","daoName":"PersonalIncomeTaxMapper"},{"COUNT无":"467","MAXelapsed":"198.0","AVGelapsed":"11.08","daoMethodName":"insert","daoName":"PersonalIncomeTaxMapper"},{"COUNT无":"302","MAXelapsed":"104.0","AVGelapsed":"14.41","daoMethodName":"queryPersonalIncomeTaxPage","daoName":"PersonalIncomeTaxMapper"},{"COUNT无":"72","MAXelapsed":"31.0","AVGelapsed":"11.54","daoMethodName":"updateByPrimaryKeySelective","daoName":"PersonalIncomeTaxMapper"},{"COUNT无":"66725","MAXelapsed":"120003.0","AVGelapsed":"25.42","daoMethodName":"queryPayrollRawByExcelCacheId","daoName":"PayrollRawMapper"},{"COUNT无":"24084","MAXelapsed":"318.0","AVGelapsed":"15.95","daoMethodName":"updateByPrimaryKeySelective","daoName":"PayrollRawMapper"},{"COUNT无":"12537","MAXelapsed":"217.0","AVGelapsed":"10.18","daoMethodName":"insert","daoName":"PayrollRawMapper"},{"COUNT无":"44895","MAXelapsed":"438.0","AVGelapsed":"9.4","daoMethodName":"queryComputeRule","daoName":"StiSalaryRulesMapper"},{"COUNT无":"9447","MAXelapsed":"120002.0","AVGelapsed":"29.74","daoMethodName":"insertIgnore","daoName":"StiSalaryRulesMapper"},{"COUNT无":"1955","MAXelapsed":"50.0","AVGelapsed":"16.19","daoMethodName":"updateByRuleId","daoName":"StiSalaryRulesMapper"},{"COUNT无":"20282","MAXelapsed":"191.0","AVGelapsed":"8.6","daoMethodName":"selectBeEmployee","daoName":"EmployeeProbationMapper"},{"COUNT无":"15598","MAXelapsed":"152.0","AVGelapsed":"9.13","daoMethodName":"deleteByCompanyIdAndEmployeeIdList","daoName":"EmployeeProbationMapper"},{"COUNT无":"13258","MAXelapsed":"153.0","AVGelapsed":"5.88","daoMethodName":"getProbation","daoName":"EmployeeProbationMapper"},{"COUNT无":"253","MAXelapsed":"35.0","AVGelapsed":"9.4","daoMethodName":"insert","daoName":"EmployeeProbationMapper"},{"COUNT无":"226","MAXelapsed":"31.0","AVGelapsed":"10.35","daoMethodName":"update","daoName":"EmployeeProbationMapper"},{"COUNT无":"20316","MAXelapsed":"150.0","AVGelapsed":"8.86","daoMethodName":"selectBeDimissionCount","daoName":"EmployeeDimissionMapper"},{"COUNT无":"11937","MAXelapsed":"216.0","AVGelapsed":"6.28","daoMethodName":"selectByCompanyIdAndEmployeeIdList","daoName":"EmployeeDimissionMapper"},{"COUNT无":"8628","MAXelapsed":"805640.0","AVGelapsed":"104.13","daoMethodName":"listDimissionInfo","daoName":"EmployeeDimissionMapper"},{"COUNT无":"1940","MAXelapsed":"205.0","AVGelapsed":"9.24","daoMethodName":"insert","daoName":"EmployeeDimissionMapper"},{"COUNT无":"1671","MAXelapsed":"7601.0","AVGelapsed":"42.14","daoMethodName":"deleteDimission","daoName":"EmployeeDimissionMapper"},{"COUNT无":"824","MAXelapsed":"92.0","AVGelapsed":"9.28","daoMethodName":"updateByEmployeeIdSelective","daoName":"EmployeeDimissionMapper"},{"COUNT无":"200","MAXelapsed":"44.0","AVGelapsed":"10.19","daoMethodName":"updateByPrimaryKey","daoName":"EmployeeDimissionMapper"},{"COUNT无":"43","MAXelapsed":"30.0","AVGelapsed":"13.16","daoMethodName":"selectDimissionExport","daoName":"EmployeeDimissionMapper"},{"COUNT无":"2","MAXelapsed":"33.0","AVGelapsed":"22.0","daoMethodName":"updateByCompanyIdAndEmployeeIdSelective","daoName":"EmployeeDimissionMapper"},{"COUNT无":"43414","MAXelapsed":"479.0","AVGelapsed":"9.17","daoMethodName":"selectEmployeeEducationDetail","daoName":"EmployeeEducationExperienceMapper"},{"COUNT无":"742","MAXelapsed":"7539.0","AVGelapsed":"83.11","daoMethodName":"deleteEducationList","daoName":"EmployeeEducationExperienceMapper"},{"COUNT无":"416","MAXelapsed":"93.0","AVGelapsed":"10.71","daoMethodName":"updateByPrimaryKeySelective","daoName":"EmployeeEducationExperienceMapper"},{"COUNT无":"90","MAXelapsed":"29.0","AVGelapsed":"9.83","daoMethodName":"insert","daoName":"EmployeeEducationExperienceMapper"},{"COUNT无":"43414","MAXelapsed":"184.0","AVGelapsed":"8.64","daoMethodName":"selectByEmployeeId","daoName":"EmployeeFamilyMemberMapper"},{"COUNT无":"742","MAXelapsed":"7492.0","AVGelapsed":"81.01","daoMethodName":"deleteByEmployeeId","daoName":"EmployeeFamilyMemberMapper"},{"COUNT无":"227","MAXelapsed":"33.0","AVGelapsed":"11.46","daoMethodName":"update","daoName":"EmployeeFamilyMemberMapper"},{"COUNT无":"71","MAXelapsed":"20.0","AVGelapsed":"9.87","daoMethodName":"insertSelective","daoName":"EmployeeFamilyMemberMapper"},{"COUNT无":"2","MAXelapsed":"9.0","AVGelapsed":"8.5","daoMethodName":"deleteByMemberIds","daoName":"EmployeeFamilyMemberMapper"},{"COUNT无":"43414","MAXelapsed":"189.0","AVGelapsed":"8.71","daoMethodName":"selectByEmployeeId","daoName":"EmployeeWorkExperienceMapper"},{"COUNT无":"742","MAXelapsed":"7593.0","AVGelapsed":"80.67","daoMethodName":"deleteByEmployeeId","daoName":"EmployeeWorkExperienceMapper"},{"COUNT无":"167","MAXelapsed":"30.0","AVGelapsed":"10.7","daoMethodName":"update","daoName":"EmployeeWorkExperienceMapper"},{"COUNT无":"51","MAXelapsed":"24.0","AVGelapsed":"9.37","daoMethodName":"insert","daoName":"EmployeeWorkExperienceMapper"},{"COUNT无":"44156","MAXelapsed":"145.0","AVGelapsed":"8.61","daoMethodName":"getByEmployeeId","daoName":"EmployeePersonnelDocumentMapper"},{"COUNT无":"52","MAXelapsed":"23.0","AVGelapsed":"10.35","daoMethodName":"update","daoName":"EmployeePersonnelDocumentMapper"}]}
         * 服务异常统计 : {"heads":["serviceAppName","serviceName","serviceMethodName","COUNT无","MAXelapsed","AVGelapsed"],"headMap":{"COUNT无":"总量","MAXelapsed":"最大耗时","AVGelapsed":"平均耗时","serviceMethodName":"方法名","serviceAppName":"应用名","serviceName":"接口名"},"dataMapList":[{"COUNT无":"1009","MAXelapsed":"806665.0","AVGelapsed":"119625.84","serviceMethodName":"queryRelationList","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"307","MAXelapsed":"120468.0","AVGelapsed":"118630.82","serviceMethodName":"queryWebUserByOpenId","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"31","MAXelapsed":"805641.0","AVGelapsed":"142128.29","serviceMethodName":"queryUserConfig","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"215","MAXelapsed":"805641.0","AVGelapsed":"124103.33","serviceMethodName":"queryEmployeePayrollList","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"20","MAXelapsed":"199408.0","AVGelapsed":"84833.1","serviceMethodName":"queryEmployeePayrollDetailList","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"2","MAXelapsed":"120001.0","AVGelapsed":"60010.0","serviceMethodName":"updatePayrollOrDetail","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"145","MAXelapsed":"805641.0","AVGelapsed":"122129.1","serviceMethodName":"statisticsTodolist","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"1","MAXelapsed":"120007.0","AVGelapsed":"120007.0","serviceMethodName":"getTodolistItem","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"38","MAXelapsed":"4400.0","AVGelapsed":"634.34","serviceMethodName":"saveDeclarationInfo","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"33","MAXelapsed":"173976.0","AVGelapsed":"93171.42","serviceMethodName":"queryEmployeeTaxBillDetail","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"2","MAXelapsed":"120003.0","AVGelapsed":"60008.0","serviceMethodName":"statisticalEmployeeTaxBill","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"1","MAXelapsed":"120008.0","AVGelapsed":"120008.0","serviceMethodName":"saveComputeRule","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"26","MAXelapsed":"29.0","AVGelapsed":"14.5","serviceMethodName":"saveEmployeeReportFeedback","serviceAppName":"gaia","serviceName":"DeductionApi"},{"COUNT无":"6","MAXelapsed":"57.0","AVGelapsed":"49.17","serviceMethodName":"saveAdditionalDTOFromG2","serviceAppName":"gaia","serviceName":"DeductionApi"},{"COUNT无":"3","MAXelapsed":"120005.0","AVGelapsed":"80012.0","serviceMethodName":"addSerial","serviceAppName":"gaia","serviceName":"DeductionApi"},{"COUNT无":"34","MAXelapsed":"120014.0","AVGelapsed":"110828.71","serviceMethodName":"compute","serviceAppName":"gaia","serviceName":"TaxV2Api"},{"COUNT无":"33","MAXelapsed":"186.0","AVGelapsed":"62.94","serviceMethodName":"savePayrollRaw","serviceAppName":"gaia","serviceName":"PayrollRawApi"},{"COUNT无":"13","MAXelapsed":"120008.0","AVGelapsed":"110773.31","serviceMethodName":"chooseDefaultCompany","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"10","MAXelapsed":"120002.0","AVGelapsed":"120001.2","serviceMethodName":"updateSubscribeStatus","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"2","MAXelapsed":"120013.0","AVGelapsed":"60028.0","serviceMethodName":"wechatBind","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"4","MAXelapsed":"120003.0","AVGelapsed":"120001.5","serviceMethodName":"getPreferPayrollName","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"4","MAXelapsed":"120015.0","AVGelapsed":"120007.0","serviceMethodName":"queryPayrollInfo","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"1","MAXelapsed":"120001.0","AVGelapsed":"120001.0","serviceMethodName":"getPayrollInfo","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"1","MAXelapsed":"120001.0","AVGelapsed":"120001.0","serviceMethodName":"getPayrollRule","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"1","MAXelapsed":"120008.0","AVGelapsed":"120008.0","serviceMethodName":"queryHasPayrollMonth","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"9","MAXelapsed":"120003.0","AVGelapsed":"120002.33","serviceMethodName":"getPayrollInfo","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"2","MAXelapsed":"120011.0","AVGelapsed":"120006.0","serviceMethodName":"queryPayrollDetail","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"3","MAXelapsed":"120026.0","AVGelapsed":"120014.67","serviceMethodName":"statistic","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"2","MAXelapsed":"120004.0","AVGelapsed":"100195.0","serviceMethodName":"queryDeductEmployee","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"1","MAXelapsed":"120004.0","AVGelapsed":"120004.0","serviceMethodName":"countUnsyncEmployee","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"1","MAXelapsed":"805644.0","AVGelapsed":"805644.0","serviceMethodName":"queryEmployeeByEmployeeId","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"1","MAXelapsed":"120024.0","AVGelapsed":"120024.0","serviceMethodName":"queryPageByCondition","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"2","MAXelapsed":"120017.0","AVGelapsed":"120009.0","serviceMethodName":"addEmployee","serviceAppName":"gaia","serviceName":"EmployeeApi"},{"COUNT无":"1","MAXelapsed":"216.0","AVGelapsed":"216.0","serviceMethodName":"addEmployeeList","serviceAppName":"gaia","serviceName":"EmployeeApi"},{"COUNT无":"1","MAXelapsed":"120006.0","AVGelapsed":"120006.0","serviceMethodName":"getRemindDaysByCompanyId","serviceAppName":"gaia","serviceName":"EmployeeApi"},{"COUNT无":"1","MAXelapsed":"120005.0","AVGelapsed":"120005.0","serviceMethodName":"updateEmployee","serviceAppName":"gaia","serviceName":"EmployeeApi"},{"COUNT无":"2","MAXelapsed":"120003.0","AVGelapsed":"60008.5","serviceMethodName":"getByCompanyId","serviceAppName":"gaia","serviceName":"EmployeeDepartmentApi"},{"COUNT无":"2","MAXelapsed":"120017.0","AVGelapsed":"120014.0","serviceMethodName":"addEntranceEmployee","serviceAppName":"gaia","serviceName":"EmployeeEntranceApi"},{"COUNT无":"1","MAXelapsed":"120003.0","AVGelapsed":"120003.0","serviceMethodName":"scopeStatistics","serviceAppName":"gaia","serviceName":"DeductionQueryApi"},{"COUNT无":"1","MAXelapsed":"805649.0","AVGelapsed":"805649.0","serviceMethodName":"queryDimission","serviceAppName":"gaia","serviceName":"EmployeeDimissionApi"}]}
         * 服务统计报表 : {"heads":["serviceAppName","serviceName","serviceMethodName","COUNT无","MAXelapsed","AVGelapsed"],"headMap":{"COUNT无":"总量","MAXelapsed":"最大耗时","AVGelapsed":"平均耗时","serviceMethodName":"方法名","serviceAppName":"应用名","serviceName":"接口名"},"dataMapList":[{"COUNT无":"1182835","MAXelapsed":"806665.0","AVGelapsed":"117.21","serviceMethodName":"queryRelationList","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"666701","MAXelapsed":"826.0","AVGelapsed":"2.57","serviceMethodName":"queryWebUserById","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"601465","MAXelapsed":"120468.0","AVGelapsed":"72.84","serviceMethodName":"queryWebUserByOpenId","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"587435","MAXelapsed":"1108.0","AVGelapsed":"2.41","serviceMethodName":"isWechatPass","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"583442","MAXelapsed":"805641.0","AVGelapsed":"22.27","serviceMethodName":"queryUserConfig","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"3151","MAXelapsed":"784.0","AVGelapsed":"42.63","serviceMethodName":"queryEmployeeWechatMap","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"405","MAXelapsed":"444.0","AVGelapsed":"9.4","serviceMethodName":"queryWebUserByMobile","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"680885","MAXelapsed":"805641.0","AVGelapsed":"66.32","serviceMethodName":"queryEmployeePayrollList","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"187869","MAXelapsed":"199408.0","AVGelapsed":"34.97","serviceMethodName":"queryEmployeePayrollDetailList","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"113276","MAXelapsed":"120001.0","AVGelapsed":"28.57","serviceMethodName":"updatePayrollOrDetail","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"6123","MAXelapsed":"1923.0","AVGelapsed":"60.99","serviceMethodName":"queryPayrollAndDetail","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"5558","MAXelapsed":"467.0","AVGelapsed":"17.05","serviceMethodName":"savePayrollRule","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"5553","MAXelapsed":"2551.0","AVGelapsed":"93.73","serviceMethodName":"savePayroll","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"1615","MAXelapsed":"1580.0","AVGelapsed":"219.43","serviceMethodName":"deletePayroll","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"280","MAXelapsed":"870.0","AVGelapsed":"176.39","serviceMethodName":"repealPayrollDetail","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"110","MAXelapsed":"379.0","AVGelapsed":"25.07","serviceMethodName":"queryPayrollByDetailId","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"81235","MAXelapsed":"120026.0","AVGelapsed":"64.33","serviceMethodName":"statistic","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"54905","MAXelapsed":"120024.0","AVGelapsed":"31.05","serviceMethodName":"queryPageByCondition","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"51532","MAXelapsed":"2737.0","AVGelapsed":"26.03","serviceMethodName":"queryAllEmployeeByCompanyId","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"49320","MAXelapsed":"120004.0","AVGelapsed":"45.95","serviceMethodName":"countUnsyncEmployee","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"43419","MAXelapsed":"805644.0","AVGelapsed":"63.45","serviceMethodName":"queryEmployeeByEmployeeId","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"25830","MAXelapsed":"407.0","AVGelapsed":"12.71","serviceMethodName":"queryAllEmployeeByEmployeeIds","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"6778","MAXelapsed":"120004.0","AVGelapsed":"61.78","serviceMethodName":"queryDeductEmployee","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"1771","MAXelapsed":"697.0","AVGelapsed":"13.33","serviceMethodName":"queryToSyncEmployee","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"857","MAXelapsed":"418.0","AVGelapsed":"15.01","serviceMethodName":"queryEmployeeByCompanyId","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"563","MAXelapsed":"469.0","AVGelapsed":"28.15","serviceMethodName":"contractStat","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"557","MAXelapsed":"828.0","AVGelapsed":"18.73","serviceMethodName":"getByCompanyIdWithoutDimission","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"261581","MAXelapsed":"805641.0","AVGelapsed":"83.32","serviceMethodName":"statisticsTodolist","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"30017","MAXelapsed":"482.0","AVGelapsed":"11.04","serviceMethodName":"queryTodolist","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"1974","MAXelapsed":"120007.0","AVGelapsed":"71.22","serviceMethodName":"getTodolistItem","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"206","MAXelapsed":"101.0","AVGelapsed":"47.5","serviceMethodName":"dealTodolist","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"36","MAXelapsed":"377.0","AVGelapsed":"102.17","serviceMethodName":"createTodolistItemByMaintainNotice","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"262400","MAXelapsed":"1039.0","AVGelapsed":"2.68","serviceMethodName":"queryClientServiceList","serviceAppName":"gaia","serviceName":"SelfServiceApi"},{"COUNT无":"5529","MAXelapsed":"486.0","AVGelapsed":"2.73","serviceMethodName":"queryBusinessServiceList","serviceAppName":"gaia","serviceName":"SelfServiceApi"},{"COUNT无":"155","MAXelapsed":"38.0","AVGelapsed":"5.72","serviceMethodName":"queryOrderCount","serviceAppName":"gaia","serviceName":"SelfServiceApi"},{"COUNT无":"27","MAXelapsed":"40.0","AVGelapsed":"32.41","serviceMethodName":"orderSelfService","serviceAppName":"gaia","serviceName":"SelfServiceApi"},{"COUNT无":"113379","MAXelapsed":"173976.0","AVGelapsed":"64.86","serviceMethodName":"queryEmployeeTaxBillDetail","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"32319","MAXelapsed":"478.0","AVGelapsed":"9.61","serviceMethodName":"queryComputeRule","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"25136","MAXelapsed":"1651.0","AVGelapsed":"28.83","serviceMethodName":"queryEmployeeTaxBill","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"9238","MAXelapsed":"120003.0","AVGelapsed":"34.55","serviceMethodName":"statisticalEmployeeTaxBill","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"3469","MAXelapsed":"120008.0","AVGelapsed":"61.12","serviceMethodName":"saveComputeRule","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"541","MAXelapsed":"4400.0","AVGelapsed":"175.48","serviceMethodName":"saveDeclarationInfo","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"523","MAXelapsed":"1119.0","AVGelapsed":"43.65","serviceMethodName":"getTaxBill","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"301","MAXelapsed":"550.0","AVGelapsed":"34.24","serviceMethodName":"statisticPushTaxBill","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"120","MAXelapsed":"212.0","AVGelapsed":"33.74","serviceMethodName":"queryPushTaxDetail","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"63738","MAXelapsed":"120015.0","AVGelapsed":"23.43","serviceMethodName":"queryPayrollInfo","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"28243","MAXelapsed":"1007.0","AVGelapsed":"21.69","serviceMethodName":"queryPayrollDetail","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"23860","MAXelapsed":"120001.0","AVGelapsed":"14.83","serviceMethodName":"getPayrollInfo","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"12293","MAXelapsed":"120001.0","AVGelapsed":"20.33","serviceMethodName":"getPayrollRule","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"11761","MAXelapsed":"120003.0","AVGelapsed":"52.52","serviceMethodName":"getPreferPayrollName","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"9431","MAXelapsed":"456.0","AVGelapsed":"10.31","serviceMethodName":"getPayrollStatistics","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"9350","MAXelapsed":"529.0","AVGelapsed":"10.01","serviceMethodName":"getEmpIdList","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"8424","MAXelapsed":"120008.0","AVGelapsed":"24.14","serviceMethodName":"queryHasPayrollMonth","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"3252","MAXelapsed":"1054.0","AVGelapsed":"53.67","serviceMethodName":"queryPayrollDetailByPayrollIdList","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"180","MAXelapsed":"32.0","AVGelapsed":"17.61","serviceMethodName":"removePayrollRule","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"12","MAXelapsed":"16.0","AVGelapsed":"11.25","serviceMethodName":"getTaxMonthRange","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"58684","MAXelapsed":"120003.0","AVGelapsed":"28.15","serviceMethodName":"getPayrollInfo","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"51264","MAXelapsed":"120011.0","AVGelapsed":"29.4","serviceMethodName":"queryPayrollDetail","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"36124","MAXelapsed":"538.0","AVGelapsed":"9.52","serviceMethodName":"getEmpIdList","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"7942","MAXelapsed":"13702.0","AVGelapsed":"64.3","serviceMethodName":"getPayrollInfoRepeat","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"7043","MAXelapsed":"520.0","AVGelapsed":"10.48","serviceMethodName":"getEmpIdSetByExcelCacheIds","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"64263","MAXelapsed":"505.0","AVGelapsed":"2.5","serviceMethodName":"saveWechatPassValidation","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"9272","MAXelapsed":"547.0","AVGelapsed":"46.79","serviceMethodName":"addCompanyRelation","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"8557","MAXelapsed":"120013.0","AVGelapsed":"83.29","serviceMethodName":"wechatBind","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"7479","MAXelapsed":"923.0","AVGelapsed":"25.91","serviceMethodName":"saveUserConfig","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"6916","MAXelapsed":"120002.0","AVGelapsed":"218.1","serviceMethodName":"updateSubscribeStatus","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"6365","MAXelapsed":"120008.0","AVGelapsed":"254.3","serviceMethodName":"chooseDefaultCompany","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"1206","MAXelapsed":"427.0","AVGelapsed":"27.69","serviceMethodName":"setWechatPassword","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"726","MAXelapsed":"432.0","AVGelapsed":"33.97","serviceMethodName":"wechatUnBind","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"272","MAXelapsed":"242.0","AVGelapsed":"57.33","serviceMethodName":"removeCompany","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"228","MAXelapsed":"94364.0","AVGelapsed":"445.74","serviceMethodName":"h5LoginIncludeRegister","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"114","MAXelapsed":"62.0","AVGelapsed":"24.92","serviceMethodName":"setH5Password","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"1","MAXelapsed":"49.0","AVGelapsed":"49.0","serviceMethodName":"certificateCompany","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"41962","MAXelapsed":"237.0","AVGelapsed":"1.08","serviceMethodName":"queryBusinessParameterValue","serviceAppName":"gaia","serviceName":"BusinessParameterApi"},{"COUNT无":"23762","MAXelapsed":"118.0","AVGelapsed":"4.8","serviceMethodName":"queryBusinessParameter","serviceAppName":"gaia","serviceName":"BusinessParameterApi"},{"COUNT无":"18343","MAXelapsed":"1176.0","AVGelapsed":"68.07","serviceMethodName":"queryHaveAdditionalSnapshootEmployeeIdList","serviceAppName":"gaia","serviceName":"SnapshootQueryApi"},{"COUNT无":"11969","MAXelapsed":"498.0","AVGelapsed":"10.4","serviceMethodName":"queryCompanyHaveAccumulativeMonthList","serviceAppName":"gaia","serviceName":"SnapshootQueryApi"},{"COUNT无":"11946","MAXelapsed":"520.0","AVGelapsed":"10.93","serviceMethodName":"queryHaveAccumulativeEmployeeIdList","serviceAppName":"gaia","serviceName":"SnapshootQueryApi"},{"COUNT无":"9351","MAXelapsed":"803.0","AVGelapsed":"16.88","serviceMethodName":"queryEmployeeAccumulativeInfo","serviceAppName":"gaia","serviceName":"SnapshootQueryApi"},{"COUNT无":"6180","MAXelapsed":"2648.0","AVGelapsed":"86.59","serviceMethodName":"queryAdditionalSpecialDeduct","serviceAppName":"gaia","serviceName":"SnapshootQueryApi"},{"COUNT无":"17798","MAXelapsed":"50247.0","AVGelapsed":"330.3","serviceMethodName":"updatePayrollDetail","serviceAppName":"gaia","serviceName":"PayrollRawApi"},{"COUNT无":"17622","MAXelapsed":"448.0","AVGelapsed":"19.91","serviceMethodName":"updatePayrollInfo","serviceAppName":"gaia","serviceName":"PayrollRawApi"},{"COUNT无":"12559","MAXelapsed":"4114.0","AVGelapsed":"106.41","serviceMethodName":"savePayrollRaw","serviceAppName":"gaia","serviceName":"PayrollRawApi"},{"COUNT无":"8929","MAXelapsed":"21019.0","AVGelapsed":"330.99","serviceMethodName":"matchPayrollRawEmployee","serviceAppName":"gaia","serviceName":"PayrollRawApi"},{"COUNT无":"53123","MAXelapsed":"805.0","AVGelapsed":"2.75","serviceMethodName":"getFunctionLimitByLocationCode","serviceAppName":"gaia","serviceName":"FunctionLimitApi"},{"COUNT无":"43158","MAXelapsed":"120003.0","AVGelapsed":"16.07","serviceMethodName":"getByCompanyId","serviceAppName":"gaia","serviceName":"EmployeeDepartmentApi"},{"COUNT无":"256","MAXelapsed":"199.0","AVGelapsed":"24.8","serviceMethodName":"addDepartment","serviceAppName":"gaia","serviceName":"EmployeeDepartmentApi"},{"COUNT无":"103","MAXelapsed":"69.0","AVGelapsed":"6.15","serviceMethodName":"getSubDepartments","serviceAppName":"gaia","serviceName":"EmployeeDepartmentApi"},{"COUNT无":"44","MAXelapsed":"62.0","AVGelapsed":"29.55","serviceMethodName":"updateDepartment","serviceAppName":"gaia","serviceName":"EmployeeDepartmentApi"},{"COUNT无":"3","MAXelapsed":"137.0","AVGelapsed":"70.67","serviceMethodName":"deleteDepartment","serviceAppName":"gaia","serviceName":"EmployeeDepartmentApi"},{"COUNT无":"42752","MAXelapsed":"12908.0","AVGelapsed":"9.06","serviceMethodName":"selectByCompanyId","serviceAppName":"gaia","serviceName":"EmployeePositionApi"},{"COUNT无":"265","MAXelapsed":"307.0","AVGelapsed":"49.72","serviceMethodName":"addPosition","serviceAppName":"gaia","serviceName":"EmployeePositionApi"},{"COUNT无":"40","MAXelapsed":"139.0","AVGelapsed":"100.38","serviceMethodName":"updatePosition","serviceAppName":"gaia","serviceName":"EmployeePositionApi"},{"COUNT无":"9","MAXelapsed":"139.0","AVGelapsed":"73.44","serviceMethodName":"deletePosition","serviceAppName":"gaia","serviceName":"EmployeePositionApi"},{"COUNT无":"30622","MAXelapsed":"272.0","AVGelapsed":"4.32","serviceMethodName":"getEmployees","serviceAppName":"gaia","serviceName":"GaiaEmployeeApi"},{"COUNT无":"9496","MAXelapsed":"457.0","AVGelapsed":"6.62","serviceMethodName":"getEmployeeList","serviceAppName":"gaia","serviceName":"GaiaEmployeeApi"},{"COUNT无":"1581","MAXelapsed":"1419.0","AVGelapsed":"24.35","serviceMethodName":"getByName","serviceAppName":"gaia","serviceName":"GaiaEmployeeApi"},{"COUNT无":"22505","MAXelapsed":"120005.0","AVGelapsed":"28.21","serviceMethodName":"addSerial","serviceAppName":"gaia","serviceName":"DeductionApi"},{"COUNT无":"5778","MAXelapsed":"649.0","AVGelapsed":"101.95","serviceMethodName":"deleteAllAdditionalInPhysical","serviceAppName":"gaia","serviceName":"DeductionApi"},{"COUNT无":"5630","MAXelapsed":"6005.0","AVGelapsed":"204.76","serviceMethodName":"saveAdditionalDTOFromG2","serviceAppName":"gaia","serviceName":"DeductionApi"}]}
         */

        private 数据访问层异常统计Bean 数据访问层异常统计;

        private 数据访问层统计Bean 数据访问层统计;

        private 服务异常统计Bean 服务异常统计;

        private 服务统计报表Bean 服务统计报表;

        public 数据访问层异常统计Bean get数据访问层异常统计() {
            return 数据访问层异常统计;
        }

        public void set数据访问层异常统计(数据访问层异常统计Bean 数据访问层异常统计) {
            this.数据访问层异常统计 = 数据访问层异常统计;
        }

        public 数据访问层统计Bean get数据访问层统计() {
            return 数据访问层统计;
        }

        public void set数据访问层统计(数据访问层统计Bean 数据访问层统计) {
            this.数据访问层统计 = 数据访问层统计;
        }

        public 服务异常统计Bean get服务异常统计() {
            return 服务异常统计;
        }

        public void set服务异常统计(服务异常统计Bean 服务异常统计) {
            this.服务异常统计 = 服务异常统计;
        }

        public 服务统计报表Bean get服务统计报表() {
            return 服务统计报表;
        }

        public void set服务统计报表(服务统计报表Bean 服务统计报表) {
            this.服务统计报表 = 服务统计报表;
        }

        public static class 数据访问层异常统计Bean {
            /**
             * heads : ["daoName","daoMethodName","COUNT无","MAXelapsed","AVGelapsed"] headMap : {"COUNT无":"总量","MAXelapsed":"最大耗时","AVGelapsed":"平均耗时","daoMethodName":"方法名","daoName":"类名"}
             * dataMapList : [{"COUNT无":"1009","MAXelapsed":"806665.0","AVGelapsed":"119623.45","daoMethodName":"findByWebUserId","daoName":"WebMobileRelationMapper"},{"COUNT无":"308","MAXelapsed":"120468.0","AVGelapsed":"118631.29","daoMethodName":"queryWebUser","daoName":"WebUserMapper"},{"COUNT无":"1","MAXelapsed":"18.0","AVGelapsed":"18.0","daoMethodName":"insertSelective","daoName":"WebUserMapper"},{"COUNT无":"1","MAXelapsed":"15.0","AVGelapsed":"15.0","daoMethodName":"updateByPrimaryKeySelective","daoName":"WebUserMapper"},{"COUNT无":"208","MAXelapsed":"805639.0","AVGelapsed":"123058.4","daoMethodName":"queryPayrollDetailByEmployeeId","daoName":"PayrollDetailMapper"},{"COUNT无":"18","MAXelapsed":"120003.0","AVGelapsed":"73367.94","daoMethodName":"queryDetailByEmployeeIdAndMonthInterval","daoName":"PayrollDetailMapper"},{"COUNT无":"1","MAXelapsed":"13.0","AVGelapsed":"13.0","daoMethodName":"updatePayrollDetail","daoName":"PayrollDetailMapper"},{"COUNT无":"145","MAXelapsed":"805640.0","AVGelapsed":"122128.79","daoMethodName":"statisticsTodolist","daoName":"TodolistItemMapper"},{"COUNT无":"1","MAXelapsed":"120007.0","AVGelapsed":"120007.0","daoMethodName":"selectByPrimaryKey","daoName":"TodolistItemMapper"},{"COUNT无":"38","MAXelapsed":"3722.0","AVGelapsed":"563.66","daoMethodName":"insert","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"18","MAXelapsed":"120003.0","AVGelapsed":"107840.89","daoMethodName":"queryEmployeesTaxBill","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"33","MAXelapsed":"144.0","AVGelapsed":"41.12","daoMethodName":"insert","daoName":"PayrollRawDetailMapper"},{"COUNT无":"2","MAXelapsed":"120001.0","AVGelapsed":"120001.0","daoMethodName":"queryPayrollDetail","daoName":"PayrollRawDetailMapper"},{"COUNT无":"34","MAXelapsed":"120005.0","AVGelapsed":"110825.24","daoMethodName":"insert","daoName":"BonusPersonalMapper"},{"COUNT无":"31","MAXelapsed":"805639.0","AVGelapsed":"142118.9","daoMethodName":"findByWebUserId","daoName":"WechatConfigMapper"},{"COUNT无":"12","MAXelapsed":"805643.0","AVGelapsed":"153195.5","daoMethodName":"selectByEmployeeId","daoName":"EmployeeMapper"},{"COUNT无":"2","MAXelapsed":"120001.0","AVGelapsed":"120001.0","daoMethodName":"selectAllByCompanyId","daoName":"EmployeeMapper"},{"COUNT无":"2","MAXelapsed":"120001.0","AVGelapsed":"120001.0","daoMethodName":"selectByCondition","daoName":"EmployeeMapper"},{"COUNT无":"2","MAXelapsed":"120004.0","AVGelapsed":"100189.5","daoMethodName":"selectByOtherCondition","daoName":"EmployeeMapper"},{"COUNT无":"1","MAXelapsed":"80.0","AVGelapsed":"80.0","daoMethodName":"insert","daoName":"EmployeeMapper"},{"COUNT无":"9","MAXelapsed":"120003.0","AVGelapsed":"120002.78","daoMethodName":"queryPayrollByPayrollIdList","daoName":"PayrollMapper"},{"COUNT无":"4","MAXelapsed":"120006.0","AVGelapsed":"120003.0","daoMethodName":"queryPayrollByCondition","daoName":"PayrollMapper"},{"COUNT无":"4","MAXelapsed":"120002.0","AVGelapsed":"120001.25","daoMethodName":"queryPayrollByMonth","daoName":"PayrollMapper"},{"COUNT无":"1","MAXelapsed":"120002.0","AVGelapsed":"120002.0","daoMethodName":"queryHasPayrollMonth","daoName":"PayrollMapper"},{"COUNT无":"1","MAXelapsed":"120001.0","AVGelapsed":"120001.0","daoMethodName":"queryPayrollByPayrollId","daoName":"PayrollMapper"},{"COUNT无":"9","MAXelapsed":"120003.0","AVGelapsed":"120002.22","daoMethodName":"queryPayrollRawByExcelCacheId","daoName":"PayrollRawMapper"},{"COUNT无":"6","MAXelapsed":"15.0","AVGelapsed":"13.67","daoMethodName":"insert","daoName":"DeductionLoanMapper"},{"COUNT无":"3","MAXelapsed":"120001.0","AVGelapsed":"80009.67","daoMethodName":"insert","daoName":"DeductionSerialMapper"},{"COUNT无":"3","MAXelapsed":"120002.0","AVGelapsed":"120001.33","daoMethodName":"selectByCompanyId","daoName":"RemindDaysMapper"},{"COUNT无":"2","MAXelapsed":"120001.0","AVGelapsed":"60007.0","daoMethodName":"selectByCompanyId","daoName":"EmployeeDepartmentMapper"},{"COUNT无":"1","MAXelapsed":"805640.0","AVGelapsed":"805640.0","daoMethodName":"listDimissionInfo","daoName":"EmployeeDimissionMapper"},{"COUNT无":"1","MAXelapsed":"120001.0","AVGelapsed":"120001.0","daoMethodName":"getPayrollRule","daoName":"PayrollRuleMapper"},{"COUNT无":"1","MAXelapsed":"120003.0","AVGelapsed":"120003.0","daoMethodName":"queryPersonalIncomeTaxByDeclareIdList","daoName":"PersonalIncomeTaxMapper"},{"COUNT无":"1","MAXelapsed":"120002.0","AVGelapsed":"120002.0","daoMethodName":"insertIgnore","daoName":"StiSalaryRulesMapper"}]
             */

            private HeadMapBean headMap;

            private List<String> heads;

            private List<DataMapListBean> dataMapList;

            public HeadMapBean getHeadMap() {
                return headMap;
            }

            public void setHeadMap(HeadMapBean headMap) {
                this.headMap = headMap;
            }

            public List<String> getHeads() {
                return heads;
            }

            public void setHeads(List<String> heads) {
                this.heads = heads;
            }

            public List<DataMapListBean> getDataMapList() {
                return dataMapList;
            }

            public void setDataMapList(List<DataMapListBean> dataMapList) {
                this.dataMapList = dataMapList;
            }

            public static class HeadMapBean {
                /**
                 * COUNT无 : 总量 MAXelapsed : 最大耗时 AVGelapsed : 平均耗时 daoMethodName : 方法名 daoName : 类名
                 */

                private String COUNT无;

                private String MAXelapsed;

                private String AVGelapsed;

                private String daoMethodName;

                private String daoName;

                public String getCOUNT无() {
                    return COUNT无;
                }

                public void setCOUNT无(String COUNT无) {
                    this.COUNT无 = COUNT无;
                }

                public String getMAXelapsed() {
                    return MAXelapsed;
                }

                public void setMAXelapsed(String MAXelapsed) {
                    this.MAXelapsed = MAXelapsed;
                }

                public String getAVGelapsed() {
                    return AVGelapsed;
                }

                public void setAVGelapsed(String AVGelapsed) {
                    this.AVGelapsed = AVGelapsed;
                }

                public String getDaoMethodName() {
                    return daoMethodName;
                }

                public void setDaoMethodName(String daoMethodName) {
                    this.daoMethodName = daoMethodName;
                }

                public String getDaoName() {
                    return daoName;
                }

                public void setDaoName(String daoName) {
                    this.daoName = daoName;
                }
            }

            public static class DataMapListBean {
                /**
                 * COUNT无 : 1009 MAXelapsed : 806665.0 AVGelapsed : 119623.45 daoMethodName : findByWebUserId daoName :
                 * WebMobileRelationMapper
                 */

                private String COUNT无;

                private String MAXelapsed;

                private String AVGelapsed;

                private String daoMethodName;

                private String daoName;

                public String getCOUNT无() {
                    return COUNT无;
                }

                public void setCOUNT无(String COUNT无) {
                    this.COUNT无 = COUNT无;
                }

                public String getMAXelapsed() {
                    return MAXelapsed;
                }

                public void setMAXelapsed(String MAXelapsed) {
                    this.MAXelapsed = MAXelapsed;
                }

                public String getAVGelapsed() {
                    return AVGelapsed;
                }

                public void setAVGelapsed(String AVGelapsed) {
                    this.AVGelapsed = AVGelapsed;
                }

                public String getDaoMethodName() {
                    return daoMethodName;
                }

                public void setDaoMethodName(String daoMethodName) {
                    this.daoMethodName = daoMethodName;
                }

                public String getDaoName() {
                    return daoName;
                }

                public void setDaoName(String daoName) {
                    this.daoName = daoName;
                }
            }
        }

        public static class 数据访问层统计Bean {
            /**
             * heads : ["daoName","daoMethodName","COUNT无","MAXelapsed","AVGelapsed"] headMap : {"COUNT无":"总量","MAXelapsed":"最大耗时","AVGelapsed":"平均耗时","daoMethodName":"方法名","daoName":"类名"}
             * dataMapList : [{"COUNT无":"681277","MAXelapsed":"805639.0","AVGelapsed":"53.55","daoMethodName":"queryPayrollDetailByEmployeeId","daoName":"PayrollDetailMapper"},{"COUNT无":"187958","MAXelapsed":"120003.0","AVGelapsed":"22.79","daoMethodName":"queryDetailByEmployeeIdAndMonthInterval","daoName":"PayrollDetailMapper"},{"COUNT无":"113665","MAXelapsed":"9682.0","AVGelapsed":"15.2","daoMethodName":"updatePayrollDetail","daoName":"PayrollDetailMapper"},{"COUNT无":"28252","MAXelapsed":"886.0","AVGelapsed":"20.35","daoMethodName":"queryPayrollDetail","daoName":"PayrollDetailMapper"},{"COUNT无":"9438","MAXelapsed":"389.0","AVGelapsed":"9.83","daoMethodName":"statistics","daoName":"PayrollDetailMapper"},{"COUNT无":"9355","MAXelapsed":"244.0","AVGelapsed":"9.44","daoMethodName":"getEmpIdList","daoName":"PayrollDetailMapper"},{"COUNT无":"7940","MAXelapsed":"13688.0","AVGelapsed":"51.39","daoMethodName":"getRepeatPayrollEmployee","daoName":"PayrollDetailMapper"},{"COUNT无":"6407","MAXelapsed":"1556.0","AVGelapsed":"27.47","daoMethodName":"queryPayrollDetailByPage","daoName":"PayrollDetailMapper"},{"COUNT无":"5554","MAXelapsed":"2227.0","AVGelapsed":"58.43","daoMethodName":"insert","daoName":"PayrollDetailMapper"},{"COUNT无":"3253","MAXelapsed":"887.0","AVGelapsed":"47.87","daoMethodName":"queryPayrollDetailByPayrollIdList","daoName":"PayrollDetailMapper"},{"COUNT无":"1506","MAXelapsed":"337.0","AVGelapsed":"17.51","daoMethodName":"updateByPayrollIdUnvalid","daoName":"PayrollDetailMapper"},{"COUNT无":"1391","MAXelapsed":"619.0","AVGelapsed":"20.98","daoMethodName":"checkPayrollDelete","daoName":"PayrollDetailMapper"},{"COUNT无":"1362","MAXelapsed":"303.0","AVGelapsed":"29.06","daoMethodName":"getInvidualPayrollEmployeeIdList","daoName":"PayrollDetailMapper"},{"COUNT无":"386","MAXelapsed":"77.0","AVGelapsed":"7.47","daoMethodName":"getSalaryEmpIdList","daoName":"PayrollDetailMapper"},{"COUNT无":"110","MAXelapsed":"127.0","AVGelapsed":"12.2","daoMethodName":"queryPayrollDetailByPayrollDetailId","daoName":"PayrollDetailMapper"},{"COUNT无":"850048","MAXelapsed":"120003.0","AVGelapsed":"11.87","daoMethodName":"queryPayrollByPayrollIdList","daoName":"PayrollMapper"},{"COUNT无":"66616","MAXelapsed":"120006.0","AVGelapsed":"22.35","daoMethodName":"queryPayrollByCondition","daoName":"PayrollMapper"},{"COUNT无":"34604","MAXelapsed":"120001.0","AVGelapsed":"11.88","daoMethodName":"queryPayrollByPayrollId","daoName":"PayrollMapper"},{"COUNT无":"11762","MAXelapsed":"120002.0","AVGelapsed":"51.78","daoMethodName":"queryPayrollByMonth","daoName":"PayrollMapper"},{"COUNT无":"8437","MAXelapsed":"120002.0","AVGelapsed":"23.59","daoMethodName":"queryHasPayrollMonth","daoName":"PayrollMapper"},{"COUNT无":"5552","MAXelapsed":"199.0","AVGelapsed":"11.88","daoMethodName":"saveOrUpdate","daoName":"PayrollMapper"},{"COUNT无":"2892","MAXelapsed":"341.0","AVGelapsed":"11.45","daoMethodName":"updatePayroll","daoName":"PayrollMapper"},{"COUNT无":"1506","MAXelapsed":"158.0","AVGelapsed":"10.57","daoMethodName":"updatePayrollUnvalid","daoName":"PayrollMapper"},{"COUNT无":"1425","MAXelapsed":"20.0","AVGelapsed":"6.68","daoMethodName":"queryMaxPayrollByMonth","daoName":"PayrollMapper"},{"COUNT无":"323731","MAXelapsed":"806665.0","AVGelapsed":"417.23","daoMethodName":"findByWebUserId","daoName":"WebMobileRelationMapper"},{"COUNT无":"7747","MAXelapsed":"248.0","AVGelapsed":"19.5","daoMethodName":"insertSelective","daoName":"WebMobileRelationMapper"},{"COUNT无":"6125","MAXelapsed":"307.0","AVGelapsed":"12.7","daoMethodName":"queryRelationByEmployee","daoName":"WebMobileRelationMapper"},{"COUNT无":"936","MAXelapsed":"204.0","AVGelapsed":"17.27","daoMethodName":"updateByPrimaryKeySelective","daoName":"WebMobileRelationMapper"},{"COUNT无":"317730","MAXelapsed":"805639.0","AVGelapsed":"34.49","daoMethodName":"findByWebUserId","daoName":"WechatConfigMapper"},{"COUNT无":"7482","MAXelapsed":"213.0","AVGelapsed":"13.2","daoMethodName":"insertSelective","daoName":"WechatConfigMapper"},{"COUNT无":"261707","MAXelapsed":"805640.0","AVGelapsed":"82.65","daoMethodName":"statisticsTodolist","daoName":"TodolistItemMapper"},{"COUNT无":"30035","MAXelapsed":"360.0","AVGelapsed":"10.52","daoMethodName":"queryTodolist","daoName":"TodolistItemMapper"},{"COUNT无":"2174","MAXelapsed":"120007.0","AVGelapsed":"64.44","daoMethodName":"selectByPrimaryKey","daoName":"TodolistItemMapper"},{"COUNT无":"203","MAXelapsed":"29.0","AVGelapsed":"10.89","daoMethodName":"dealTodolist","daoName":"TodolistItemMapper"},{"COUNT无":"109","MAXelapsed":"41.0","AVGelapsed":"15.84","daoMethodName":"insert","daoName":"TodolistItemMapper"},{"COUNT无":"90945","MAXelapsed":"120001.0","AVGelapsed":"36.44","daoMethodName":"selectByCondition","daoName":"EmployeeMapper"},{"COUNT无":"57312","MAXelapsed":"805643.0","AVGelapsed":"44.74","daoMethodName":"selectByEmployeeId","daoName":"EmployeeMapper"},{"COUNT无":"55750","MAXelapsed":"120001.0","AVGelapsed":"54.67","daoMethodName":"selectAllByCompanyId","daoName":"EmployeeMapper"},{"COUNT无":"20402","MAXelapsed":"23885.0","AVGelapsed":"44.21","daoMethodName":"update","daoName":"EmployeeMapper"},{"COUNT无":"10724","MAXelapsed":"3581.0","AVGelapsed":"35.92","daoMethodName":"selectByEmployeeIds","daoName":"EmployeeMapper"},{"COUNT无":"6792","MAXelapsed":"120004.0","AVGelapsed":"51.74","daoMethodName":"selectByOtherCondition","daoName":"EmployeeMapper"},{"COUNT无":"4304","MAXelapsed":"6293.0","AVGelapsed":"26.61","daoMethodName":"insert","daoName":"EmployeeMapper"},{"COUNT无":"778","MAXelapsed":"6960.0","AVGelapsed":"86.87","daoMethodName":"deleteByEmployeeId","daoName":"EmployeeMapper"},{"COUNT无":"147802","MAXelapsed":"120003.0","AVGelapsed":"31.66","daoMethodName":"queryEmployeesTaxBill","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"15710","MAXelapsed":"243.0","AVGelapsed":"16.52","daoMethodName":"updateTaxDetailSawState","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"539","MAXelapsed":"3831.0","AVGelapsed":"137.92","daoMethodName":"insert","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"526","MAXelapsed":"1092.0","AVGelapsed":"32.39","daoMethodName":"queryPersonalIncomeTaxDetailList","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"394","MAXelapsed":"123.0","AVGelapsed":"12.89","daoMethodName":"queryPushDetailCollection","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"120","MAXelapsed":"167.0","AVGelapsed":"23.27","daoMethodName":"queryGroupByIdentification","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"117","MAXelapsed":"30.0","AVGelapsed":"19.15","daoMethodName":"updateEmployeeId","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"72","MAXelapsed":"48.0","AVGelapsed":"14.38","daoMethodName":"deleteTaxDetailByDeclareId","daoName":"PersonalIncomeTaxDetailMapper"},{"COUNT无":"116887","MAXelapsed":"120468.0","AVGelapsed":"353.97","daoMethodName":"queryWebUser","daoName":"WebUserMapper"},{"COUNT无":"15263","MAXelapsed":"413.0","AVGelapsed":"10.91","daoMethodName":"updateByPrimaryKeySelective","daoName":"WebUserMapper"},{"COUNT无":"7857","MAXelapsed":"233.0","AVGelapsed":"18.91","daoMethodName":"insertSelective","daoName":"WebUserMapper"},{"COUNT无":"2887","MAXelapsed":"373.0","AVGelapsed":"15.66","daoMethodName":"queryByIdList","daoName":"WebUserMapper"},{"COUNT无":"51294","MAXelapsed":"120001.0","AVGelapsed":"27.08","daoMethodName":"queryPayrollDetail","daoName":"PayrollRawDetailMapper"},{"COUNT无":"36153","MAXelapsed":"437.0","AVGelapsed":"9.1","daoMethodName":"getEmpIdList","daoName":"PayrollRawDetailMapper"},{"COUNT无":"26731","MAXelapsed":"49666.0","AVGelapsed":"312.47","daoMethodName":"updateByPrimaryKeySelective","daoName":"PayrollRawDetailMapper"},{"COUNT无":"12570","MAXelapsed":"3770.0","AVGelapsed":"64.2","daoMethodName":"insert","daoName":"PayrollRawDetailMapper"},{"COUNT无":"7047","MAXelapsed":"129.0","AVGelapsed":"9.73","daoMethodName":"getEmpIdSetByExcelCacheIds","daoName":"PayrollRawDetailMapper"},{"COUNT无":"130877","MAXelapsed":"120003.0","AVGelapsed":"10.19","daoMethodName":"queryPersonalIncomeTaxByDeclareIdList","daoName":"PersonalIncomeTaxMapper"},{"COUNT无":"1065","MAXelapsed":"206.0","AVGelapsed":"8.36","daoMethodName":"queryPersonalIncomeTaxByMonth","daoName":"PersonalIncomeTaxMapper"},{"COUNT无":"467","MAXelapsed":"198.0","AVGelapsed":"11.08","daoMethodName":"insert","daoName":"PersonalIncomeTaxMapper"},{"COUNT无":"302","MAXelapsed":"104.0","AVGelapsed":"14.41","daoMethodName":"queryPersonalIncomeTaxPage","daoName":"PersonalIncomeTaxMapper"},{"COUNT无":"72","MAXelapsed":"31.0","AVGelapsed":"11.54","daoMethodName":"updateByPrimaryKeySelective","daoName":"PersonalIncomeTaxMapper"},{"COUNT无":"66725","MAXelapsed":"120003.0","AVGelapsed":"25.42","daoMethodName":"queryPayrollRawByExcelCacheId","daoName":"PayrollRawMapper"},{"COUNT无":"24084","MAXelapsed":"318.0","AVGelapsed":"15.95","daoMethodName":"updateByPrimaryKeySelective","daoName":"PayrollRawMapper"},{"COUNT无":"12537","MAXelapsed":"217.0","AVGelapsed":"10.18","daoMethodName":"insert","daoName":"PayrollRawMapper"},{"COUNT无":"44895","MAXelapsed":"438.0","AVGelapsed":"9.4","daoMethodName":"queryComputeRule","daoName":"StiSalaryRulesMapper"},{"COUNT无":"9447","MAXelapsed":"120002.0","AVGelapsed":"29.74","daoMethodName":"insertIgnore","daoName":"StiSalaryRulesMapper"},{"COUNT无":"1955","MAXelapsed":"50.0","AVGelapsed":"16.19","daoMethodName":"updateByRuleId","daoName":"StiSalaryRulesMapper"},{"COUNT无":"20282","MAXelapsed":"191.0","AVGelapsed":"8.6","daoMethodName":"selectBeEmployee","daoName":"EmployeeProbationMapper"},{"COUNT无":"15598","MAXelapsed":"152.0","AVGelapsed":"9.13","daoMethodName":"deleteByCompanyIdAndEmployeeIdList","daoName":"EmployeeProbationMapper"},{"COUNT无":"13258","MAXelapsed":"153.0","AVGelapsed":"5.88","daoMethodName":"getProbation","daoName":"EmployeeProbationMapper"},{"COUNT无":"253","MAXelapsed":"35.0","AVGelapsed":"9.4","daoMethodName":"insert","daoName":"EmployeeProbationMapper"},{"COUNT无":"226","MAXelapsed":"31.0","AVGelapsed":"10.35","daoMethodName":"update","daoName":"EmployeeProbationMapper"},{"COUNT无":"20316","MAXelapsed":"150.0","AVGelapsed":"8.86","daoMethodName":"selectBeDimissionCount","daoName":"EmployeeDimissionMapper"},{"COUNT无":"11937","MAXelapsed":"216.0","AVGelapsed":"6.28","daoMethodName":"selectByCompanyIdAndEmployeeIdList","daoName":"EmployeeDimissionMapper"},{"COUNT无":"8628","MAXelapsed":"805640.0","AVGelapsed":"104.13","daoMethodName":"listDimissionInfo","daoName":"EmployeeDimissionMapper"},{"COUNT无":"1940","MAXelapsed":"205.0","AVGelapsed":"9.24","daoMethodName":"insert","daoName":"EmployeeDimissionMapper"},{"COUNT无":"1671","MAXelapsed":"7601.0","AVGelapsed":"42.14","daoMethodName":"deleteDimission","daoName":"EmployeeDimissionMapper"},{"COUNT无":"824","MAXelapsed":"92.0","AVGelapsed":"9.28","daoMethodName":"updateByEmployeeIdSelective","daoName":"EmployeeDimissionMapper"},{"COUNT无":"200","MAXelapsed":"44.0","AVGelapsed":"10.19","daoMethodName":"updateByPrimaryKey","daoName":"EmployeeDimissionMapper"},{"COUNT无":"43","MAXelapsed":"30.0","AVGelapsed":"13.16","daoMethodName":"selectDimissionExport","daoName":"EmployeeDimissionMapper"},{"COUNT无":"2","MAXelapsed":"33.0","AVGelapsed":"22.0","daoMethodName":"updateByCompanyIdAndEmployeeIdSelective","daoName":"EmployeeDimissionMapper"},{"COUNT无":"43414","MAXelapsed":"479.0","AVGelapsed":"9.17","daoMethodName":"selectEmployeeEducationDetail","daoName":"EmployeeEducationExperienceMapper"},{"COUNT无":"742","MAXelapsed":"7539.0","AVGelapsed":"83.11","daoMethodName":"deleteEducationList","daoName":"EmployeeEducationExperienceMapper"},{"COUNT无":"416","MAXelapsed":"93.0","AVGelapsed":"10.71","daoMethodName":"updateByPrimaryKeySelective","daoName":"EmployeeEducationExperienceMapper"},{"COUNT无":"90","MAXelapsed":"29.0","AVGelapsed":"9.83","daoMethodName":"insert","daoName":"EmployeeEducationExperienceMapper"},{"COUNT无":"43414","MAXelapsed":"184.0","AVGelapsed":"8.64","daoMethodName":"selectByEmployeeId","daoName":"EmployeeFamilyMemberMapper"},{"COUNT无":"742","MAXelapsed":"7492.0","AVGelapsed":"81.01","daoMethodName":"deleteByEmployeeId","daoName":"EmployeeFamilyMemberMapper"},{"COUNT无":"227","MAXelapsed":"33.0","AVGelapsed":"11.46","daoMethodName":"update","daoName":"EmployeeFamilyMemberMapper"},{"COUNT无":"71","MAXelapsed":"20.0","AVGelapsed":"9.87","daoMethodName":"insertSelective","daoName":"EmployeeFamilyMemberMapper"},{"COUNT无":"2","MAXelapsed":"9.0","AVGelapsed":"8.5","daoMethodName":"deleteByMemberIds","daoName":"EmployeeFamilyMemberMapper"},{"COUNT无":"43414","MAXelapsed":"189.0","AVGelapsed":"8.71","daoMethodName":"selectByEmployeeId","daoName":"EmployeeWorkExperienceMapper"},{"COUNT无":"742","MAXelapsed":"7593.0","AVGelapsed":"80.67","daoMethodName":"deleteByEmployeeId","daoName":"EmployeeWorkExperienceMapper"},{"COUNT无":"167","MAXelapsed":"30.0","AVGelapsed":"10.7","daoMethodName":"update","daoName":"EmployeeWorkExperienceMapper"},{"COUNT无":"51","MAXelapsed":"24.0","AVGelapsed":"9.37","daoMethodName":"insert","daoName":"EmployeeWorkExperienceMapper"},{"COUNT无":"44156","MAXelapsed":"145.0","AVGelapsed":"8.61","daoMethodName":"getByEmployeeId","daoName":"EmployeePersonnelDocumentMapper"},{"COUNT无":"52","MAXelapsed":"23.0","AVGelapsed":"10.35","daoMethodName":"update","daoName":"EmployeePersonnelDocumentMapper"}]
             */

            private HeadMapBeanX headMap;

            private List<String> heads;

            private List<DataMapListBeanX> dataMapList;

            public HeadMapBeanX getHeadMap() {
                return headMap;
            }

            public void setHeadMap(HeadMapBeanX headMap) {
                this.headMap = headMap;
            }

            public List<String> getHeads() {
                return heads;
            }

            public void setHeads(List<String> heads) {
                this.heads = heads;
            }

            public List<DataMapListBeanX> getDataMapList() {
                return dataMapList;
            }

            public void setDataMapList(List<DataMapListBeanX> dataMapList) {
                this.dataMapList = dataMapList;
            }

            public static class HeadMapBeanX {
                /**
                 * COUNT无 : 总量 MAXelapsed : 最大耗时 AVGelapsed : 平均耗时 daoMethodName : 方法名 daoName : 类名
                 */

                private String COUNT无;

                private String MAXelapsed;

                private String AVGelapsed;

                private String daoMethodName;

                private String daoName;

                public String getCOUNT无() {
                    return COUNT无;
                }

                public void setCOUNT无(String COUNT无) {
                    this.COUNT无 = COUNT无;
                }

                public String getMAXelapsed() {
                    return MAXelapsed;
                }

                public void setMAXelapsed(String MAXelapsed) {
                    this.MAXelapsed = MAXelapsed;
                }

                public String getAVGelapsed() {
                    return AVGelapsed;
                }

                public void setAVGelapsed(String AVGelapsed) {
                    this.AVGelapsed = AVGelapsed;
                }

                public String getDaoMethodName() {
                    return daoMethodName;
                }

                public void setDaoMethodName(String daoMethodName) {
                    this.daoMethodName = daoMethodName;
                }

                public String getDaoName() {
                    return daoName;
                }

                public void setDaoName(String daoName) {
                    this.daoName = daoName;
                }
            }

            public static class DataMapListBeanX {
                /**
                 * COUNT无 : 681277 MAXelapsed : 805639.0 AVGelapsed : 53.55 daoMethodName : queryPayrollDetailByEmployeeId daoName :
                 * PayrollDetailMapper
                 */

                private String COUNT无;

                private String MAXelapsed;

                private String AVGelapsed;

                private String daoMethodName;

                private String daoName;

                public String getCOUNT无() {
                    return COUNT无;
                }

                public void setCOUNT无(String COUNT无) {
                    this.COUNT无 = COUNT无;
                }

                public String getMAXelapsed() {
                    return MAXelapsed;
                }

                public void setMAXelapsed(String MAXelapsed) {
                    this.MAXelapsed = MAXelapsed;
                }

                public String getAVGelapsed() {
                    return AVGelapsed;
                }

                public void setAVGelapsed(String AVGelapsed) {
                    this.AVGelapsed = AVGelapsed;
                }

                public String getDaoMethodName() {
                    return daoMethodName;
                }

                public void setDaoMethodName(String daoMethodName) {
                    this.daoMethodName = daoMethodName;
                }

                public String getDaoName() {
                    return daoName;
                }

                public void setDaoName(String daoName) {
                    this.daoName = daoName;
                }
            }
        }

        public static class 服务异常统计Bean {
            /**
             * heads : ["serviceAppName","serviceName","serviceMethodName","COUNT无","MAXelapsed","AVGelapsed"] headMap :
             * {"COUNT无":"总量","MAXelapsed":"最大耗时","AVGelapsed":"平均耗时","serviceMethodName":"方法名","serviceAppName":"应用名","serviceName":"接口名"}
             * dataMapList : [{"COUNT无":"1009","MAXelapsed":"806665.0","AVGelapsed":"119625.84","serviceMethodName":"queryRelationList","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"307","MAXelapsed":"120468.0","AVGelapsed":"118630.82","serviceMethodName":"queryWebUserByOpenId","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"31","MAXelapsed":"805641.0","AVGelapsed":"142128.29","serviceMethodName":"queryUserConfig","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"215","MAXelapsed":"805641.0","AVGelapsed":"124103.33","serviceMethodName":"queryEmployeePayrollList","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"20","MAXelapsed":"199408.0","AVGelapsed":"84833.1","serviceMethodName":"queryEmployeePayrollDetailList","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"2","MAXelapsed":"120001.0","AVGelapsed":"60010.0","serviceMethodName":"updatePayrollOrDetail","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"145","MAXelapsed":"805641.0","AVGelapsed":"122129.1","serviceMethodName":"statisticsTodolist","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"1","MAXelapsed":"120007.0","AVGelapsed":"120007.0","serviceMethodName":"getTodolistItem","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"38","MAXelapsed":"4400.0","AVGelapsed":"634.34","serviceMethodName":"saveDeclarationInfo","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"33","MAXelapsed":"173976.0","AVGelapsed":"93171.42","serviceMethodName":"queryEmployeeTaxBillDetail","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"2","MAXelapsed":"120003.0","AVGelapsed":"60008.0","serviceMethodName":"statisticalEmployeeTaxBill","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"1","MAXelapsed":"120008.0","AVGelapsed":"120008.0","serviceMethodName":"saveComputeRule","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"26","MAXelapsed":"29.0","AVGelapsed":"14.5","serviceMethodName":"saveEmployeeReportFeedback","serviceAppName":"gaia","serviceName":"DeductionApi"},{"COUNT无":"6","MAXelapsed":"57.0","AVGelapsed":"49.17","serviceMethodName":"saveAdditionalDTOFromG2","serviceAppName":"gaia","serviceName":"DeductionApi"},{"COUNT无":"3","MAXelapsed":"120005.0","AVGelapsed":"80012.0","serviceMethodName":"addSerial","serviceAppName":"gaia","serviceName":"DeductionApi"},{"COUNT无":"34","MAXelapsed":"120014.0","AVGelapsed":"110828.71","serviceMethodName":"compute","serviceAppName":"gaia","serviceName":"TaxV2Api"},{"COUNT无":"33","MAXelapsed":"186.0","AVGelapsed":"62.94","serviceMethodName":"savePayrollRaw","serviceAppName":"gaia","serviceName":"PayrollRawApi"},{"COUNT无":"13","MAXelapsed":"120008.0","AVGelapsed":"110773.31","serviceMethodName":"chooseDefaultCompany","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"10","MAXelapsed":"120002.0","AVGelapsed":"120001.2","serviceMethodName":"updateSubscribeStatus","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"2","MAXelapsed":"120013.0","AVGelapsed":"60028.0","serviceMethodName":"wechatBind","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"4","MAXelapsed":"120003.0","AVGelapsed":"120001.5","serviceMethodName":"getPreferPayrollName","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"4","MAXelapsed":"120015.0","AVGelapsed":"120007.0","serviceMethodName":"queryPayrollInfo","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"1","MAXelapsed":"120001.0","AVGelapsed":"120001.0","serviceMethodName":"getPayrollInfo","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"1","MAXelapsed":"120001.0","AVGelapsed":"120001.0","serviceMethodName":"getPayrollRule","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"1","MAXelapsed":"120008.0","AVGelapsed":"120008.0","serviceMethodName":"queryHasPayrollMonth","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"9","MAXelapsed":"120003.0","AVGelapsed":"120002.33","serviceMethodName":"getPayrollInfo","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"2","MAXelapsed":"120011.0","AVGelapsed":"120006.0","serviceMethodName":"queryPayrollDetail","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"3","MAXelapsed":"120026.0","AVGelapsed":"120014.67","serviceMethodName":"statistic","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"2","MAXelapsed":"120004.0","AVGelapsed":"100195.0","serviceMethodName":"queryDeductEmployee","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"1","MAXelapsed":"120004.0","AVGelapsed":"120004.0","serviceMethodName":"countUnsyncEmployee","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"1","MAXelapsed":"805644.0","AVGelapsed":"805644.0","serviceMethodName":"queryEmployeeByEmployeeId","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"1","MAXelapsed":"120024.0","AVGelapsed":"120024.0","serviceMethodName":"queryPageByCondition","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"2","MAXelapsed":"120017.0","AVGelapsed":"120009.0","serviceMethodName":"addEmployee","serviceAppName":"gaia","serviceName":"EmployeeApi"},{"COUNT无":"1","MAXelapsed":"216.0","AVGelapsed":"216.0","serviceMethodName":"addEmployeeList","serviceAppName":"gaia","serviceName":"EmployeeApi"},{"COUNT无":"1","MAXelapsed":"120006.0","AVGelapsed":"120006.0","serviceMethodName":"getRemindDaysByCompanyId","serviceAppName":"gaia","serviceName":"EmployeeApi"},{"COUNT无":"1","MAXelapsed":"120005.0","AVGelapsed":"120005.0","serviceMethodName":"updateEmployee","serviceAppName":"gaia","serviceName":"EmployeeApi"},{"COUNT无":"2","MAXelapsed":"120003.0","AVGelapsed":"60008.5","serviceMethodName":"getByCompanyId","serviceAppName":"gaia","serviceName":"EmployeeDepartmentApi"},{"COUNT无":"2","MAXelapsed":"120017.0","AVGelapsed":"120014.0","serviceMethodName":"addEntranceEmployee","serviceAppName":"gaia","serviceName":"EmployeeEntranceApi"},{"COUNT无":"1","MAXelapsed":"120003.0","AVGelapsed":"120003.0","serviceMethodName":"scopeStatistics","serviceAppName":"gaia","serviceName":"DeductionQueryApi"},{"COUNT无":"1","MAXelapsed":"805649.0","AVGelapsed":"805649.0","serviceMethodName":"queryDimission","serviceAppName":"gaia","serviceName":"EmployeeDimissionApi"}]
             */

            private HeadMapBeanXX headMap;

            private List<String> heads;

            private List<DataMapListBeanXX> dataMapList;

            public HeadMapBeanXX getHeadMap() {
                return headMap;
            }

            public void setHeadMap(HeadMapBeanXX headMap) {
                this.headMap = headMap;
            }

            public List<String> getHeads() {
                return heads;
            }

            public void setHeads(List<String> heads) {
                this.heads = heads;
            }

            public List<DataMapListBeanXX> getDataMapList() {
                return dataMapList;
            }

            public void setDataMapList(List<DataMapListBeanXX> dataMapList) {
                this.dataMapList = dataMapList;
            }

            public static class HeadMapBeanXX {
                /**
                 * COUNT无 : 总量 MAXelapsed : 最大耗时 AVGelapsed : 平均耗时 serviceMethodName : 方法名 serviceAppName : 应用名 serviceName : 接口名
                 */

                private String COUNT无;

                private String MAXelapsed;

                private String AVGelapsed;

                private String serviceMethodName;

                private String serviceAppName;

                private String serviceName;

                public String getCOUNT无() {
                    return COUNT无;
                }

                public void setCOUNT无(String COUNT无) {
                    this.COUNT无 = COUNT无;
                }

                public String getMAXelapsed() {
                    return MAXelapsed;
                }

                public void setMAXelapsed(String MAXelapsed) {
                    this.MAXelapsed = MAXelapsed;
                }

                public String getAVGelapsed() {
                    return AVGelapsed;
                }

                public void setAVGelapsed(String AVGelapsed) {
                    this.AVGelapsed = AVGelapsed;
                }

                public String getServiceMethodName() {
                    return serviceMethodName;
                }

                public void setServiceMethodName(String serviceMethodName) {
                    this.serviceMethodName = serviceMethodName;
                }

                public String getServiceAppName() {
                    return serviceAppName;
                }

                public void setServiceAppName(String serviceAppName) {
                    this.serviceAppName = serviceAppName;
                }

                public String getServiceName() {
                    return serviceName;
                }

                public void setServiceName(String serviceName) {
                    this.serviceName = serviceName;
                }
            }

            public static class DataMapListBeanXX {
                /**
                 * COUNT无 : 1009 MAXelapsed : 806665.0 AVGelapsed : 119625.84 serviceMethodName : queryRelationList serviceAppName : gaia
                 * serviceName : IndividualQueryApi
                 */

                private String COUNT无;

                private String MAXelapsed;

                private String AVGelapsed;

                private String serviceMethodName;

                private String serviceAppName;

                private String serviceName;

                public String getCOUNT无() {
                    return COUNT无;
                }

                public void setCOUNT无(String COUNT无) {
                    this.COUNT无 = COUNT无;
                }

                public String getMAXelapsed() {
                    return MAXelapsed;
                }

                public void setMAXelapsed(String MAXelapsed) {
                    this.MAXelapsed = MAXelapsed;
                }

                public String getAVGelapsed() {
                    return AVGelapsed;
                }

                public void setAVGelapsed(String AVGelapsed) {
                    this.AVGelapsed = AVGelapsed;
                }

                public String getServiceMethodName() {
                    return serviceMethodName;
                }

                public void setServiceMethodName(String serviceMethodName) {
                    this.serviceMethodName = serviceMethodName;
                }

                public String getServiceAppName() {
                    return serviceAppName;
                }

                public void setServiceAppName(String serviceAppName) {
                    this.serviceAppName = serviceAppName;
                }

                public String getServiceName() {
                    return serviceName;
                }

                public void setServiceName(String serviceName) {
                    this.serviceName = serviceName;
                }
            }
        }

        public static class 服务统计报表Bean {
            /**
             * heads : ["serviceAppName","serviceName","serviceMethodName","COUNT无","MAXelapsed","AVGelapsed"] headMap :
             * {"COUNT无":"总量","MAXelapsed":"最大耗时","AVGelapsed":"平均耗时","serviceMethodName":"方法名","serviceAppName":"应用名","serviceName":"接口名"}
             * dataMapList : [{"COUNT无":"1182835","MAXelapsed":"806665.0","AVGelapsed":"117.21","serviceMethodName":"queryRelationList","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"666701","MAXelapsed":"826.0","AVGelapsed":"2.57","serviceMethodName":"queryWebUserById","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"601465","MAXelapsed":"120468.0","AVGelapsed":"72.84","serviceMethodName":"queryWebUserByOpenId","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"587435","MAXelapsed":"1108.0","AVGelapsed":"2.41","serviceMethodName":"isWechatPass","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"583442","MAXelapsed":"805641.0","AVGelapsed":"22.27","serviceMethodName":"queryUserConfig","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"3151","MAXelapsed":"784.0","AVGelapsed":"42.63","serviceMethodName":"queryEmployeeWechatMap","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"405","MAXelapsed":"444.0","AVGelapsed":"9.4","serviceMethodName":"queryWebUserByMobile","serviceAppName":"gaia","serviceName":"IndividualQueryApi"},{"COUNT无":"680885","MAXelapsed":"805641.0","AVGelapsed":"66.32","serviceMethodName":"queryEmployeePayrollList","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"187869","MAXelapsed":"199408.0","AVGelapsed":"34.97","serviceMethodName":"queryEmployeePayrollDetailList","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"113276","MAXelapsed":"120001.0","AVGelapsed":"28.57","serviceMethodName":"updatePayrollOrDetail","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"6123","MAXelapsed":"1923.0","AVGelapsed":"60.99","serviceMethodName":"queryPayrollAndDetail","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"5558","MAXelapsed":"467.0","AVGelapsed":"17.05","serviceMethodName":"savePayrollRule","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"5553","MAXelapsed":"2551.0","AVGelapsed":"93.73","serviceMethodName":"savePayroll","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"1615","MAXelapsed":"1580.0","AVGelapsed":"219.43","serviceMethodName":"deletePayroll","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"280","MAXelapsed":"870.0","AVGelapsed":"176.39","serviceMethodName":"repealPayrollDetail","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"110","MAXelapsed":"379.0","AVGelapsed":"25.07","serviceMethodName":"queryPayrollByDetailId","serviceAppName":"gaia","serviceName":"SalaryApi"},{"COUNT无":"81235","MAXelapsed":"120026.0","AVGelapsed":"64.33","serviceMethodName":"statistic","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"54905","MAXelapsed":"120024.0","AVGelapsed":"31.05","serviceMethodName":"queryPageByCondition","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"51532","MAXelapsed":"2737.0","AVGelapsed":"26.03","serviceMethodName":"queryAllEmployeeByCompanyId","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"49320","MAXelapsed":"120004.0","AVGelapsed":"45.95","serviceMethodName":"countUnsyncEmployee","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"43419","MAXelapsed":"805644.0","AVGelapsed":"63.45","serviceMethodName":"queryEmployeeByEmployeeId","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"25830","MAXelapsed":"407.0","AVGelapsed":"12.71","serviceMethodName":"queryAllEmployeeByEmployeeIds","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"6778","MAXelapsed":"120004.0","AVGelapsed":"61.78","serviceMethodName":"queryDeductEmployee","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"1771","MAXelapsed":"697.0","AVGelapsed":"13.33","serviceMethodName":"queryToSyncEmployee","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"857","MAXelapsed":"418.0","AVGelapsed":"15.01","serviceMethodName":"queryEmployeeByCompanyId","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"563","MAXelapsed":"469.0","AVGelapsed":"28.15","serviceMethodName":"contractStat","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"557","MAXelapsed":"828.0","AVGelapsed":"18.73","serviceMethodName":"getByCompanyIdWithoutDimission","serviceAppName":"gaia","serviceName":"EmployeeQueryApi"},{"COUNT无":"261581","MAXelapsed":"805641.0","AVGelapsed":"83.32","serviceMethodName":"statisticsTodolist","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"30017","MAXelapsed":"482.0","AVGelapsed":"11.04","serviceMethodName":"queryTodolist","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"1974","MAXelapsed":"120007.0","AVGelapsed":"71.22","serviceMethodName":"getTodolistItem","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"206","MAXelapsed":"101.0","AVGelapsed":"47.5","serviceMethodName":"dealTodolist","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"36","MAXelapsed":"377.0","AVGelapsed":"102.17","serviceMethodName":"createTodolistItemByMaintainNotice","serviceAppName":"gaia","serviceName":"TodolistApi"},{"COUNT无":"262400","MAXelapsed":"1039.0","AVGelapsed":"2.68","serviceMethodName":"queryClientServiceList","serviceAppName":"gaia","serviceName":"SelfServiceApi"},{"COUNT无":"5529","MAXelapsed":"486.0","AVGelapsed":"2.73","serviceMethodName":"queryBusinessServiceList","serviceAppName":"gaia","serviceName":"SelfServiceApi"},{"COUNT无":"155","MAXelapsed":"38.0","AVGelapsed":"5.72","serviceMethodName":"queryOrderCount","serviceAppName":"gaia","serviceName":"SelfServiceApi"},{"COUNT无":"27","MAXelapsed":"40.0","AVGelapsed":"32.41","serviceMethodName":"orderSelfService","serviceAppName":"gaia","serviceName":"SelfServiceApi"},{"COUNT无":"113379","MAXelapsed":"173976.0","AVGelapsed":"64.86","serviceMethodName":"queryEmployeeTaxBillDetail","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"32319","MAXelapsed":"478.0","AVGelapsed":"9.61","serviceMethodName":"queryComputeRule","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"25136","MAXelapsed":"1651.0","AVGelapsed":"28.83","serviceMethodName":"queryEmployeeTaxBill","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"9238","MAXelapsed":"120003.0","AVGelapsed":"34.55","serviceMethodName":"statisticalEmployeeTaxBill","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"3469","MAXelapsed":"120008.0","AVGelapsed":"61.12","serviceMethodName":"saveComputeRule","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"541","MAXelapsed":"4400.0","AVGelapsed":"175.48","serviceMethodName":"saveDeclarationInfo","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"523","MAXelapsed":"1119.0","AVGelapsed":"43.65","serviceMethodName":"getTaxBill","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"301","MAXelapsed":"550.0","AVGelapsed":"34.24","serviceMethodName":"statisticPushTaxBill","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"120","MAXelapsed":"212.0","AVGelapsed":"33.74","serviceMethodName":"queryPushTaxDetail","serviceAppName":"gaia","serviceName":"TaxApi"},{"COUNT无":"63738","MAXelapsed":"120015.0","AVGelapsed":"23.43","serviceMethodName":"queryPayrollInfo","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"28243","MAXelapsed":"1007.0","AVGelapsed":"21.69","serviceMethodName":"queryPayrollDetail","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"23860","MAXelapsed":"120001.0","AVGelapsed":"14.83","serviceMethodName":"getPayrollInfo","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"12293","MAXelapsed":"120001.0","AVGelapsed":"20.33","serviceMethodName":"getPayrollRule","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"11761","MAXelapsed":"120003.0","AVGelapsed":"52.52","serviceMethodName":"getPreferPayrollName","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"9431","MAXelapsed":"456.0","AVGelapsed":"10.31","serviceMethodName":"getPayrollStatistics","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"9350","MAXelapsed":"529.0","AVGelapsed":"10.01","serviceMethodName":"getEmpIdList","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"8424","MAXelapsed":"120008.0","AVGelapsed":"24.14","serviceMethodName":"queryHasPayrollMonth","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"3252","MAXelapsed":"1054.0","AVGelapsed":"53.67","serviceMethodName":"queryPayrollDetailByPayrollIdList","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"180","MAXelapsed":"32.0","AVGelapsed":"17.61","serviceMethodName":"removePayrollRule","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"12","MAXelapsed":"16.0","AVGelapsed":"11.25","serviceMethodName":"getTaxMonthRange","serviceAppName":"gaia","serviceName":"PayrollQueryApi"},{"COUNT无":"58684","MAXelapsed":"120003.0","AVGelapsed":"28.15","serviceMethodName":"getPayrollInfo","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"51264","MAXelapsed":"120011.0","AVGelapsed":"29.4","serviceMethodName":"queryPayrollDetail","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"36124","MAXelapsed":"538.0","AVGelapsed":"9.52","serviceMethodName":"getEmpIdList","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"7942","MAXelapsed":"13702.0","AVGelapsed":"64.3","serviceMethodName":"getPayrollInfoRepeat","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"7043","MAXelapsed":"520.0","AVGelapsed":"10.48","serviceMethodName":"getEmpIdSetByExcelCacheIds","serviceAppName":"gaia","serviceName":"PayrollRawQueryApi"},{"COUNT无":"64263","MAXelapsed":"505.0","AVGelapsed":"2.5","serviceMethodName":"saveWechatPassValidation","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"9272","MAXelapsed":"547.0","AVGelapsed":"46.79","serviceMethodName":"addCompanyRelation","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"8557","MAXelapsed":"120013.0","AVGelapsed":"83.29","serviceMethodName":"wechatBind","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"7479","MAXelapsed":"923.0","AVGelapsed":"25.91","serviceMethodName":"saveUserConfig","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"6916","MAXelapsed":"120002.0","AVGelapsed":"218.1","serviceMethodName":"updateSubscribeStatus","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"6365","MAXelapsed":"120008.0","AVGelapsed":"254.3","serviceMethodName":"chooseDefaultCompany","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"1206","MAXelapsed":"427.0","AVGelapsed":"27.69","serviceMethodName":"setWechatPassword","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"726","MAXelapsed":"432.0","AVGelapsed":"33.97","serviceMethodName":"wechatUnBind","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"272","MAXelapsed":"242.0","AVGelapsed":"57.33","serviceMethodName":"removeCompany","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"228","MAXelapsed":"94364.0","AVGelapsed":"445.74","serviceMethodName":"h5LoginIncludeRegister","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"114","MAXelapsed":"62.0","AVGelapsed":"24.92","serviceMethodName":"setH5Password","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"1","MAXelapsed":"49.0","AVGelapsed":"49.0","serviceMethodName":"certificateCompany","serviceAppName":"gaia","serviceName":"IndividualApi"},{"COUNT无":"41962","MAXelapsed":"237.0","AVGelapsed":"1.08","serviceMethodName":"queryBusinessParameterValue","serviceAppName":"gaia","serviceName":"BusinessParameterApi"},{"COUNT无":"23762","MAXelapsed":"118.0","AVGelapsed":"4.8","serviceMethodName":"queryBusinessParameter","serviceAppName":"gaia","serviceName":"BusinessParameterApi"},{"COUNT无":"18343","MAXelapsed":"1176.0","AVGelapsed":"68.07","serviceMethodName":"queryHaveAdditionalSnapshootEmployeeIdList","serviceAppName":"gaia","serviceName":"SnapshootQueryApi"},{"COUNT无":"11969","MAXelapsed":"498.0","AVGelapsed":"10.4","serviceMethodName":"queryCompanyHaveAccumulativeMonthList","serviceAppName":"gaia","serviceName":"SnapshootQueryApi"},{"COUNT无":"11946","MAXelapsed":"520.0","AVGelapsed":"10.93","serviceMethodName":"queryHaveAccumulativeEmployeeIdList","serviceAppName":"gaia","serviceName":"SnapshootQueryApi"},{"COUNT无":"9351","MAXelapsed":"803.0","AVGelapsed":"16.88","serviceMethodName":"queryEmployeeAccumulativeInfo","serviceAppName":"gaia","serviceName":"SnapshootQueryApi"},{"COUNT无":"6180","MAXelapsed":"2648.0","AVGelapsed":"86.59","serviceMethodName":"queryAdditionalSpecialDeduct","serviceAppName":"gaia","serviceName":"SnapshootQueryApi"},{"COUNT无":"17798","MAXelapsed":"50247.0","AVGelapsed":"330.3","serviceMethodName":"updatePayrollDetail","serviceAppName":"gaia","serviceName":"PayrollRawApi"},{"COUNT无":"17622","MAXelapsed":"448.0","AVGelapsed":"19.91","serviceMethodName":"updatePayrollInfo","serviceAppName":"gaia","serviceName":"PayrollRawApi"},{"COUNT无":"12559","MAXelapsed":"4114.0","AVGelapsed":"106.41","serviceMethodName":"savePayrollRaw","serviceAppName":"gaia","serviceName":"PayrollRawApi"},{"COUNT无":"8929","MAXelapsed":"21019.0","AVGelapsed":"330.99","serviceMethodName":"matchPayrollRawEmployee","serviceAppName":"gaia","serviceName":"PayrollRawApi"},{"COUNT无":"53123","MAXelapsed":"805.0","AVGelapsed":"2.75","serviceMethodName":"getFunctionLimitByLocationCode","serviceAppName":"gaia","serviceName":"FunctionLimitApi"},{"COUNT无":"43158","MAXelapsed":"120003.0","AVGelapsed":"16.07","serviceMethodName":"getByCompanyId","serviceAppName":"gaia","serviceName":"EmployeeDepartmentApi"},{"COUNT无":"256","MAXelapsed":"199.0","AVGelapsed":"24.8","serviceMethodName":"addDepartment","serviceAppName":"gaia","serviceName":"EmployeeDepartmentApi"},{"COUNT无":"103","MAXelapsed":"69.0","AVGelapsed":"6.15","serviceMethodName":"getSubDepartments","serviceAppName":"gaia","serviceName":"EmployeeDepartmentApi"},{"COUNT无":"44","MAXelapsed":"62.0","AVGelapsed":"29.55","serviceMethodName":"updateDepartment","serviceAppName":"gaia","serviceName":"EmployeeDepartmentApi"},{"COUNT无":"3","MAXelapsed":"137.0","AVGelapsed":"70.67","serviceMethodName":"deleteDepartment","serviceAppName":"gaia","serviceName":"EmployeeDepartmentApi"},{"COUNT无":"42752","MAXelapsed":"12908.0","AVGelapsed":"9.06","serviceMethodName":"selectByCompanyId","serviceAppName":"gaia","serviceName":"EmployeePositionApi"},{"COUNT无":"265","MAXelapsed":"307.0","AVGelapsed":"49.72","serviceMethodName":"addPosition","serviceAppName":"gaia","serviceName":"EmployeePositionApi"},{"COUNT无":"40","MAXelapsed":"139.0","AVGelapsed":"100.38","serviceMethodName":"updatePosition","serviceAppName":"gaia","serviceName":"EmployeePositionApi"},{"COUNT无":"9","MAXelapsed":"139.0","AVGelapsed":"73.44","serviceMethodName":"deletePosition","serviceAppName":"gaia","serviceName":"EmployeePositionApi"},{"COUNT无":"30622","MAXelapsed":"272.0","AVGelapsed":"4.32","serviceMethodName":"getEmployees","serviceAppName":"gaia","serviceName":"GaiaEmployeeApi"},{"COUNT无":"9496","MAXelapsed":"457.0","AVGelapsed":"6.62","serviceMethodName":"getEmployeeList","serviceAppName":"gaia","serviceName":"GaiaEmployeeApi"},{"COUNT无":"1581","MAXelapsed":"1419.0","AVGelapsed":"24.35","serviceMethodName":"getByName","serviceAppName":"gaia","serviceName":"GaiaEmployeeApi"},{"COUNT无":"22505","MAXelapsed":"120005.0","AVGelapsed":"28.21","serviceMethodName":"addSerial","serviceAppName":"gaia","serviceName":"DeductionApi"},{"COUNT无":"5778","MAXelapsed":"649.0","AVGelapsed":"101.95","serviceMethodName":"deleteAllAdditionalInPhysical","serviceAppName":"gaia","serviceName":"DeductionApi"},{"COUNT无":"5630","MAXelapsed":"6005.0","AVGelapsed":"204.76","serviceMethodName":"saveAdditionalDTOFromG2","serviceAppName":"gaia","serviceName":"DeductionApi"}]
             */

            private HeadMapBeanXXX headMap;

            private List<String> heads;

            private List<DataMapListBeanXXX> dataMapList;

            public HeadMapBeanXXX getHeadMap() {
                return headMap;
            }

            public void setHeadMap(HeadMapBeanXXX headMap) {
                this.headMap = headMap;
            }

            public List<String> getHeads() {
                return heads;
            }

            public void setHeads(List<String> heads) {
                this.heads = heads;
            }

            public List<DataMapListBeanXXX> getDataMapList() {
                return dataMapList;
            }

            public void setDataMapList(List<DataMapListBeanXXX> dataMapList) {
                this.dataMapList = dataMapList;
            }

            public static class HeadMapBeanXXX {
                /**
                 * COUNT无 : 总量 MAXelapsed : 最大耗时 AVGelapsed : 平均耗时 serviceMethodName : 方法名 serviceAppName : 应用名 serviceName : 接口名
                 */

                private String COUNT无;

                private String MAXelapsed;

                private String AVGelapsed;

                private String serviceMethodName;

                private String serviceAppName;

                private String serviceName;

                public String getCOUNT无() {
                    return COUNT无;
                }

                public void setCOUNT无(String COUNT无) {
                    this.COUNT无 = COUNT无;
                }

                public String getMAXelapsed() {
                    return MAXelapsed;
                }

                public void setMAXelapsed(String MAXelapsed) {
                    this.MAXelapsed = MAXelapsed;
                }

                public String getAVGelapsed() {
                    return AVGelapsed;
                }

                public void setAVGelapsed(String AVGelapsed) {
                    this.AVGelapsed = AVGelapsed;
                }

                public String getServiceMethodName() {
                    return serviceMethodName;
                }

                public void setServiceMethodName(String serviceMethodName) {
                    this.serviceMethodName = serviceMethodName;
                }

                public String getServiceAppName() {
                    return serviceAppName;
                }

                public void setServiceAppName(String serviceAppName) {
                    this.serviceAppName = serviceAppName;
                }

                public String getServiceName() {
                    return serviceName;
                }

                public void setServiceName(String serviceName) {
                    this.serviceName = serviceName;
                }
            }

            public static class DataMapListBeanXXX {
                /**
                 * COUNT无 : 1182835 MAXelapsed : 806665.0 AVGelapsed : 117.21 serviceMethodName : queryRelationList serviceAppName : gaia
                 * serviceName : IndividualQueryApi
                 */

                private String COUNT无;

                private String MAXelapsed;

                private String AVGelapsed;

                private String serviceMethodName;

                private String serviceAppName;

                private String serviceName;

                public String getCOUNT无() {
                    return COUNT无;
                }

                public void setCOUNT无(String COUNT无) {
                    this.COUNT无 = COUNT无;
                }

                public String getMAXelapsed() {
                    return MAXelapsed;
                }

                public void setMAXelapsed(String MAXelapsed) {
                    this.MAXelapsed = MAXelapsed;
                }

                public String getAVGelapsed() {
                    return AVGelapsed;
                }

                public void setAVGelapsed(String AVGelapsed) {
                    this.AVGelapsed = AVGelapsed;
                }

                public String getServiceMethodName() {
                    return serviceMethodName;
                }

                public void setServiceMethodName(String serviceMethodName) {
                    this.serviceMethodName = serviceMethodName;
                }

                public String getServiceAppName() {
                    return serviceAppName;
                }

                public void setServiceAppName(String serviceAppName) {
                    this.serviceAppName = serviceAppName;
                }

                public String getServiceName() {
                    return serviceName;
                }

                public void setServiceName(String serviceName) {
                    this.serviceName = serviceName;}}}}}
