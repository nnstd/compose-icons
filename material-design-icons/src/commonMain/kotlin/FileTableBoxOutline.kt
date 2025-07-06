package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileTableBoxOutline: ImageVector
    get() {
        if (_FileTableBoxOutline != null) {
            return _FileTableBoxOutline!!
        }
        _FileTableBoxOutline = ImageVector.Builder(
            name = "FileTableBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.11f, 3f, 19f, 3f)
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                moveTo(9f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                moveTo(13f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                moveTo(9f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                moveTo(13f, 15f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                moveTo(9f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                moveTo(13f, 12f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _FileTableBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileTableBoxOutline: ImageVector? = null
