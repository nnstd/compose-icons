package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardF3: ImageVector
    get() {
        if (_KeyboardF3 != null) {
            return _KeyboardF3!!
        }
        _KeyboardF3 = ImageVector.Builder(
            name = "KeyboardF3",
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
                moveTo(19f, 15f)
                curveTo(19f, 16.11f, 18.11f, 17f, 17f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                curveTo(18.1f, 7f, 19f, 7.89f, 19f, 9f)
                verticalLineTo(10.5f)
                curveTo(19f, 11.33f, 18.33f, 12f, 17.5f, 12f)
                curveTo(18.33f, 12f, 19f, 12.67f, 19f, 13.5f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _KeyboardF3!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardF3: ImageVector? = null
