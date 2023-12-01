package com.CricApp.test;

import java.util.Scanner;

public class CricketLive {

	public static void oDI(short over, short tBalls) {

		short balls = 0, wb = 0, nb = 0, extras = 0, run = 0, wicket = 0, del = 0, overs = 0;

		try {
			for (short i = 1; i <= tBalls; i++) {
			System.out.println("Please deiver your ball" + "\n1. Wide" + "\n2. No Ball" + "\n3. Vaid delivery\n");
			del = (new Scanner(System.in)).nextShort();
			if (del == 1) {
				wb++;
				if (balls == 0) {
					balls = 0;
				} else if (balls == 1) {
					balls = 1;
				}
				run++;
				extras++;
				if (balls % 6 == 0) {
					// overs++;
					balls = 0;
				}
				currentScoreDisplay(run, wicket, balls, extras, nb, wb, overs);
				averageScoreDisplay(run, overs, over);
				continue;
			} else if (del == 2) {
				nb++;
				if (balls == 0) {
					balls = 0;
				} else if (balls == 1) {
					balls = 1;
				}
				run++;
				extras++;
				if (balls % 6 == 0) {
					// overs++;
					balls = 0;
				}
				currentScoreDisplay(run, wicket, balls, extras, nb, wb, overs);
				averageScoreDisplay(run, overs, over);
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

				balls++;
				if (balls % 6 == 0) {
					overs++;
					balls = 0;
				}
				currentScoreDisplay(run, wicket, balls, extras, nb, wb, overs);
				averageScoreDisplay(run, overs, over);
			}

		}
	} catch (Exception e) {
		System.out.println("This is a exception in ODI : " + e.getMessage());
	}
	}

	public static void t20(short over, short tBalls) {

		// int run = 0, wicket = 0;
		short balls = 0, wb = 0, nb = 0, extras = 0, run = 0, wicket = 0, del = 0, overs = 0, ballcntr = 0;

		try {
			for (short i = 1; i <= tBalls; i++) {
			System.out.println("Please deiver your ball" + "\n1. Wide" + "\n2. No Ball" + "\n3. Vaid delivery\n");
			del = (new Scanner(System.in)).nextShort();
			if (del == 1) {
				wb++;
				if (balls == 0) {
					balls = 0;
				} else if (balls == 1) {
					balls = 1;
				}
				run++;
				extras++;
				if (balls % 6 == 0) {
					// overs++;
					balls = 0;
				}
				currentScoreDisplay(run, wicket, balls, extras, nb, wb, overs);
				averageScoreDisplay(run, overs, over);
				continue;
			} else if (del == 2) {
				nb++;
				if (balls == 0) {
					balls = 0;
				} else if (balls == 1) {
					balls = 1;
				}
				run++;
				extras++;
				if (balls % 6 == 0) {
					// overs++;
					balls = 0;
				}
				currentScoreDisplay(run, wicket, balls, extras, nb, wb, overs);
				averageScoreDisplay(run, overs, over);
				continue;
			} else {
				System.out.println("Check for run" + "\n1. Single" + "\n2. Double" + "\n3. Three" + "\n4. Four"
						+ "\n5. No run" + "\n6. Six" + "\n7. Out");
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

				balls++;
				if (balls % 6 == 0) {
					overs++;
					balls = 0;
				}
				currentScoreDisplay(run, wicket, balls, extras, nb, wb, overs);
				averageScoreDisplay(run, overs, over);
			}

		}
	} catch (Exception e) {
		System.out.println("This is a exception in T20 : " + e.getMessage());
	}
	}

	static int cntr = 1;
	public static void currentScoreDisplay(short run, short wicket, short balls, short extras, short nb, short wb,
			short overs) {

		// int cntr = 1;
		System.out.println("\n**************************************************************************\n");
		System.out.println("**************************************************************************\n");
		System.out.println("Runs =" + run);
		System.out.println("Wickets =" + wicket);
		if (overs == cntr) {
			cntr++;
			System.out.println("Overs =" + overs);
		} else {
			System.out.println("Overs =" + overs + "." + balls);
		}
		System.out.println("Extras =" + extras + " : " + "wide=" + wb + " No ball=" + nb);
		System.out.println("\n**************************************************************************\n");

	}

	public static void averageScoreDisplay(short run, short overs, short over) {

		double runRate = 0.0;
		int scoreP = 0, cntr = 0;
		cntr = overs;

		try {
			if (run > 0 || cntr > 0) {
				runRate = run / cntr;
				scoreP = (int) (runRate * (over - cntr));
		}

		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		System.out.println("Run Rate =" + runRate);
		System.out.println("Score Predictor =" + scoreP);
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
	} catch (Exception e) {
		System.out.println("This is xception in averageScoreDisplay : " + e.getMessage());
	}

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