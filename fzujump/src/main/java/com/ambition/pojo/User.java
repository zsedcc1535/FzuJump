package com.ambition.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Ambition
 * @since 2022-11-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户编码(token)")
    @TableField("userCode")
    private String userCode;

    @ApiModelProperty(value = "用户名称")
    @TableField("userName")
    private String userName;

    @ApiModelProperty(value = "用户密码")
    @TableField("userPassword")
    private String userPassword;

    @ApiModelProperty(value = "用户角色（取自角色表-角色id）")
    @TableField("userRole")
    private Long userRole;

    @ApiModelProperty(value = "创建者")
    @TableField("createdBy")
    private Long createdBy;

    @ApiModelProperty(value = "修改者")
    @TableField("modifyBy")
    private Long modifyBy;

    @ApiModelProperty(value = "修改时间")
    @TableField(value = "modifyDate", fill = FieldFill.INSERT_UPDATE)
    private Date modifyDate;


}
