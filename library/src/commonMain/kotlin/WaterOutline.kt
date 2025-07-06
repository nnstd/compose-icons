package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterOutline: ImageVector
    get() {
        if (_WaterOutline != null) {
            return _WaterOutline!!
        }
        _WaterOutline = ImageVector.Builder(
            name = "WaterOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3.77f)
                lineTo(11.25f, 4.61f)
                curveTo(11.25f, 4.61f, 9.97f, 6.06f, 8.68f, 7.94f)
                curveTo(7.39f, 9.82f, 6f, 12.07f, 6f, 14.23f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20.23f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 14.23f)
                curveTo(18f, 12.07f, 16.61f, 9.82f, 15.32f, 7.94f)
                curveTo(14.03f, 6.06f, 12.75f, 4.61f, 12.75f, 4.61f)
                lineTo(12f, 3.77f)
                moveTo(12f, 6.9f)
                curveTo(12.44f, 7.42f, 12.84f, 7.85f, 13.68f, 9.07f)
                curveTo(14.89f, 10.83f, 16f, 13.07f, 16f, 14.23f)
                curveTo(16f, 16.45f, 14.22f, 18.23f, 12f, 18.23f)
                curveTo(9.78f, 18.23f, 8f, 16.45f, 8f, 14.23f)
                curveTo(8f, 13.07f, 9.11f, 10.83f, 10.32f, 9.07f)
                curveTo(11.16f, 7.85f, 11.56f, 7.42f, 12f, 6.9f)
                close()
            }
        }.build()

        return _WaterOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WaterOutline: ImageVector? = null
