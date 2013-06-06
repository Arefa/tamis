INSERT IGNORE INTO users VALUES ('admin', 'admin', true);
INSERT IGNORE INTO authorities VALUES ('admin', 'ROLE_USER');
INSERT IGNORE INTO authorities VALUES ('admin', 'ROLE_ADMIN');
INSERT IGNORE INTO users VALUES ('guest', 'guest', true);
INSERT IGNORE INTO authorities VALUES ('guest', 'ROLE_USER');

