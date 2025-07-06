package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Gamepad: ImageVector
    get() {
        if (_Gamepad != null) {
            return _Gamepad!!
        }
        _Gamepad = ImageVector.Builder(
            name = "Gamepad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 9f)
                lineTo(13.5f, 12f)
                lineTo(16.5f, 15f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                moveTo(9f, 16.5f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(16.5f)
                lineTo(12f, 13.5f)
                moveTo(7.5f, 9f)
                horizontalLineTo(2f)
                verticalLineTo(15f)
                horizontalLineTo(7.5f)
                lineTo(10.5f, 12f)
                moveTo(15f, 7.5f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineTo(7.5f)
                lineTo(12f, 10.5f)
                lineTo(15f, 7.5f)
                close()
            }
        }.build()

        return _Gamepad!!
    }

@Suppress("ObjectPropertyName")
private var _Gamepad: ImageVector? = null
