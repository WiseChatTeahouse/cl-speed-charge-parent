package chat.candleloong.common.vo;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class StationStatsInfo {

    /*充电站ID (必填) 小于等于20位*/
    private String stationID;
    /*统计的开始时间 (必填) 10位*/
    private String startTime;
    /*统计结束时间 (必填) 10位*/
    private String endTime;
    /*充电站累计电量 (必填) 小数点后1位*/
    private Double stationElectricity;
    /*充电设备统计信息列表 (必填) */
    private List<EquipmentStatsInfo> equipmentStatsInfos;
}
