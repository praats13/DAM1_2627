# Find the Errors

In the exam they give you broken code and you must **find the error** and **explain why** it's wrong.
A good answer has 3 parts:

> **Line X:** `<what is written>` → **Error:** why it's wrong → **Fix:** `<correct version>`

Example:
> **Line 5:** `<p>Hello` → **Error:** the `<p>` tag is opened but never closed. → **Fix:** `<p>Hello</p>`

---

## The checklist — go through it on EVERY exam code

Read the code once per item. Slow is fine.

1. ☐ `<!DOCTYPE html>` at the very top?
2. ☐ `<html>`, `<head>`, `<body>` exist, in the right order, and are closed?
3. ☐ `<title>` is inside `<head>` (not body)?
4. ☐ Every tag opened is closed? (`<p>`, `<li>`, `<td>`, `<tr>`, `<a>`, `<h1>`…)
5. ☐ Closed in the right order? (`<b><i></i></b>` not `<b><i></b></i>`)
6. ☐ Opening and closing names match? (`<h1>…</h2>` ❌, `<ul>…</ol>` ❌)
7. ☐ Empty tags NOT closed? (`<br>`, `<hr>`, `<img>`, `<input>`, `<meta>`)
8. ☐ Attributes have `=` and quotes? (`href="page.html"`)
9. ☐ Spelling of tags and attributes? (`colspam`, `scr`, `herf`, `<tabel>`, `<lable>`)
10. ☐ Tags in the right parent? (`<li>` in `ul/ol`, `<td>` in `<tr>`, `<tr>` in `<table>`, `<option>` in `<select>`)
11. ☐ Tables: every row has the same number of columns (counting colspan/rowspan)?
12. ☐ Forms: `label for` = `input id`? radios share the same `name`? valid `type`?
13. ☐ `<img>` has `src` and `alt`?
14. ☐ Only one `<h1>`? Headings in order (h1 → h2 → h3, no jumping h1 → h4)?

---

## The most common errors (with explanation)

| Wrong ❌                                      | Why                                                 | Right ✅                                |
| -------------------------------------------- | --------------------------------------------------- | -------------------------------------- |
| `<p>Hello`                                   | Tag not closed                                      | `<p>Hello</p>`                         |
| `<b><i>Hi</b></i>`                           | Bad nesting: the last opened must be closed first   | `<b><i>Hi</i></b>`                     |
| `<h1>Title</h2>`                             | Opening and closing don't match                     | `<h1>Title</h1>`                       |
| `<br></br>` or `<img ...></img>`             | Empty tags have no closing tag                      | `<br>` / `<img ...>`                   |
| `<a href=page.html>`                         | Attribute value without quotes                      | `<a href="page.html">`                 |
| `<a herf="x.html">`                          | Attribute misspelled (`href` = hypertext reference) | `<a href="x.html">`                    |
| `<img scr="a.jpg">`                          | `src` misspelled, and missing `alt`                 | `<img src="a.jpg" alt="...">`          |
| `<ul> Milk </ul>`                            | Text inside a list must be in `<li>`                | `<ul><li>Milk</li></ul>`               |
| `<table><td>A</td></table>`                  | Cells must be inside a row `<tr>`                   | `<table><tr><td>A</td></tr></table>`   |
| `<td colspam="2">`                           | Misspelled: `colspan`                               | `<td colspan="2">`                     |
| `<tr colspan="2">`                           | colspan/rowspan go on a cell (`td`/`th`), not a row | `<td colspan="2">`                     |
| Row with too many cells after rowspan        | The rowspan cell above already occupies that space  | Delete one cell in the next row        |
| `<title>` inside `<body>`                    | Title belongs in `<head>`                           | Move it to `<head>`                    |
| `<input type="text"></input>`                | `input` is an empty tag                             | `<input type="text">`                  |
| `<textarea />`                               | textarea needs a closing tag                        | `<textarea></textarea>`                |
| `<label for="name">` + `<input id="nombre">` | `for` and `id` must be identical                    | Same word in both                      |
| Radios with `name="a"`, `name="b"`           | Different names → all can be selected at once       | Same `name` for the group              |
| `<input type="mail">`                        | Not a valid type                                    | `type="email"`                         |
| `<option>` without `<select>`                | option must be inside select                        | `<select><option>…</option></select>`  |
| `<form>` without closing / inputs outside it | Inputs outside the form are not sent                | Put all inputs inside `<form>…</form>` |

