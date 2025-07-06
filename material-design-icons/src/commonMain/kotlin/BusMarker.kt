package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BusMarker: ImageVector
    get() {
        if (_BusMarker != null) {
            return _BusMarker!!
        }
        _BusMarker = ImageVector.Builder(
            name = "BusMarker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(7.58f, 2f, 4f, 2.5f, 4f, 6f)
                verticalLineTo(16f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 18.22f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 21f)
                horizontalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 15.5f)
                arcTo(5.55f, 5.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.38f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                arcTo(4.07f, 4.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 10f)
                arcTo(5.34f, 5.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 10.22f)
                verticalLineTo(6f)
                curveTo(20f, 2.5f, 16.42f, 2f, 12f, 2f)
                moveTo(7.5f, 14f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 14f)
                moveTo(18.5f, 12f)
                arcTo(3.54f, 3.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 15.5f)
                curveTo(15f, 18.1f, 18.5f, 22f, 18.5f, 22f)
                reflectiveCurveTo(22f, 18.1f, 22f, 15.5f)
                arcTo(3.54f, 3.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 12f)
                moveTo(18.5f, 16.8f)
                arcTo(1.2f, 1.2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18.5f, 14.4f)
                arcTo(1.29f, 1.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.7f, 15.6f)
                arcTo(1.15f, 1.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 16.8f)
                close()
            }
        }.build()

        return _BusMarker!!
    }

@Suppress("ObjectPropertyName")
private var _BusMarker: ImageVector? = null
