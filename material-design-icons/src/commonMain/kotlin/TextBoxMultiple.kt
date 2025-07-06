package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TextBoxMultiple: ImageVector
    get() {
        if (_TextBoxMultiple != null) {
            return _TextBoxMultiple!!
        }
        _TextBoxMultiple = ImageVector.Builder(
            name = "TextBoxMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                moveTo(19f, 11f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                moveTo(19f, 7f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(21f, 1f)
                horizontalLineTo(7f)
                curveTo(5.89f, 1f, 5f, 1.89f, 5f, 3f)
                verticalLineTo(17f)
                curveTo(5f, 18.11f, 5.9f, 19f, 7f, 19f)
                horizontalLineTo(21f)
                curveTo(22.11f, 19f, 23f, 18.11f, 23f, 17f)
                verticalLineTo(3f)
                curveTo(23f, 1.89f, 22.1f, 1f, 21f, 1f)
                moveTo(3f, 5f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(23f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 21f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _TextBoxMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _TextBoxMultiple: ImageVector? = null
