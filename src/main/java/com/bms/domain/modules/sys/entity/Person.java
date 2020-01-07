package com.bms.domain.modules.sys.entity;

public class Person {
    private Integer id;

    private String name;

    private String sex;

    private String idCard;

    private Integer birthday;

    private Double height;

    private Double weight;

    private String blod;

    private String marriage;

    private String heath;

    private Integer mobile;

    private Integer phone;

    private String mail;

    private String address;

    private String colleage;

    private Integer graduationData;

    private String education;

    private String degree;

    private String major;

    private String politics;

    private String personnelType;

    private String hierarchy;

    private String speciality;

    private String hobby;

    private String computerRank;

    private String englishRank;

    private String duty;

    private String station;

    private String departments;

    public Person(Integer id, String name, String sex, String idCard, Integer birthday, Double height, Double weight, String blod, String marriage, String heath, Integer mobile, Integer phone, String mail, String address, String colleage, Integer graduationData, String education, String degree, String major, String politics, String personnelType, String hierarchy, String speciality, String hobby, String computerRank, String englishRank, String duty, String station, String departments) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.idCard = idCard;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
        this.blod = blod;
        this.marriage = marriage;
        this.heath = heath;
        this.mobile = mobile;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
        this.colleage = colleage;
        this.graduationData = graduationData;
        this.education = education;
        this.degree = degree;
        this.major = major;
        this.politics = politics;
        this.personnelType = personnelType;
        this.hierarchy = hierarchy;
        this.speciality = speciality;
        this.hobby = hobby;
        this.computerRank = computerRank;
        this.englishRank = englishRank;
        this.duty = duty;
        this.station = station;
        this.departments = departments;
    }

    public Person() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getBlod() {
        return blod;
    }

    public void setBlod(String blod) {
        this.blod = blod == null ? null : blod.trim();
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage == null ? null : marriage.trim();
    }

    public String getHeath() {
        return heath;
    }

    public void setHeath(String heath) {
        this.heath = heath == null ? null : heath.trim();
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getColleage() {
        return colleage;
    }

    public void setColleage(String colleage) {
        this.colleage = colleage == null ? null : colleage.trim();
    }

    public Integer getGraduationData() {
        return graduationData;
    }

    public void setGraduationData(Integer graduationData) {
        this.graduationData = graduationData;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getPolitics() {
        return politics;
    }

    public void setPolitics(String politics) {
        this.politics = politics == null ? null : politics.trim();
    }

    public String getPersonnelType() {
        return personnelType;
    }

    public void setPersonnelType(String personnelType) {
        this.personnelType = personnelType == null ? null : personnelType.trim();
    }

    public String getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(String hierarchy) {
        this.hierarchy = hierarchy == null ? null : hierarchy.trim();
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality == null ? null : speciality.trim();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getComputerRank() {
        return computerRank;
    }

    public void setComputerRank(String computerRank) {
        this.computerRank = computerRank == null ? null : computerRank.trim();
    }

    public String getEnglishRank() {
        return englishRank;
    }

    public void setEnglishRank(String englishRank) {
        this.englishRank = englishRank == null ? null : englishRank.trim();
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station == null ? null : station.trim();
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments == null ? null : departments.trim();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", idCard='" + idCard + '\'' +
                ", birthday=" + birthday +
                ", height=" + height +
                ", weight=" + weight +
                ", blod='" + blod + '\'' +
                ", marriage='" + marriage + '\'' +
                ", heath='" + heath + '\'' +
                ", mobile=" + mobile +
                ", phone=" + phone +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                ", colleage='" + colleage + '\'' +
                ", graduationData=" + graduationData +
                ", education='" + education + '\'' +
                ", degree='" + degree + '\'' +
                ", major='" + major + '\'' +
                ", politics='" + politics + '\'' +
                ", personnelType='" + personnelType + '\'' +
                ", hierarchy='" + hierarchy + '\'' +
                ", speciality='" + speciality + '\'' +
                ", hobby='" + hobby + '\'' +
                ", computerRank='" + computerRank + '\'' +
                ", englishRank='" + englishRank + '\'' +
                ", duty='" + duty + '\'' +
                ", station='" + station + '\'' +
                ", departments='" + departments + '\'' +
                '}';
    }
}