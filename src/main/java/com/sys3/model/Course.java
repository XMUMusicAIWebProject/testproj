package com.sys3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private Integer courseId;
    private String name;
    private String detail;
    private double presentationWeight;
    private double reportWeight;
    private double discussionWeight;
    private Integer teacherId;
    private Integer maxNumber;
    private Integer minNumber;
    private Date startTime;
    private Date endTime;

    public Course() {
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPresentationWeight() {
        return presentationWeight;
    }

    public void setPresentationWeight(double presentationWeight) {
        this.presentationWeight = presentationWeight;
    }

    public double getReportWeight() {
        return reportWeight;
    }

    public void setReportWeight(double reportWeight) {
        this.reportWeight = reportWeight;
    }

    public double getDiscussionWeight() {
        return discussionWeight;
    }

    public void setDiscussionWeight(double discussionWeight) {
        this.discussionWeight = discussionWeight;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(Integer maxNumber) {
        this.maxNumber = maxNumber;
    }

    public Integer getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(Integer minNumber) {
        this.minNumber = minNumber;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
