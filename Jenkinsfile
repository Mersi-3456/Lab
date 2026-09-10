pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Mersi-3456/labinternal.git'
            }
        }

        stage('Compile') {
            steps {
                bat 'javac Factorial.java TestFactorial.java'
            }
        }

        stage('Test') {
            steps {
                bat 'java TestFactorial'
            }
        }

        stage('Run') {
            steps {
                bat 'java Factorial'
            }
        }

        stage('Package JAR') {
            steps {
                bat '"C:\\Program Files\\Java\\jdk-17\\bin\\jar.exe" cfm factorial.jar manifest.txt Factorial.class'
            }
        }

        stage('Archive JAR') {
            steps {
                archiveArtifacts artifacts: 'factorial.jar'
            }
        }
    }

    post {
        success {
            echo 'Build, test, run and JAR creation successful and artifact is ready!'
        }

        failure {
            echo 'Build or test failed!'
        }
    }
