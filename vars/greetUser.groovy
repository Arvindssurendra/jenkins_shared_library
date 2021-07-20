def call(String username = 'null', String designation = null) { 
	
	echo "This is shared library greetUser"
	echo "${designation}"
	
	pipeline {
		environment { 
			USER_NAME = "${username}"
			desig = "${designation}"
		}	
		agent any 
		stages {
			stage('GREET') {
				steps {
					echo "Hi ${USER_NAME}, How are you !"
					echo "Your designation is ${desig}"
				}
			}
		}
	}
}


