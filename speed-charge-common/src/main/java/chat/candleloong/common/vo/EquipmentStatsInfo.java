package chat.candleloong.common.vo;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class EquipmentStatsInfo {

    /*设备编码 (必填) 23位*/
    private String equipmentID;
    /*充电设备接口累计电量 (必填) 小数点1位*/
    private Double equipmentElectricity;
    /*充电设备接口统计信息列表 (必填) */
    private String connectorStatsInfos;
}
