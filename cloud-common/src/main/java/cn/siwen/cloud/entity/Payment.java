package cn.siwen.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shkstart
 * @create 2020-11-02 9:05
 * @email 251830091@qq.com
 */
@Data
@AllArgsConstructor //自动生成有参构造
@NoArgsConstructor  //无参构造
public class Payment {
    private long id;
    private String serial;
}
