<h1>Demo Serenity BDD test</h1>

Execute test command:

- mvn clean verify
Run test command with environment
- mvn verify -Denvironment=dev
Run test command with environment and Tagname
- mvn verify -Denvironment=dev -Dtags="@Login"


Naming rules:
Example:
import Methods;
com = company
trecs = project name
allMethods = pagkage name
Methods = class name