package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderAccountOutline: ImageVector
    get() {
        if (_FolderAccountOutline != null) {
            return _FolderAccountOutline!!
        }
        _FolderAccountOutline = ImageVector.Builder(
            name = "FolderAccountOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 14f)
                curveTo(16.33f, 14f, 19f, 14.67f, 19f, 16f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                curveTo(11f, 14.67f, 13.67f, 14f, 15f, 14f)
                moveTo(15f, 13f)
                curveTo(16.11f, 13f, 17f, 12.11f, 17f, 11f)
                reflectiveCurveTo(16.11f, 9f, 15f, 9f)
                curveTo(13.9f, 9f, 13f, 9.89f, 13f, 11f)
                curveTo(13f, 12.11f, 13.9f, 13f, 15f, 13f)
                moveTo(22f, 8f)
                verticalLineTo(18f)
                curveTo(22f, 19.11f, 21.11f, 20f, 20f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.9f, 4f, 4f, 4f)
                horizontalLineTo(10f)
                lineTo(12f, 6f)
                horizontalLineTo(20f)
                curveTo(21.11f, 6f, 22f, 6.9f, 22f, 8f)
                moveTo(20f, 8f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _FolderAccountOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderAccountOutline: ImageVector? = null
