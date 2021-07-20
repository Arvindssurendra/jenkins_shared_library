def call(String username = 'null') { 
	echo "This is shared library greetUser"
	pipeline {
		environment { 
			USER_NAME = "${username}"
		agent any 
		stage('GREET') {
			steps {
				echo "Hi ${USER_NAME}, How are you !"
			}
		}
	
	}
}


