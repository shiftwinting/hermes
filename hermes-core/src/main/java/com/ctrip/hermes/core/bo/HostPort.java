package com.ctrip.hermes.core.bo;

import java.util.Objects;

public class HostPort {

	private String m_host;

	private int m_port;

	public HostPort() {
	}

	public HostPort(String host, int port) {
		m_host = host;
		m_port = port;
	}

	public String getHost() {
		return m_host;
	}

	public void setHost(String host) {
		m_host = host;
	}

	public int getPort() {
		return m_port;
	}

	public void setPort(int port) {
		m_port = port;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		HostPort hostPort = (HostPort) o;
		return Objects.equals(m_port, hostPort.m_port) &&
				  Objects.equals(m_host, hostPort.m_host);
	}

	@Override
	public int hashCode() {
		return Objects.hash(m_host, m_port);
	}

	@Override
	public String toString() {
		return "HostPort{" +
				  "m_host='" + m_host + '\'' +
				  ", m_port=" + m_port +
				  '}';
	}
}
