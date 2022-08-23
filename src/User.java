public class User {

        private String name;
        private double id;
        private String gender;

        public void setName(String Name){

            name = Name;
        }

        public void setId(double Id){

            id = Id;
        }
        public void setGender(String Gender){

            gender = Gender;
        }
        public String getName(){
            return name;
        }
        public double getId(){
            return id;
        }
        public String getGender(){
            return gender;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }
