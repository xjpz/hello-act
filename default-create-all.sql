create table user (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  password                      varchar(255),
  email                         varchar(255),
  phone                         varchar(255),
  type                          integer,
  status                        integer,
  init_time                     bigint,
  update_time                   bigint,
  tombstone                     integer,
  constraint pk_user primary key (id)
);

