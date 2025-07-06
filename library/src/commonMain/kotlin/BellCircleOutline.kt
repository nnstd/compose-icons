package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BellCircleOutline: ImageVector
    get() {
        if (_BellCircleOutline != null) {
            return _BellCircleOutline!!
        }
        _BellCircleOutline = ImageVector.Builder(
            name = "BellCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 16f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                lineTo(8f, 14f)
                verticalLineTo(11.39f)
                curveTo(8f, 10.3f, 8.27f, 9.34f, 8.79f, 8.53f)
                curveTo(9.3f, 7.72f, 10.04f, 7.21f, 11f, 7f)
                verticalLineTo(6.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 6.5f)
                verticalLineTo(7f)
                curveTo(13.96f, 7.21f, 14.7f, 7.72f, 15.21f, 8.53f)
                curveTo(15.73f, 9.34f, 16f, 10.3f, 16f, 11.39f)
                verticalLineTo(14f)
                lineTo(17f, 15f)
                verticalLineTo(16f)
                moveTo(13.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 17f)
                horizontalLineTo(13.5f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                close()
            }
        }.build()

        return _BellCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BellCircleOutline: ImageVector? = null
