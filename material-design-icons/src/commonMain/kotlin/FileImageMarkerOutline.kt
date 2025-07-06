package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileImageMarkerOutline: ImageVector
    get() {
        if (_FileImageMarkerOutline != null) {
            return _FileImageMarkerOutline!!
        }
        _FileImageMarkerOutline = ImageVector.Builder(
            name = "FileImageMarkerOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 12f)
                curveTo(7.67f, 12f, 7f, 11.33f, 7f, 10.5f)
                reflectiveCurveTo(7.67f, 9f, 8.5f, 9f)
                reflectiveCurveTo(10f, 9.67f, 10f, 10.5f)
                reflectiveCurveTo(9.33f, 12f, 8.5f, 12f)
                moveTo(14f, 19f)
                curveTo(13.43f, 17.86f, 13f, 16.64f, 13f, 15.5f)
                curveTo(13f, 15.34f, 13f, 15.18f, 13.03f, 15.03f)
                lineTo(12f, 14f)
                lineTo(7f, 19f)
                horizontalLineTo(14f)
                moveTo(6f, 20f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(10.03f)
                curveTo(18.17f, 10f, 18.33f, 10f, 18.5f, 10f)
                curveTo(19f, 10f, 19.5f, 10.08f, 20f, 10.22f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(15.91f)
                curveTo(15.5f, 21.44f, 15f, 20.76f, 14.55f, 20f)
                horizontalLineTo(6f)
                moveTo(22f, 15.5f)
                curveTo(22f, 18.1f, 18.5f, 22f, 18.5f, 22f)
                reflectiveCurveTo(15f, 18.1f, 15f, 15.5f)
                curveTo(15f, 13.6f, 16.6f, 12f, 18.5f, 12f)
                reflectiveCurveTo(22f, 13.6f, 22f, 15.5f)
                moveTo(19.7f, 15.6f)
                curveTo(19.7f, 15f, 19.1f, 14.4f, 18.5f, 14.4f)
                reflectiveCurveTo(17.3f, 14.9f, 17.3f, 15.6f)
                curveTo(17.3f, 16.2f, 17.8f, 16.8f, 18.5f, 16.8f)
                reflectiveCurveTo(19.8f, 16.2f, 19.7f, 15.6f)
                close()
            }
        }.build()

        return _FileImageMarkerOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileImageMarkerOutline: ImageVector? = null
