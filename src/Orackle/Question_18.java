package Orackle;

import Orackle.Question_19.Question_19;

public class Question_18 {
    public static void main (String[] args) {
        String [][]chs = new String[5][2];
        chs[0]=new String[2];
        chs[1]=new String[5];
        int i=97;
        for (int j = 0; j <chs.length ; j++) {
            for (int b = 0; b <chs.length ; b++) {
                chs[j][b]=""+i;
                i++;

            }

        }for(String[] cj:chs){
            for(String c: cj){
                System.out.print (c+" " );
            }
            System.out.println ( );
        }
    }



    }

