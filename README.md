#Reference

##Maven Command

1. mvn 

2. mvn compile

3. mvn clean package

4. mvn spring-boot:run

5. mvn clean package spring-boot:run

6. mnv spring-boot:run -Dspring-boot.run.arguments="--port=3000"

7. mvn spring-boot:run -Dspring-boot.run.arguments="--port=3000 --dataDir=<path way>

8. mvn clean test (only to run test section of code <day 13>)

##Git command

1. git init (initialise local repo but no link to remote yet)

2. <create remote repo>

3. git remote add origin <HTTPS github repo link>

4. git add * (transfer to local repo)(add new or udpated files to be commited to local repo)

5. git status (to check for files going in)

6. git commit -m "message" (commit new or updated files)

7. git push -u origin master (creates master branch)(to push local repo to remote repo)

8. git checkout -b develop master (to create a develop branch with whatever is in the master)

9. git push -u origin develop 

10. git checkout develop/master (to move between branches)

11. git branch -a (show all local and remote branches)

12. git branch (show all local branches)

<after finishing coding>

13. git add *

14. git commit -m "message"

15. git push -u origin develop

16. git checkout master

17. git merge develop 

18. git push -u origin master

<deploying to heroku>

1. creating system.properties file <java.runtime.version=18>

2. heroku login

3. heroku apps:create

4. git push -u heroku master







