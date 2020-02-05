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
   }
}
