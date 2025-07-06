package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KettleOffOutline: ImageVector
    get() {
        if (_KettleOffOutline != null) {
            return _KettleOffOutline!!
        }
        _KettleOffOutline = ImageVector.Builder(
            name = "KettleOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(4.7f, 6.6f)
                curveTo(4.3f, 7.3f, 4f, 8.1f, 4f, 9f)
                curveTo(4f, 10.2f, 4.5f, 11.3f, 5.4f, 12.3f)
                curveTo(4.5f, 13.5f, 4f, 15f, 4f, 16.5f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(19f)
                curveTo(19.3f, 22f, 19.6f, 21.9f, 19.9f, 21.8f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(8.2f, 10.1f)
                lineTo(7.6f, 10.4f)
                curveTo(7.2f, 10f, 7f, 9.5f, 7f, 9f)
                verticalLineTo(8.9f)
                lineTo(8.2f, 10.1f)
                moveTo(6f, 20f)
                verticalLineTo(16.5f)
                curveTo(6f, 14.7f, 7.6f, 12.6f, 9.7f, 11.6f)
                lineTo(10.9f, 12.8f)
                curveTo(9.1f, 13.4f, 8f, 14.8f, 8f, 17f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                curveTo(10f, 16.2f, 10f, 14.5f, 11.4f, 13.3f)
                lineTo(18.1f, 20f)
                horizontalLineTo(6f)
                moveTo(16.9f, 10.1f)
                lineTo(19f, 8f)
                lineTo(22f, 11f)
                lineTo(20f, 13f)
                curveTo(20.7f, 14.1f, 21f, 15.3f, 21f, 16.5f)
                verticalLineTo(17.8f)
                lineTo(18.9f, 15.7f)
                curveTo(18.5f, 13.9f, 16.8f, 12.1f, 14.6f, 11.4f)
                lineTo(12.2f, 9f)
                curveTo(13.8f, 8.9f, 15.4f, 9.3f, 16.9f, 10.1f)
                moveTo(9.5f, 6.3f)
                lineTo(7.4f, 4.2f)
                curveTo(8.8f, 3.5f, 10.6f, 3f, 12.5f, 3f)
                curveTo(14.6f, 3f, 16.6f, 3.5f, 18.3f, 4.7f)
                lineTo(16.3f, 6.7f)
                curveTo(15.3f, 6.1f, 13.9f, 5.7f, 12.5f, 5.7f)
                curveTo(11.4f, 5.7f, 10.3f, 5.9f, 9.5f, 6.3f)
                close()
            }
        }.build()

        return _KettleOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _KettleOffOutline: ImageVector? = null
