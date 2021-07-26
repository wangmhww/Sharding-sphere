package com.wm.shardingspherejdbc.strategy;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @author: wangm
 * @date: 2021/7/23 17:04
 * @Description
 */
@Slf4j
public class TablePreciseShardingAlgorithm implements PreciseShardingAlgorithm<Long>{
    @Override
    public String doSharding(Collection<String> tableNames, PreciseShardingValue<Long> id) {
        String idStr = id.toString();
        String shardingValue = idStr.substring(idStr.length() - 3, idStr.length() -2 );
        log.info("需要分片的主键Id={}, 分片计算的原始值={}", id.toString(), shardingValue);
        String value = Integer.valueOf(shardingValue) % tableNames.size() + "";
        log.info("分片的大小={},落在分片的位置={}", tableNames.size(), value);
        for (String tableName: tableNames) {
            if (tableName.endsWith(value)) {
                return tableName;
            }
        }
        log.error("未找到数据库分片：分片主键={}", id);
        throw new IllegalArgumentException();
    }
}
