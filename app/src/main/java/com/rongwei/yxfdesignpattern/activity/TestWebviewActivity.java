package com.rongwei.yxfdesignpattern.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.rongwei.yxfdesignpattern.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TestWebviewActivity extends AppCompatActivity {

    @Bind(R.id.title)
    TextView mTitle;
    @Bind(R.id.text_beginLoading)
    TextView textBeginLoading;
    @Bind(R.id.text_Loading)
    TextView textLoading;
    @Bind(R.id.text_endLoading)
    TextView textEndLoading;
    @Bind(R.id.webView1)
    WebView mWebview;

    WebSettings mWebSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_webview);
        ButterKnife.bind(this);
        mWebSettings=mWebview.getSettings();
        mWebview.loadUrl("http://www.baidu.com/");
        //设置不用系统浏览器打开,直接显示在当前Webview
       mWebview.setWebViewClient(new WebViewClient(){
           @Override
           public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
               return super.shouldOverrideUrlLoading(view, request);
           }

           //设置加载前的函数
           @Override
           public void onPageStarted(WebView view, String url, Bitmap favicon) {
               super.onPageStarted(view, url, favicon);
               System.out.println("开始加载了");
               textBeginLoading.setText("开始加载了");
           }

           //设置结束加载函数
           @Override
           public void onPageFinished(WebView view, String url) {
               super.onPageFinished(view, url);
               textEndLoading.setText("结束加载了");
           }
       });

        //设置WebChromeClient类
        mWebview.setWebChromeClient(new WebChromeClient(){

            //获取网站标题
            @Override
            public void onReceivedTitle(WebView view, String title) {
                super.onReceivedTitle(view, title);
                System.out.println("标题在这里");
                mTitle.setText(title);
            }

            //获取加载进度
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
//                if (newProgress < 100) {
                    String progress = newProgress + "%";
                    textLoading.setText(progress);
//                } else if (newProgress == 100) {
//                    String progress = newProgress + "%";
//                    textLoading.setText(progress);
//                }
            }

        });
    }


    //点击返回上一页面而不是退出浏览器
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && mWebview.canGoBack()) {
            mWebview.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }


    //销毁Webview
    @Override
    protected void onDestroy() {
        if (mWebview != null) {
            mWebview.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            mWebview.clearHistory();

            ((ViewGroup) mWebview.getParent()).removeView(mWebview);
            mWebview.destroy();
            mWebview = null;
        }
        super.onDestroy();
    }

}
