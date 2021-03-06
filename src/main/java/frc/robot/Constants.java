package frc.robot;

import frc.robot.util.GZFile;
import frc.robot.util.GZFileMaker;
import frc.robot.util.GZFileMaker.ValidFileExtension;
import frc.robot.util.GZFiles.Folder;
import frc.robot.util.GZPID;

/**
 * Robot subsystem constants
 *
 * @author Max
 * @since 5/4/18
 */

public class Constants {
	public static class kLoop {
	}

	public static class kAuton {
		public final static boolean IGNORE_ANALOG_AUTON_SELECTOR = true;
		
		public final static double GYRO_PERCENT_PER_DEGREE_OF_ERROR = 1.0/20.0;
		public final static double GYRO_CONSTANT_SPEED = .03;
		public final static double GYRO_PRECISION_IN_DEGREES = 2;
		public final static double GYRO_TIMEOUT = 5;

		public final static int COMMAND_ARRAY_SIZE = 41;

		public final static double CORRECTION = 0.025;

		public final static int SAFTEY_SWITCH = 96;

		public final static int AUTO_SELECTOR_1 = 2;
		public final static int AUTO_SELECTOR_2 = 3;

		public final static int AUTO_VARIANCE = 15;

		// COMP
		public final static int AUTO_1 = 2683;
		public final static int AUTO_2 = 2992;
		public final static int AUTO_3 = 3185;
		public final static int AUTO_4 = 3321;
		public final static int AUTO_5 = 3427;
		public final static int AUTO_6 = 3507;
		public final static int AUTO_7 = 3565;
		public final static int AUTO_8 = 3658;
		public final static int AUTO_9 = 3721;
		public final static int AUTO_10 = 3781;

		public final static int AUTO_1_L = AUTO_1 - AUTO_VARIANCE;
		public final static int AUTO_1_H = AUTO_1 + AUTO_VARIANCE;

		public final static int AUTO_2_L = AUTO_2 - AUTO_VARIANCE;
		public final static int AUTO_2_H = AUTO_2 + AUTO_VARIANCE;

		public final static int AUTO_3_L = AUTO_3 - AUTO_VARIANCE;
		public final static int AUTO_3_H = AUTO_3 + AUTO_VARIANCE;

		public final static int AUTO_4_L = AUTO_4 - AUTO_VARIANCE;
		public final static int AUTO_4_H = AUTO_4 + AUTO_VARIANCE;

		public final static int AUTO_5_L = AUTO_5 - AUTO_VARIANCE;
		public final static int AUTO_5_H = AUTO_5 + AUTO_VARIANCE;

		public final static int AUTO_6_L = AUTO_6 - AUTO_VARIANCE;
		public final static int AUTO_6_H = AUTO_6 + AUTO_VARIANCE;

		public final static int AUTO_7_L = AUTO_7 - AUTO_VARIANCE;
		public final static int AUTO_7_H = AUTO_7 + AUTO_VARIANCE;

		public final static int AUTO_8_L = AUTO_8 - AUTO_VARIANCE;
		public final static int AUTO_8_H = AUTO_8 + AUTO_VARIANCE;

		public final static int AUTO_9_L = AUTO_9 - AUTO_VARIANCE;
		public final static int AUTO_9_H = AUTO_9 + AUTO_VARIANCE;

		public final static int AUTO_10_L = AUTO_10 - AUTO_VARIANCE;
		public final static int AUTO_10_H = AUTO_10 + AUTO_VARIANCE;

		public final static String DEFAULT_NAME = "NO COMMAND";
	}

	public static class kCamera {
	}

	public static class kDrivetrain {

		public static final boolean TUNING = false;

		public static class PID {

			static final double p = .3; // .1
			static final double d = 3; // 10
			public final static GZPID Left = new GZPID(p, 0, d, 0, 0);
			public final static GZPID Right = new GZPID(p, 0, d, 0, 0);

			// public final static GZPID Left = new GZPID(0, 2.7, 0, 2.7 * 25, .235, 0);
			// public final static GZPID Right = new GZPID(0, 2.7, 0, 2.7 * 25, .239, 0);

			public final static GZPID OldLeft = new GZPID(0, .425, 0, 4.25, 0, 0);
			public final static GZPID OldRight = new GZPID(0, .8, 0, 4.25, 0, 0);
		}

		public final static double WHEEL_DIAMATER_IN = 6;

		public final static int L1 = 1, L2 = 2, L3 = 3, L4 = 4;
		public final static int R1 = 5, R2 = 6, R3 = 7, R4 = 8;

		public final static boolean L_INVERT = true;
		public final static boolean R_INVERT = true;

		public final static double DIFFERENTIAL_DRIVE_DEADBAND = 0.025;


