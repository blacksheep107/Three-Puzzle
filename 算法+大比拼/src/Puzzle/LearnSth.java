package Puzzle;
import Analysis.JSONAnalysis;
import Analysis.PostAnswer;
import Analysis.URLAnalysis;
import ImagUtil.CmpImage;
import ImagUtil.ImageToMat;
import com.alibaba.fastjson.JSONObject;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LearnSth {
    public static void main(String[] args) throws Exception {
        int[] mat={0,3,1,4,8,5,0,7,2,9};
        JSONAnalysis.step=18;
        JSONAnalysis.swap=new ArrayList<>();
        JSONAnalysis.swap.add(3);
        JSONAnalysis.swap.add(2);
        new PlayPuzzle().playPuzzle(mat);
    }
}
//260143879