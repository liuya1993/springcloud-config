package cn.siwen.cloud.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

/**
 * @author shkstart
 * @create 2020-11-04 8:40
 * @email 251830091@qq.com
 */

@Configuration
public class AppcationContextConfig {
   @Bean
   @LoadBalanced  //负载均衡 轮询
   RestTemplate restTemplate(){
       return new RestTemplate();
  }
}
