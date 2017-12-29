package com.gmsj.common.vo.forecastAnaylse;

import com.gmsj.common.vo.CommonVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class DetailVO {

    @ApiModelProperty(value = "影响因素标题")
    private String title;

    @ApiModelProperty(value = "每个item详细信息")
    private List<ItemDetailVO> list;

}
