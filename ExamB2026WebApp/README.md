The web application defines two roles: a field agent and manager.
The web application is expected to work as follows for each role: 

Field Agent
A field agent must be able to perform the following tasks:
 - Login
 - Write a message. The text must be classified either as Low, High or Critical. Low Messages are informational, high messages require a prompt response, and critical messages call for immediate action from the manager HQ.
 - Send the message to HQ. The following message components should be persisted/stored in the database:
     - Agent name
     - Agent ID
     - Message text
     - Message ID
     - Message classification (Low,High,Critical)
     - Timestamp
 - Search for a specific text and display it
 - View the total number of critical-priority messages sent to HQ
 - Logout

Manager
A manager must be able to do the following tasks:
  - Login
  - View Messages according to a specified message classification
  - Determine and display the details of the field agent (Name and ID) who has sent more reports to HQ based on specified message classification
  - Logout

Security Users
Field Agent 1:
- Username: agent1
- password: 123
- role: agent

Field Agent 2:
- username: agent2
- password: 321
- role: agent

Manager:
- username: boss
- password: 123
- role: manager
