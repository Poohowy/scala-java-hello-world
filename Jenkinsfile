pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh '/opt/sbt/bin/sbt clean compile run package'
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
