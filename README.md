# Design-and-support-methods
# Lab 1. IDEF

## 1.1. Исходные данные, возможности безнеса и нужды клиентов
Компания "БукЧейн" - это известный торговец книгами, предлагающий широкий ассортимент литературы различных жанров, начиная от электроники и заканчивая кулинарией. Однако, несмотря на успешную работу в традиционном "оффлайн" формате, компания сталкивается с ростом конкуренции со стороны онлайн-маркетплейсов, приводящим к снижению прибыли и утрате конкурентоспособности.

Анализ рынка и конкурентов: В условиях стремительного роста онлайн-торговли книгами, покупатели оценивают удобство покупки, доступность широкого ассортимента и персонализированный подход. Онлайн-маркетплейсы предоставляют все это, что приводит к их значительному успеху на рынке. Множество конкурентов "БукЧейн" уже успешно перешли на онлайн-торговлю и достигли значительного роста в своей прибыли. Их стратегии включают в себя активное использование цифрового маркетинга, удобные интерфейсы покупки и гибкую систему доставки.

Подходы к решению: Для того чтобы оставаться конкурентоспособным, "БукЧейн" должен создать собственный онлайн-магазин с удобными функциями, такими как персонализированные рекомендации и удобная система доставки.

## 1.2. Образ решения

Магазин розничной торговли "БукЧейн" решает расширить свои возможности путем внедрения информационной системы на основе системы складского учета "Склад", реализующей следующие функции:

1. Просмотр и формирование каталога книг различных жанров;
2. Отслеживание поступления новых поставок книг;
3. Обновление информации об остатках на складе;
4. Создание заказов для поставщиков;
5. Возможность создания типовых комплектаций книг и добавление их в каталог.

Новую технологию решено назвать "Е-БукЧейн". Целью внедрения данной системы является повышение эффективности работы магазина и улучшение обслуживания клиентов и увеличение продаж. Интернет-приложение "Е-БукЧейн" будет реализовано с помощью сайта компании, позволяя посетителям делать заказы книг онлайн, без необходимости посещения физического магазина.

Система "Е-БукЧейн" будет обеспечивать посетителям сайта полный и актуальный каталог книг, а также удобный механизм заказа и доставки товаров, создавая новые возможности для взаимодействия с клиентами и увеличивая конкурентоспособность компании на рынке книжной торговли.

## 1.3. Основные функции

1. Каталог товаров.
* Отображение полного каталога товаров по жанрам и авторам, розничной и оптовой ценой.
* Поиск по каталогу.
* Отображение на первой странице сайта спецпредложений, новинок, лидеров продаж.
-------------

2. Заказ товара. Покупатель должен иметь возможность заказать товар прямо на сайте компании. При этом покупатель должен иметь возможность:
* Зарегистрироваться в системе (до или после набора корзины).
* Просмотреть список книг по жанрам, готовые подборки, имеющиеся в наличии.
* Выбрать нужный товар в корзину.
* Ввести свои данные о способе оплаты (тип кред. карты, наличными).
* Ввести данные о способе доставки (служба доставки, куда доставлять, или сам заберет в магазине). При этом тут же рассчитывается стоимость доставки.
----------------
3. Обработка заказа. Работники компании выполняют заказ клиента. Менеджер по продажам
может проверить, отредактировать и одобрить заказ. После оплаты менеджер склада
выполняет сборку заказа, а менеджер по отправке отправляет заказ клиенту через выбранную
службу доставки или отдаёт на кассу в случае самовывоза.

# Структурная модель системы электронной торговли книгами в нотациях IDEF0

**Цель моделирования**: описать бизнес процесс покупки товара в электронном магазине
книг компании «БукЧейн».

**Точка зрения**: аналитик требований из команды разработки системы «БукЧейн».

**Область моделирования**: ограничивается процессами создания и внедрения
информационного и программного обеспечения системы «БукЧейн»

![IDEF drawio](https://github.com/DekartVan/Design-and-support-methods/assets/60447026/4e5bd00a-0e27-4230-8109-57fc9be30183)

![IDEF_1 drawio](https://github.com/DekartVan/Design-and-support-methods/assets/60447026/45f4b457-9d6e-45d0-a385-b4a0105b4e0a)

![IDEF_2 drawio](https://github.com/DekartVan/Design-and-support-methods/assets/60447026/0564b81d-3518-4c71-a750-01417195532e)

![IDEF_3 drawio](https://github.com/DekartVan/Design-and-support-methods/assets/60447026/139cbd00-24de-4abf-81b6-f2ae9c586ce6)



