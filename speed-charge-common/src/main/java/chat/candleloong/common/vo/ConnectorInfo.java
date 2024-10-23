package chat.candleloong.common.vo;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class ConnectorInfo {

    /*充电设备接口编码 (必填) 小于等于26位*/
    private String connectorID;
    /*充电设备接口名称 30位*/
    private String connectorName;
    /*充电设备接口类型 (必填)*/
    private Integer connectorType;
    /*额定电压上限 (必填)*/
    private Integer voltageUpperLimits;
    /*额定电压下限 (必填)*/
    private Integer voltageLowerLimits;
    /*额定电流 (必填)*/
    private Integer current;
    /*额定功率 (必填) 小数点后1位*/
    private Double power;
    /*车位号*/
    private String parkNo;
    /*国家标准 (必填) */
    private Integer nationalStandard;
}
