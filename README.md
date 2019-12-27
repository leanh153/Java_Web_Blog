# Java Web Blog


 
## Table of contents

- [Pre-Requisites](#Pre-Requisites)
- [Demo](#Demo)
- [How to run](#How-to-run)
- [What's included](#whats-included)
- [Creators](#creators)

## Pre-Requisites
- [Install JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Install Eclipse IDE](https://www.eclipse.org/downloads/)
- [Install Tomcat server](https://tomcat.apache.org/download-90.cgi)

## Demo
- [Video](https://www.youtube.com/watch?v=pb7IwbS8ZQg&list=PLyjak6-yUJUVKNwrWmWK_RplHI0mgzyTC&index=3)

## How to run

- Copy or move file with .war extension to tomcat webapps folder and start server.

## What's included


```text
Java_Web_Blog
├── build.sh
├── README.md
├── src
│   ├── model
│   │   └── Post.java
│   ├── util
│   │   └── HibernateUtil.java
│   └── web
│       ├── Filter.java
│       ├── LogInOutServlet.java
│       ├── PostDAO.java
│       └── PostServlet.java
├── Web321x_Project4.war
└── WebContent
    ├── css
    │   └── main.css
    ├── editor.jsp
    ├── error.jsp
    ├── img
    │   └── profile.jpg
    ├── login.jsp
    ├── META-INF
    │   └── MANIFEST.MF
    ├── navigator.jsp
    ├── node_modules
    │   ├── bootstrap
    │   │   ├── dist
    │   │   │   ├── css
    │   │   │   │   ├── bootstrap.css
    │   │   │   │   ├── bootstrap.css.map
    │   │   │   │   ├── bootstrap-grid.css
    │   │   │   │   ├── bootstrap-grid.css.map
    │   │   │   │   ├── bootstrap-grid.min.css
    │   │   │   │   ├── bootstrap-grid.min.css.map
    │   │   │   │   ├── bootstrap.min.css
    │   │   │   │   ├── bootstrap.min.css.map
    │   │   │   │   ├── bootstrap-reboot.css
    │   │   │   │   ├── bootstrap-reboot.css.map
    │   │   │   │   ├── bootstrap-reboot.min.css
    │   │   │   │   └── bootstrap-reboot.min.css.map
    │   │   │   └── js
    │   │   │       ├── bootstrap.bundle.js
    │   │   │       ├── bootstrap.bundle.js.map
    │   │   │       ├── bootstrap.bundle.min.js
    │   │   │       ├── bootstrap.bundle.min.js.map
    │   │   │       ├── bootstrap.js
    │   │   │       ├── bootstrap.js.map
    │   │   │       ├── bootstrap.min.js
    │   │   │       └── bootstrap.min.js.map
    │   │   ├── LICENSE
    │   │   ├── package.json
    │   │   ├── README.md
    │   │   └── scss
    │   │       ├── _alert.scss
    │   │       ├── _badge.scss
    │   │       ├── bootstrap-grid.scss
    │   │       ├── bootstrap-reboot.scss
    │   │       ├── bootstrap.scss
    │   │       ├── _breadcrumb.scss
    │   │       ├── _button-group.scss
    │   │       ├── _buttons.scss
    │   │       ├── _card.scss
    │   │       ├── _carousel.scss
    │   │       ├── _close.scss
    │   │       ├── _code.scss
    │   │       ├── _custom-forms.scss
    │   │       ├── _dropdown.scss
    │   │       ├── _forms.scss
    │   │       ├── _functions.scss
    │   │       ├── _grid.scss
    │   │       ├── _images.scss
    │   │       ├── _input-group.scss
    │   │       ├── _jumbotron.scss
    │   │       ├── _list-group.scss
    │   │       ├── _media.scss
    │   │       ├── mixins
    │   │       │   ├── _alert.scss
    │   │       │   ├── _background-variant.scss
    │   │       │   ├── _badge.scss
    │   │       │   ├── _border-radius.scss
    │   │       │   ├── _box-shadow.scss
    │   │       │   ├── _breakpoints.scss
    │   │       │   ├── _buttons.scss
    │   │       │   ├── _caret.scss
    │   │       │   ├── _clearfix.scss
    │   │       │   ├── _deprecate.scss
    │   │       │   ├── _float.scss
    │   │       │   ├── _forms.scss
    │   │       │   ├── _gradients.scss
    │   │       │   ├── _grid-framework.scss
    │   │       │   ├── _grid.scss
    │   │       │   ├── _hover.scss
    │   │       │   ├── _image.scss
    │   │       │   ├── _list-group.scss
    │   │       │   ├── _lists.scss
    │   │       │   ├── _nav-divider.scss
    │   │       │   ├── _pagination.scss
    │   │       │   ├── _reset-text.scss
    │   │       │   ├── _resize.scss
    │   │       │   ├── _screen-reader.scss
    │   │       │   ├── _size.scss
    │   │       │   ├── _table-row.scss
    │   │       │   ├── _text-emphasis.scss
    │   │       │   ├── _text-hide.scss
    │   │       │   ├── _text-truncate.scss
    │   │       │   ├── _transition.scss
    │   │       │   └── _visibility.scss
    │   │       ├── _mixins.scss
    │   │       ├── _modal.scss
    │   │       ├── _navbar.scss
    │   │       ├── _nav.scss
    │   │       ├── _pagination.scss
    │   │       ├── _popover.scss
    │   │       ├── _print.scss
    │   │       ├── _progress.scss
    │   │       ├── _reboot.scss
    │   │       ├── _root.scss
    │   │       ├── _spinners.scss
    │   │       ├── _tables.scss
    │   │       ├── _toasts.scss
    │   │       ├── _tooltip.scss
    │   │       ├── _transitions.scss
    │   │       ├── _type.scss
    │   │       ├── utilities
    │   │       │   ├── _align.scss
    │   │       │   ├── _background.scss
    │   │       │   ├── _borders.scss
    │   │       │   ├── _clearfix.scss
    │   │       │   ├── _display.scss
    │   │       │   ├── _embed.scss
    │   │       │   ├── _flex.scss
    │   │       │   ├── _float.scss
    │   │       │   ├── _overflow.scss
    │   │       │   ├── _position.scss
    │   │       │   ├── _screenreaders.scss
    │   │       │   ├── _shadows.scss
    │   │       │   ├── _sizing.scss
    │   │       │   ├── _spacing.scss
    │   │       │   ├── _stretched-link.scss
    │   │       │   ├── _text.scss
    │   │       │   └── _visibility.scss
    │   │       ├── _utilities.scss
    │   │       ├── _variables.scss
    │   │       └── vendor
    │   │           └── _rfs.scss
    │   ├── jquery
    │   │   ├── AUTHORS.txt
    │   │   ├── bower.json
    │   │   ├── dist
    │   │   │   ├── core.js
    │   │   │   ├── jquery.js
    │   │   │   ├── jquery.min.js
    │   │   │   ├── jquery.min.map
    │   │   │   ├── jquery.slim.js
    │   │   │   ├── jquery.slim.min.js
    │   │   │   └── jquery.slim.min.map
    │   │   ├── external
    │   │   │   └── sizzle
    │   │   │       ├── dist
    │   │   │       │   ├── sizzle.js
    │   │   │       │   ├── sizzle.min.js
    │   │   │       │   └── sizzle.min.map
    │   │   │       └── LICENSE.txt
    │   │   ├── LICENSE.txt
    │   │   ├── package.json
    │   │   ├── README.md
    │   │   └── src
    │   │       ├── ajax
    │   │       │   ├── jsonp.js
    │   │       │   ├── load.js
    │   │       │   ├── parseXML.js
    │   │       │   ├── script.js
    │   │       │   ├── var
    │   │       │   │   ├── location.js
    │   │       │   │   ├── nonce.js
    │   │       │   │   └── rquery.js
    │   │       │   └── xhr.js
    │   │       ├── ajax.js
    │   │       ├── attributes
    │   │       │   ├── attr.js
    │   │       │   ├── classes.js
    │   │       │   ├── prop.js
    │   │       │   ├── support.js
    │   │       │   └── val.js
    │   │       ├── attributes.js
    │   │       ├── callbacks.js
    │   │       ├── core
    │   │       │   ├── access.js
    │   │       │   ├── camelCase.js
    │   │       │   ├── DOMEval.js
    │   │       │   ├── init.js
    │   │       │   ├── isAttached.js
    │   │       │   ├── nodeName.js
    │   │       │   ├── parseHTML.js
    │   │       │   ├── readyException.js
    │   │       │   ├── ready.js
    │   │       │   ├── ready-no-deferred.js
    │   │       │   ├── stripAndCollapse.js
    │   │       │   ├── support.js
    │   │       │   ├── toType.js
    │   │       │   └── var
    │   │       │       └── rsingleTag.js
    │   │       ├── core.js
    │   │       ├── css
    │   │       │   ├── addGetHookIf.js
    │   │       │   ├── adjustCSS.js
    │   │       │   ├── curCSS.js
    │   │       │   ├── finalPropName.js
    │   │       │   ├── hiddenVisibleSelectors.js
    │   │       │   ├── showHide.js
    │   │       │   ├── support.js
    │   │       │   └── var
    │   │       │       ├── cssExpand.js
    │   │       │       ├── getStyles.js
    │   │       │       ├── isHiddenWithinTree.js
    │   │       │       ├── rboxStyle.js
    │   │       │       ├── rnumnonpx.js
    │   │       │       └── swap.js
    │   │       ├── css.js
    │   │       ├── data
    │   │       │   ├── Data.js
    │   │       │   └── var
    │   │       │       ├── acceptData.js
    │   │       │       ├── dataPriv.js
    │   │       │       └── dataUser.js
    │   │       ├── data.js
    │   │       ├── deferred
    │   │       │   └── exceptionHook.js
    │   │       ├── deferred.js
    │   │       ├── deprecated.js
    │   │       ├── dimensions.js
    │   │       ├── effects
    │   │       │   ├── animatedSelector.js
    │   │       │   └── Tween.js
    │   │       ├── effects.js
    │   │       ├── event
    │   │       │   ├── ajax.js
    │   │       │   ├── alias.js
    │   │       │   ├── focusin.js
    │   │       │   ├── support.js
    │   │       │   └── trigger.js
    │   │       ├── event.js
    │   │       ├── exports
    │   │       │   ├── amd.js
    │   │       │   └── global.js
    │   │       ├── jquery.js
    │   │       ├── manipulation
    │   │       │   ├── buildFragment.js
    │   │       │   ├── _evalUrl.js
    │   │       │   ├── getAll.js
    │   │       │   ├── setGlobalEval.js
    │   │       │   ├── support.js
    │   │       │   ├── var
    │   │       │   │   ├── rscriptType.js
    │   │       │   │   └── rtagName.js
    │   │       │   └── wrapMap.js
    │   │       ├── manipulation.js
    │   │       ├── offset.js
    │   │       ├── queue
    │   │       │   └── delay.js
    │   │       ├── queue.js
    │   │       ├── selector.js
    │   │       ├── selector-native.js
    │   │       ├── selector-sizzle.js
    │   │       ├── serialize.js
    │   │       ├── traversing
    │   │       │   ├── findFilter.js
    │   │       │   └── var
    │   │       │       ├── dir.js
    │   │       │       ├── rneedsContext.js
    │   │       │       └── siblings.js
    │   │       ├── traversing.js
    │   │       ├── var
    │   │       │   ├── arr.js
    │   │       │   ├── class2type.js
    │   │       │   ├── concat.js
    │   │       │   ├── documentElement.js
    │   │       │   ├── document.js
    │   │       │   ├── fnToString.js
    │   │       │   ├── getProto.js
    │   │       │   ├── hasOwn.js
    │   │       │   ├── indexOf.js
    │   │       │   ├── isFunction.js
    │   │       │   ├── isWindow.js
    │   │       │   ├── ObjectFunctionString.js
    │   │       │   ├── pnum.js
    │   │       │   ├── push.js
    │   │       │   ├── rcheckableType.js
    │   │       │   ├── rcssNum.js
    │   │       │   ├── rnothtmlwhite.js
    │   │       │   ├── slice.js
    │   │       │   ├── support.js
    │   │       │   └── toString.js
    │   │       └── wrap.js
    │   └── popper.js
    │       ├── dist
    │       │   ├── esm
    │       │   │   ├── popper.js
    │       │   │   ├── popper.js.map
    │       │   │   ├── popper.min.js
    │       │   │   ├── popper.min.js.map
    │       │   │   ├── popper-utils.js
    │       │   │   ├── popper-utils.js.map
    │       │   │   ├── popper-utils.min.js
    │       │   │   └── popper-utils.min.js.map
    │       │   ├── popper.js
    │       │   ├── popper.js.map
    │       │   ├── popper.min.js
    │       │   ├── popper.min.js.map
    │       │   ├── popper-utils.js
    │       │   ├── popper-utils.js.map
    │       │   ├── popper-utils.min.js
    │       │   ├── popper-utils.min.js.map
    │       │   └── umd
    │       │       ├── popper.js
    │       │       ├── popper.js.map
    │       │       ├── popper.min.js
    │       │       ├── popper.min.js.map
    │       │       ├── popper-utils.js
    │       │       ├── popper-utils.js.map
    │       │       ├── popper-utils.min.js
    │       │       ├── popper-utils.min.js.map
    │       │       └── poppper.js.flow
    │       ├── index.d.ts
    │       ├── index.js.flow
    │       ├── package.json
    │       └── README.md
    ├── package.json
    ├── postDetail.jsp
    ├── posts.jsp
    ├── sql
    │   └── database.sql
    ├── WEB-INF
    │   ├── lib
    │   │   ├── antlr-2.7.7.jar
    │   │   ├── byte-buddy-1.9.11.jar
    │   │   ├── classmate-1.3.4.jar
    │   │   ├── dom4j-2.1.1.jar
    │   │   ├── FastInfoset-1.2.15.jar
    │   │   ├── hibernate-commons-annotations-5.1.0.Final.jar
    │   │   ├── hibernate-core-5.4.6.Final.jar
    │   │   ├── istack-commons-runtime-3.0.7.jar
    │   │   ├── jandex-2.0.5.Final.jar
    │   │   ├── javassist-3.24.0-GA.jar
    │   │   ├── javax.activation-api-1.2.0.jar
    │   │   ├── javax.persistence-api-2.2.jar
    │   │   ├── jaxb-api-2.3.1.jar
    │   │   ├── jaxb-runtime-2.3.1.jar
    │   │   ├── jboss-logging-3.3.2.Final.jar
    │   │   ├── jboss-transaction-api_1.2_spec-1.1.1.Final.jar
    │   │   ├── mysql-connector-java-5.1.48-bin.jar
    │   │   ├── stax-ex-1.8.jar
    │   │   ├── taglibs-standard-compat-1.2.5.jar
    │   │   ├── taglibs-standard-impl-1.2.5.jar
    │   │   ├── taglibs-standard-jstlel-1.2.5.jar
    │   │   ├── taglibs-standard-spec-1.2.5.jar
    │   │   └── txw2-2.3.1.jar
    │   └── web.xml
    └── yarn.lock

49 directories, 310 files
```
## Creators

- [Github](https://github.com/leanh153)

- Make friend [FACEBOOK](https://WWW.facebook.com/leanh153)

- My [LinkIn](https://www.linkedin.com/in/lênanh)

Enjoy :metal:
