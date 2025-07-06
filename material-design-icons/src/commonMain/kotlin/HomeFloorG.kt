package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeFloorG: ImageVector
    get() {
        if (_HomeFloorG != null) {
            return _HomeFloorG!!
        }
        _HomeFloorG = ImageVector.Builder(
            name = "HomeFloorG",
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
                moveTo(11f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                curveTo(15f, 17.11f, 14.1f, 18f, 13f, 18f)
                horizontalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 16f)
                verticalLineTo(10f)
                curveTo(9f, 8.89f, 9.9f, 8f, 11f, 8f)
                close()
            }
        }.build()

        return _HomeFloorG!!
    }

@Suppress("ObjectPropertyName")
private var _HomeFloorG: ImageVector? = null
