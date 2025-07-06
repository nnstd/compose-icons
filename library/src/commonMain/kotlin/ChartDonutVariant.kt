package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartDonutVariant: ImageVector
    get() {
        if (_ChartDonutVariant != null) {
            return _ChartDonutVariant!!
        }
        _ChartDonutVariant = ImageVector.Builder(
            name = "ChartDonutVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2.05f)
                curveTo(18.05f, 2.55f, 22f, 6.82f, 22f, 12f)
                curveTo(22f, 13.45f, 21.68f, 14.83f, 21.12f, 16.07f)
                lineTo(18.5f, 14.54f)
                curveTo(18.82f, 13.75f, 19f, 12.9f, 19f, 12f)
                curveTo(19f, 8.47f, 16.39f, 5.57f, 13f, 5.08f)
                verticalLineTo(2.05f)
                moveTo(12f, 19f)
                curveTo(14.21f, 19f, 16.17f, 18f, 17.45f, 16.38f)
                lineTo(20.05f, 17.91f)
                curveTo(18.23f, 20.39f, 15.3f, 22f, 12f, 22f)
                curveTo(6.47f, 22f, 2f, 17.5f, 2f, 12f)
                curveTo(2f, 6.81f, 5.94f, 2.55f, 11f, 2.05f)
                verticalLineTo(5.08f)
                curveTo(7.61f, 5.57f, 5f, 8.47f, 5f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
                moveTo(12f, 6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                curveTo(18f, 14.97f, 15.84f, 17.44f, 13f, 17.92f)
                verticalLineTo(14.83f)
                curveTo(14.17f, 14.42f, 15f, 13.31f, 15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                lineTo(11.45f, 9.05f)
                lineTo(9.91f, 6.38f)
                curveTo(10.56f, 6.13f, 11.26f, 6f, 12f, 6f)
                moveTo(6f, 12f)
                curveTo(6f, 10.14f, 6.85f, 8.5f, 8.18f, 7.38f)
                lineTo(9.72f, 10.05f)
                curveTo(9.27f, 10.57f, 9f, 11.26f, 9f, 12f)
                curveTo(9f, 13.31f, 9.83f, 14.42f, 11f, 14.83f)
                verticalLineTo(17.92f)
                curveTo(8.16f, 17.44f, 6f, 14.97f, 6f, 12f)
                close()
            }
        }.build()

        return _ChartDonutVariant!!
    }

@Suppress("ObjectPropertyName")
private var _ChartDonutVariant: ImageVector? = null
