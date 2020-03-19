package kr.co.fragmentApapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.Room;

import java.util.List;

import kr.co.a20200319_02_fragment02.R;

public class RoomAdapter extends ArrayAdapter<Room> {

    Context ncontext; // 어느 화면에서 어댑터를 쓰는지 보관
    List<Room> mList;// 화면에서 방 목록 배열을 보관하는곳
    LayoutInflater inflater; // xml을 가지고 객체화 시켜주는 클래쓰

    public RoomAdapter(@NonNull Context context, int resource, @NonNull List<Room> objects) {
        super(context, resource, objects);

        ncontext = context;
        mList = objects;
        inflater = LayoutInflater.from(ncontext);

    }

//    getview는 각각의 줄을 그려주는 메쏘드
//    목록 : 0~9까지 있다? => 0번 그릴때 실행, 1번 그릴때 실행.
//    실행 될떄 마다 몇번 줄을 그리러 오는건지 / position에 담겨있음.
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row= convertView; // 한줄 이라는 의미를 강화 : 변수이름 생성

//        row: 한줄이 없다? - > 새로 xml -> java로 그려주자
//        리스트뷰의 재활용성에서 다시 설명
        if (row == null){
            row = inflater.inflate(R.layout.room_list_item,null);
        }

        return row;//row변수에 담긴 xml을 화면에 뿌려줘라 결과로 선정.

    }
}
