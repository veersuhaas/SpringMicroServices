pipeline {
	agent any
	
	stages {
		stage('compile stage'){
		
			steps{
				withMaven(maven :'maven3.6.0'){
					sh 'mvn clean compile'
				}
			
			}
		}
		stage('test stage'){
		
			steps{
				withMaven(maven :'maven3.6.0'){
					sh 'mvn test'
				}
			
			}
		}
		
		stage('deploy stage'){
		
			steps{
				withMaven(maven :'maven3.6.0'){
					sh 'mvn deploy'
				}
			
			}
		}
	}

}