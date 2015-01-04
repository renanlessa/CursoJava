

public class Conta implements Comparable<Conta> {

	private double saldo;
	private String titular;
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public Conta(double saldo, String titular) {
		this.saldo = saldo;
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double quantidade) {
		saldo += quantidade;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + "]";
	}

	@Override
	public int compareTo(Conta outra) {
		if(this.saldo < outra.saldo) return -1;
		if(this.saldo > outra.saldo) return 1;
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((titular == null) ? 0 : titular.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (Double.doubleToLongBits(saldo) != Double
				.doubleToLongBits(other.saldo))
			return false;
		if (titular == null) {
			if (other.titular != null)
				return false;
		} else if (!titular.equals(other.titular))
			return false;
		return true;
	}
}