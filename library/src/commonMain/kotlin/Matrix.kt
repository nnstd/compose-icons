package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Matrix: ImageVector
    get() {
        if (_Matrix != null) {
            return _Matrix!!
        }
        _Matrix = ImageVector.Builder(
            name = "Matrix",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                moveTo(20f, 4f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                moveTo(9f, 5f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                lineTo(8f, 6.5f)
                verticalLineTo(5.5f)
                lineTo(9f, 5f)
                moveTo(15f, 13f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                lineTo(14f, 14.5f)
                verticalLineTo(13.5f)
                lineTo(15f, 13f)
                moveTo(9f, 13f)
                curveTo(10.1f, 13f, 11f, 14.34f, 11f, 16f)
                curveTo(11f, 17.66f, 10.1f, 19f, 9f, 19f)
                curveTo(7.9f, 19f, 7f, 17.66f, 7f, 16f)
                curveTo(7f, 14.34f, 7.9f, 13f, 9f, 13f)
                moveTo(9f, 14f)
                curveTo(8.45f, 14f, 8f, 14.9f, 8f, 16f)
                curveTo(8f, 17.1f, 8.45f, 18f, 9f, 18f)
                curveTo(9.55f, 18f, 10f, 17.1f, 10f, 16f)
                curveTo(10f, 14.9f, 9.55f, 14f, 9f, 14f)
                moveTo(15f, 5f)
                curveTo(16.1f, 5f, 17f, 6.34f, 17f, 8f)
                curveTo(17f, 9.66f, 16.1f, 11f, 15f, 11f)
                curveTo(13.9f, 11f, 13f, 9.66f, 13f, 8f)
                curveTo(13f, 6.34f, 13.9f, 5f, 15f, 5f)
                moveTo(15f, 6f)
                curveTo(14.45f, 6f, 14f, 6.9f, 14f, 8f)
                curveTo(14f, 9.1f, 14.45f, 10f, 15f, 10f)
                curveTo(15.55f, 10f, 16f, 9.1f, 16f, 8f)
                curveTo(16f, 6.9f, 15.55f, 6f, 15f, 6f)
                close()
            }
        }.build()

        return _Matrix!!
    }

@Suppress("ObjectPropertyName")
private var _Matrix: ImageVector? = null
