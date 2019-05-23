package com.example.pulltorefreshview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * 描述: 主功能
 * 作者|时间: djj on 2019/5/23 0023 上午 11:52
 * 博客地址: http://www.jianshu.com/u/dfbde65a03fc
 */
public class MainActivity extends AppCompatActivity {

    private PullToRefreshView mRefreshView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRefreshView = findViewById(R.id.refresh_view);

        mRefreshView.setOnHeaderRefreshListener(new PullToRefreshView.OnHeaderRefreshListener() {
            @Override
            public void onHeaderRefresh(PullToRefreshView view) {
                mRefreshView.onHeaderRefreshComplete();
            }
        });

        mRefreshView.setOnFooterRefreshListener(new PullToRefreshView.OnFooterRefreshListener() {
            @Override
            public void onFooterRefresh(PullToRefreshView view) {

            }
        });
    }
}
