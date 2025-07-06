package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileTableBoxMultipleOutline: ImageVector
    get() {
        if (_FileTableBoxMultipleOutline != null) {
            return _FileTableBoxMultipleOutline!!
        }
        _FileTableBoxMultipleOutline = ImageVector.Builder(
            name = "FileTableBoxMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 5f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(23f)
                horizontalLineTo(3f)
                curveTo(1.9f, 23f, 1f, 22.1f, 1f, 21f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                moveTo(21f, 1f)
                horizontalLineTo(7f)
                curveTo(5.89f, 1f, 5f, 1.89f, 5f, 3f)
                verticalLineTo(17f)
                curveTo(5f, 18.1f, 5.9f, 19f, 7f, 19f)
                horizontalLineTo(21f)
                curveTo(22.11f, 19f, 23f, 18.11f, 23f, 17f)
                verticalLineTo(3f)
                curveTo(23f, 1.9f, 22.1f, 1f, 21f, 1f)
                moveTo(21f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                moveTo(11f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                moveTo(15f, 14f)
                horizontalLineTo(12f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                moveTo(11f, 11f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                moveTo(15f, 11f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                moveTo(11f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                moveTo(15f, 8f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _FileTableBoxMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileTableBoxMultipleOutline: ImageVector? = null
