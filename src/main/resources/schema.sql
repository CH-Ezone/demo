CREATE TABLE user (`id` int  NOT NULL,
                     `name` varchar(30) NOT NULL,
                    `sex` int DEFAULT 0,
                    `age` int DEFAULT 0,
                    `birthday` time ,
                     PRIMARY KEY (`id`)
)