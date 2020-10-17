package Puzzle;

import Analysis.JSONAnalysis;
import Analysis.PostAnswer;
import ImagUtil.BaseImages;
import ImagUtil.ImageToMat;
import Puzzle.PlayPuzzle;
import org.junit.Assert;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class PlayPuzzleTest {
    @org.junit.Test
    public void playPuzzleTest() throws Exception {
        int[] mat={0,3,1,9,4,7,5,0,2,8};
        JSONAnalysis.step=17;
        JSONAnalysis.swap=new ArrayList<>();
        JSONAnalysis.swap.add(1);
        JSONAnalysis.swap.add(1);
        PlayPuzzle p=new PlayPuzzle();
        p.playPuzzle(mat);
    }

}