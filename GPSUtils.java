package no.hvl.dat100.prosjekt;

import static java.lang.Math.*;

public class GPSUtils {

	public GPSUtils() {
	
	}
	
	// konverter sekunder til string på formen hh:mm:ss
	public static String printTime(int secs) {
		
		String timestr = "";
		String TIMESEP = ":";
		
		// TODO
		// OPPGAVE - START
		
		
				
		// OPPGAVE - SLUTT
		
		return timestr;
	}
	
	// beregn maximum av en tabell av doubles med minnst et element
	public static double findMax(double[] da) {

		double max = da[0];

		for (double d : da) {
			if (d > max) {
				max = d;
			}
		}

		return max;
	}

	// beregn minimum av en tabell av doubles med minnst et element
	public static double findMin(double[] da) {

		// fjern = "0.0" når metoden implementeres for ikke få forkert minimum
		double min = da[0] ;

		// TODO
		// OPPGAVE - START
		for (int i = 0; i< da.length; i++) {
			if (da[i] < min) {
				min = da[i];
			}
		}
		// OPPGAVE - SLUT
		return min;
	}

	
	private static int R = 6371000; // jordens radius
	
	// Beregn avstand mellom to gps punkter ved bruk av Haversine formlen
	public static double distance(double latitude1, double longitude1, double latitude2, double longitude2) {

		double a,c,d = 0; // fjern = 1.0
		
		
		// TODO:
		// OPPGAVE - START
		
		
		a = Math.pow(Math.sin((latitude2-latitude1)/2), 2) + Math.cos(latitude1) * Math.cos(latitude2) * Math.pow(Math.sin((longitude2-longitude1/2)),2); 
		
		c = 2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		
		d = R * c; 
		// OPPGAVE - SLUTT

		return d;
	}
	
	// beregn gjennomsnits hastighet i km/t mellom to gps punkter
	public static double speed(int secs, double latitude1, double longitude1, double latitude2, double longitude2) {
		
		double speed = 0.0;


		// TODO:
		// OPPGAVE - START
		
		double punkt1 = latitude1, longitude1;
		double punkt2 = latitude2, longitude2; 
		
		speed = (punkt2 - punkt1) ; 
		
		// OPPGAVE - SLUTT

		return speed;
	}
	
	private static int TEXTWIDTH = 10;
	
	// konverter double til string med 2 decimaler og streng lengde 10
	// eks. 1.346 konverteres til "      1.35" og enhet til slutt
	// Hint: se på String.format metoden
	
	public static String printDouble(double d) {
		
		String str = "";
		
		// TODO
		// OPPGAVE - START
		double d = 
		String time = String.format(%f, d);
		
		// OPPGAVE - SLUTT
		
		return str;
	}
}
