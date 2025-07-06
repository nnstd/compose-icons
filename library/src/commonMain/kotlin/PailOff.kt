package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PailOff: ImageVector
    get() {
        if (_PailOff != null) {
            return _PailOff!!
        }
        _PailOff = ImageVector.Builder(
            name = "PailOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(17.35f, 19.24f)
                lineTo(17f, 21f)
                horizontalLineTo(7f)
                lineTo(5.79f, 14.97f)
                lineTo(10.41f, 12.3f)
                lineTo(9.31f, 11.2f)
                lineTo(4.27f, 14.11f)
                curveTo(3.79f, 14.39f, 3.18f, 14.23f, 2.9f, 13.75f)
                curveTo(2.62f, 13.27f, 2.79f, 12.66f, 3.27f, 12.38f)
                lineTo(7.85f, 9.74f)
                lineTo(6.75f, 8.64f)
                lineTo(4.76f, 9.79f)
                lineTo(4f, 6f)
                horizontalLineTo(3f)
                verticalLineTo(4.89f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(10.71f, 6.36f)
                curveTo(11.09f, 6.13f, 11.53f, 6f, 12f, 6f)
                curveTo(13.38f, 6f, 14.5f, 7.12f, 14.5f, 8.5f)
                curveTo(14.5f, 9.27f, 14.16f, 9.94f, 13.6f, 10.4f)
                lineTo(18.2f, 15f)
                lineTo(20f, 6f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                horizontalLineTo(7.2f)
                lineTo(10f, 6.78f)
                lineTo(10.71f, 6.36f)
                moveTo(11.5f, 7.63f)
                lineTo(11.08f, 7.88f)
                lineTo(12.53f, 9.33f)
                curveTo(12.97f, 9.05f, 13.13f, 8.46f, 12.86f, 8f)
                curveTo(12.58f, 7.5f, 11.97f, 7.35f, 11.5f, 7.63f)
                close()
            }
        }.build()

        return _PailOff!!
    }

@Suppress("ObjectPropertyName")
private var _PailOff: ImageVector? = null
