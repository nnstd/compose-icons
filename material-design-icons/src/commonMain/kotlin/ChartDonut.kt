package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartDonut: ImageVector
    get() {
        if (_ChartDonut != null) {
            return _ChartDonut!!
        }
        _ChartDonut = ImageVector.Builder(
            name = "ChartDonut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2.05f)
                verticalLineTo(5.08f)
                curveTo(16.39f, 5.57f, 19f, 8.47f, 19f, 12f)
                curveTo(19f, 12.9f, 18.82f, 13.75f, 18.5f, 14.54f)
                lineTo(21.12f, 16.07f)
                curveTo(21.68f, 14.83f, 22f, 13.45f, 22f, 12f)
                curveTo(22f, 6.82f, 18.05f, 2.55f, 13f, 2.05f)
                moveTo(12f, 19f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 12f)
                curveTo(5f, 8.47f, 7.61f, 5.57f, 11f, 5.08f)
                verticalLineTo(2.05f)
                curveTo(5.94f, 2.55f, 2f, 6.81f, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                curveTo(15.3f, 22f, 18.23f, 20.39f, 20.05f, 17.91f)
                lineTo(17.45f, 16.38f)
                curveTo(16.17f, 18f, 14.21f, 19f, 12f, 19f)
                close()
            }
        }.build()

        return _ChartDonut!!
    }

@Suppress("ObjectPropertyName")
private var _ChartDonut: ImageVector? = null
