package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KettleAlert: ImageVector
    get() {
        if (_KettleAlert != null) {
            return _KettleAlert!!
        }
        _KettleAlert = ImageVector.Builder(
            name = "KettleAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 3f)
                curveTo(4.8f, 3f, 1f, 5.7f, 1f, 9f)
                curveTo(1f, 10.2f, 1.5f, 11.3f, 2.4f, 12.3f)
                curveTo(1.5f, 13.5f, 1f, 15f, 1f, 16.5f)
                verticalLineTo(20f)
                curveTo(1f, 21.1f, 1.9f, 22f, 3f, 22f)
                horizontalLineTo(16f)
                curveTo(17.1f, 22f, 18f, 21.1f, 18f, 20f)
                verticalLineTo(16.5f)
                curveTo(18f, 15.3f, 17.7f, 14.1f, 17f, 13f)
                lineTo(19f, 11f)
                lineTo(16f, 8f)
                lineTo(13.9f, 10.1f)
                curveTo(12.6f, 9.4f, 11.1f, 9f, 9.5f, 9f)
                curveTo(7.7f, 9f, 5.9f, 9.5f, 4.6f, 10.4f)
                curveTo(4.2f, 10f, 4f, 9.5f, 4f, 9f)
                curveTo(4f, 7.2f, 6.5f, 5.8f, 9.5f, 5.8f)
                curveTo(10.9f, 5.8f, 12.3f, 6.1f, 13.3f, 6.7f)
                lineTo(15.3f, 4.7f)
                curveTo(13.8f, 3.6f, 11.7f, 3f, 9.5f, 3f)
                moveTo(9.5f, 11f)
                curveTo(9.8f, 11f, 10.2f, 11f, 10.5f, 11.1f)
                curveTo(7.4f, 11.6f, 5f, 14.2f, 5f, 17.5f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(17.5f)
                curveTo(3f, 13.9f, 5.9f, 11f, 9.5f, 11f)
                moveTo(21f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(23f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                moveTo(21f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(23f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _KettleAlert!!
    }

@Suppress("ObjectPropertyName")
private var _KettleAlert: ImageVector? = null
