GLASSGAZE
=========

This project is a fork from the [GlassGaze](https://github.com/dmardanbeigi/GlassGaze) developed by Diako Mardanbegi dima@itu.dk and Shahram Jalalinia jsha@itu.dk. The project was initially built to work as a client for [Haytham server](http://eyeinfo.itu.dk/index.php/projects/low-cost-gaze-tracking).

Changes
--------
The changes made are listed bellow:
- Changes in calibration process were made in order to fit [EyeDroid](https://github.com/centosGit/EyeDroid/tree/glassgaze_demo).
- An activity was added to conduct an experiment. The experiment consisted in showing a set of random dots on the glass display while coordinates were sampled from [EyeDroid](https://github.com/centosGit/EyeDroid/tree/glassgaze_demo) in order to evaluate the system accuracy.
- Some additional steps were added in the communication protocol for calibration and the experiment process.

<img src="ScreenShots/EyeDroid_GlassGaze.PNG?raw=true" height="300"/>

How to use
----------

In order to use the client with the [EyeDroid](https://github.com/centosGit/EyeDroid/tree/glassgaze_demo) server the only step required is to set the static IP address of the server to the client.
This can be done in the Constants.java file.

The port numbers used by the client are the same as with the [EyeDroid](https://github.com/centosGit/EyeDroid/tree/glassgaze_demo) server. If you wish to change the port numbers make sure that the server is configured accordingly.


