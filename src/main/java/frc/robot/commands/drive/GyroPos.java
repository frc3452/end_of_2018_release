package frc.robot.commands.drive;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Constants.kAuton;
import frc.robot.subsystems.Drive;
import frc.robot.util.GZUtil;

public class GyroPos extends Command {
	private double m_gyro, m_target, m_speed, m_precise, m_constantspeed;

	private Drive drive = Drive.getInstance();

	/**
	 * @author macco
	 * @param targetangle
	 * @param speedPerDegree
	 * @param degreesToComplete
	 * @param constantSpeed
	 * @see Drive
	 */
	public GyroPos(double targetangle, double speedPerDegree, double constantSpeed, double degreesToComplete) {
		requires(drive);

		m_gyro = drive.getGyroFusedHeading();
		m_target = targetangle;
		m_speed = Math.abs(speedPerDegree);
		m_constantspeed = Math.abs(constantSpeed);
		m_precise = degreesToComplete;
	}

	public GyroPos(double targetangle, double degreesToComplete) {
		this(targetangle, kAuton.GYRO_PERCENT_PER_DEGREE_OF_ERROR, kAuton.GYRO_CONSTANT_SPEED, degreesToComplete);
	}

	public GyroPos(double targetangle) {
		this(targetangle, kAuton.GYRO_PRECISION_IN_DEGREES);
	}

	protected void initialize() {
		setTimeout(kAuton.GYRO_TIMEOUT);
		System.out.println("Gyro servo started at angle {" + m_target + "} with gain of {" + m_speed + "}.");
	}

	protected void execute() {
		m_gyro = drive.getGyroFusedHeading();
		double error = Math.abs(m_gyro - m_target);

		double flip = 1;

		if (m_gyro < 360 && m_gyro > 180) {
			if ((m_gyro < (m_target + 180)) && (m_gyro > m_target)) {
				flip *= -1;
			} else {
				// flip;
			}
		}

		if (m_gyro > 0 && m_gyro < 180) {
			if ((m_gyro > (m_target - 180)) && (m_gyro < m_target)) {
				// flip
			} else {
				flip *= -1;
			}
		}

		drive.arcade(0, flip * m_speed * error + (flip * m_constantspeed));
	}

	protected boolean isFinished() {
		// return GZUtil.epsilonEquals(m_gyro, m_target, m_precise) || isTimedOut();
		return ((m_gyro < (m_target + m_precise)) && (m_gyro > (m_target - m_precise))) || isTimedOut();
	}

	protected void end() {
		System.out.println("Gyro servo finished.");
		drive.stop();
	}

	protected void interrupted() {
		end();
	}
}
