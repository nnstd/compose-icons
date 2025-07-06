package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CornOff: ImageVector
    get() {
        if (_CornOff != null) {
            return _CornOff!!
        }
        _CornOff = ImageVector.Builder(
            name = "CornOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(7.2f, 9.1f)
                curveTo(7.1f, 9.7f, 7f, 10.3f, 7f, 11f)
                curveTo(5.5f, 10.4f, 3.8f, 10f, 2f, 10f)
                curveTo(7.9f, 12.6f, 6f, 22f, 12f, 22f)
                curveTo(14.5f, 22f, 15.7f, 20.5f, 16.6f, 18.5f)
                lineTo(20.9f, 22.8f)
                lineTo(22.1f, 21.5f)
                moveTo(8.1f, 10f)
                lineTo(9.1f, 11f)
                horizontalLineTo(8f)
                lineTo(8.1f, 10f)
                moveTo(8.8f, 12f)
                horizontalLineTo(10.1f)
                lineTo(11f, 12.9f)
                verticalLineTo(13.7f)
                curveTo(10.3f, 13.1f, 9.6f, 12.5f, 8.8f, 12f)
                moveTo(14.3f, 19.2f)
                curveTo(14.1f, 18f, 13.4f, 16.4f, 12.2f, 15f)
                horizontalLineTo(13.1f)
                lineTo(15.2f, 17.1f)
                curveTo(15f, 17.9f, 14.7f, 18.6f, 14.3f, 19.2f)
                moveTo(11f, 6f)
                verticalLineTo(7.8f)
                lineTo(12.2f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(12f)
                verticalLineTo(3f)
                curveTo(14.1f, 3f, 15.9f, 7f, 16f, 11.8f)
                verticalLineTo(12.8f)
                lineTo(18f, 14.8f)
                curveTo(18.8f, 12.8f, 19.9f, 10.9f, 22f, 10f)
                curveTo(20.2f, 10f, 18.5f, 10.4f, 17f, 11.1f)
                curveTo(16.8f, 5.9f, 14.7f, 2f, 12f, 2f)
                curveTo(10.5f, 2f, 9.2f, 3.2f, 8.3f, 5.1f)
                lineTo(9.2f, 6f)
                horizontalLineTo(11f)
                moveTo(11f, 3.3f)
                verticalLineTo(5f)
                horizontalLineTo(9.5f)
                curveTo(10f, 4.2f, 10.5f, 3.6f, 11f, 3.3f)
                moveTo(15f, 11.8f)
                lineTo(14.2f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(11.8f)
                close()
            }
        }.build()

        return _CornOff!!
    }

@Suppress("ObjectPropertyName")
private var _CornOff: ImageVector? = null
