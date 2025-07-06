package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderKeyOutline: ImageVector
    get() {
        if (_FolderKeyOutline != null) {
            return _FolderKeyOutline!!
        }
        _FolderKeyOutline = ImageVector.Builder(
            name = "FolderKeyOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                moveTo(20f, 6f)
                horizontalLineTo(12f)
                lineTo(10f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.1f, 20f, 22f, 19.1f, 22f, 18f)
                verticalLineTo(8f)
                curveTo(22f, 6.9f, 21.1f, 6f, 20f, 6f)
                moveTo(12.8f, 12f)
                curveTo(12.4f, 10.8f, 11.3f, 10f, 10f, 10f)
                curveTo(8.3f, 10f, 7f, 11.3f, 7f, 13f)
                reflectiveCurveTo(8.3f, 16f, 10f, 16f)
                curveTo(11.3f, 16f, 12.4f, 15.2f, 12.8f, 14f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(12.8f)
                moveTo(10f, 14f)
                curveTo(9.4f, 14f, 9f, 13.6f, 9f, 13f)
                curveTo(9f, 12.4f, 9.4f, 12f, 10f, 12f)
                reflectiveCurveTo(11f, 12.4f, 11f, 13f)
                reflectiveCurveTo(10.6f, 14f, 10f, 14f)
                close()
            }
        }.build()

        return _FolderKeyOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderKeyOutline: ImageVector? = null
