package com.java8.demo.lambda;

import com.boot.demo.common.model.Bill;
import com.boot.demo.common.model.BillDTO;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 类说明：
 *
 * @author janita
 * @since 2019-01-21 - 14:47
 */
public class ReduceTest {

    public static void main(String[] args) {
        Bill b1 = new Bill("1", 1);
        Bill b2 = new Bill("1", 2);
        Bill b3 = new Bill("2", 2);
        List<Bill> list = Lists.newArrayList(b1, b2, b3);
        Map<String, BillDTO> billDTOMap = list.stream()
            .collect(Collectors.groupingBy(Bill::getUserId, Collectors.reducing(new BillDTO(), ReduceTest::trans, ReduceTest::add)));
        System.out.println(billDTOMap);
    }

    private static BillDTO trans(Bill bill) {
        BillDTO dto = new BillDTO();
        BeanUtils.copyProperties(bill, dto);
        return dto;
    }

    private static BillDTO add(BillDTO dto, BillDTO billDTO) {
        dto.setMoney(dto.getMoney() + billDTO.getMoney());
        return dto;
    }
}
