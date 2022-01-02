
var objectMapper = com.fasterxml.jackson.databind.ObjectMapper;

function testScript(context) {
    var execution = context.getExecution();

    /* PASTE JS CODE TO TEST BELOW */

    var HashMap = Java.type("java.util.HashMap");
    var map = new HashMap();
    // map key-value access by java get/put method calls
    map.put('js', 'nashorn');
    var element = map.get('js');

    var testVariable = {
        a: 1,
        b: "a"
    }

    var party = JSON.parse(execution.getVariable('party'));
    print(party.name);
    print(execution.getVariable('party').get('name'));

//    var execution = new variableScope();
    execution.setVariable('testVariable', new objectMapper().readTree(JSON.stringify(testVariable)));

//    var message = new objectMapper().readTree(JSON.stringify(testVariable)); // "hello world " + context.getName() + ": " + element;
    var message = context.getName() + " " + element;
    return message;
}
