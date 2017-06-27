package test.jiyun.com.shiguangdemo.modle.entivity;

import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;

/**
 * 项目名称:时光网
 * 类描述: 资讯
 * 创建人:LENOVO
 * 创建时间:2017-6-23 23:05
 * 修改人:
 * 修改内容:
 */

public interface IInformationModel {

    //资讯列表
    void list(int pageIndex, MyCallback callback);


}
