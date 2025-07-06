package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileLink: ImageVector
    get() {
        if (_FileLink != null) {
            return _FileLink!!
        }
        _FileLink = ImageVector.Builder(
            name = "FileLink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.89f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.11f, 22f, 20f, 21.11f, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(11f, 20f)
                horizontalLineTo(10f)
                curveTo(8.39f, 20f, 6f, 18.94f, 6f, 16f)
                curveTo(6f, 13.07f, 8.39f, 12f, 10f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                curveTo(9.54f, 14f, 8f, 14.17f, 8f, 16f)
                curveTo(8f, 17.9f, 9.67f, 18f, 10f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                moveTo(15f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                moveTo(14f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                curveTo(14.46f, 18f, 16f, 17.83f, 16f, 16f)
                curveTo(16f, 14.1f, 14.33f, 14f, 14f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                curveTo(15.61f, 12f, 18f, 13.07f, 18f, 16f)
                curveTo(18f, 18.94f, 15.61f, 20f, 14f, 20f)
                moveTo(13f, 9f)
                verticalLineTo(3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _FileLink!!
    }

@Suppress("ObjectPropertyName")
private var _FileLink: ImageVector? = null
