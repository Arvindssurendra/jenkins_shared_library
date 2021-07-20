def call(String username = 'null') { 
	echo "USERNAME -> ${username}."
	pipeline {
		agent any 
		stage('GREET') {
			steps {
				echo "USERNAME: ${username}"
			}
		}
	
	}
}


