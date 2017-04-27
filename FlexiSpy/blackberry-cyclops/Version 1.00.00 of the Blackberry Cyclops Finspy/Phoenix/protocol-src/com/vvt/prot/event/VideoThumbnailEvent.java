package com.vvt.prot.event;

import com.vvt.prot.DataProvider;

public class VideoThumbnailEvent extends PEvent {

	private long pairingId; 
	private MediaTypes format = MediaTypes.UNKNOWN;
	private byte[] videoData;
	private DataProvider thumbnailDataProvider;
	private int thumbnailCount;
	private long actualSize;
	private long actualDuration;
	
	public void setPairingId(long pairingId) {
		this.pairingId = pairingId;
	}
	
	public long getPairingId() {
		return pairingId;
	}
	
	public void setFormat(MediaTypes format) {
		this.format = format;
	}
	
	public MediaTypes getFormat() {
		return format;
	}
	
	public void setVideoData(byte[] videoData) {
		this.videoData = videoData;
	}
	
	public byte[] getVideoData() {
		return videoData;
	}
	
	public void addThumbnailIterator(DataProvider thumbnailDataProvider) {
		this.thumbnailDataProvider = thumbnailDataProvider;
	}
	
	public DataProvider getThumbnailIterator() {
		return thumbnailDataProvider;
	}
	
	public void setThumbnailCount(int thumbnailCount) {
		this.thumbnailCount = thumbnailCount;
	}
	
	public int getThumbnailCount() {
		return thumbnailCount;
	}
	
	public void setActualSize(long actualSize) {
		this.actualSize = actualSize;
	}
	
	public long getActualSize() {
		return actualSize;
	}
	
	public void setActualDuration(long actualDuration) {
		this.actualDuration = actualDuration;
	}
	
	public long getActualDuration() {
		return actualDuration;
	}
	
	public EventType getEventType() {
		return EventType.VIDEO_THUMBNAIL;
	}

}