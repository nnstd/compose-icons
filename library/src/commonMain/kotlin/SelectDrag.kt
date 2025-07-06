package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SelectDrag: ImageVector
    get() {
        if (_SelectDrag != null) {
            return _SelectDrag!!
        }
        _SelectDrag = ImageVector.Builder(
            name = "SelectDrag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(23f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(23f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                moveTo(11f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                moveTo(7f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                moveTo(19f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                moveTo(19f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(15f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                moveTo(11f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                moveTo(7f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                moveTo(7f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                moveTo(7f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _SelectDrag!!
    }

@Suppress("ObjectPropertyName")
private var _SelectDrag: ImageVector? = null
