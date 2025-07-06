package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderKeyNetwork: ImageVector
    get() {
        if (_FolderKeyNetwork != null) {
            return _FolderKeyNetwork!!
        }
        _FolderKeyNetwork = ImageVector.Builder(
            name = "FolderKeyNetwork",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 5f)
                curveTo(4.9f, 5f, 4f, 5.9f, 4f, 7f)
                verticalLineTo(15f)
                curveTo(4f, 16.1f, 4.9f, 17f, 6f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                curveTo(9.4f, 19f, 9f, 19.4f, 9f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                curveTo(9f, 22.6f, 9.4f, 23f, 10f, 23f)
                horizontalLineTo(14f)
                curveTo(14.6f, 23f, 15f, 22.6f, 15f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                curveTo(15f, 19.4f, 14.6f, 19f, 14f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                curveTo(19.1f, 17f, 20f, 16.1f, 20f, 15f)
                verticalLineTo(9f)
                curveTo(20f, 7.9f, 19.1f, 7f, 18f, 7f)
                horizontalLineTo(12f)
                lineTo(10f, 5f)
                horizontalLineTo(6f)
                moveTo(9f, 9f)
                curveTo(10.3f, 9f, 11.4f, 9.8f, 11.8f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                horizontalLineTo(11.8f)
                curveTo(11.4f, 14.2f, 10.3f, 15f, 9f, 15f)
                curveTo(7.3f, 15f, 6f, 13.7f, 6f, 12f)
                reflectiveCurveTo(7.3f, 9f, 9f, 9f)
                moveTo(9f, 11f)
                curveTo(8.4f, 11f, 8f, 11.4f, 8f, 12f)
                curveTo(8f, 12.6f, 8.4f, 13f, 9f, 13f)
                curveTo(9.6f, 13f, 10f, 12.6f, 10f, 12f)
                reflectiveCurveTo(9.6f, 11f, 9f, 11f)
                close()
            }
        }.build()

        return _FolderKeyNetwork!!
    }

@Suppress("ObjectPropertyName")
private var _FolderKeyNetwork: ImageVector? = null
