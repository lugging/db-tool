package db.tool.util;

import java.io.Serializable;
import java.util.Date;

public class Context implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6596701771762312423L;

	//插入总条数
	private long count;
	
	//当前插入条数
	private volatile long currentNumber; 
	
	//开始时间
	private Date beginDate;
	
	//结束事件
	private Date endDate;

	//执行状态(0 未运行， 1 运行中 ， 2 运行结束 )
	private int status = 0; 
	
	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public long getCurrentNumber() {
		return currentNumber;
	}

	public void setCurrentNumber(long currentNumber) {
		this.currentNumber = currentNumber;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * 0 未运行， 1 运行中 ， 2 运行结束
	 * @return
	 */
	public int getStatus() {
		return status;
	}
	
	/**
	 * 0 未运行， 1 运行中 ， 2 运行结束
	 * @param status
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Context [count=" + count + ", currentNumber=" + currentNumber + ", beginDate=" + beginDate
				+ ", endDate=" + endDate + ", status=" + status + "]";
	}
	
}