<?xml version="1.0" encoding="UTF-8"?>

-<beans xsi:schemaLocation="http://www.springframework.org/schema/beans https://www.springframework.org/schema/beans/spring-beans.xsd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://www.springframework.org/schema/beans">


-<bean class="com.example.demo.Employee" id="emp1">

<property value="1" name="id"/>

<property value="Harini" name="name"/>

<property value="10000" name="salary"/>

<property name="department" ref="department1"/>

<property value="Full-Time" name="permanent"/>


-<property name="dateOfBirth">


-<bean factory-method="parse" factory-bean="dateFormat">

<constructor-arg value="13/10/1997"/>

</bean>

</property>

<property name="skill" ref="skill1"/>

</bean>


-<bean class="com.example.demo.Employee" id="emp2">

<property value="2" name="id"/>

<property value="Sangeetha" name="name"/>

<property value="10000" name="salary"/>

<property name="department" ref="department2"/>

<property value="Full-Time" name="permanent"/>


-<property name="dateOfBirth">


-<bean factory-method="parse" factory-bean="dateFormat">

<constructor-arg value="16/07/1997"/>

</bean>

</property>

<property name="skill" ref="skill2"/>

</bean>


-<bean class="com.example.demo.Employee" id="emp3">

<property value="3" name="id"/>

<property value="Sathya" name="name"/>

<property value="10000" name="salary"/>

<property name="department" ref="department3"/>

<property value="Full-Time" name="permanent"/>


-<property name="dateOfBirth">


-<bean factory-method="parse" factory-bean="dateFormat">

<constructor-arg value="08/05/1997"/>

</bean>

</property>

<property name="skill" ref="skill3"/>

</bean>


-<bean class="com.example.demo.Department" id="department1">

<property value="10" name="id"/>

<property value="web development" name="name"/>

</bean>


-<bean class="com.example.demo.Department" id="department2">

<property value="20" name="id"/>

<property value="AI" name="name"/>

</bean>


-<bean class="com.example.demo.Department" id="department3">

<property value="30" name="id"/>

<property value="Data Science" name="name"/>

</bean>


-<bean class="com.example.demo.Skill" id="skill1">

<property value="100" name="id"/>

<property value="logical analysis" name="name"/>

</bean>


-<bean class="com.example.demo.Skill" id="skill2">

<property value="200" name="id"/>

<property value="Decoding" name="name"/>

</bean>


-<bean class="com.example.demo.Skill" id="skill3">

<property value="300" name="id"/>

<property value="Communication" name="name"/>

</bean>


-<bean class="java.util.ArrayList" id="employeeList">


-<constructor-arg>


-<list>

<ref bean="emp1"/>

<ref bean="emp2"/>

<ref bean="emp3"/>

</list>

</constructor-arg>

</bean>


-<bean class="java.util.ArrayList" id="departmentList">


-<constructor-arg>


-<list>

<ref bean="department1"/>

<ref bean="department2"/>

<ref bean="department3"/>

</list>

</constructor-arg>

</bean>

</beans>