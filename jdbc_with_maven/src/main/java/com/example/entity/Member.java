package com.example.entity;

import java.time.LocalDate;

public class Member {

		private int memberId;
		private String memberName;
		private String memberAddress;
		private LocalDate accOpenDate;
		private String membershipId;
		private double fessPaid;
		private int maxBooksAllowed;
		private double penaltyAmount;
		
		
		public Member() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public Member(int memberId, String memberName, String memberAddress, LocalDate accOpenDate, String membershipId,
				double fessPaid, int maxBooksAllowed, double penaltyAmount) {
			super();
			this.memberId = memberId;
			this.memberName = memberName;
			this.memberAddress = memberAddress;
			this.accOpenDate = accOpenDate;
			this.membershipId = membershipId;
			this.fessPaid = fessPaid;
			this.maxBooksAllowed = maxBooksAllowed;
			this.penaltyAmount = penaltyAmount;
		}
		
		
		public int getMemberId() {
			return memberId;
		}
		public void setMemberId(int memberId) {
			this.memberId = memberId;
		}
		public String getMemberName() {
			return memberName;
		}
		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}
		public String getMemberAddress() {
			return memberAddress;
		}
		public void setMemberAddress(String memberAddress) {
			this.memberAddress = memberAddress;
		}
		public LocalDate getAccOpenDate() {
			return accOpenDate;
		}
		public void setAccOpenDate(LocalDate accOpenDate) {
			this.accOpenDate = accOpenDate;
		}
		public String getMembershipId() {
			return membershipId;
		}
		public void setMembershipId(String membershipId) {
			this.membershipId = membershipId;
		}
		public double getFessPaid() {
			return fessPaid;
		}
		public void setFessPaid(double fessPaid) {
			this.fessPaid = fessPaid;
		}
		public int getMaxBooksAllowed() {
			return maxBooksAllowed;
		}
		public void setMaxBooksAllowed(int maxBooksAllowed) {
			this.maxBooksAllowed = maxBooksAllowed;
		}
		public double getPenaltyAmount() {
			return penaltyAmount;
		}
		public void setPenaltyAmount(double penaltyAmount) {
			this.penaltyAmount = penaltyAmount;
		}
		
		
		@Override
		public String toString() {
			return "member [memberId=" + memberId + ", memberName=" + memberName + ", memberAddress=" + memberAddress
					+ ", accOpenDate=" + accOpenDate + ", membershipId=" + membershipId + ", fessPaid=" + fessPaid
					+ ", maxBooksAllowed=" + maxBooksAllowed + ", penaltyAmount=" + penaltyAmount + "]";
		}
		
}
