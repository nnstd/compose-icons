package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BellCircle: ImageVector
    get() {
        if (_BellCircle != null) {
            return _BellCircle!!
        }
        _BellCircle = ImageVector.Builder(
            name = "BellCircle",
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
                moveTo(17f, 16f)
                verticalLineTo(15f)
                lineTo(16f, 14f)
                verticalLineTo(11.39f)
                curveTo(16f, 10.3f, 15.73f, 9.34f, 15.21f, 8.53f)
                curveTo(14.7f, 7.72f, 13.96f, 7.21f, 13f, 7f)
                verticalLineTo(6.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 6.5f)
                verticalLineTo(7f)
                curveTo(10.04f, 7.21f, 9.3f, 7.72f, 8.79f, 8.53f)
                curveTo(8.27f, 9.34f, 8f, 10.3f, 8f, 11.39f)
                verticalLineTo(14f)
                lineTo(7f, 15f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                moveTo(13.5f, 17f)
                horizontalLineTo(10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 17f)
                close()
            }
        }.build()

        return _BellCircle!!
    }

@Suppress("ObjectPropertyName")
private var _BellCircle: ImageVector? = null
