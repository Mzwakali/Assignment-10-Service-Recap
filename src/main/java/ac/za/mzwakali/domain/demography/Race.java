package ac.za.mzwakali.domain.demography;

public class Race {
    private int raceId;
    private String raceDesc;

    public Race() {
    }

    public Race(Builder builder) {
        this.raceId = builder.raceId;
        this.raceDesc = builder.raceDesc;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public void setRaceDesc(String raceDesc) {
        this.raceDesc = raceDesc;
    }

    public int getRaceId() {
        return raceId;
    }

    public String getRaceDesc() {
        return raceDesc;
    }

    @Override
    public String toString() {
        return "Race{" +
                "raceId=" + raceId +
                ", raceDesc='" + raceDesc + '\'' +
                '}';
    }

    public static class Builder{
        private int raceId;
        private String raceDesc;

        public Builder raceId(int raceId){
            this.raceId = raceId;
            return this;
        }

        public Builder raceDesc(String raceDesc){
            this.raceDesc = raceDesc;
            return this;
        }

        public Race build(){
            return new Race(this);
        }
    }
}
