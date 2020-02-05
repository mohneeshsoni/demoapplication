pipeline {
   agent any

   stages {
      stage('Clean-up') {
         steps {
            
            echo "Cleaning up the workspace" 
         }
      }
      stage('Git Clone') {
         steps {
            
            git  "https://github.com/mohneeshsoni/demoapplication.git"
            
         }
      }
      stage('static code analysis') {
         steps {
           bat '''
                cd demo-application
                dir
                mvn sonar:sonar
            '''
         } 
      }
      stage('Junit') {
         steps {
           bat '''
                cd demo-application
                dir
                mvn test
            '''
         } 
      }
      stage('Build') {
         steps {
           bat '''
                cd demo-application
                dir
                mvn clean package docker:build -DpushImage
            '''
         } 
      }
      stage('Deploy') {
         steps {
           bat '''
                cd demo-application
                dir
                kubectl apply -f deployment.yaml
                kubectl apply -f service.yaml
            '''
         } 
      }
      stage('Deploy Verification') {
         steps {
           bat '''
                // script to check log and exception patterns
                
            '''
         } 
      }
      stage('Functional/Integration testing') {
         steps {
           bat '''
               // to run the functional/Integration testcases
   
            '''
         } 
      }
      
      
      
   }
}
