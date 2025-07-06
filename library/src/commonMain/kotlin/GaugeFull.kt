package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GaugeFull: ImageVector
    get() {
        if (_GaugeFull != null) {
            return _GaugeFull!!
        }
        _GaugeFull = ImageVector.Builder(
            name = "GaugeFull",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                curveTo(20f, 14.4f, 19f, 16.5f, 17.3f, 18f)
                curveTo(15.9f, 16.7f, 14f, 16f, 12f, 16f)
                curveTo(10f, 16f, 8.2f, 16.7f, 6.7f, 18f)
                curveTo(5f, 16.5f, 4f, 14.4f, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                moveTo(10f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 6f)
                moveTo(14f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 6f)
                moveTo(17.09f, 8.94f)
                curveTo(16.96f, 8.94f, 16.84f, 8.97f, 16.7f, 9f)
                lineTo(13.5f, 10.32f)
                lineTo(13.23f, 10.43f)
                curveTo(12.67f, 10f, 11.91f, 9.88f, 11.25f, 10.15f)
                curveTo(10.23f, 10.56f, 9.73f, 11.73f, 10.15f, 12.75f)
                curveTo(10.56f, 13.77f, 11.73f, 14.27f, 12.75f, 13.85f)
                curveTo(13.41f, 13.59f, 13.88f, 13f, 14f, 12.28f)
                lineTo(14.23f, 12.18f)
                lineTo(17.45f, 10.88f)
                lineTo(17.47f, 10.87f)
                curveTo(18f, 10.66f, 18.23f, 10.08f, 18.03f, 9.56f)
                curveTo(17.87f, 9.18f, 17.5f, 8.93f, 17.09f, 8.94f)
                moveTo(7f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 9f)
                close()
            }
        }.build()

        return _GaugeFull!!
    }

@Suppress("ObjectPropertyName")
private var _GaugeFull: ImageVector? = null
