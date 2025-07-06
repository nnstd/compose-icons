package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileEditOutline: ImageVector
    get() {
        if (_FileEditOutline != null) {
            return _FileEditOutline!!
        }
        _FileEditOutline = ImageVector.Builder(
            name = "FileEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(12.1f)
                lineTo(20f, 10.1f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                moveTo(20.2f, 13f)
                curveTo(20.3f, 13f, 20.5f, 13.1f, 20.6f, 13.2f)
                lineTo(21.9f, 14.5f)
                curveTo(22.1f, 14.7f, 22.1f, 15.1f, 21.9f, 15.3f)
                lineTo(20.9f, 16.3f)
                lineTo(18.8f, 14.2f)
                lineTo(19.8f, 13.2f)
                curveTo(19.9f, 13.1f, 20f, 13f, 20.2f, 13f)
                moveTo(20.2f, 16.9f)
                lineTo(14.1f, 23f)
                horizontalLineTo(12f)
                verticalLineTo(20.9f)
                lineTo(18.1f, 14.8f)
                lineTo(20.2f, 16.9f)
                close()
            }
        }.build()

        return _FileEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileEditOutline: ImageVector? = null
