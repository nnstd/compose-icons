package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GamepadDown: ImageVector
    get() {
        if (_GamepadDown != null) {
            return _GamepadDown!!
        }
        _GamepadDown = ImageVector.Builder(
            name = "GamepadDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 2f)
                verticalLineTo(7.5f)
                lineTo(12f, 10.5f)
                lineTo(15f, 7.5f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                moveTo(2f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(7.5f)
                lineTo(10.5f, 12f)
                lineTo(7.5f, 9f)
                horizontalLineTo(2f)
                moveTo(16.5f, 9f)
                lineTo(13.5f, 12f)
                lineTo(16.5f, 15f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(16.5f)
                moveTo(12f, 13.5f)
                lineTo(9f, 16.5f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(16.5f)
                lineTo(12f, 13.5f)
                moveTo(11f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _GamepadDown!!
    }

@Suppress("ObjectPropertyName")
private var _GamepadDown: ImageVector? = null
