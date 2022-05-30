# Support issues in Netbeans, Tomcat

## Can not connect Demo to SQL Server using JDBC
Keyword: SQL, JDBC

### Symtom:
Error message:
The TCP/IP connection to the host localhost, port 1433 has failed. Error: "connect timed out. Verify the connection properties

![](img/hinh1.png)

### Solution:

Check this link and update Port
**Have you enabled 'Named Pipes' and 'TCP/IP'?**
1. Open the 'Sql Server Configuration' application.
2. In the left pane, go to 'SQL Server Network Configuration' -> 'Protocols for [instance-name]'
3. Right-click on both 'Named Pipes' and 'TCP/IP' and select 'enable'.

**Have you used the correct port?**
1. Double-click on 'TCP/IP'
2. Select 'IP Addresses' tab
3. Scroll to IPAII. Your port number is here. Should be 1433
4. Restart the 'SQL Server ([instance-name])' windows service.

![](img/hinh2.png)
