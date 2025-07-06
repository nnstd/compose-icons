package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileTableBoxMultiple: ImageVector
    get() {
        if (_FileTableBoxMultiple != null) {
            return _FileTableBoxMultiple!!
        }
        _FileTableBoxMultiple = ImageVector.Builder(
            name = "FileTableBoxMultiple",
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
                curveTo(5f, 18.11f, 5.9f, 19f, 7f, 19f)
                horizontalLineTo(21f)
                curveTo(22.11f, 19f, 23f, 18.11f, 23f, 17f)
                verticalLineTo(3f)
                curveTo(23f, 1.89f, 22.1f, 1f, 21f, 1f)
                moveTo(11f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                moveTo(11f, 13f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                moveTo(11f, 10f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                moveTo(15f, 16f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                moveTo(15f, 13f)
                horizontalLineTo(12f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                moveTo(15f, 10f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _FileTableBoxMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _FileTableBoxMultiple: ImageVector? = null
