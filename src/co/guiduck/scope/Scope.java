package co.guiduck.scope;
import java.util.Map;

import org.guiduck.data.Data;


public class Scope {
	private Map<String, Data> variables;
	private int returnAddress;
	
	public Scope(Map<String, Data> variables, int returnAddress) {
		this.variables = variables;
		this.returnAddress = returnAddress;
	}
	
	public Object getData(String var) {
		return variables.get(var);
	}
	
	public void addVar(String var, Object val) {
		variables.put(var, new Data (val));
	}
	
	public boolean containsVar(String var) {
		return variables.containsKey(var);
	}

}
