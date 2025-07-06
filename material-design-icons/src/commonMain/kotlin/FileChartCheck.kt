package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileChartCheck: ImageVector
    get() {
        if (_FileChartCheck != null) {
            return _FileChartCheck!!
        }
        _FileChartCheck = ImageVector.Builder(
            name = "FileChartCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.5f, 17f)
                lineTo(18.5f, 22f)
                lineTo(15f, 18.5f)
                lineTo(16.5f, 17f)
                lineTo(18.5f, 19f)
                lineTo(22f, 15.5f)
                lineTo(23.5f, 17f)
                moveTo(6f, 2f)
                curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(13.8f)
                curveTo(13.3f, 21.1f, 13f, 20.1f, 13f, 19f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                curveTo(13f, 15.7f, 15.7f, 13f, 19f, 13f)
                curveTo(19.3f, 13f, 19.7f, 13f, 20f, 13.1f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                horizontalLineTo(6f)
                moveTo(13f, 3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(3.5f)
                moveTo(7f, 14f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _FileChartCheck!!
    }

@Suppress("ObjectPropertyName")
private var _FileChartCheck: ImageVector? = null