		//Wasserman: Peak should be half of continuous with duration of 50ms
		public final static int AMP_40_PEAK = 20, AMP_40_CONTINUOUS = 40, AMP_40_TIME = 50;

		public final static int AMP_30_PEAK = 15, AMP_30_CONTINUOUS = 30, AMP_30_TIME = 50;

		public final static double OPEN_LOOP_RAMP_TIME = 0.125;

		public final static double DEMO_DRIVE_MODIFIER = .4;

		public final static double ELEV_TURN_SCALAR = 1.67; // 1.67
	}

	public static class kPDP {
		public final static int DRIVE_L_1 = 10, DRIVE_L_2 = 11, DRIVE_L_3 = 12, DRIVE_L_4 = 13;
		public final static int DRIVE_R_1 = 5, DRIVE_R_2 = 4, DRIVE_R_3 = 3, DRIVE_R_4 = 2;
	}

	public class kTempSensor {
		public final static double LOW_TEMP_C = -50;
		public final static double HIGH_TEMP_C = 100;
		public final static double LOW_VOLT = 0;
		public final static double HIGH_VOLT = 1.75;
	}

	public static class kLights {
		public final static int CANIFIER_ID = 0;

		public final static int RED = 0;
		public final static int BLUE = 120;
		public final static int PURPLE = 55;
		public final static int GREEN = 254; // ;)
		public final static int YELLOW = 330;
	}

	public static class kPoofs {
		// PROBABLY GOTTA BE BIG TUNED
		// public static final double kRobotLinearInertia = 60.0; // kg TODO tune
		// public static final double kRobotAngularInertia = 10.0; // kg m^2 TODO tune
		// public static final double kRobotAngularDrag = 12.0; // N*m / (rad/sec) TODO
		// tune
		// public static final double kDriveVIntercept = 1.055; // V
		// public static final double kDriveKv = 0.135; // V per rad/s //.135
		// public static final double kDriveKa = 0.012; // V per rad/s^2 //.012
		// ~BIG TUNE

		public static final double kRobotLinearInertia = 60.0; // kg TODO tune
		public static final double kRobotAngularInertia = 10.0; // kg m^2 TODO tune
		public static final double kRobotAngularDrag = 12.0; // N*m / (rad/sec) TODO tune
		public static final double kDriveVIntercept = 1.055; // V
		public static final double kDriveKv = 0.4; // V per rad/s
		public static final double kDriveKa = 0.1; // V per rad/s^2

		public static final double kPathKX = 4.0; // units/s per unit of error
		public static final double kPathLookaheadTime = 0.4; // seconds to look ahead along the path for steering
		public static final double kPathMinLookaheadDistance = 24.0; // inches

		public static final double kEpsilon = 1e-12;

		public static final double kLidarXOffset = -3.3211;
		public static final double kLidarYOffset = 0;
		public static final double kLidarYawAngleDegrees = 0;

		public static final double kDriveWheelTrackWidthInches = 25.5;
		public static final double kDriveWheelDiameterInches = 6;
		public static final double kDriveWheelRadiusInches = kDriveWheelDiameterInches / 2.0;
		public static final double kTrackScrubFactor = 1.0;
	}

	public static class kFiles {
		private kFiles() {
		}

		public static final boolean FAKE_PDP = true;

		public final static String MP_NAME = "MP1";
		public final static Folder MP_FOLDER = new Folder("MotionProfiles"); // if on rio, folder is
																				// MotionProfiles/MP1.csv
		public final static boolean MP_USB = true; // if on usb, folder is 3452/MotionProfiles/MP1.csv

		public final static GZFile MOTOR_TESTING_CONFIG = GZFileMaker.getSafeFile("MotorTestingConfig", new Folder(""),
				ValidFileExtension.CSV, false, false);

		public final static Folder STATS_FILE_FOLDER = new Folder("GZStats");
		public final static String STATS_FILE_NAME = "Stats";
		public final static boolean STATS_FILE_ON_USB = false;
		public final static double DEFAULT_STATS_RECORD_TIME = .5;

		public final static int RECORDING_MOTION_PROFILE_MS = 30; // 20
		public final static double LOGGING_SPEED = .125;
		public final static String DEFAULT_LOG_VALUE = "N/A";

		public final static double PDPChannelCheckerWaitTime = 1;

		public final static double COPY_WAIT_TIME = 5;
	}

	public static class kOI {
		public class Rumble {

			public final static double INTAKE = .3;
			public final static double ELEVATOR_SPEED_OVERRIDE_DRIVE = .45;
			public final static double ELEVATOR_SPEED_OVERRIDE_OP = ELEVATOR_SPEED_OVERRIDE_DRIVE - .2;
			public final static double ELEVATOR_LIMIT_OVERRIDE = .45;
			public final static double ENDGAME = .6;

		}
	}
}
