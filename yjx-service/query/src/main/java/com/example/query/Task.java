package com.example.query;

import com.example.query.entity.order;
import com.example.query.mapper.orderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class Task {
    @Autowired
    private orderMapper orderMapper;
    @Resource
    private RedisTemplate redisTemplate;
    @Scheduled(cron = "0 0 1 * * ?")
    public void delete(){
        orderMapper.delete();
        String key="order";
        ValueOperations<String, List<order>> operations= redisTemplate.opsForValue();
        boolean hasKey=redisTemplate.hasKey(key);
        if(hasKey){
            redisTemplate.delete(key);
        }
    }
}
