package practice.week4_day4.exception_test.custom_exception;

import practice.week4_day4.exception_test.custom_exception.exceptions.IDFormatException;
import practice.week4_day4.exception_test.custom_exception.exceptions.PositiveNumberException;

public class PTMember {

    private String ID;
    private String name;
    private Integer height;
    private Integer weight;
    private String gender;

    public PTMember(String name, Integer height, Integer weight, String gender) {

        if(height<=0) throw new PositiveNumberException("키는 0보다 커야합니다.");
        if(weight<=0) throw new PositiveNumberException("몸무게는 0보다 커야합니다.");

        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public void setID(String ID) {
        if(ID==null) throw new IDFormatException("ID는 Null이 될 수 없습니다.");
        if(ID.length()<8 || ID.length()>20) throw new IDFormatException("ID는 8자 이상 20자 이하이어야 합니다.");
        this.ID = ID;
    }
}
