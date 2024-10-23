package chat.candleloong.common.vo;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class StationStatusInfo {

    /*充电站ID (必填) 小于等于20位*/
    private String stationID;
    /*充电设备接口状态列表 (必填)*/
    private List<ConnectorStatusInfo> connectorStatusInfos;
}
