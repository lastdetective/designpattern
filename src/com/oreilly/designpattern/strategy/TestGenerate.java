package com.oreilly.designpattern.strategy;

public class TestGenerate {

    private boolean testApple;
    private Boolean testOrange;
    private Boolean isDeleted;
    private boolean isDeleted2;
    private int sayOne;
    private Integer sayTwo;


    public boolean isTestApple() {
        return testApple;
    }

    public void setTestApple(boolean testApple) {
        this.testApple = testApple;
    }

    public Boolean getTestOrange() {
        return testOrange;
    }

    public void setTestOrange(Boolean testOrange) {
        this.testOrange = testOrange;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public boolean isDeleted2() {
        return isDeleted2;
    }

    public void setDeleted2(boolean deleted2) {
        isDeleted2 = deleted2;
    }

    public int getSayOne() {
        return sayOne;
    }

    public void setSayOne(int sayOne) {
        this.sayOne = sayOne;
    }

    public Integer getSayTwo() {
        return sayTwo;
    }

    public void setSayTwo(Integer sayTwo) {
        this.sayTwo = sayTwo;
    }
}
