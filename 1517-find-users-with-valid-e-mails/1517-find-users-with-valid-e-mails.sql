SELECT * 
FROM Users 
WHERE mail LIKE '[A-Za-z]%@leetcode.com' COLLATE LATIN1_GENERAL_CS_AS
  AND mail NOT LIKE '%[^A-Za-z0-9_.-]%@leetcode.com';