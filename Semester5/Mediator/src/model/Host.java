package model;

import mediator.Mediator;

public class Host {
	
	private Mediator mediator;
	private String hostname;
	private String ipAddress;
	
	public Host(Mediator mediator, String hostname, String ipAddress) {
		super();
		this.mediator = mediator;
		this.hostname = hostname;
		this.ipAddress = ipAddress;
	}
	
	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public void send(String receiver) {
		System.out.println("Sending message from " + this.ipAddress + " to " + receiver);
		mediator.send(receiver, receiver);;
	}
	
	public void receive(String sender) {
		System.out.println(this.ipAddress + " received message from " + sender);
	}
}
