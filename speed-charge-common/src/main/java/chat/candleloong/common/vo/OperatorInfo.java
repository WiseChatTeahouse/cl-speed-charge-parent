package chat.candleloong.common.vo;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class OperatorInfo {

    /*组织机构代码 （必填） 9位*/
    private String operatorID;
    /*机构全称 （必填） 小于等于64位*/
    private String operatorName;
    /*运营商客服电话1 （必填）小于等于32位 */
    private String operatorTel1;
    /*运营商客服电话2 小于等于32位 */
    private String operatorTel2;
    /*运营商注册地址 小于等于64位 */
    private String operatorRegAddress;
    /*备注信息 小于等于255位*/
    private String operatorNote;

}
