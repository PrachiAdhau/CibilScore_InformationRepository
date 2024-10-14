package com.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import java.text.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Cibil;

@RestController
public class cibilController {
	
	@GetMapping("/getCibilId")
	public String getCibilId() {
		Random random = new Random();

		String ss = "CIBIL";

		int num = 10000 + random.nextInt(90000);

		String cibil_Id = ss + num;

		System.out.println("Generated CIBIL ID: " + cibil_Id);
		return cibil_Id;
	}

	// CIBIL score
	@GetMapping("/getCibilScore")
	public int getAboutCibilScore() {
		Random random = new Random();

		int minScore = 300;
		int maxScore = 900;

		int cibilScore = random.nextInt((maxScore - minScore) + 1) + minScore;

		System.out.println("Generated CIBIL Score: " + cibilScore);
		return cibilScore;
	}

	@GetMapping("/getStatus")
	public String getAboutStatus() {
		Cibil c = new Cibil();
		int ss = getAboutCibilScore();
		String status = null;
		if (ss >= 300 && ss < 400) {
			System.out.println(ss);
			return "Bad";
		} else if (ss >= 400 && ss < 600) {
			System.out.println(ss);
			return "Average";
		} else if (ss >= 600 && ss < 750) {
			System.out.println(ss);
			return "Good";
		} else if (ss >= 750 && ss <= 900) {
			System.out.println(ss);
			return "Excellent";
		} else {
			System.out.println(ss);
			return null;
		}
	}

	@GetMapping("/getRemark")
	public String getAboutRemark() {

		Cibil c = new Cibil();
		String ss=getAboutStatus();
		String cibilRemark = null;

		if (ss=="Bad") {
			System.out.println(ss);
			return "No";

		} else {
			System.out.println(ss);
			return "Yes";
		}

	}

	@GetMapping("/getDate")
	public Date getAboutDate() throws ParseException  {
		Date cibilScoreDateandTime = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String d = dateFormat.format(cibilScoreDateandTime);
		Date dd=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(d);
		 System.out.println("Current Date: " + d);
		return dd;

	}

	@GetMapping("/getCibilDetails")
	public Cibil getCibilDetails() throws ParseException {
		String id = getCibilId();
		int score=getAboutCibilScore();
		String sts=getAboutStatus();
        Date dd=getAboutDate();
       String rmk= getAboutRemark();

		Cibil cb = new Cibil();
		cb.setCibilId(id);
		cb.setCibilScore(score);
		cb.setStatus(sts); 
		cb.setCibilScoreDateandTime(dd);
        cb.setRemark(rmk);
		return cb;

	}

}
