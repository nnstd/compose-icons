package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Git: ImageVector
    get() {
        if (_Git != null) {
            return _Git!!
        }
        _Git = ImageVector.Builder(
            name = "Git",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.6f, 10.59f)
                lineTo(8.38f, 4.8f)
                lineTo(10.07f, 6.5f)
                curveTo(9.83f, 7.35f, 10.22f, 8.28f, 11f, 8.73f)
                verticalLineTo(14.27f)
                curveTo(10.4f, 14.61f, 10f, 15.26f, 10f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 16f)
                curveTo(14f, 15.26f, 13.6f, 14.61f, 13f, 14.27f)
                verticalLineTo(9.41f)
                lineTo(15.07f, 11.5f)
                curveTo(15f, 11.65f, 15f, 11.82f, 15f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 10f)
                curveTo(16.82f, 10f, 16.65f, 10f, 16.5f, 10.07f)
                lineTo(13.93f, 7.5f)
                curveTo(14.19f, 6.57f, 13.71f, 5.55f, 12.78f, 5.16f)
                curveTo(12.35f, 5f, 11.9f, 4.96f, 11.5f, 5.07f)
                lineTo(9.8f, 3.38f)
                lineTo(10.59f, 2.6f)
                curveTo(11.37f, 1.81f, 12.63f, 1.81f, 13.41f, 2.6f)
                lineTo(21.4f, 10.59f)
                curveTo(22.19f, 11.37f, 22.19f, 12.63f, 21.4f, 13.41f)
                lineTo(13.41f, 21.4f)
                curveTo(12.63f, 22.19f, 11.37f, 22.19f, 10.59f, 21.4f)
                lineTo(2.6f, 13.41f)
                curveTo(1.81f, 12.63f, 1.81f, 11.37f, 2.6f, 10.59f)
                close()
            }
        }.build()

        return _Git!!
    }

@Suppress("ObjectPropertyName")
private var _Git: ImageVector? = null
