pipeline {

    agent any
    tools {
        maven 'maven_3_8_1'
        jdk 'jdk14'
    }
    stages {
        stage('Compile') {
            steps {
                bat "mvn clean compile"
        }
    }

         stage('Test') {
             steps {
                bat "mvn test"
        }
    }

  }

}
