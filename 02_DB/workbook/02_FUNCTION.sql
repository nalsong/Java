--1
SELECT STUDENT_NO "학번", STUDENT_NAME "이름", TO_CHAR(ENTRANCE_DATE,'YYYY-MM-DD') "입학년도" 
FROM TB_STUDENT 
WHERE DEPARTMENT_NO = 002
ORDER BY ENTRANCE_DATE ;


--2
SELECT PROFESSOR_NAME , PROFESSOR_SSN 
FROM TB_PROFESSOR
WHERE PROFESSOR_NAME NOT LIKE '___';



--3
SELECT PROFESSOR_NAME "교수이름", FLOOR(MONTHS_BETWEEN(SYSDATE, SUBSTR(PROFESSOR_SSN, 1, 6))/12) "나이"
FROM TB_PROFESSOR
WHERE SUBSTR(PROFESSOR_SSN, 8, 1) = 1;



