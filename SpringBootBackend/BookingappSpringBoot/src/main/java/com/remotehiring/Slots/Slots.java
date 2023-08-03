package com.remotehiring.Slots;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="add_shows")
public class Slots {
	@Id private String slotid;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer locationid;
	private String slotno;
	private Integer status = 0;
	private String time = "0";
	private String duration ;
	private String showname;
	public Slots() {
	}
	
	public Slots(String showname,String slotid, Integer locationid, String slotno, Integer status, String time, String duration) {
		super();
		this.slotid = slotid;
		this.locationid = locationid;
		this.slotno = slotno;
		this.status = status;
		this.time = time;
		this.duration = duration;
		this.showname=showname;
	}
	
	public String getSlotid() {
		return slotid;
	}
	
	public void setSlotid(String slotid) {
		this.slotid = slotid;
	}
	public Integer getLocationid() {
		return locationid;
	}
	public void setLocationid(Integer locationid) {
		this.locationid = locationid;
	}
	public String getSlotno() {
		return slotno;
	}
	public void setSlotno(String slotno) {
		this.slotno = slotno;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getshowname() {
		return duration;
	}
	public void setshowname(String showname) {
		this.showname = showname;
	}
	
	
}
