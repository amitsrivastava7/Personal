package com.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ShareHistory implements Serializable {

	/**
	 * name":"NS","history":{"2019-12-04":{"open":"1.10","close":"1.15","high":"1.15","low":"1.05","volume":"59824932"},"
	 */
	private static final long serialVersionUID = 8737678725623469365L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "share_history_id", unique = true, nullable = false)
	private int sharehistoryId;

	@ManyToOne(targetEntity = Share.class)
	@JoinColumn(name = "share_id")
	private Share share;

	@Column(name = "date", nullable = false)
	private LocalDate date;

	@Column(name = "open", nullable = false)
	private Double open;

	@Column(name = "close", nullable = false)
	private Double close;

	@Column(name = "high", nullable = false)
	private Double high;

	@Column(name = "low", nullable = false)
	private Double low;

	@Column(name = "volume", nullable = false)
	private Long volume;

	public int getSharehistoryId() {
		return sharehistoryId;
	}

	public void setSharehistoryId(int sharehistoryId) {
		this.sharehistoryId = sharehistoryId;
	}

	public Share getShare() {
		return share;
	}

	public void setShare(Share share) {
		this.share = share;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = LocalDate.parse(date);
	}

	public Double getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = Double.valueOf(open);
	}

	public Double getClose() {
		return close;
	}

	public void setClose(String close) {
		this.close = Double.valueOf(close);
	}

	public Double getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = Double.valueOf(high);
	}

	public Double getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = Double.valueOf(low);
	}

	public Long getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = Long.valueOf(volume);
	}

	@Override
	public String toString() {
		return "ShareHistory [sharehistoryId=" + sharehistoryId + ", share=" + share + ", date=" + date + ", open="
				+ open + ", close=" + close + ", high=" + high + ", low=" + low + ", volume=" + volume + "]";
	}
	
	

}