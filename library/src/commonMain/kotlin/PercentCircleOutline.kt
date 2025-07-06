package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PercentCircleOutline: ImageVector
    get() {
        if (_PercentCircleOutline != null) {
            return _PercentCircleOutline!!
        }
        _PercentCircleOutline = ImageVector.Builder(
            name = "PercentCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 15.22f)
                curveTo(17f, 16.2f, 16.2f, 17f, 15.22f, 17f)
                curveTo(14.24f, 17f, 13.45f, 16.2f, 13.45f, 15.22f)
                curveTo(13.45f, 14.24f, 14.24f, 13.45f, 15.22f, 13.45f)
                curveTo(16.2f, 13.45f, 17f, 14.24f, 17f, 15.22f)
                moveTo(8.83f, 10.6f)
                curveTo(9.81f, 10.6f, 10.6f, 9.81f, 10.6f, 8.83f)
                curveTo(10.6f, 7.84f, 9.81f, 7.05f, 8.83f, 7.05f)
                curveTo(7.84f, 7.05f, 7.05f, 7.84f, 7.05f, 8.83f)
                curveTo(7.05f, 9.81f, 7.84f, 10.6f, 8.83f, 10.6f)
                moveTo(7f, 15.53f)
                lineTo(8.5f, 17.03f)
                lineTo(17.03f, 8.5f)
                lineTo(15.53f, 7f)
                lineTo(7f, 15.53f)
                moveTo(22f, 12f)
                curveTo(22f, 17.5f, 17.5f, 22f, 12f, 22f)
                curveTo(6.5f, 22f, 2f, 17.5f, 2f, 12f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                moveTo(20f, 12f)
                curveTo(20f, 7.59f, 16.41f, 4f, 12f, 4f)
                curveTo(7.59f, 4f, 4f, 7.59f, 4f, 12f)
                curveTo(4f, 16.41f, 7.59f, 20f, 12f, 20f)
                curveTo(16.41f, 20f, 20f, 16.41f, 20f, 12f)
                close()
            }
        }.build()

        return _PercentCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PercentCircleOutline: ImageVector? = null
