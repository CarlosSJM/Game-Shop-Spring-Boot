drop table if exists videojuego;
drop table if exists distribuidor;


create table videojuego (
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    imagen_url varchar(500)
);


insert into videojuego
(nombre,descripcion,imagen_url) values
('Fall Out 3','Is a 2008 post-apocalyptic action role-playing open worldvideo game developed by Bethesda Game Studios and published byBethesda Softworks.','https://images-na.ssl-images-amazon.com/images/I/812u3NvhFUS._AC_SL1500_.jpg'),
('Diablo 3','Diablo III is a hack-and-slash action role-playing game developed and published by Blizzard Entertainment as the third installment in the Diablo franchise.','https://cdn-products.eneba.com/resized-products/URWddcK_350x200_1x-0.jpg'),
('Berserk and the Band of the Hawk','Guts (ガッツ, Gattsu) is a warrior who has faced the impossible since he was found beneath his hanging mother by a mercenarys wife.','https://images-na.ssl-images-amazon.com/images/I/81Q4bP4qCAL._SX342_.jpg'),
('Baldurs Gate III','Baldurs Gate is a series of role-playing video games set in the Forgotten Realms Dungeons & Dragons campaign setting.','https://smartcdkeys.com/image/cache/data/products/baldurs-gate-iii-3/cover/baldurs-gate-iii-3-smartcdkeys-cheap-cd-key-cover-390x580.png');



insert into videojuego 
(nombre,                    descripcion,                                                                                                                                                                    imagen_url) values
('Bioshock Infinite',       'The last great installment of the Bioshock saga, now in an unmissable dream city among the clouds.',                                                                       'https://cdn.vox-cdn.com/thumbor/I24jyQjEEDBM4AQrGIbaCk4t2gk=/0x0:1080x720/1200x800/filters:focal(0x0:1080x720)/cdn.vox-cdn.com/uploads/chorus_image/image/4674397/bioshock_infinite_delay.0.jpg'),
('Insurgency: Sandstorm',   'A tactical team FPS based on lethal combat in tight spaces and objective-focused multiplayer',                                                             'https://areajugones.sport.es/wp-content/uploads/2018/06/insurgency-e1528802800327.jpg'),
('The Witness',             'You wake up, alone, on a strange island full of puzzles that will challenge and surprise you.',                                                                                   'https://cdn.wccftech.com/wp-content/uploads/2016/11/the-witness-ps4-pro-patch-4k-2060x1288.jpg'),
('Braid',                   'A puzzle game with platformer touches, where you can manipulate the flow of time in unusual and bizarre ways.',                                          'https://i1.wp.com/braid-game.com/news/wp-content/uploads/banner-420x358-city-1e.png'),
('Borderlands 3',           'The father of shooter-looters is back, with a zillion thousand weapons and a chaotic adventure!',                                                                                   'https://cdn.gbposters.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/f/p/fp4825-borderlands-3-cover.jpg'),
('Control',                 'After the invasion of a secret agency in New York by an otherworldly threat, you become the new director who must fight to regain Control.',  'https://media.playstation.com/is/image/SCEA/control-poster-01-ps4-us-11sep19?$native_nt$'),
('Subnautica',              'An underwater adventure game set in an alien ocean world. A huge open world full of wonders and dangers awaits you!',                              'https://store.playstation.com/store/api/chihiro/00_09_000/container/ES/es/999/EP5426-CUSA13893_00-2222444466669999/1568624921000/image?w=240&h=240&bg_color=000000&opacity=100&_version=00_09_000'),
('Firewatch',               'Firewatch is a first-person mystery game for one player that takes place in the Wyoming jungle',                                                                'https://www.mobygames.com/images/covers/l/323028-firewatch-playstation-4-front-cover.jpg');


create table distribuidor (
    id int primary key auto_increment,
    nombre varchar(200) not null,
    sitio_web varchar(500)
);

insert into distribuidor
(id,    nombre,                         sitio_web) values
(1,     '2K',                           'https://2k.com'),
(2,     'Focus Home Interactive',       'https://www.focus-home.com'),
(3,     'Thekla',                       null),
(4,     'Number One',                   null),
(5,     '505 Games',                    'https://505games.com'),
(6,     'Unknown Worlds Entertainment', 'https://unknownworlds.com'),
(7,     'Campo Santo',                  'https://www.camposanto.com');

alter table videojuego
add column distribuidor_id int,
add foreign key (distribuidor_id) references distribuidor(id);

update videojuego set distribuidor_id = 1 where id in (1, 5);
update videojuego set distribuidor_id = 2 where id in (2);
update videojuego set distribuidor_id = 3 where id in (3);
update videojuego set distribuidor_id = 4 where id in (4);
update videojuego set distribuidor_id = 5 where id in (6);
update videojuego set distribuidor_id = 6 where id in (7);
update videojuego set distribuidor_id = 7 where id in (8);

alter table videojuego
modify distribuidor_id int not null;
