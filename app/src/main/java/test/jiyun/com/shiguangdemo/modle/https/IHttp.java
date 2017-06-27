package test.jiyun.com.shiguangdemo.modle.https;


import java.io.File;
import java.util.Map;

import test.jiyun.com.shiguangdemo.modle.callback.MyCallback;


public interface IHttp {
    void Get(String url, Map<String, String> map, MyCallback callback);

    void Post(String url, Map<String, String> map, MyCallback callback);
    void Filed(String url, String fileName, File file, Map<String, String> map, MyCallback myCallback);

    void wGet(String url,MyCallback callback);
}
