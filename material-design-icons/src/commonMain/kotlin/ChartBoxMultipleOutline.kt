package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartBoxMultipleOutline: ImageVector
    get() {
        if (_ChartBoxMultipleOutline != null) {
            return _ChartBoxMultipleOutline!!
        }
        _ChartBoxMultipleOutline = ImageVector.Builder(
            name = "ChartBoxMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 16f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                moveTo(22f, 16f)
                curveTo(22f, 17.1f, 21.1f, 18f, 20f, 18f)
                horizontalLineTo(8f)
                curveTo(6.9f, 18f, 6f, 17.1f, 6f, 16f)
                verticalLineTo(4f)
                curveTo(6f, 2.9f, 6.9f, 2f, 8f, 2f)
                horizontalLineTo(20f)
                curveTo(21.1f, 2f, 22f, 2.9f, 22f, 4f)
                moveTo(16f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.1f, 2f, 20f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                moveTo(16f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                moveTo(13f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                moveTo(10f, 8f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _ChartBoxMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ChartBoxMultipleOutline: ImageVector? = null
