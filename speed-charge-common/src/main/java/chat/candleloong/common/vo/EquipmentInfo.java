package chat.candleloong.common.vo;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class EquipmentInfo {

    /*设备编码 （必填）*/
    private String equipmentID;
    /*设备生产商组织机构代码 9位*/
    private String manufacturerID;
    /*设备生产商名称 30位*/
    private String manufacturerName;
    /*设备型号 20位*/
    private String equipmentModel;
    /*设备生产日期 10位*/
    private String productionDate;
    /*设备类型 （必填）*/
    private Integer equipmentType;
    /*充电设备接口信息列表 （必填）*/
    private List<ConnectorInfo> connectorInfos;
    /*充电设备经度 小数点后6位*/
    private String equipmentLng;
    /*充电设备纬度 小数点后6位*/
    private String equipmentLat;
    /*充电设备总功率 （必填）小数点后1位*/
    private String power;
    /*充电设备名称 30位*/
    private String equipmentName;

}
