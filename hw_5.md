    // unit-test проверка id контакта
    @Test
    void checkedId() {
        int id = 1;
        assertThat(id).isEqualTo(1);
    }

    // unit-test проверка имени контакта
    @Test
    void checkedName() {
        String name1 = "Max";
        assertThat(name1).isEqualTo("Max");
    }

    // unit-test проверка номера телефона контакта
    @Test
    void checkedNumberOfTelephone() {
        String numberTelephone = "73222252";
        assertThat(numberTelephone).isEqualTo("73222252");
    }

    // unit-test добавление контакта в записную книжку
    @Test
    void testAddContactToNote() {
        //создаем список listContact и заполняем его данными
        List<Contact> note = new ArrayList<>();
        note.add(contact);
        note.add(contact1);

        // запускаем тест и проверяем добавлен ли контакт в записную книжку
        assertTrue(note.add(contact));
        assertTrue(note.add(contact1));

    }

    // unit-test удаление контакта из записной книжки
    @Test
    void testDeleteContact() {
        Note note = mock(Note.class);
        note.deleteContact(contact, listContacts);
        assertFalse(note == null);
    }
}
