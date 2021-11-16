package junits;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class EnvCheck implements ExecutionCondition {
	
	
		

	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		// TODO Auto-generated method stub
		String ExpEnv = "DEV";
		String ActEnv = "DEV";
		
		if(ExpEnv.equals(ActEnv)) {
			return ConditionEvaluationResult.enabled("The Env values are matching");
		}
		return ConditionEvaluationResult.disabled("The env values are not matchinr");
	}
	

}
