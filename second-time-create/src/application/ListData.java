package application;

public class ListData {

	protected long L1;
	protected long L2;
	protected long L3;

		public ListData(long L1, long L2 , long L3) {
			this.L1 = Time.nowStart1;
			this.L2 = Time.nowStop2;
			this.L3 = Time.timeDiff;
		}
		public void setValue1( long l) {
			L1 = l;
		}

		public long getValue1() {
			return L1;
		}

		public void setValue2(long l) {
			L2 = l;
		}

		public long getValue2() {
			return L2;
		}
		public void setValue3(long l) {
			L3 = l;
		}

		public long getValue3() {
			return L3;
		}
	}

