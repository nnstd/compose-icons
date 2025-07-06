package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Seesaw: ImageVector
    get() {
        if (_Seesaw != null) {
            return _Seesaw!!
        }
        _Seesaw = ImageVector.Builder(
            name = "Seesaw",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.68f, 13.26f)
                lineTo(22.04f, 15.23f)
                lineTo(2.35f, 18.77f)
                lineTo(2f, 16.8f)
                lineTo(4.95f, 16.27f)
                lineTo(4.6f, 14.3f)
                curveTo(4.5f, 13.76f, 4.86f, 13.24f, 5.41f, 13.14f)
                curveTo(5.95f, 13.04f, 6.47f, 13.4f, 6.57f, 13.95f)
                lineTo(6.92f, 15.91f)
                lineTo(16.76f, 14.15f)
                lineTo(16.41f, 12.18f)
                curveTo(16.31f, 11.63f, 16.67f, 11.11f, 17.22f, 11f)
                curveTo(17.76f, 10.92f, 18.28f, 11.28f, 18.38f, 11.82f)
                lineTo(18.73f, 13.79f)
                lineTo(21.68f, 13.26f)
                moveTo(10.06f, 18.4f)
                lineTo(8f, 22f)
                horizontalLineTo(16f)
                lineTo(13.58f, 17.77f)
                lineTo(10.06f, 18.4f)
                close()
            }
        }.build()

        return _Seesaw!!
    }

@Suppress("ObjectPropertyName")
private var _Seesaw: ImageVector? = null
