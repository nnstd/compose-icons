package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderKeyNetworkOutline: ImageVector
    get() {
        if (_FolderKeyNetworkOutline != null) {
            return _FolderKeyNetworkOutline!!
        }
        _FolderKeyNetworkOutline = ImageVector.Builder(
            name = "FolderKeyNetworkOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 8f)
                curveTo(7.3f, 8f, 6f, 9.3f, 6f, 11f)
                reflectiveCurveTo(7.3f, 14f, 9f, 14f)
                curveTo(10.3f, 14f, 11.4f, 13.2f, 11.8f, 12f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(11.8f)
                curveTo(11.4f, 8.8f, 10.3f, 8f, 9f, 8f)
                moveTo(9f, 12f)
                curveTo(8.4f, 12f, 8f, 11.6f, 8f, 11f)
                reflectiveCurveTo(8.4f, 10f, 9f, 10f)
                reflectiveCurveTo(10f, 10.4f, 10f, 11f)
                reflectiveCurveTo(9.6f, 12f, 9f, 12f)
                moveTo(15f, 20f)
                curveTo(15f, 19.5f, 14.6f, 19f, 14f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                curveTo(20.1f, 17f, 21f, 16.1f, 21f, 15f)
                verticalLineTo(7f)
                curveTo(21f, 5.9f, 20.1f, 5f, 19f, 5f)
                horizontalLineTo(13f)
                lineTo(11f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(15f)
                curveTo(3f, 16.1f, 3.9f, 17f, 5f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                curveTo(9.4f, 19f, 9f, 19.5f, 9f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                curveTo(9f, 22.5f, 9.4f, 23f, 10f, 23f)
                horizontalLineTo(14f)
                curveTo(14.6f, 23f, 15f, 22.5f, 15f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                moveTo(5f, 15f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _FolderKeyNetworkOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderKeyNetworkOutline: ImageVector? = null
