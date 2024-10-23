package chat.candleloong.common.vo;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class ConnectorStatusInfo {

    /*充电设备接口编码 (必填) 小于等于26位*/
    private String connectorID;
    /*充电设备接口状态 (必填) */
    private Integer status;
    /*车位状态*/
    private Integer parkStatus;
    /*地锁状态*/
    private Integer lockStatus;
}
