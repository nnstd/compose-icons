package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartBoxMultiple: ImageVector
    get() {
        if (_ChartBoxMultiple != null) {
            return _ChartBoxMultiple!!
        }
        _ChartBoxMultiple = ImageVector.Builder(
            name = "ChartBoxMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 20f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.1f, 2f, 20f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                moveTo(22f, 4f)
                verticalLineTo(16f)
                curveTo(22f, 17.1f, 21.1f, 18f, 20f, 18f)
                horizontalLineTo(8f)
                curveTo(6.9f, 18f, 6f, 17.1f, 6f, 16f)
                verticalLineTo(4f)
                curveTo(6f, 2.9f, 6.9f, 2f, 8f, 2f)
                horizontalLineTo(20f)
                curveTo(21.1f, 2f, 22f, 2.9f, 22f, 4f)
                moveTo(12f, 8f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                moveTo(15f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                moveTo(18f, 11f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _ChartBoxMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _ChartBoxMultiple: ImageVector? = null
