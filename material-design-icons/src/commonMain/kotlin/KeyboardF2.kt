package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardF2: ImageVector
    get() {
        if (_KeyboardF2 != null) {
            return _KeyboardF2!!
        }
        _KeyboardF2 = ImageVector.Builder(
            name = "KeyboardF2",
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
                moveTo(13f, 7f)
                horizontalLineTo(17f)
                curveTo(18.11f, 7f, 19f, 7.9f, 19f, 9f)
                verticalLineTo(11f)
                curveTo(19f, 12.11f, 18.11f, 13f, 17f, 13f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                curveTo(13f, 11.9f, 13.9f, 11f, 15f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _KeyboardF2!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardF2: ImageVector? = null
