package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CompareRemove: ImageVector
    get() {
        if (_CompareRemove != null) {
            return _CompareRemove!!
        }
        _CompareRemove = ImageVector.Builder(
            name = "CompareRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 5f)
                horizontalLineTo(14f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(13.4f)
                curveTo(20.4f, 13.2f, 19.7f, 13f, 19f, 13f)
                verticalLineTo(5f)
                moveTo(10f, 1f)
                horizontalLineTo(12f)
                verticalLineTo(23f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(10f)
                verticalLineTo(1f)
                moveTo(10f, 12f)
                lineTo(5f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                moveTo(15.7f, 14f)
                lineTo(14f, 12f)
                verticalLineTo(15.7f)
                curveTo(14.4f, 15f, 15f, 14.5f, 15.7f, 14f)
                moveTo(21.1f, 15.5f)
                lineTo(19f, 17.6f)
                lineTo(16.9f, 15.5f)
                lineTo(15.5f, 16.9f)
                lineTo(17.6f, 19f)
                lineTo(15.5f, 21.1f)
                lineTo(16.9f, 22.5f)
                lineTo(19f, 20.4f)
                lineTo(21.1f, 22.5f)
                lineTo(22.5f, 21.1f)
                lineTo(20.4f, 19f)
                lineTo(22.5f, 16.9f)
                lineTo(21.1f, 15.5f)
                close()
            }
        }.build()

        return _CompareRemove!!
    }

@Suppress("ObjectPropertyName")
private var _CompareRemove: ImageVector? = null
