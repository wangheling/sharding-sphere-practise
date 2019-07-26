package com.heling.rule;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @Author: wangheling
 * @Date: 2019/7/26 11:27
 * @Description: 自定义user表分库规则，如果name长度小于3，则放入0库
 */
public class UserDatabaseShardingAlgorithm implements PreciseShardingAlgorithm<String> {

    @Override
    public String doSharding(Collection<String> databaseNames, PreciseShardingValue<String> preciseShardingValue) {
        if (preciseShardingValue.getValue().length() < 3) {
            return "sharding0";
        } else {
            return "sharding1";
        }
    }
}
