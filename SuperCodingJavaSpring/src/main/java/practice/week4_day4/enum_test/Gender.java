package practice.week4_day4.enum_test;

public enum Gender {
    FEMALE("여자", "Female"),
    MALE("남자", "Male"),
    UNKNOWN("미정", "Unknown");

    private String koreanTerm;
    private String englishTerm;

    Gender(String koreanTerm, String englishTerm) {
        this.koreanTerm = koreanTerm;
        this.englishTerm = englishTerm;
    }

    //string -> Gender
    public static Gender valueOfTerm(String str){
        for(Gender gender : values()){
            if(str.equals(gender.koreanTerm) || str.equals(gender.englishTerm)){
                return gender;
            }
        }
        return Gender.UNKNOWN;
    }
}
