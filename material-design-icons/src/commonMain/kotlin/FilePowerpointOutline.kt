package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilePowerpointOutline: ImageVector
    get() {
        if (_FilePowerpointOutline != null) {
            return _FilePowerpointOutline!!
        }
        _FilePowerpointOutline = ImageVector.Builder(
            name = "FilePowerpointOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.11f, 22f, 20f, 21.11f, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                moveTo(15.2f, 10.8f)
                curveTo(14.7f, 10.3f, 14.1f, 10f, 12.8f, 10f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(10.6f)
                verticalLineTo(15.7f)
                horizontalLineTo(12.8f)
                curveTo(14.1f, 15.7f, 14.6f, 15.5f, 15.2f, 15f)
                curveTo(15.8f, 14.5f, 16f, 13.8f, 16f, 12.9f)
                curveTo(16f, 12f, 15.8f, 11.4f, 15.2f, 10.8f)
                moveTo(13.9f, 14f)
                curveTo(13.6f, 14.3f, 13.3f, 14.5f, 12.7f, 14.5f)
                horizontalLineTo(10.6f)
                verticalLineTo(11.3f)
                horizontalLineTo(12.6f)
                curveTo(13.2f, 11.3f, 13.6f, 11.5f, 13.9f, 11.8f)
                curveTo(14.2f, 12.1f, 14.3f, 12.4f, 14.3f, 12.9f)
                reflectiveCurveTo(14.2f, 13.7f, 13.9f, 14f)
                close()
            }
        }.build()

        return _FilePowerpointOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FilePowerpointOutline: ImageVector? = null
