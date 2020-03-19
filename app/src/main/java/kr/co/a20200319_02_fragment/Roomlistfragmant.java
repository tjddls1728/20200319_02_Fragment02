package kr.co.a20200319_02_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import kr.co.a20200319_02_fragment02.R;
import kr.co.a20200319_02_fragment02.databinding.FragmentRoomListBinding;

public class Roomlistfragmant extends Fragment {

    FragmentRoomListBinding binding = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_room_list,container,false);
        return binding.getRoot();

//        프래그먼트의 동작 코드 -> 리스트뷰 뽑아주기


    }
}
