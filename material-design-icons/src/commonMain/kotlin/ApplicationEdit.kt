package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ApplicationEdit: ImageVector
    get() {
        if (_ApplicationEdit != null) {
            return _ApplicationEdit!!
        }
        _ApplicationEdit = ImageVector.Builder(
            name = "ApplicationEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 20.1f)
                lineTo(19.2f, 11.9f)
                curveTo(19.7f, 11.4f, 20.3f, 11.1f, 21f, 11.1f)
                curveTo(21.7f, 11.1f, 22.3f, 11.4f, 22.8f, 11.9f)
                lineTo(23f, 12.1f)
                verticalLineTo(4f)
                curveTo(23f, 2.9f, 22.1f, 2f, 21f, 2f)
                horizontalLineTo(3f)
                curveTo(1.9f, 2f, 1f, 2.9f, 1f, 4f)
                verticalLineTo(20f)
                curveTo(1f, 21.1f, 1.9f, 22f, 3f, 22f)
                horizontalLineTo(11f)
                verticalLineTo(20.1f)
                moveTo(3f, 4f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                moveTo(21f, 13.1f)
                curveTo(20.9f, 13.1f, 20.7f, 13.2f, 20.6f, 13.3f)
                lineTo(19.6f, 14.3f)
                lineTo(21.7f, 16.4f)
                lineTo(22.7f, 15.4f)
                curveTo(22.9f, 15.2f, 22.9f, 14.8f, 22.7f, 14.6f)
                lineTo(21.4f, 13.3f)
                curveTo(21.3f, 13.2f, 21.2f, 13.1f, 21f, 13.1f)
                moveTo(19.1f, 14.9f)
                lineTo(13f, 20.9f)
                verticalLineTo(23f)
                horizontalLineTo(15.1f)
                lineTo(21.2f, 16.9f)
                lineTo(19.1f, 14.9f)
                close()
            }
        }.build()

        return _ApplicationEdit!!
    }

@Suppress("ObjectPropertyName")
private var _ApplicationEdit: ImageVector? = null
