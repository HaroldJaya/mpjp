package m1ex;

import java.util.logging.Logger;

public class S02 {
	private static final Logger LOG = Logger.getGlobal();

	/**
	 * Average speed
	 * 
	 * @param distance in meters
	 * @param time     in seconds
	 * @return speed in meters per second
	 */
	public static double speed(double distance, double time) {
		LOG.info(String.format("distance is %.3f and time is %.2f", distance, time));
		return distance / time;
	}

	/**
	 * Distance between (x0, y0) and (x1, y1)
	 * 
	 * @param x0 first point x
	 * @param y0 first point y
	 * @param x1 second point x
	 * @param y1 second point y
	 * @return distance
	 */
	public static double distance(int x0, int y0, int x1, int y1) {
		// uso la distanza euclidea
		return Math.sqrt((x0 - x1) ^ 2 + (y0 - y1) ^ 2);
	}

	public static double distance(double x0, double y0, double x1, double y1) {
		// uso la distanza euclidea
		return Math.sqrt((x0 - x1) * (x0 - x1) + (y0 - y1) * (y0 - y1));
	}

	/**
	 * Engine capacity
	 * 
	 * @param bore   in mm
	 * @param stroke in mm
	 * @param nr     number of cylinders
	 * @return the engine capacity in cm^3
	 */
	public static double engineCapacity(double bore, double stroke, int nr) {
		double areaBase = Math.pow(bore / 2,2) * Math.PI;
		double cil = areaBase * stroke * nr; // cilindrata in mm cubici
		cil *= 0.001;						// cilindrata in cm cubici
		return cil;
	}

	/**
     * Add up all the digits in an integer
     * 
     * @param value
     * @return sum of digits
     */
   public static int digitSum(int value) {
   	//ignoro il segno
//       while() {
//      	
//        }
        return 0;
    }

	/**
	 * Score based on distance from (0, 0) [1, 5, 10] -> [10, 5, 1, 0]
	 *
	 * @param x
	 * @param y
	 *
	 * @return
	 */
	public static int score(double x, double y) {
		double modulo = S02.distance(x, y, 0, 0);
		if (modulo <= 1) {
			return 10;
		} else if (modulo <= 5) {
			return 5;
		} else if (modulo <= 10) {
			return 1;
		} else {
			return 0;
		}
	}
}
