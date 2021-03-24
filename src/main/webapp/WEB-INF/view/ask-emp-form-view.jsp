<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear Employee, Please enter your details</h2>
<br>
<br>
<form:form action ="showForm" modelAttribute="employee">

Employee ID <form:input path="employeeId"/>
<form:errors path="employeeId"/>
<br>
First name <form:input path="firstName"/>
<form:errors path="firstName"/>
<br>
Last name <form:input path="lastName"/>
<form:errors path="lastName"/>
<br>
Department ID <form:input path="departmentId"/>
<form:errors path="departmentId"/>
<br>
jobTitle <form:input path="jobTitle"/>
<form:errors path="jobTitle"/>
<br>
Date of Birth <form:input path="dateBirth"/>
<form:errors path="dateBirth"/>
<br>

Gender?
MALE<form:radiobutton path="gender" value="MALE"/>
FEMALE<form:radiobutton path="gender" value="FEMALE"/>
<br><br>

<input type="submit" value="OK"/>

</form:form>

</body>
</html>