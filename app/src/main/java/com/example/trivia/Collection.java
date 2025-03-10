package com.example.trivia;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Collection {
    private ArrayList<Question> arr;
    private int index;//מספר השאלה הבאה בתור
    public Collection(){
        Question q1=new Question("1+10","1","11","3","100",2);
        Question q2=new Question("1+2","1","2","3","100",3);
        Question q3=new Question("1+3","1","2","4","100",3);
        Question q4=new Question("1+4","5","2","3","100",1);

        arr=new ArrayList<>();
        //Random random=new Random();
        //int x=random.nextInt(4)+1;

        arr.add(q1);
        arr.add(q2);
        arr.add(q3);
        arr.add(q4);

        Collections.shuffle(arr);

    }
    public void  initQuestion(){
        index=0;
    }
     public Question getNextQuestion(){
        // הפעולה מחזירה הפניה לשאלה הבאה
         Question q=arr.get(index);
         index++;
         return q;
     }

     public boolean isNotLastQuestion(){
        // הפעולה מחזירה אמת אם אנו בשאלה האחרונה
         return (index<arr.size());
     }
     public  int getIndex(){return index;}
}
