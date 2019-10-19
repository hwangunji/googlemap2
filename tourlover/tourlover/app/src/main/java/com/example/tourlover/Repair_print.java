package com.example.tourlover;
//동영상의 메인엑티비티에 해당
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.TextView;
//임포트 수정1013
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.DocumentChange.Type;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.Query.Direction;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class Repair_print extends AppCompatActivity implements View.OnClickListener{

    /*파이어베이스 리드소스를 위한 바이어베이스 변수 선언*/
    private FirebaseFirestore rStore = FirebaseFirestore.getInstance();

    // Create a reference to the cities collection
    CollectionReference RepairRef = rStore.collection("repair");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);//두가지 액티비티에 추가 메인 이랑 파인드로드어쩌구저쩌구

        /*아래에리드데이터즉파이어베이스에서 데이터 가져오는 코드를 복붙함(tool파이어베이스 코드에 있음*/
        rStore.collection("repair").get()//id = rStore.collection("repair").document().getId();
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (DocumentSnapshot document : task.getResult()) {
                                String id = (String) document.getData().get("id");
                                double wedo = (double) document.getData().get("wedo");
                                double gengdo = (double) document.getData().get("gengdo");
                                Date date = (Date) document.getData().get("date");

                                Repair_print data = new Repair_print(id, wedo, gengdo, date);
                                /* private String id;
                                    private double wedo;
                                    private  double gengdo ;
                                    private Date date;//toDate()*/


                            }//for1013

                        }//if1013
                    }//public1013
                });//add1013
    }


}
