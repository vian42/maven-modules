#Maven-modules

Context : 
        
        - com.jam.app is your main module
        - com.jam.services is your service module which allows the app to retrieve some data
        
        
Step 1 : Modularize the app : 
- App class has to use module com.jam.services to print the list of participants
- You have some TODO's to help you

Step 2 : JLINK :
- Jlink allows us to link sets of only required modules to create a runtime image (our own JRE) 
- We are going to create our JRE to run the application the module com.base.services
- to help you : 
    - https://docs.oracle.com/javase/9/tools/jlink.htm#JSWOR-GUID-CECAC52B-CFEE-46CB-8166-F17A8E9280E9
    - https://www.logicbig.com/tutorials/core-java-tutorial/java-9-changes/jlink.html
    - you can also run "mvn clean install -X" (debug) and search for "--module-path"              
