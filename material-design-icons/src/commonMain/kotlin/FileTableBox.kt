package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileTableBox: ImageVector
    get() {
        if (_FileTableBox != null) {
            return _FileTableBox!!
        }
        _FileTableBox = ImageVector.Builder(
            name = "FileTableBox",
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
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                moveTo(9f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                moveTo(9f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                moveTo(9f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                moveTo(13f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                moveTo(13f, 15f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                moveTo(13f, 12f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _FileTableBox!!
    }

@Suppress("ObjectPropertyName")
private var _FileTableBox: ImageVector? = null
