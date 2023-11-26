package com.CricApp.test;

import java.util.Scanner;

public class CricketLive {

	public static void oDI(short over, short tBalls) {

		// int run = 0, wicket = 0;
		short balls = 0, wb = 0, nb = 0, extras = 0, run = 0, wicket = 0, del = 0, overs = 0;

		for (short i = 1; i < tBalls + 1; i++) {
			System.out.println("Please deiver your ball" + "\n1. Wide" + "\n2. No Ball" + "\n3. Vaid delivery\n");
			del = (new Scanner(System.in)).nextShort();
			if (del == 1) {
				wb++;
				balls = (short) (i - 1);
				run++;
				extras += wb;
				currentScoreDisplay(run, wicket, balls, extras, nb, wb);
				averageScoreDisplay(run, balls);
				continue;
			} else if (del == 2) {
				nb++;
				balls = (short) (i - 1);
				run++;
				extras += nb;
				currentScoreDisplay(run, wicket, balls, extras, nb, wb);
				averageScoreDisplay(run, balls);
				continue;
			} else {
				System.out.println(
						"Check for run" + "\n1. Single" + "\n2. Double" + "\n3. Three" + "\n4. Four" + "\n5. No run"
								+ "\n6. Six" + "\n7. Out");
				short rInput = (new Scanner(System.in).nextShort());
				if (rInput == 1) {
					run += 1;
				} else if (rInput == 2) {
					run += 2;
				} else if (rInput == 3) {
					run += 3;
				} else if (rInput == 4) {
					run += 4;
				} else if (rInput == 5) {

				} else if (rInput == 6) {
					run += 6;
				} else {
					wicket++;
				}

				balls = i;
				currentScoreDisplay(run, wicket, balls, extras, nb, wb);
				averageScoreDisplay(run, balls);
			}


		}
	}

	public static void t20(short over, short tBalls) {

		// int run = 0, wicket = 0;
		short balls = 0, wb = 0, nb = 0, extras = 0, run = 0, wicket = 0, del = 0, overs = 0;

		for (short i = 1; i < tBalls + 1; i++) {
			System.out.println("Please deiver your ball" + "\n1. Wide" + "\n2. No Ball" + "\n3. Vaid delivery\n");
			del = (new Scanner(System.in)).nextShort();
			if (del == 1) {
				wb++;
				balls = (short) (i - 1);
				run++;
				extras += wb;
				currentScoreDisplay(run, wicket, balls, extras, nb, wb);
				averageScoreDisplay(run, balls);
				continue;

			} else if (del == 2) {
				nb++;
				balls = (short) (i - 1);
				run++;
				extras += nb;
				currentScoreDisplay(run, wicket, balls, extras, nb, wb);
				averageScoreDisplay(run, balls);
				continue;
			} else {
				System.out.println("Check for run" + "\n1. Single" + "\n2. Double" + "\n3. Three" + "\n4. Four"
						+ "\n5. No run" + "\n6. Six" + "\n7. Out");
				@SuppressWarnings("resource")
				short rInput = (new Scanner(System.in).nextShort());
				if (rInput == 1) {
					run += 1;
				} else if (rInput == 2) {
					run += 2;
				} else if (rInput == 3) {
					run += 3;
				} else if (rInput == 4) {
					run += 4;
				} else if (rInput == 5) {

				} else if (rInput == 6) {
					run += 6;
				} else {
					wicket++;
				}

				balls = i;
				currentScoreDisplay(run, wicket, balls, extras, nb, wb);
				averageScoreDisplay(run, balls);
			}

		}
	}

	public static void currentScoreDisplay(short run, short wicket, short balls, short extras, short nb, short wb) {

		int cntr = 0;
		System.out.println("\n**************************************************************************\n");
		System.out.println("**************************************************************************\n");
		System.out.println("Runs =" + run);
		System.out.println("Wickets =" + wicket);
		if (balls % 6 == 0) {
			cntr++;
			System.out.println("Overs =" + cntr);
		} else {
			System.out.println("Overs =" + cntr + "." + balls);
		}
		System.out.println("Extras =" + extras + " : " + "wide=" + wb + " No ball=" + nb);
		System.out.println("\n**************************************************************************\n");

	}

	public static void averageScoreDisplay(short run, short balls) {

		double runRate = 0.0;
		int scoreP = 0, cntr = 0;

		if (run > 0) {
			if (balls % 6 == 0) {
				cntr++;
				runRate = run / cntr;
				scoreP = (int) (runRate * cntr);
			} else {
				runRate = run / balls;
				scoreP = (int) (runRate * balls);
			}
		}

		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		System.out.println("Run Rate =" + runRate);
		System.out.println("Score Predictor =" + scoreP);
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

	}

	public static void main(String[] args) {

		int inp = 0;
		short over = 0;

		System.out.println(" Enter your format" + "\n1. ODI\n" + "2. T20");
		Scanner sc = new Scanner(System.in);
		inp=sc.nextInt();
		
		if (inp == 1) {
			over = 50;
			short tBalls = 6 * 50;
			oDI(over, tBalls);

		} else {
			over = 20;
			short tBalls = 6 * 20;
			t20(over, tBalls);
		}

		sc.close();

	}

}
