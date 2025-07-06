package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardF6: ImageVector
    get() {
        if (_KeyboardF6 != null) {
            return _KeyboardF6!!
        }
        _KeyboardF6 = ImageVector.Builder(
            name = "KeyboardF6",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                moveTo(15f, 7f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                curveTo(18.11f, 11f, 19f, 11.9f, 19f, 13f)
                verticalLineTo(15f)
                curveTo(19f, 16.11f, 18.11f, 17f, 17f, 17f)
                horizontalLineTo(15f)
                curveTo(13.9f, 17f, 13f, 16.11f, 13f, 15f)
                verticalLineTo(9f)
                curveTo(13f, 7.9f, 13.9f, 7f, 15f, 7f)
                moveTo(15f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _KeyboardF6!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardF6: ImageVector? = null
