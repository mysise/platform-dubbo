package org.mysise.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@TableName("sys_user")
public class User extends Model<User> {

    private int id;

    private String name;

    private int sex;

    private int age;
}
