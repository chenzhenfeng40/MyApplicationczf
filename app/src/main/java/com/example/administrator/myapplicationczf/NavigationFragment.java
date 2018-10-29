package com.example.administrator.myapplicationczf;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class NavigationFragment extends BaseFragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_navigation,container,false);
        initViews(view);
        setTabSelection(R.id.tab_item_home);
        return view;

    }
    private void initViews(View view){

        //主页面
        tabItemHome = (LinearLayout)view.findViewById(R.id.tab_item_home);
        tabItemHome.setOnclickListener(this);
        //分类页面
        tabItemCategory = (LinearLayout)view.findViewById(R.id.tab_item_category);
        tabItemCategory.setOnclickListener(this);
        //购物车
        tabItemCart = (LinearLayout)view.findViewById(R.id.tab_item_cart);
        tabItemCart.setOnclickListener(this);
        //个人中心页面
        tabItemPersonal = (LinearLayout)view.findViewById(R.id.tab_item_personal);
        tabItemPersonal.setOnclickListener(this);
        tabItemHomeBtn = (ImageButton)view.findViewById(R.id.tab_item_home_btn);
        tabItemCategoryBtn = (ImageButton)view.findViewById(R.id.tab_item_category_btn);
        tabItemCartBtn = (ImageButton)view.findViewById(R.id.tab_item_cart_btn);
        tabItemPersonalBtn = (ImageButton)view.findViewById(R.id.tab_item_personal_btn);
        fragmentManager = getFragmentManager();//获得Fragment管理类对象
    }
    @Override
    public void onClick(View v){
        setTabSelection(v.getId());
    }
    public void setTabSelection(int id){

        //重置所有tabItem状态
        tabItemHomeBtn.setImageResource(R.drawable.tab_item_home_focus);
        tabItemCategoryBtn.setImageResource(R.drawable.tab_item_category_focus);
        tabItemCartBtn.setImageResource(R.drawable.tab_item_cart_focus);
        tabItemPersonalBtn.setImageResource(R.drawable.tab_item_personal_focus);
        //开启一个事务
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //隐藏所有Fragment
        

    }

}
