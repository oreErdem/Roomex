# roomex

login functionality of Roomex and an api comments verification Using Cucumber Framework

How to Run:

To run on local go to CukesRunner class located at src/test/java/com/roomex/runners and run the class

To get Cucumber reports you should run with mvn test/verify commands

How to Choose Browser:

Go to properties files and write any driver case name given in utilities/driver class

Choosing tags:

To run only api scenario add @api tag

To run only UI scenarios add @ui

--do not delete @ui tags or change them as they link the hook class methods with @ui --@ui tags are added to prevent browser opening when only api task is run
