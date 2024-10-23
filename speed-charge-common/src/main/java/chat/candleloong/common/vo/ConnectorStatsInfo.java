package chat.candleloong.common.vo;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class ConnectorStatsInfo {

    /*充电设备接口编码 (必填) 26位*/
    private String connectorID;
    /*充电设备接口累计电量 小数点1位*/
    private Double connectorElectricity;
}
