package tech.dongfei.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
@Data
//@TableName("t_user")
public class User {

    @TableId(value = "uid",type = IdType.AUTO)   //将属性对应的字段指定为主键
    private Long id;

    @TableField("user_name")
    private String name;

    private Integer age;

    private String email;

    @TableLogic  //逻辑删除功能
    private Integer isDeleted;
}
