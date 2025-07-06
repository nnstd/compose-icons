package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Hammer: ImageVector
    get() {
        if (_Hammer != null) {
            return _Hammer!!
        }
        _Hammer = ImageVector.Builder(
            name = "Hammer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 19.63f)
                lineTo(13.43f, 8.2f)
                lineTo(12.72f, 7.5f)
                lineTo(14.14f, 6.07f)
                lineTo(12f, 3.89f)
                curveTo(13.2f, 2.7f, 15.09f, 2.7f, 16.27f, 3.89f)
                lineTo(19.87f, 7.5f)
                lineTo(18.45f, 8.91f)
                horizontalLineTo(21.29f)
                lineTo(22f, 9.62f)
                lineTo(18.45f, 13.21f)
                lineTo(17.74f, 12.5f)
                verticalLineTo(9.62f)
                lineTo(16.27f, 11.04f)
                lineTo(15.56f, 10.33f)
                lineTo(4.13f, 21.76f)
                lineTo(2f, 19.63f)
                close()
            }
        }.build()

        return _Hammer!!
    }

@Suppress("ObjectPropertyName")
private var _Hammer: ImageVector? = null
