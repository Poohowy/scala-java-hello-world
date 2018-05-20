pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh '/opt/sbt/bin/sbt clean run'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
