package com.ajas.jasper.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ajas.jasper.model.ScoreModel;
@Service
public class ScoreServive {

public static List<ScoreModel> generatedScoreList(){
		
		List<ScoreModel> score= new ArrayList<ScoreModel>();

		score.add(new ScoreModel(1,"Ajas",50, 60, 110));
		score.add(new ScoreModel(2,"Arun",80, 90, 170));
		score.add(new ScoreModel(2,"Akhil",80, 90, 170));
		score.add(new ScoreModel(2,"Sam",80, 90, 170));
		score.add(new ScoreModel(2,"Kiran",80, 90, 170));
		score.add(new ScoreModel(2,"Arjun",80, 90, 170));

		
				
				
				return score;
			
			
		
		
	}
	
}
