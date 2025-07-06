package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Torch: ImageVector
    get() {
        if (_Torch != null) {
            return _Torch!!
        }
        _Torch = ImageVector.Builder(
            name = "Torch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.6f, 9.6f)
                curveTo(9f, 10.2f, 9.5f, 10.7f, 10.2f, 11f)
                horizontalLineTo(14.2f)
                curveTo(14.5f, 10.9f, 14.7f, 10.7f, 14.9f, 10.5f)
                curveTo(15.9f, 9.5f, 16.3f, 8f, 15.8f, 6.7f)
                lineTo(15.7f, 6.5f)
                curveTo(15.6f, 6.2f, 15.4f, 6f, 15.2f, 5.8f)
                curveTo(15.1f, 5.6f, 14.9f, 5.5f, 14.8f, 5.3f)
                curveTo(14.4f, 5f, 14f, 4.7f, 13.6f, 4.3f)
                curveTo(12.7f, 3.4f, 12.6f, 2f, 13.1f, 1f)
                curveTo(12.6f, 1.1f, 12.1f, 1.4f, 11.7f, 1.8f)
                curveTo(10.2f, 3f, 9.6f, 5.1f, 10.3f, 7f)
                verticalLineTo(7.2f)
                curveTo(10.3f, 7.3f, 10.2f, 7.4f, 10.1f, 7.5f)
                curveTo(10f, 7.6f, 9.8f, 7.5f, 9.7f, 7.4f)
                lineTo(9.6f, 7.3f)
                curveTo(9f, 6.5f, 8.9f, 5.3f, 9.3f, 4.3f)
                curveTo(8.4f, 5.1f, 7.9f, 6.4f, 8f, 7.7f)
                curveTo(8f, 8f, 8.1f, 8.3f, 8.2f, 8.6f)
                curveTo(8.2f, 8.9f, 8.4f, 9.3f, 8.6f, 9.6f)
                moveTo(12.3f, 8.1f)
                curveTo(12.4f, 7.6f, 12.2f, 7.2f, 12.1f, 6.8f)
                curveTo(12f, 6.4f, 12f, 6f, 12.2f, 5.6f)
                lineTo(12.5f, 6.2f)
                curveTo(12.9f, 6.8f, 13.6f, 7f, 13.8f, 7.8f)
                verticalLineTo(8.1f)
                curveTo(13.8f, 8.6f, 13.6f, 9.1f, 13.3f, 9.4f)
                curveTo(13.1f, 9.5f, 12.9f, 9.7f, 12.7f, 9.7f)
                curveTo(12.1f, 9.9f, 11.4f, 9.6f, 11f, 9.2f)
                curveTo(11.8f, 9.2f, 12.2f, 8.6f, 12.3f, 8.1f)
                moveTo(15f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                lineTo(13f, 22f)
                horizontalLineTo(11f)
                lineTo(10f, 14f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _Torch!!
    }

@Suppress("ObjectPropertyName")
private var _Torch: ImageVector? = null
