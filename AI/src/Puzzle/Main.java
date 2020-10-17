package Puzzle;

import Analysis.JSONAnalysis;
import Analysis.PostAnswer;
import ImagUtil.BaseImages;
import ImagUtil.ImageToMat;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        int cnt=0;
        new BaseImages();
        JSONAnalysis js=new JSONAnalysis();
        ImageToMat im=new ImageToMat();
        PlayPuzzle pl=new PlayPuzzle();
        for(int i=0;i<1;i++){
            cnt++;
            js.jsonAnalysis();//获得题目
            pl.playPuzzle(im.findAnsImage());//获得答案
            if(new PostAnswer().postAnswer().getString("score")=="false"){
                System.out.println("Fail Game:"+cnt);
                break;
            }
        }
    }
}