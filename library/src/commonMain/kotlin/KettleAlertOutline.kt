package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KettleAlertOutline: ImageVector
    get() {
        if (_KettleAlertOutline != null) {
            return _KettleAlertOutline!!
        }
        _KettleAlertOutline = ImageVector.Builder(
            name = "KettleAlertOutline",
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
                curveTo(11f, 8.5f, 7.4f, 8.6f, 4.6f, 10.4f)
                curveTo(4.2f, 10f, 4f, 9.5f, 4f, 9f)
                curveTo(4f, 7.2f, 6.5f, 5.7f, 9.5f, 5.7f)
                curveTo(10.9f, 5.7f, 12.3f, 6.1f, 13.3f, 6.7f)
                lineTo(15.3f, 4.7f)
                curveTo(13.6f, 3.5f, 11.6f, 3f, 9.5f, 3f)
                moveTo(9.5f, 11f)
                curveTo(13f, 11f, 16f, 14f, 16f, 16.5f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(16.5f)
                curveTo(3f, 14f, 6f, 11f, 9.5f, 11f)
                moveTo(10f, 12.5f)
                curveTo(7f, 12.5f, 5f, 14f, 5f, 17f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                curveTo(7f, 16f, 7f, 13.5f, 10f, 12.5f)
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

        return _KettleAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _KettleAlertOutline: ImageVector? = null
