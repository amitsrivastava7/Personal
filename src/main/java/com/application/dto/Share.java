package com.application.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Share implements Serializable {

    /**
     * [{"symbol":"NS","name":"","currency":"INR","price":"1.20","price_open":"1.20",
     * "day_high":"1.20","day_low":"1.20","52_week_high":"18.65","52_week_low":"0.50","day_change":"0.05","change_pct":"4.35",
     * "close_yesterday":"1.15","market_cap":"2665848320","volume":"2025637","volume_avg":"18509988","shares":"2744250112",
     * "stock_exchange_long":"National Stock Exchange of India","stock_exchange_short":"NSE","timezone":"IST",
     * "timezone_name":"Asia/Kolkata","gmt_offset":"19800","last_trade_time":"2019-12-05 11:16:44","pe":"N/A","eps":"-140.20"}]}
     */

    private static final long serialVersionUID = 3018149627792847296L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "share_id", unique = true, nullable = false)
    private int shareId;
    
    @Column(name = "api_symbol", nullable = false)
    private String apiSymbol;
    
    @Column(name = "symbol", nullable = false, unique = true)
    private String symbol;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "price", nullable = false)
    private Double price;
    
    @Column(name = "price_open", nullable = true)
    private Double priceOpen;
    
    @Column(name = "day_high", nullable = true)
    private Double dayHigh;
    
    @Column(name = "day_low", nullable = true)
    private Double dayLow;
    
    @Column(name = "week52_high", nullable = true)
    private Double week52High;
    
    @Column(name = "week52_low", nullable = true)
    private Double week52Low;
    
    @Column(name = "day_change", nullable = true)
    private Double dayChange;
    
    @Column(name = "change_percentage", nullable = true)
    private Double changePercentage;
    
    @Column(name = "close_yesterday", nullable = true)
    private Double closeYesterday;
    
    @Column(name = "market_cap", nullable = true)
    private Long marketCap;
    
    @Column(name = "volume", nullable = true)
    private Long volume;
    
    @Column(name = "volume_average", nullable = true)
    private Long volumeAverage;
    
    @Column(name = "total_shares", nullable = true)
    private Long totalShares;
    
    @Column(name = "stock_exchange", nullable = true)
    private String stockExchange;
    
    @Column(name = "last_trade_time", nullable = true)
    private LocalDateTime lastTradeTime;
    
    @Column(name = "pe_ratio", nullable = true)
    private String peRatio;
    
    @Column(name = "eps", nullable = true)
    private String eps;
    
    @Column(name = "last_updated_on", nullable = true)
    private LocalDateTime lastUpdatedOn;
    
    @OneToMany(mappedBy = "share", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<ShareHistory> shareHistories;

	public int getShareId() {
		return shareId;
	}

	public void setShareId(int shareId) {
		this.shareId = shareId;
	}
    

}