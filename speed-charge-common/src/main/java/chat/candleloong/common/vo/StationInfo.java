package chat.candleloong.common.vo;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class StationInfo {

    /*充电站ID （必填）小于等于20位*/
    private String stationID;
    /*运营商ID （必填）9位*/
    private String operatorID;
    /*设备所属方ID （必填）9位*/
    private String equipmentOwnerID;
    /*充电站名称 （必填）*/
    private String stationName;
    /*充电站国家代码 （必填）*/
    private String countryCode = "CN";
    /*充电站省市辖区编码 （必填）20位*/
    private String areaCode;
    /*详细地址 （必填）*/
    private String address;
    /*站点电话*/
    private String stationTel;
    /*服务电话 （必填）*/
    private String serviceTel;
    /*站点类型 （必填）*/
    private Integer stationType;
    /*站点状态 （必填）*/
    private Integer stationStatus;
    /*车位数量 （必填）*/
    private Integer parkNums;
    /*经度 （必填）小数点后6位*/
    private Float stationLng;
    /*纬度 （必填）小数点后6位*/
    private Float stationLat;
    /*站点引导*/
    private String siteGuide;
    /*建设场所 （必填）*/
    private Integer construction;
    /*站点照片*/
    private String[] pictures = new String[5];
    /*使用车型描述*/
    private String matchCars;
    /*车位楼层及数量描述*/
    private String parkInfo;
    /*营业时间*/
    private String busineHours;
    /*充电电费率*/
    private String electricityFee;
    /*服务费率*/
    private String serviceFee;
    /*停车费*/
    private String parkFee;
    /*支付方式*/
    private String payment;
    /*是否支持预约*/
    private Integer supportOrder;
    /*备注*/
    private String remark;
    /*充电设备信息列表 （必填）*/
    private List<EquipmentInfo> equipmentInfos;

}
