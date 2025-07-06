package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EscalatorUp: ImageVector
    get() {
        if (_EscalatorUp != null) {
            return _EscalatorUp!!
        }
        _EscalatorUp = ImageVector.Builder(
            name = "EscalatorUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                horizontalLineTo(18.95f)
                lineTo(6.95f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                curveTo(2f, 16.9f, 2.9f, 16f, 4f, 16f)
                horizontalLineTo(5.29f)
                lineTo(7f, 14.29f)
                verticalLineTo(10f)
                curveTo(7f, 9.45f, 7.45f, 9f, 8f, 9f)
                horizontalLineTo(9f)
                curveTo(9.55f, 9f, 10f, 9.45f, 10f, 10f)
                verticalLineTo(11.29f)
                lineTo(17.29f, 4f)
                horizontalLineTo(20f)
                curveTo(21.11f, 4f, 22f, 4.89f, 22f, 6f)
                curveTo(22f, 7.11f, 21.11f, 8f, 20f, 8f)
                moveTo(8.5f, 5f)
                curveTo(9.33f, 5f, 10f, 5.67f, 10f, 6.5f)
                curveTo(10f, 7.33f, 9.33f, 8f, 8.5f, 8f)
                curveTo(7.67f, 8f, 7f, 7.33f, 7f, 6.5f)
                curveTo(7f, 5.67f, 7.67f, 5f, 8.5f, 5f)
                moveTo(20.17f, 15.66f)
                lineTo(14.66f, 21.17f)
                lineTo(12.83f, 19.34f)
                lineTo(18.34f, 13.83f)
                lineTo(16.5f, 12f)
                horizontalLineTo(22f)
                verticalLineTo(17.5f)
                lineTo(20.17f, 15.66f)
                close()
            }
        }.build()

        return _EscalatorUp!!
    }

@Suppress("ObjectPropertyName")
private var _EscalatorUp: ImageVector? = null
