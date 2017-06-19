package test.jiyun.com.shiguangdemo.modle.https;


public class HttpFactory {

    private static final int OKHTTP = 0;
    private static final int VOLLEY = 1;
    private static final int RETROFIT = 2;
    private static final int TYPE = RETROFIT;


    public static IHttp getFactory() {
        IHttp http = null;
        switch (TYPE) {
            case OKHTTP:
//                http = Retrofitimple.getInstance();
                break;
            case VOLLEY:
                break;
            case RETROFIT:
                http = Retrofitimple.getInstance();
                break;
        }
        return http;
    }
}
