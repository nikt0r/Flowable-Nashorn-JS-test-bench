import org.flowable.variable.api.delegate.VariableScope
import org.flowable.variable.api.persistence.entity.VariableInstance

class MockExecution(private val variablesMap: MutableMap<String, Any?>) : VariableScope {
    override fun getVariables(): MutableMap<String, Any> {
        TODO("Not yet implemented")
    }

    override fun getVariables(variableNames: MutableCollection<String>?): MutableMap<String, Any> {
        TODO("Not yet implemented")
    }

    override fun getVariables(
        variableNames: MutableCollection<String>?,
        fetchAllVariables: Boolean
    ): MutableMap<String, Any> {
        TODO("Not yet implemented")
    }

    override fun getVariableInstances(): MutableMap<String, VariableInstance> {
        TODO("Not yet implemented")
    }

    override fun getVariableInstances(variableNames: MutableCollection<String>?): MutableMap<String, VariableInstance> {
        TODO("Not yet implemented")
    }

    override fun getVariableInstances(
        variableNames: MutableCollection<String>?,
        fetchAllVariables: Boolean
    ): MutableMap<String, VariableInstance> {
        TODO("Not yet implemented")
    }

    override fun getVariablesLocal(): MutableMap<String, Any> {
        TODO("Not yet implemented")
    }

    override fun getVariablesLocal(variableNames: MutableCollection<String>?): MutableMap<String, Any> {
        TODO("Not yet implemented")
    }

    override fun getVariablesLocal(
        variableNames: MutableCollection<String>?,
        fetchAllVariables: Boolean
    ): MutableMap<String, Any> {
        TODO("Not yet implemented")
    }

    override fun getVariableInstancesLocal(): MutableMap<String, VariableInstance> {
        TODO("Not yet implemented")
    }

    override fun getVariableInstancesLocal(variableNames: MutableCollection<String>?): MutableMap<String, VariableInstance> {
        TODO("Not yet implemented")
    }

    override fun getVariableInstancesLocal(
        variableNames: MutableCollection<String>?,
        fetchAllVariables: Boolean
    ): MutableMap<String, VariableInstance> {
        TODO("Not yet implemented")
    }

    override fun getVariable(variableName: String?): Any {
        return variablesMap[variableName] as Any
    }

    override fun getVariable(variableName: String?, fetchAllVariables: Boolean): Any {
        return variablesMap[variableName] as Any
//            val typeRef: TypeReference<HashMap<String, Any>> = object : TypeReference<HashMap<String, Any>>() {}
//            return try {
//                ObjectMapper().readValue<Map<String, Any>>(jsonStr[variableName], typeRef)
//            } catch (e: IOException) {
//                e.printStackTrace()
//            }
    }

    override fun <T : Any?> getVariable(variableName: String?, variableClass: Class<T>?): T {
        TODO("Not yet implemented")
    }

    override fun getVariableInstance(variableName: String?): VariableInstance {
        TODO("Not yet implemented")
    }

    override fun getVariableInstance(variableName: String?, fetchAllVariables: Boolean): VariableInstance {
        TODO("Not yet implemented")
    }

    override fun getVariableLocal(variableName: String?): Any {
        TODO("Not yet implemented")
    }

    override fun getVariableLocal(variableName: String?, fetchAllVariables: Boolean): Any {
        TODO("Not yet implemented")
    }

    override fun <T : Any?> getVariableLocal(variableName: String?, variableClass: Class<T>?): T {
        TODO("Not yet implemented")
    }

    override fun getVariableInstanceLocal(variableName: String?): VariableInstance {
        TODO("Not yet implemented")
    }

    override fun getVariableInstanceLocal(variableName: String?, fetchAllVariables: Boolean): VariableInstance {
        TODO("Not yet implemented")
    }

    override fun getVariableNames(): MutableSet<String> {
        TODO("Not yet implemented")
    }

    override fun getVariableNamesLocal(): MutableSet<String> {
        TODO("Not yet implemented")
    }

    override fun setVariable(variableName: String, value: Any?) {
        variablesMap[variableName] = value
    }

    override fun setVariable(variableName: String?, value: Any?, fetchAllVariables: Boolean) {
        TODO("Not yet implemented")
    }

    override fun setVariableLocal(variableName: String?, value: Any?): Any {
        TODO("Not yet implemented")
    }

    override fun setVariableLocal(variableName: String?, value: Any?, fetchAllVariables: Boolean): Any {
        TODO("Not yet implemented")
    }

    override fun setVariables(variables: MutableMap<String, out Any>?) {
        TODO("Not yet implemented")
    }

    override fun setVariablesLocal(variables: MutableMap<String, out Any>?) {
        TODO("Not yet implemented")
    }

    override fun hasVariables(): Boolean {
        TODO("Not yet implemented")
    }

    override fun hasVariablesLocal(): Boolean {
        TODO("Not yet implemented")
    }

    override fun hasVariable(variableName: String?): Boolean {
        TODO("Not yet implemented")
    }

    override fun hasVariableLocal(variableName: String?): Boolean {
        TODO("Not yet implemented")
    }

    override fun removeVariable(variableName: String?) {
        TODO("Not yet implemented")
    }

    override fun removeVariableLocal(variableName: String?) {
        TODO("Not yet implemented")
    }

    override fun removeVariables(variableNames: MutableCollection<String>?) {
        TODO("Not yet implemented")
    }

    override fun removeVariables() {
        TODO("Not yet implemented")
    }

    override fun removeVariablesLocal(variableNames: MutableCollection<String>?) {
        TODO("Not yet implemented")
    }

    override fun removeVariablesLocal() {
        TODO("Not yet implemented")
    }

    override fun setTransientVariable(variableName: String?, variableValue: Any?) {
        TODO("Not yet implemented")
    }

    override fun getTenantId(): String {
        TODO("Not yet implemented")
    }

    override fun setTransientVariableLocal(variableName: String?, variableValue: Any?) {
        TODO("Not yet implemented")
    }

    override fun setTransientVariables(transientVariables: MutableMap<String, Any>?) {
        TODO("Not yet implemented")
    }

    override fun getTransientVariable(variableName: String?): Any {
        TODO("Not yet implemented")
    }

    override fun getTransientVariables(): MutableMap<String, Any> {
        TODO("Not yet implemented")
    }

    override fun setTransientVariablesLocal(transientVariables: MutableMap<String, Any>?) {
        TODO("Not yet implemented")
    }

    override fun getTransientVariableLocal(variableName: String?): Any {
        TODO("Not yet implemented")
    }

    override fun getTransientVariablesLocal(): MutableMap<String, Any> {
        TODO("Not yet implemented")
    }

    override fun removeTransientVariableLocal(variableName: String?) {
        TODO("Not yet implemented")
    }

    override fun removeTransientVariable(variableName: String?) {
        TODO("Not yet implemented")
    }

    override fun removeTransientVariables() {
        TODO("Not yet implemented")
    }

    override fun removeTransientVariablesLocal() {
        TODO("Not yet implemented")
    }
}