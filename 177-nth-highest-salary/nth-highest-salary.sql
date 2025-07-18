CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (

    select DISTINCT salary
    FROM (
        select salary,
            Dense_rank() over(ORDER BY salary DESC) AS drnk 
        from Employee 
    ) as t1
    WHERE drnk = N
  );
END