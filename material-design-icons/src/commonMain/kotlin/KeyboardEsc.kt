package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardEsc: ImageVector
    get() {
        if (_KeyboardEsc != null) {
            return _KeyboardEsc!!
        }
        _KeyboardEsc = ImageVector.Builder(
            name = "KeyboardEsc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(1f)
                verticalLineTo(7f)
                moveTo(11f, 7f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                curveTo(14.11f, 11f, 15f, 11.9f, 15f, 13f)
                verticalLineTo(15f)
                curveTo(15f, 16.11f, 14.11f, 17f, 13f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                curveTo(9.9f, 13f, 9f, 12.11f, 9f, 11f)
                verticalLineTo(9f)
                curveTo(9f, 7.9f, 9.9f, 7f, 11f, 7f)
                moveTo(19f, 7f)
                horizontalLineTo(21f)
                curveTo(22.11f, 7f, 23f, 7.9f, 23f, 9f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                curveTo(23f, 16.11f, 22.11f, 17f, 21f, 17f)
                horizontalLineTo(19f)
                curveTo(17.9f, 17f, 17f, 16.11f, 17f, 15f)
                verticalLineTo(9f)
                curveTo(17f, 7.9f, 17.9f, 7f, 19f, 7f)
                close()
            }
        }.build()

        return _KeyboardEsc!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardEsc: ImageVector? = null
