package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileStarOutline: ImageVector
    get() {
        if (_FileStarOutline != null) {
            return _FileStarOutline!!
        }
        _FileStarOutline = ImageVector.Builder(
            name = "FileStarOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.1f, 22f, 20f, 21.1f, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                moveTo(9.5f, 18f)
                lineTo(10.2f, 15.2f)
                lineTo(8f, 13.3f)
                lineTo(10.9f, 13.1f)
                lineTo(12f, 10.4f)
                lineTo(13.1f, 13f)
                lineTo(16f, 13.2f)
                lineTo(13.8f, 15.1f)
                lineTo(14.5f, 17.9f)
                lineTo(12f, 16.5f)
                lineTo(9.5f, 18f)
                close()
            }
        }.build()

        return _FileStarOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileStarOutline: ImageVector? = null
