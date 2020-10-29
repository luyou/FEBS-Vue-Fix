package cc.mrbird.febs.system.domain;

import cc.mrbird.febs.common.converter.TimeConverter;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wuwenze.poi.annotation.Excel;
import com.wuwenze.poi.annotation.ExcelField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("t_log")
@Excel("系统日志表")
public class SysLog implements Serializable {

    private static final long serialVersionUID = -8878596941954995444L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    @ExcelField(value = "操作人")
    private String username;

    @ExcelField(value = "操作描述")
    @TableField(value = "\"OPERATION\"")
    private String operation;

    @ExcelField(value = "耗时（毫秒）")
    @TableField(value = "\"TIME\"")
    private Long time;

    @ExcelField(value = "执行方法")
    @TableField(value = "\"METHOD\"")
    private String method;

    @ExcelField(value = "方法参数")
    private String params;

    @ExcelField(value = "IP地址")
    private String ip;

    @ExcelField(value = "操作时间", writeConverter = TimeConverter.class)
    private Date createTime;

    private transient String createTimeFrom;
    private transient String createTimeTo;

    @ExcelField(value = "操作地点")
    @TableField(value = "\"LOCATION\"")
    private String location;

}