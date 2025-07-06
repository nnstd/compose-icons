package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageCogOutline: ImageVector
    get() {
        if (_MessageCogOutline != null) {
            return _MessageCogOutline!!
        }
        _MessageCogOutline = ImageVector.Builder(
            name = "MessageCogOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(22f)
                lineTo(6f, 18f)
                horizontalLineTo(20f)
                curveTo(21.1f, 18f, 22f, 17.1f, 22f, 16f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                moveTo(20f, 16f)
                horizontalLineTo(5.2f)
                lineTo(4f, 17.2f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                moveTo(16.8f, 11.3f)
                lineTo(15.7f, 10.5f)
                verticalLineTo(10f)
                verticalLineTo(9.5f)
                lineTo(16.8f, 8.7f)
                curveTo(16.9f, 8.6f, 16.9f, 8.5f, 16.9f, 8.4f)
                lineTo(15.9f, 6.7f)
                curveTo(15.8f, 6.6f, 15.7f, 6.5f, 15.6f, 6.6f)
                lineTo(14.3f, 7f)
                curveTo(14f, 6.8f, 13.8f, 6.6f, 13.4f, 6.5f)
                lineTo(13.2f, 5.2f)
                curveTo(13.2f, 5.1f, 13.1f, 5f, 13f, 5f)
                horizontalLineTo(11f)
                curveTo(10.9f, 5f, 10.8f, 5.1f, 10.8f, 5.2f)
                lineTo(10.6f, 6.5f)
                curveTo(10.3f, 6.7f, 10f, 6.8f, 9.7f, 7f)
                lineTo(8.5f, 6.5f)
                curveTo(8.4f, 6.5f, 8.3f, 6.5f, 8.2f, 6.6f)
                lineTo(7.2f, 8.3f)
                curveTo(7.1f, 8.4f, 7.2f, 8.5f, 7.3f, 8.6f)
                lineTo(8.4f, 9.4f)
                verticalLineTo(10.4f)
                lineTo(7.3f, 11.2f)
                curveTo(7.2f, 11.3f, 7.2f, 11.4f, 7.2f, 11.5f)
                lineTo(8.2f, 13.2f)
                curveTo(8.3f, 13.3f, 8.4f, 13.4f, 8.5f, 13.3f)
                lineTo(9.7f, 13f)
                curveTo(10f, 13.2f, 10.2f, 13.4f, 10.5f, 13.5f)
                lineTo(10.7f, 14.8f)
                curveTo(10.7f, 14.9f, 10.8f, 15f, 11f, 15f)
                horizontalLineTo(13f)
                curveTo(13.1f, 15f, 13.2f, 14.9f, 13.2f, 14.8f)
                lineTo(13.4f, 13.5f)
                curveTo(13.7f, 13.4f, 14f, 13.2f, 14.2f, 13f)
                lineTo(15.4f, 13.5f)
                curveTo(15.5f, 13.5f, 15.6f, 13.5f, 15.7f, 13.4f)
                lineTo(16.7f, 11.7f)
                curveTo(16.9f, 11.5f, 16.9f, 11.4f, 16.8f, 11.3f)
                moveTo(12f, 11.5f)
                curveTo(11.2f, 11.5f, 10.5f, 10.8f, 10.5f, 10f)
                reflectiveCurveTo(11.2f, 8.5f, 12f, 8.5f)
                reflectiveCurveTo(13.5f, 9.2f, 13.5f, 10f)
                reflectiveCurveTo(12.8f, 11.5f, 12f, 11.5f)
                close()
            }
        }.build()

        return _MessageCogOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MessageCogOutline: ImageVector? = null
