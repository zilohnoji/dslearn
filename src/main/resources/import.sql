INSERT INTO tb_user (name, email, password) VALUES ('Alex', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Nelio', 'nelioalvesdev@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('Bootcamp ReactJs', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjn5iF14Ij9J51dN1BisYQJUPXPe_4ipSWAA&usqp=CAU', 'data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBw8PDw8PDw8PDw8PDw8NDw8PDw8PDw8PFRUWFhUVFRUYHSggGBolHRUVITEhJSkrLi4uFx8zODMtNygtLisBCgoKDQ0NDg0NDysZFRktNystNysrNSsrLSstKysrKysrKystKysrKy0rKys3LS0rKystLSsrKysrKysrKysrK//AABEIAOEA4QMBIgACEQEDEQH/xAAYAAEBAQEBAAAAAAAAAAAAAAABAAIDBv/EABYQAQEBAAAAAAAAAAAAAAAAAAARAf/EABYBAQEBAAAAAAAAAAAAAAAAAAABAv/EABURAQEAAAAAAAAAAAAAAAAAAAAR/9oADAMBAAIRAxEAPwD12iNaEUIhQIoAkgQKAREAkkCBAJEAkkARQgRQBJAkiARQOoa0I0EQogUIEUKEQARQgDQAIoAkgSSBAoAigCKAJIQpIHbQ1oRplNAAigAKAIoAGkDKKVGUVEAilAigAKAIoAigCKBIwA7gpFZRQBFAA1EDKKAAoAGgARQBFCBEAgUARUAYigChQJGIHVHQKEUARQANAAigZTQABpAyigCKAIgAigSUQBNRQRkogIiQdNDQFSiQCIoGUUAiKgMooAGoAEUKAIoAigEDSBmJpAEUIFCgSSB1DWhFCMQBFAyiooIoQARQBFAyjEAUKAIqAIioARiARQqCBQrMBQGIHUNBFCKABpAyigCIARGIBFCgZUMIMqEgymhACKUCMQBFCBEgA0gdA0EUKGIAioDKjQAIoAGhAERQMkoAoiARgBCNAAigChSgJigBGISNqFRFCKAKEAEUARQMkoGYigCMQMkxAASABQBRoAhCYAiKUERiBtGJAIoGU0ACKAIgAigCKAIgEjFAAKBAoAUgQMQJFAIGko2tKQCKAAqAFCgAaABFAEUADQAIoAigCKAKFAEUAKSiRiBtEIBFAEUABQCIoAkgCKAIoAigCKAJIEkgSSBIoFEYlGkdCARQBFAAUARQBEAkkCSQBFAgUASIMooAUooikgiioVoSCwpAEkCWpAEUARQAFAEUCBQBFAEkARSgKQFJIFJKP//Z');

INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2024-09-10T03:00:00Z', TIMESTAMP WITH TIME ZONE '2025-01-01T03:00:00Z', 1);
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2026-01-05T03:00:00Z', TIMESTAMP WITH TIME ZONE '2027-01-01T03:00:00Z', 1);

INSERT INTO tb_resource (title, description, position, img_uri, type, offer_id) VALUES('Trilha React', 'Trilha principal do curso', '1', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjn5iF14Ij9J51dN1BisYQJUPXPe_4ipSWAA&usqp=CAU', 'LESSON_TASK', 1);
INSERT INTO tb_resource (title, description, position, img_uri, type, offer_id) VALUES('Fórum', 'Tire suas dúvidas', '2', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjn5iF14Ij9J51dN1BisYQJUPXPe_4ipSWAA&usqp=CAU', 'FORUM', 1);
INSERT INTO tb_resource (title, description, position, img_uri, type, offer_id) VALUES('Lives', 'Lives exclusivas para a turma', '3', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjn5iF14Ij9J51dN1BisYQJUPXPe_4ipSWAA&usqp=CAU', 'LESSON_ONLY', 1);

INSERT INTO tb_section (title, description, position, img_uri, resource_id, prerequisite_id) VALUES ('Capitulo 1', 'Neste capitulo vamos começar', 1, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjn5iF14Ij9J51dN1BisYQJUPXPe_4ipSWAA&usqp=CAU', 1, null);
INSERT INTO tb_section (title, description, position, img_uri, resource_id, prerequisite_id) VALUES ('Capitulo 2', 'Neste capitulo vamos continuar', 2, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjn5iF14Ij9J51dN1BisYQJUPXPe_4ipSWAA&usqp=CAU', 1, 1);
INSERT INTO tb_section (title, description, position, img_uri, resource_id, prerequisite_id) VALUES ('Capitulo 3', 'Neste capitulo vamos finalizar', 3, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjn5iF14Ij9J51dN1BisYQJUPXPe_4ipSWAA&usqp=CAU', 1, 2);