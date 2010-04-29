Scalaton
========
A skeleton application for developing Processing applications in Scala.

Features
--------
* All required dependencies
* Ant build script that runs the application by default ("ant")
* Mac application target that builds a disk image ("ant dist-mac")
* Demonstration unit tests
* Easy versioning

Dependencies
------------
* OS X 10.5 and up
* Mac OS X Developer tools for building a Mac application. Free registration required, see http://developer.apple.com/mac

Building
--------
From the Terminal, run "ant" to run the application.
To create a disk image, run "ant dist-mac". The image will be created under the "dist" directory.

Customizing
-----------
The application name, version and main class can be set in the "version.properties" file.
If you change the application name, make sure to also change the name of the icon (by default res/Scalaton.icns).

Links
-----
* Processing: http://www.processing.org/
* Scala: http://www.scala-lang.org/
