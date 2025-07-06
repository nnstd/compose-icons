package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Yoga: ImageVector
    get() {
        if (_Yoga != null) {
            return _Yoga!!
        }
        _Yoga = ImageVector.Builder(
            name = "Yoga",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2f)
                curveTo(11.9f, 2f, 11f, 2.9f, 11f, 4f)
                curveTo(11f, 5.11f, 11.9f, 6f, 13f, 6f)
                curveTo(14.11f, 6f, 15f, 5.11f, 15f, 4f)
                curveTo(15f, 2.9f, 14.11f, 2f, 13f, 2f)
                moveTo(4f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                lineTo(4.93f, 20.07f)
                lineTo(6.34f, 21.5f)
                lineTo(13.06f, 14.77f)
                lineTo(17f, 17.13f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(16.57f)
                curveTo(19f, 16.21f, 18.82f, 15.89f, 18.5f, 15.71f)
                lineTo(15f, 13.6f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _Yoga!!
    }

@Suppress("ObjectPropertyName")
private var _Yoga: ImageVector? = null
