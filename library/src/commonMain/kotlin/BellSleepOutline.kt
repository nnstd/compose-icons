package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BellSleepOutline: ImageVector
    get() {
        if (_BellSleepOutline != null) {
            return _BellSleepOutline!!
        }
        _BellSleepOutline = ImageVector.Builder(
            name = "BellSleepOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 21f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 23f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 21f)
                moveTo(21f, 19f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                lineTo(5f, 17f)
                verticalLineTo(11f)
                curveTo(5f, 7.9f, 7.03f, 5.17f, 10f, 4.29f)
                curveTo(10f, 4.19f, 10f, 4.1f, 10f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 4f)
                curveTo(14f, 4.1f, 14f, 4.19f, 14f, 4.29f)
                curveTo(16.97f, 5.17f, 19f, 7.9f, 19f, 11f)
                verticalLineTo(17f)
                lineTo(21f, 19f)
                moveTo(17f, 11f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 11f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                moveTo(9f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(12.24f)
                lineTo(9f, 13.7f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(11.76f)
                lineTo(15f, 11.3f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _BellSleepOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BellSleepOutline: ImageVector? = null
