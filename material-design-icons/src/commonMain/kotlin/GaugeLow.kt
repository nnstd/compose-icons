package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GaugeLow: ImageVector
    get() {
        if (_GaugeLow != null) {
            return _GaugeLow!!
        }
        _GaugeLow = ImageVector.Builder(
            name = "GaugeLow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                curveTo(4f, 14.4f, 5f, 16.5f, 6.7f, 18f)
                curveTo(8.1f, 16.7f, 10f, 16f, 12f, 16f)
                curveTo(14f, 16f, 15.8f, 16.7f, 17.3f, 18f)
                curveTo(19f, 16.5f, 20f, 14.4f, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                moveTo(10f, 5.89f)
                curveTo(10.38f, 5.9f, 10.74f, 6.15f, 10.9f, 6.54f)
                lineTo(12.19f, 9.77f)
                lineTo(12.29f, 10f)
                curveTo(13f, 10.13f, 13.59f, 10.6f, 13.86f, 11.26f)
                curveTo(14.27f, 12.29f, 13.77f, 13.45f, 12.74f, 13.86f)
                curveTo(11.71f, 14.27f, 10.55f, 13.77f, 10.14f, 12.74f)
                curveTo(9.88f, 12.08f, 10f, 11.32f, 10.43f, 10.76f)
                lineTo(10.33f, 10.5f)
                lineTo(9.04f, 7.29f)
                lineTo(9.03f, 7.26f)
                curveTo(8.83f, 6.75f, 9.08f, 6.17f, 9.59f, 5.96f)
                curveTo(9.72f, 5.91f, 9.85f, 5.89f, 10f, 5.89f)
                verticalLineTo(5.89f)
                moveTo(14f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 6f)
                moveTo(17f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 9f)
                moveTo(7f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 9f)
                close()
            }
        }.build()

        return _GaugeLow!!
    }

@Suppress("ObjectPropertyName")
private var _GaugeLow: ImageVector? = null
