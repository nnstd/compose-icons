package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeartHalfFull: ImageVector
    get() {
        if (_HeartHalfFull != null) {
            return _HeartHalfFull!!
        }
        _HeartHalfFull = ImageVector.Builder(
            name = "HeartHalfFull",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 5f)
                curveTo(15f, 5f, 13.58f, 5.91f, 13f, 7.2f)
                verticalLineTo(17.74f)
                curveTo(17.25f, 13.87f, 20f, 11.2f, 20f, 8.5f)
                curveTo(20f, 6.5f, 18.5f, 5f, 16.5f, 5f)
                moveTo(16.5f, 3f)
                curveTo(19.58f, 3f, 22f, 5.41f, 22f, 8.5f)
                curveTo(22f, 12.27f, 18.6f, 15.36f, 13.45f, 20.03f)
                lineTo(12f, 21.35f)
                lineTo(10.55f, 20.03f)
                curveTo(5.4f, 15.36f, 2f, 12.27f, 2f, 8.5f)
                curveTo(2f, 5.41f, 4.42f, 3f, 7.5f, 3f)
                curveTo(9.24f, 3f, 10.91f, 3.81f, 12f, 5.08f)
                curveTo(13.09f, 3.81f, 14.76f, 3f, 16.5f, 3f)
                close()
            }
        }.build()

        return _HeartHalfFull!!
    }

@Suppress("ObjectPropertyName")
private var _HeartHalfFull: ImageVector? = null
