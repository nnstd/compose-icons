package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileEdit: ImageVector
    get() {
        if (_FileEdit != null) {
            return _FileEdit!!
        }
        _FileEdit = ImageVector.Builder(
            name = "FileEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(10f)
                verticalLineTo(20.1f)
                lineTo(20f, 10.1f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                horizontalLineTo(6f)
                moveTo(13f, 3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(3.5f)
                moveTo(20.1f, 13f)
                curveTo(20f, 13f, 19.8f, 13.1f, 19.7f, 13.2f)
                lineTo(18.7f, 14.2f)
                lineTo(20.8f, 16.3f)
                lineTo(21.8f, 15.3f)
                curveTo(22f, 15.1f, 22f, 14.7f, 21.8f, 14.5f)
                lineTo(20.5f, 13.2f)
                curveTo(20.4f, 13.1f, 20.3f, 13f, 20.1f, 13f)
                moveTo(18.1f, 14.8f)
                lineTo(12f, 20.9f)
                verticalLineTo(23f)
                horizontalLineTo(14.1f)
                lineTo(20.2f, 16.9f)
                lineTo(18.1f, 14.8f)
                close()
            }
        }.build()

        return _FileEdit!!
    }

@Suppress("ObjectPropertyName")
private var _FileEdit: ImageVector? = null
