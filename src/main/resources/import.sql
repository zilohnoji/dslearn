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

INSERT INTO tb_enrollment (user_id, offer_id, enroll_moment, refund_moment, available, only_update) VALUES (1, 1, '2024-09-10T03:00:00Z', null, true, false);
INSERT INTO tb_enrollment (user_id, offer_id, enroll_moment, refund_moment, available, only_update) VALUES (2, 2, '2025-10-10T14:23:12Z', null, true, true);
INSERT INTO tb_enrollment (user_id, offer_id, enroll_moment, refund_moment, available, only_update) VALUES (3, 2, '2025-11-10T09:10:12Z', null, false, true);

INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula - 1', 1, 1);
INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula - 2', 2, 1);
INSERT INTO tb_lesson (title, position, section_id) VALUES ('Aula - 3', 3, 1);

INSERT INTO tb_content (id, text_content, video_uri) VALUES (1, 'Material de apoio: abc', 'https://www.youtube.com/watch?v=jfKfPfyJRdk');
INSERT INTO tb_content (id, text_content, video_uri) VALUES (2, '', 'https://www.youtube.com/watch?v=jfKfPfyJRdk');
INSERT INTO tb_content (id, text_content, video_uri) VALUES (3, '', 'https://www.youtube.com/watch?v=jfKfPfyJRdk');

INSERT INTO tb_lesson (title, position, section_id) VALUES ('Tarefa do capitulo 1', 3, 1);
INSERT INTO tb_task (id, description, question_count, approval_count, weight, due_date) VALUES (4, 'Fazer um trabalho legal', 5, 4, 1.0, TIMESTAMP WITH TIME ZONE '2024-09-10T03:00:00Z');

INSERT INTO tb_lessons_done (lesson_id, user_id, offer_id) VALUES (1, 1, 1);
INSERT INTO tb_lessons_done (lesson_id, user_id, offer_id) VALUES (2, 1, 1);

INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Primeiro feedback de tarefa: favor revisar', TIMESTAMP WITH TIME ZONE '2020-12-10T13:00:00Z', true, '/offers/1/resource/1/sections/1', 1);
INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Segundo feedback: favor revisar', TIMESTAMP WITH TIME ZONE '2020-12-12T13:00:00Z', true, '/offers/1/resource/1/sections/1', 1);
INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Terceiro feedback: favor revisar', TIMESTAMP WITH TIME ZONE '2020-12-14T13:00:00Z', true, '/offers/1/resource/1/sections/1', 1);

INSERT INTO tb_deliver (uri, moment, status, feedback, correct_Count, lesson_id, user_id, offer_id) VALUES ('https://github.com/devsuperior/bds-dslearn', TIMESTAMP WITH TIME ZONE '2020-12-10T10:00:00Z', 0, null, null, 3, 1, 1);

INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 1', 'Corpo do tópico 1', TIMESTAMP WITH TIME ZONE '2020-12-12T13:00:00Z', 1, 1, 1);
INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 2', 'Corpo do tópico 2', TIMESTAMP WITH TIME ZONE '2020-12-13T13:00:00Z', 2, 1, 1);
INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 3', 'Corpo do tópico 3', TIMESTAMP WITH TIME ZONE '2020-12-14T13:00:00Z', 2, 1, 1);
INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 4', 'Corpo do tópico 4', TIMESTAMP WITH TIME ZONE '2020-12-15T13:00:00Z', 1, 1, 2);
INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 5', 'Corpo do tópico 5', TIMESTAMP WITH TIME ZONE '2020-12-16T13:00:00Z', 1, 1, 2);
INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 6', 'Corpo do tópico 6', TIMESTAMP WITH TIME ZONE '2020-12-17T13:00:00Z', 2, 1, 3);

INSERT INTO tb_topic_likes (topic_id, user_id) VALUES (1, 2);
INSERT INTO tb_topic_likes (topic_id, user_id) VALUES (2, 1);

INSERT INTO tb_reply (body, moment, topic_id, author_id) VALUES ('Tente reiniciar o computador', TIMESTAMP WITH TIME ZONE '2020-12-15T13:00:00Z', 1, 2);
INSERT INTO tb_reply (body, moment, topic_id, author_id) VALUES ('Deu certo, valeu!', TIMESTAMP WITH TIME ZONE '2020-12-20T13:00:00Z', 1, 1);

INSERT INTO tb_reply_likes (reply_id, user_id) VALUES (1, 1);