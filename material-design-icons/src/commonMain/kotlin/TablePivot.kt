package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TablePivot: ImageVector
    get() {
        if (_TablePivot != null) {
            return _TablePivot!!
        }
        _TablePivot = ImageVector.Builder(
            name = "TablePivot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                curveTo(20f, 19.11f, 19.11f, 20f, 18f, 20f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                lineTo(12f, 19f)
                lineTo(15f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                lineTo(19f, 12f)
                lineTo(22f, 15f)
                moveTo(22f, 4f)
                verticalLineTo(8f)
                curveTo(22f, 9.1f, 21.1f, 10f, 20f, 10f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                curveTo(10f, 21.1f, 9.1f, 22f, 8f, 22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.1f, 2f, 20f)
                verticalLineTo(4f)
                curveTo(2f, 2.9f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(20f)
                curveTo(21.1f, 2f, 22f, 2.9f, 22f, 4f)
                moveTo(4f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                moveTo(4f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                moveTo(8f, 20f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                lineTo(8f, 20f)
                moveTo(14f, 8f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                moveTo(20f, 4f)
                lineTo(20f, 4f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                lineTo(20f, 4f)
                close()
            }
        }.build()

        return _TablePivot!!
    }

@Suppress("ObjectPropertyName")
private var _TablePivot: ImageVector? = null
