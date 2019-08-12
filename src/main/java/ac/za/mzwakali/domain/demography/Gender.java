package ac.za.mzwakali.domain.demography;

public class Gender {

    private int genderId;
    private String genderDesc;

    public Gender() {
    }

    public Gender(Builder builder) {
        this.genderId = builder.genderId;
        this.genderDesc = builder.genderDesc;
    }


    public void setGenderId(int genderId) {
        this.genderId = genderId;
    }

    public void setGenderDesc(String genderDesc) {
        this.genderDesc = genderDesc;
    }

    public int getGenderId() {
        return genderId;
    }

    public String getGenderDesc() {
        return genderDesc;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "genderId=" + genderId +
                ", genderDesc='" + genderDesc + '\'' +
                '}';
    }

    public static class Builder{

        private int genderId;
        private String genderDesc;

        public Builder genderId(int genderId){
            this.genderId = genderId;
            return this;
        }

        public Builder genderDesc(String genderDesc){
            this.genderDesc = genderDesc;
            return this;
        }

        public Gender build(){
            return new Gender(this);
        }
    }
}
