package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GamepadOutline: ImageVector
    get() {
        if (_GamepadOutline != null) {
            return _GamepadOutline!!
        }
        _GamepadOutline = ImageVector.Builder(
            name = "GamepadOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 9f)
                horizontalLineTo(2f)
                verticalLineTo(15f)
                horizontalLineTo(7.5f)
                lineTo(10.5f, 12f)
                lineTo(7.5f, 9f)
                moveTo(6f, 13f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                moveTo(15f, 7.5f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineTo(7.5f)
                lineTo(12f, 10.5f)
                lineTo(15f, 7.5f)
                moveTo(11f, 4f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                moveTo(9f, 16.5f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(16.5f)
                lineTo(12f, 13.5f)
                lineTo(9f, 16.5f)
                moveTo(13f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                moveTo(16.5f, 9f)
                lineTo(13.5f, 12f)
                lineTo(16.5f, 15f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(16.5f)
                moveTo(20f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _GamepadOutline!!
    }

@Suppress("ObjectPropertyName")
private var _GamepadOutline: ImageVector? = null
