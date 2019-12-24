package com.heling.rule;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.text.SimpleDateFormat;
import java.util.Collection;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2019/12/24 14:14
 */
public class CreateTimeTableShardingAlgorithm implements PreciseShardingAlgorithm<Long> {

    private static final String tablePrefix = "user_";


    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {

        

        Long createTime = preciseShardingValue.getValue();

        String month = new SimpleDateFormat("yyyyMM").format(createTime);

        return tablePrefix + month;
    }
}
