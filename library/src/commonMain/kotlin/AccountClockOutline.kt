package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountClockOutline: ImageVector
    get() {
        if (_AccountClockOutline != null) {
            return _AccountClockOutline!!
        }
        _AccountClockOutline = ImageVector.Builder(
            name = "AccountClockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 14f)
                horizontalLineTo(17.5f)
                verticalLineTo(16.82f)
                lineTo(19.94f, 18.23f)
                lineTo(19.19f, 19.53f)
                lineTo(16f, 17.69f)
                verticalLineTo(14f)
                moveTo(17f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 22f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 12f)
                moveTo(17f, 10f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 17f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 24f)
                curveTo(14.21f, 24f, 11.8f, 22.36f, 10.67f, 20f)
                horizontalLineTo(1f)
                verticalLineTo(17f)
                curveTo(1f, 14.34f, 6.33f, 13f, 9f, 13f)
                curveTo(9.6f, 13f, 10.34f, 13.07f, 11.12f, 13.2f)
                curveTo(12.36f, 11.28f, 14.53f, 10f, 17f, 10f)
                moveTo(10f, 17f)
                curveTo(10f, 16.3f, 10.1f, 15.62f, 10.29f, 15f)
                curveTo(9.87f, 14.93f, 9.43f, 14.9f, 9f, 14.9f)
                curveTo(6.03f, 14.9f, 2.9f, 16.36f, 2.9f, 17f)
                verticalLineTo(18.1f)
                horizontalLineTo(10.09f)
                curveTo(10.03f, 17.74f, 10f, 17.37f, 10f, 17f)
                moveTo(9f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 4f)
                moveTo(9f, 5.9f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.9f, 8f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 10.1f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.1f, 8f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 5.9f)
                close()
            }
        }.build()

        return _AccountClockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountClockOutline: ImageVector? = null
