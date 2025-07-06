package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileCodeOutline: ImageVector
    get() {
        if (_FileCodeOutline != null) {
            return _FileCodeOutline!!
        }
        _FileCodeOutline = ImageVector.Builder(
            name = "FileCodeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.11f, 22f, 20f, 21.11f, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                moveTo(9.54f, 15.65f)
                lineTo(11.63f, 17.74f)
                lineTo(10.35f, 19f)
                lineTo(7f, 15.65f)
                lineTo(10.35f, 12.3f)
                lineTo(11.63f, 13.56f)
                lineTo(9.54f, 15.65f)
                moveTo(17f, 15.65f)
                lineTo(13.65f, 19f)
                lineTo(12.38f, 17.74f)
                lineTo(14.47f, 15.65f)
                lineTo(12.38f, 13.56f)
                lineTo(13.65f, 12.3f)
                lineTo(17f, 15.65f)
                close()
            }
        }.build()

        return _FileCodeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileCodeOutline: ImageVector? = null
