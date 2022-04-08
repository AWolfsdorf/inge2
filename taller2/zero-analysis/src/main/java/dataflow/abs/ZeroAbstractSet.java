package dataflow.abs;

import java.util.HashMap;
import java.util.Objects;

public class ZeroAbstractSet {
	private final HashMap<String, ZeroAbstractValue> map;

	public ZeroAbstractSet(){
		this.map = new HashMap<String, ZeroAbstractValue>();
	}

	public Boolean hasValue(String variable) {
		return this.map.containsKey(variable);
	}

	public ZeroAbstractValue getValue(String variable) {
		return this.map.get(variable);
	}

	public void setValue(String variable, ZeroAbstractValue value) {
		if (value != null) {
			this.map.put(variable, value);
		}
	}

	public ZeroAbstractSet union(ZeroAbstractSet another) {
		another.map.forEach(
			(key, value) -> this.map.merge(key, value, (v1, v2) -> v1.merge(v2))
		);
		return this;
	}

	public void clear() {
		this.map.clear();
	}

	public void putAll(ZeroAbstractSet another) {
		this.map.putAll(another.map);
	}

	@Override
	public String toString() {
		return "ZeroAbstractSet{" + this.map + "}";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof ZeroAbstractSet)) return false;
		ZeroAbstractSet that = (ZeroAbstractSet) o;
		return Objects.equals(this.map, that.map);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.map);
	}
}
