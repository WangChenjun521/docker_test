DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`          INTEGER NOT NULL,
    `username`    TEXT,
    `password`    TEXT,
    PRIMARY KEY (`id`)
)