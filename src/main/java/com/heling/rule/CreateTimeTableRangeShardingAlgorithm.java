package com.heling.rule;

import com.google.common.collect.Range;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2019/12/24 14:14
 */
public class CreateTimeTableRangeShardingAlgorithm implements RangeShardingAlgorithm<Long> {


    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, RangeShardingValue<Long> shardingValue) {
        Range<Long> valueRange = shardingValue.getValueRange();
        Long lowerEndpoint = valueRange.lowerEndpoint();
        Long upperEndpoint = valueRange.upperEndpoint();

        //201910
        String low = new SimpleDateFormat("yyyyMM").format(lowerEndpoint);
        //201912
        String up = new SimpleDateFormat("yyyyMM").format(upperEndpoint);

        Collection<String> collect = new LinkedHashSet<>();
        for (String tableName : availableTargetNames) {
            String suffix = tableName.substring(tableName.length() - 6);
            if (Integer.valueOf(suffix) >= Integer.valueOf(low) && Integer.valueOf(suffix) <= Integer.valueOf(up)) {
                collect.add(tableName);
            }
        }
        //最终路由到的表集合
        return collect;
    }

}
