package org.mysise.demo.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
public class DemoEntity extends Model {

    private int id;

    private int sex;
}
