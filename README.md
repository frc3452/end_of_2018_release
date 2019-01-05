# 2019_beta_java

# Features

# Individual Subsystem Health generated for each subsystem into a user friendly HTML File
(see Health.java in Subsystems)

# Configurable Amperage Testing based on CSV file 
Code writes all neccesary files and programs to USB for configuration
Shortcut with Putty allows one click transfer 
(See MotorChecker.java in util)

# Persistent Settings 
Code backs up information every half second to file and reads on startup (variables and values can persist over power cycles)
(See PersistentInfoManager.java)

# Motor controller classes integrate analog temperature sensors
(See GZSRX.java and GZSpark.java) 

# Automatic logging of constructed Motor Controllers
(See Drive.addLoggingValues())

# Odometry implemented - created by team 254 in 2018
(See Drive.java and RobotStateEstimator.java)
