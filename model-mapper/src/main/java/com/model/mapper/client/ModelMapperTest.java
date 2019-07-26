package com.model.mapper.client;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-26 - 10:49
 */
public class ModelMapperTest {


    private static AppleDTO convert(Apple apple) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(apple, AppleDTO.class);
    }

    private static AppleDTO convert2(Apple apple) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
            //LOOSE松散策略
            .setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper.map(apple, AppleDTO.class);
    }

    private static PropertyMap<AppleDTO, AppleVO> customField() {
        /*
         * 自定义映射规则
         */
        return new PropertyMap<AppleDTO, AppleVO>() {
            @Override
            protected void configure() {
                //使用自定义转换规则
                map(source.getCreate_age(), destination.getCreateAge());
            }
        };
    }

    private static AppleVO convert3(AppleDTO appleDTO) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(customField());
        return modelMapper.map(appleDTO, AppleVO.class);
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setId("1");
        apple.setName("红富士");
        AppleDTO appleDTO = convert(apple);
        System.out.println(appleDTO);

        appleDTO = convert2(apple);
        System.out.println(appleDTO);

        appleDTO.setCreate_age("5");
        AppleVO appleVO = convert3(appleDTO);
        System.out.println(appleVO);
    }
}
