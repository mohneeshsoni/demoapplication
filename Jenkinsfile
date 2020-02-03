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
