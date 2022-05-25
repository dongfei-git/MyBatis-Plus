package tech.dongfei.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;
import tech.dongfei.mybatisplus.enums.SexEnum;

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

    private SexEnum sex;

    private String email;

    @TableLogic  //逻辑删除功能
    private Integer isDeleted;
}
