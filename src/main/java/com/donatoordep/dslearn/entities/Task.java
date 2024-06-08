package com.donatoordep.dslearn.entities;

import com.donatoordep.dslearn.builders.TaskAbstractBuilder;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "tb_task")
public class Task extends Lesson {

    private String description;
    private Integer questionCount;
    private Integer approvalCount;
    private Double weight;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant dueDate;

    protected Task() {
    }

    public static class TaskBuilder implements TaskAbstractBuilder {
        private Task entity;

        private TaskBuilder() {
            this.reset();
        }

        public static TaskBuilder builder() {
            return new TaskBuilder();
        }

        @Override
        public Task build() {
            return this.entity;
        }

        @Override
        public TaskAbstractBuilder id(Long id) {
            this.entity.setId(id);
            return this;
        }

        @Override
        public TaskAbstractBuilder description(String description) {
            this.entity.setDescription(description);
            return this;
        }

        @Override
        public TaskAbstractBuilder questionCount(Integer questionCount) {
            this.entity.setQuestionCount(questionCount);
            return this;
        }

        @Override
        public TaskAbstractBuilder approvalCount(Integer approvalCount) {
            this.entity.setApprovalCount(approvalCount);
            return this;
        }

        @Override
        public TaskAbstractBuilder weight(Double weight) {
            this.entity.setWeight(weight);
            return this;
        }

        @Override
        public TaskAbstractBuilder dueDate(Instant dueDate) {
            this.entity.setDueDate(dueDate);
            return this;
        }

        @Override
        public TaskAbstractBuilder lessonTitle(String title) {
            this.entity.setTitle(title);
            return this;
        }

        @Override
        public TaskAbstractBuilder lessonPosition(Integer position) {
            this.entity.setPosition(position);
            return this;
        }

        @Override
        public TaskAbstractBuilder lessonSection(Section section) {
            this.entity.setSection(section);
            return this;
        }

        @Override
        public void reset() {
            this.entity = new Task();
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(Integer questionCount) {
        this.questionCount = questionCount;
    }

    public Integer getApprovalCount() {
        return approvalCount;
    }

    public void setApprovalCount(Integer approvalCount) {
        this.approvalCount = approvalCount;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Instant getDueDate() {
        return dueDate;
    }

    public void setDueDate(Instant dueDate) {
        this.dueDate = dueDate;
    }
}