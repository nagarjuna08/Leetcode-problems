/* Write your PL/SQL query statement below */
select n.id from Weather y cross join Weather n  where  n.recordDate-y.recordDate= 1 and n.temperature > y.temperature;