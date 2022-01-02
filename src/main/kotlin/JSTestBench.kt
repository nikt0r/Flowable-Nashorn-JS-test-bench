import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import org.flowable.variable.api.delegate.VariableScope
import javax.script.Invocable
import javax.script.ScriptEngineManager
import javax.script.ScriptException

class JSTestBench {

    private val variablesMap = mutableMapOf<String, Any?>(
        "party" to createJsonNode(
            """
        {
            "name": "ABC123",
            "aaa": 1
        }
        """.trimIndent()
        )
    )

    fun getName(): String {
        return "Flowable JS Test Bench"
    }

    fun getExecution(): VariableScope {
        return MockExecution(variablesMap)
    }

    fun testScript() {
        val engineManager = ScriptEngineManager()
        val scriptEngine = engineManager.getEngineByName("nashorn")
        val fileName = "src/main/resources/jsfile.js"
        val functionName = "testScript"
        try {
            scriptEngine.eval("load('$fileName');")
            val inv = scriptEngine as Invocable
            val retValue = inv.invokeFunction(functionName, this)
            println("$fileName@$functionName returned: $retValue")
            println(variablesMap)
        } catch (e: ScriptException) {
            e.printStackTrace()
        } catch (e: NoSuchMethodException) {
            e.printStackTrace()
        }
    }

    companion object {
        fun createJsonNode(json: String): JsonNode = ObjectMapper().readTree(json)
    }

}