# MVCDesignPattern
         MVC Pttern stands for Model-View-Controller PAttern.The pttern is used to seperate into
different objects. 
MODEL-Model represents an object or Java POJO carrying data.It contains no logic describing how to 
present the data to the user.

VIEW:View represents the visualization the model's data to the user.

CONTROLLER:Controller acts both model and view.It controls the data flow into model and updates
the view whenever data changes.It keeps model and view separate.

        In this project,"Student" object acting as a model."StudentView" will be a view class which
print student details and "StudentController" is the controller class responsibleto store data in 
Student object and update view .


JunitTest:
        There is JUnit Test also present for all MVC Design Pattern and test coverage are 100%
  successful by jacoco reports.
       
  SONARQUBE 
  
  gradle command to publish code to sonarqube
gradle sonarqube 
  -Dsonar.projectKey=MVCDesignPattern 
  -Dsonar.host.url=http://localhost:9000 
  -Dsonar.login=973f3376b24566dd37475a15798fa1ec507181d0