This is a web system of managing students information based on java + jsp + servlet.

## Overview
For this system, it has adding, modifying, deleting, and querying functions of  managing the information of  students, teachers, classes. The system is divided into three roles: student, teacher, and administrator. Each function has different function permissions after login.

### preview
These are the explanation about the login page and pages after login as a **administrator**.

#### Login
The login page. you can choose a to login. Each role have different authorities of the functions.
![login](https://github.com/koshiryo/studentsManagementWeb/blob/master/pics/login.png)

#### Home page after logining
This is the page after login as a administrator. you can choose to view students, teachers, classes information in each page. Also, you can add, modify, delete, query the information in each page too.
![system](https://github.com/koshiryo/studentsManagementWeb/blob/master/pics/system.png)

#### Student list page
You can view all students' information details here.What' more, you can also add, modify, delete, query the information. A dialog window will be shown when press each function button.
![2](https://github.com/koshiryo/studentsManagementWeb/blob/master/pics/2.png)

#### Add a student
Dialog window of Add a student.
![3](https://github.com/koshiryo/studentsManagementWeb/blob/master/pics/3.png)

#### Change password
System page to change password. The dialog wimdow will be shown once you press the **Reset Password** button.
![4](https://github.com/koshiryo/studentsManagementWeb/blob/master/pics/3.png)


## Getting Started
#### Prerequisites
- Eclispe
- MySql
- Apache Tomcat 7.0

#### Installing
Perform the following steps:
- Download and install **Eclipse**.
- Select Import in menu bar.
- Select Git > 'Project from git' and click Next button.
- Select this project in 'Project root directory' and click Finish button.
- Clone the URL of repository from github.

#### Start Server
- Open Eclipse > **“Window”** > **“Preferences”**.
- Select **“Server”** option, **“Runtime Environments”** below.
- Click **“Add”** to add Tomcat.
- Click **“Next”**, finish the Tomcat path where you downloaded and click **"finished"**.

#### Tomcat Setting
- **Window** > **Show View** > **Servers**.
- Click **"No servers are available. Click this link to create a new server."**, and select Tomcat version.
- Click **“Next”**, add project > Finish.

#### Start Project
- Find **"index.jsp"** in **WebContent** folder.
- Right click **"Run As"** > **"Run on Server"** to start the project.


## Project Map
   

     - src/com//students/programmer
          + dao                                   … Provide daos
          + model                                 … Define models
          + servlet                               … Define servlets
          + utils                                 … Define servlets
    
     - src/WebContent
          + easyui                                … Provide ui framework
          + view                                  … Defined each page view
          + h-ui                                  … Provide ui framework


## Authors

* **Koshi Ryo**


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

