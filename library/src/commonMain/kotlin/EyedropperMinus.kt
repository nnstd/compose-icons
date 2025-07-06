package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyedropperMinus: ImageVector
    get() {
        if (_EyedropperMinus != null) {
            return _EyedropperMinus!!
        }
        _EyedropperMinus = ImageVector.Builder(
            name = "EyedropperMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.35f, 11.72f)
                lineTo(17.22f, 13.85f)
                lineTo(15.81f, 12.43f)
                lineTo(8.1f, 20.14f)
                lineTo(3.5f, 22f)
                lineTo(2f, 20.5f)
                lineTo(3.86f, 15.9f)
                lineTo(11.57f, 8.19f)
                lineTo(10.15f, 6.78f)
                lineTo(12.28f, 4.65f)
                lineTo(19.35f, 11.72f)
                moveTo(16.76f, 3f)
                curveTo(17.93f, 1.83f, 19.83f, 1.83f, 21f, 3f)
                reflectiveCurveTo(22.17f, 6.07f, 21f, 7.24f)
                lineTo(19.08f, 9.16f)
                lineTo(14.84f, 4.92f)
                lineTo(16.76f, 3f)
                moveTo(5.56f, 17.03f)
                lineTo(4.5f, 19.5f)
                lineTo(6.97f, 18.44f)
                lineTo(14.4f, 11f)
                lineTo(13f, 9.6f)
                lineTo(5.56f, 17.03f)
                moveTo(9f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(1f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _EyedropperMinus!!
    }

@Suppress("ObjectPropertyName")
private var _EyedropperMinus: ImageVector? = null
