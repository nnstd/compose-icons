package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileImageMarker: ImageVector
    get() {
        if (_FileImageMarker != null) {
            return _FileImageMarker!!
        }
        _FileImageMarker = ImageVector.Builder(
            name = "FileImageMarker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 20f)
                lineTo(12f, 14f)
                lineTo(13.03f, 15.03f)
                curveTo(13.28f, 12.26f, 15.68f, 10f, 18.5f, 10f)
                curveTo(19f, 10f, 19.5f, 10.08f, 20f, 10.22f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.89f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(15.91f)
                curveTo(15.5f, 21.44f, 15f, 20.76f, 14.55f, 20f)
                horizontalLineTo(6f)
                moveTo(13f, 3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(3.5f)
                moveTo(8f, 9f)
                curveTo(9.11f, 9f, 10f, 9.9f, 10f, 11f)
                reflectiveCurveTo(9.11f, 13f, 8f, 13f)
                reflectiveCurveTo(6f, 12.11f, 6f, 11f)
                reflectiveCurveTo(6.9f, 9f, 8f, 9f)
                moveTo(18.5f, 12f)
                curveTo(16.6f, 12f, 15f, 13.6f, 15f, 15.5f)
                curveTo(15f, 18.1f, 18.5f, 22f, 18.5f, 22f)
                reflectiveCurveTo(22f, 18.1f, 22f, 15.5f)
                curveTo(22f, 13.6f, 20.4f, 12f, 18.5f, 12f)
                moveTo(18.5f, 16.8f)
                curveTo(17.8f, 16.8f, 17.3f, 16.2f, 17.3f, 15.6f)
                curveTo(17.3f, 14.9f, 17.9f, 14.4f, 18.5f, 14.4f)
                reflectiveCurveTo(19.7f, 15f, 19.7f, 15.6f)
                curveTo(19.8f, 16.2f, 19.2f, 16.8f, 18.5f, 16.8f)
                close()
            }
        }.build()

        return _FileImageMarker!!
    }

@Suppress("ObjectPropertyName")
private var _FileImageMarker: ImageVector? = null
