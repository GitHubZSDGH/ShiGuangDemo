package test.jiyun.com.shiguangdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.OnClick;
import test.jiyun.com.shiguangdemo.R;
import test.jiyun.com.shiguangdemo.base.BaseActivity;

public class WebActivity extends BaseActivity {


    @Bind(R.id.web_back)
    ImageView webBack;
    @Bind(R.id.web_text)
    TextView webText;
    @Bind(R.id.web_pinlun)
    TextView webPinlun;
    @Bind(R.id.web_webView)
    WebView webWebView;
    private Intent intent;
    private String url;

    private String webName;

    @Override
    protected int getLayoutViwe() {
        return R.layout.activity_web;
    }

    @Override
    protected void initView() {
        intent = getIntent();
    }

    @Override
    protected void initloadData() {
        url = intent.getStringExtra("url");
        webName = intent.getStringExtra("webName");

        webText.setText(webName);
        webWebView.loadUrl(url);

        webWebView.setWebViewClient(new WebViewClient());

        WebSettings settings = webWebView.getSettings();

        settings.setJavaScriptEnabled(true);

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) and run LayoutCreator again
    }
    @OnClick(R.id.web_back)
    public void onViewClicked() {
        finish();
    }
}
