# CHEATSHEET — read this right before the exam

## Page skeleton
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
  <header><h1>Site</h1></header>
  <nav><ul><li><a href="#x">Link</a></li></ul></nav>
  <main> ... </main>
  <footer><p>&copy; 2026</p></footer>
</body>
</html>
```

## Lists
```html
<ul> <li>bullet</li> </ul>        ul = Unordered = • bullets
<ol> <li>number</li> </ol>        ol = Ordered   = 1. 2. 3.
<ol type="A">  <ol start="5">     letters / start number
```
Nested list → goes **inside** the `<li>`, before `</li>`.

## Table
```html
<table border="1">
  <tr> <th>Header</th> <th>Header</th> </tr>
  <tr> <td>Data</td>   <td>Data</td>   </tr>
</table>
```
- `tr` = row, `th` = header cell, `td` = data cell
- `colspan="2"` → wider ←→ (delete 1 cell in **that** row)
- `rowspan="2"` → taller ↓ (delete 1 cell in the **next** row)
- **Every row must count the same number of columns.** Draw it first!

## Form
```html
<form action="send.php" method="post">
  <label for="n">Name:</label>
  <input type="text" id="n" name="n" required>

  <input type="radio" name="g" value="a"> <input type="radio" name="g" value="b">  ← same name
  <input type="checkbox" name="c" value="x">

  <select name="s"> <option value="1">One</option> </select>
  <textarea name="t"></textarea>                                                  ← has closing tag

  <input type="submit" value="Send">  <input type="reset" value="Clear">
</form>
```
Types: `text email password number date radio checkbox submit reset`

## Error hunting — the big 6
1. Tag not closed
2. Bad nesting `<b><i></b></i>`
3. Opening ≠ closing `<h1></h2>`, `<ul></ol>`
4. Empty tags closed `</br> </img> </input>`
5. Misspelled `scr herf colspam lable tabel`
6. Wrong parent: `li` outside list, `td` outside `tr`, `option` outside `select`, `title` in body

Answer format: **Line X → what's wrong → why → fix.**