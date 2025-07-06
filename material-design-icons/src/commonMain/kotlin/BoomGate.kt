package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BoomGate: ImageVector
    get() {
        if (_BoomGate != null) {
            return _BoomGate!!
        }
        _BoomGate = ImageVector.Builder(
            name = "BoomGate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 9f)
                horizontalLineTo(8.22f)
                curveTo(7.11f, 7.77f, 5.21f, 7.68f, 4f, 8.8f)
                curveTo(3.36f, 9.36f, 3f, 10.16f, 3f, 11f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 9f)
                moveTo(6f, 12.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 12.5f)
                moveTo(10.5f, 12f)
                lineTo(9f, 10f)
                horizontalLineTo(10.5f)
                lineTo(12f, 12f)
                horizontalLineTo(10.5f)
                moveTo(14.5f, 12f)
                lineTo(13f, 10f)
                horizontalLineTo(14.5f)
                lineTo(16f, 12f)
                horizontalLineTo(14.5f)
                moveTo(18.5f, 12f)
                lineTo(17f, 10f)
                horizontalLineTo(18.5f)
                lineTo(20f, 12f)
                horizontalLineTo(18.5f)
                close()
            }
        }.build()

        return _BoomGate!!
    }

@Suppress("ObjectPropertyName")
private var _BoomGate: ImageVector? = null
