## [Navigation](https://github.com/wagnod/itmo/tree/master/Android/Navigation)

<img src="https://github.com/wagnod/itmo/blob/master/Android/Navigation/Navigation.gif" width="20%" />

**Что нужно сделать?**
* Создать 3 таба. В каждом - свой бэкстэк.
* Всё должно быть на фрагментах (с одной активити).
* Кнопка “Назад” в тулбаре и системная “Назад” ведут себя одинаково: если в стеке текущего таба есть фрагменты, то выкидываем один. Иначе – или выход из приложения, или возврат на предыдущий таб с непустым стеком.
* Стейт при повороте не должен теряться.

**Что сделано?**
* Создано 3 таба, в каждом из которых свой бэкстэк.
* Есть контейнер `RootFragment`, в который будем складывать `ChildFragment` в зависимости от текущего таба.
* Системная кнопка "Назад" работает так же, как и кнопка "Назад" на `Toolbar`
* Приложение не закрывается по клику на "Назад", пока есть хотя бы один таб с непустым стеком.