---

## PRACTICE 1 — find 8 errors

Cover the answers. Write your answers on paper first.

```html
1  <!DOCTYPE html>
2  <html>
3  <head>
4    <meta charset="UTF-8">
5  </head>
6  <body>
7    <title>My page</title>
8    <h1>Welcome</h2>
9    <p>This is <b><i>important</b></i>
10   <img scr="cat.jpg">
11   <ul>
12     <li>One</li>
13     Two
14   </ol>
15   <a href=index.html>Home</a>
16   <br></br>
17 </body>
18 </html>
```

<details>
<summary><b>Answers (click)</b></summary>

1. **Line 7:** `<title>` is inside `<body>` → it must be inside `<head>`.
2. **Line 8:** opens `<h1>` but closes `</h2>` → `<h1>Welcome</h1>`.
3. **Line 9:** bad nesting, `<i>` opened last so must close first → `<b><i>important</i></b>`.
4. **Line 9:** `<p>` never closed → add `</p>`.
5. **Line 10:** `scr` is misspelled → `src`; also missing `alt` → `<img src="cat.jpg" alt="A cat">`.
6. **Line 13:** "Two" is not inside `<li>` → `<li>Two</li>`.
7. **Line 14:** opens `<ul>` but closes `</ol>` → `</ul>`.
8. **Line 15:** attribute value without quotes → `href="index.html"`.
9. *(bonus)* **Line 16:** `<br>` is empty, no `</br>` → just `<br>`.

</details>

---

## PRACTICE 2 — table (find 3 errors)

```html
1  <table border="1">
2    <tr>
3      <th colspam="2">Schedule</th>
4    </tr>
5    <tr>
6      <td rowspan="2">Monday</td>
7      <td>Math</td>
8    </tr>
9    <tr>
10     <td>Monday</td>
11     <td>HTML</td>
12   </tr>
13   <td>Tuesday</td><td>CSS</td>
14 </table>
```

<details>
<summary><b>Answers (click)</b></summary>

1. **Line 3:** `colspam` misspelled → `colspan`.
2. **Line 10:** extra cell. "Monday" in line 6 has `rowspan="2"`, so it already fills this row's first column. This row has 3 columns instead of 2 → delete line 10.
3. **Line 13:** the cells are not inside a `<tr>` → `<tr><td>Tuesday</td><td>CSS</td></tr>`.

After fixing, count: every row = 2 columns ✔

</details>

---

## PRACTICE 3 — form (find 6 errors)

```html
1  <form action="send.php" method="post">
2    <label for="user">User:</label>
3    <input type="text" id="username" name="user">
4    <label for="mail">Email:</label>
5    <input type="mail" id="mail" name="mail"></input>
6    <p>Gender:</p>
7    <input type="radio" name="g1" value="m"> Male
8    <input type="radio" name="g2" value="f"> Female
9    <option value="es">Spain</option>
10   <textarea name="msg">
11   <input type="submit" value="Send">
12 </form>
```

<details>
<summary><b>Answers (click)</b></summary>

1. **Line 2–3:** `label for="user"` but `input id="username"` → they must be the same (`id="user"`).
2. **Line 5:** `type="mail"` doesn't exist → `type="email"`.
3. **Line 5:** `</input>` → input is an empty tag, remove `</input>`.
4. **Line 7–8:** radios have different `name` (`g1`, `g2`) → both must be `name="gender"` so only one can be chosen.
5. **Line 9:** `<option>` outside `<select>` → `<select name="country"><option value="es">Spain</option></select>`.
6. **Line 10:** `<textarea>` not closed → `<textarea name="msg"></textarea>`.

</details>