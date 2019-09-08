pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building ...'
                sh "mvn clean"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing ...'
                sh  'mvn test'
            }
        }
        stage('Reporting') {
            steps {
                echo 'Reporting ...'
            }
        }
    }
}
