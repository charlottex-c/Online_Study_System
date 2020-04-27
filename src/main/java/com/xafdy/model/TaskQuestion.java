package com.xafdy.model;

public class TaskQuestion {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_question.id
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_question.title
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_question.item_a
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    private String itemA;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_question.item_b
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    private String itemB;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_question.item_c
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    private String itemC;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_question.item_d
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    private String itemD;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_question.answer
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    private String answer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_question.task_id
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    private Integer taskId;
    
    private Integer score;
    
    public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_question.id
     *
     * @return the value of task_question.id
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_question.id
     *
     * @param id the value for task_question.id
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_question.title
     *
     * @return the value of task_question.title
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_question.title
     *
     * @param title the value for task_question.title
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_question.item_a
     *
     * @return the value of task_question.item_a
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    public String getItemA() {
        return itemA;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_question.item_a
     *
     * @param itemA the value for task_question.item_a
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    public void setItemA(String itemA) {
        this.itemA = itemA;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_question.item_b
     *
     * @return the value of task_question.item_b
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    public String getItemB() {
        return itemB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_question.item_b
     *
     * @param itemB the value for task_question.item_b
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    public void setItemB(String itemB) {
        this.itemB = itemB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_question.item_c
     *
     * @return the value of task_question.item_c
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    public String getItemC() {
        return itemC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_question.item_c
     *
     * @param itemC the value for task_question.item_c
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    public void setItemC(String itemC) {
        this.itemC = itemC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_question.item_d
     *
     * @return the value of task_question.item_d
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    public String getItemD() {
        return itemD;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_question.item_d
     *
     * @param itemD the value for task_question.item_d
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    public void setItemD(String itemD) {
        this.itemD = itemD;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_question.answer
     *
     * @return the value of task_question.answer
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_question.answer
     *
     * @param answer the value for task_question.answer
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_question.task_id
     *
     * @return the value of task_question.task_id
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_question.task_id
     *
     * @param taskId the value for task_question.task_id
     *
     * @mbg.generated Fri Mar 30 15:11:14 CST 2018
     */
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }
}