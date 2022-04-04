# MVCDesignPattern
         MVC Pttern stands for Model-View-Controller PAttern.The pttern is used to seperate into
different objects. 
  
  MODEL-Model represents an object or Java POJO carrying data.It contains no logic describing how to 
present the data to the user.

  VIEW:View represents the visualization the model's data to the user.

  CONTROLLER:Controller acts both model and view.It controls the data flow into model and updates
the view whenever data changes.It keeps model and view separate.

        In this project,"Student" object acting as a model."StudentView" will be a view class which
print student details and "StudentController" is the controller class responsible to store data in 
Student object and update view .


JunitTest:

     The  Junit Test is done of all the entities in  "MVC Design Pattern" project and test coverage 
  is 100% successful in jacoco report.
  
         
    SONARQUBE :
            In sonarqube,reliability ,security , securityReview and maintainability is A and 
  the code coverage is 100%. 

       
  SONARQUBE 
  
  gradle command to publish code to sonarqube
gradle sonarqube 
  -Dsonar.projectKey=MVCDesignPattern 
  -Dsonar.host.url=http://localhost:9000 
  -Dsonar.login=973f3376b24566dd37475a15798fa1ec507181d0