pipeline{
    agent any
    stages{
        stage('Compile'){
            steps{
                sh 'javac Factorial.java TestFactorial.java'
            }
        }
        stage('Test'){
            steps{
                sh 'java TestFactorial'
            }
        }
        stage('Run'){
            steps{
                sh 'java Factorial'
            }
        }
        stage('package jar'){
            steps{
                sh 'jar cfm factorial.jar manifest.txt Factorial.class'
            }
        }
        stage('archiving  artifacts'){
            steps{
                archiveArtifacts artifacts: 'factorial.jar'
            }
        }
    }
    post{
        success{
            echo 'Build succeeded'
        }
        failure{
            echo 'Build failed'
        }
    }
}