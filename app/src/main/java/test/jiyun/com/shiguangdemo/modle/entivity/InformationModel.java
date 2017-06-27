package test.jiyun.com.shiguangdemo.modle.entivity;

import java.util.HashMap;
import java.util.Map;

import test.jiyun.com.shiguangdemo.modle.Urls;
import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;
import test.jiyun.com.shiguangdemo.modle.https.HttpFactory;

/**
 * 项目名称:时光网
 * 类描述:
 * 创建人:LENOVO
 * 创建时间:2017-6-23 23:09
 * 修改人:
 * 修改内容:
 */

public class InformationModel implements IInformationModel {

    /**
     * 资讯列表
     * @param pageIndex
     * @param callback
     */
    @Override
    public void list(int pageIndex, MyCallback callback) {
        Map<String,String> info = new HashMap<>();
        info.put("pageIndex", String.valueOf(pageIndex));
        HttpFactory.getFactory().Get(Urls.INFORMATION,info,callback);

    }




}
