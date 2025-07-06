package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeMapMarker: ImageVector
    get() {
        if (_HomeMapMarker != null) {
            return _HomeMapMarker!!
        }
        _HomeMapMarker = ImageVector.Builder(
            name = "HomeMapMarker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                lineTo(2f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                lineTo(12f, 3f)
                moveTo(12f, 7.7f)
                curveTo(14.1f, 7.7f, 15.8f, 9.4f, 15.8f, 11.5f)
                curveTo(15.8f, 14.5f, 12f, 18f, 12f, 18f)
                curveTo(12f, 18f, 8.2f, 14.5f, 8.2f, 11.5f)
                curveTo(8.2f, 9.4f, 9.9f, 7.7f, 12f, 7.7f)
                moveTo(12f, 10f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                close()
            }
        }.build()

        return _HomeMapMarker!!
    }

@Suppress("ObjectPropertyName")
private var _HomeMapMarker: ImageVector? = null
