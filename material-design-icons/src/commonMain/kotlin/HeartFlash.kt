package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeartFlash: ImageVector
    get() {
        if (_HeartFlash != null) {
            return _HeartFlash!!
        }
        _HeartFlash = ImageVector.Builder(
            name = "HeartFlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 2.83f)
                curveTo(14.76f, 2.83f, 13.09f, 3.64f, 12f, 4.9f)
                curveTo(10.91f, 3.64f, 9.24f, 2.83f, 7.5f, 2.83f)
                curveTo(4.42f, 2.83f, 2f, 5.24f, 2f, 8.33f)
                curveTo(2f, 12.1f, 5.4f, 15.19f, 10.55f, 19.86f)
                lineTo(12f, 21.17f)
                lineTo(13.45f, 19.86f)
                curveTo(18.6f, 15.19f, 22f, 12.1f, 22f, 8.33f)
                curveTo(22f, 5.24f, 19.58f, 2.83f, 16.5f, 2.83f)
                moveTo(12f, 17.83f)
                verticalLineTo(13.83f)
                horizontalLineTo(9f)
                lineTo(12f, 6.83f)
                verticalLineTo(10.83f)
                horizontalLineTo(15f)
            }
        }.build()

        return _HeartFlash!!
    }

@Suppress("ObjectPropertyName")
private var _HeartFlash: ImageVector? = null
