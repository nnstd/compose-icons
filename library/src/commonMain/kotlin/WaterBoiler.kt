package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterBoiler: ImageVector
    get() {
        if (_WaterBoiler != null) {
            return _WaterBoiler!!
        }
        _WaterBoiler = ImageVector.Builder(
            name = "WaterBoiler",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 2f)
                curveTo(6.89f, 2f, 6f, 2.89f, 6f, 4f)
                verticalLineTo(16f)
                curveTo(6f, 17.11f, 6.89f, 18f, 8f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                curveTo(10.11f, 22f, 11f, 21.11f, 11f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                curveTo(13f, 21.11f, 13.89f, 22f, 15f, 22f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                curveTo(17.11f, 18f, 18f, 17.11f, 18f, 16f)
                verticalLineTo(4f)
                curveTo(18f, 2.89f, 17.11f, 2f, 16f, 2f)
                horizontalLineTo(8f)
                moveTo(12f, 4.97f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 6.97f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8.97f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 6.97f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4.97f)
                moveTo(10f, 14.5f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()

        return _WaterBoiler!!
    }

@Suppress("ObjectPropertyName")
private var _WaterBoiler: ImageVector? = null
