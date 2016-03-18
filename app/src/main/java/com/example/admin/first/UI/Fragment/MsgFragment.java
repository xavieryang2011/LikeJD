package com.example.admin.first.UI.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.first.Model.MsgEntityDto;
import com.example.admin.first.R;

import java.util.List;

import butterknife.ButterKnife;
import io.realm.Realm;

/**
 * Created by yangxh on 2016/3/17.
 */
public class MsgFragment extends BaseFragment  {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
       View view=inflater.inflate(R.layout.fragment_msg,container,false);
        ButterKnife.bind(this.getActivity());
        return view;
    }

    private void request()
    {
        //网络请求返回数据
        List<MsgEntityDto> msgEntityDtoList=null;
        //将网络请求数据保存到realm库
        Realm realm=null;
        try {
            realm = Realm.getDefaultInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
