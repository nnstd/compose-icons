package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PowerPlugOutline: ImageVector
    get() {
        if (_PowerPlugOutline != null) {
            return _PowerPlugOutline!!
        }
        _PowerPlugOutline = ImageVector.Builder(
            name = "PowerPlugOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 7f)
                verticalLineTo(3f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                curveTo(7f, 7f, 6f, 8f, 6f, 9f)
                verticalLineTo(14.5f)
                lineTo(9.5f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(14.5f)
                verticalLineTo(18f)
                lineTo(18f, 14.5f)
                verticalLineTo(9f)
                curveTo(18f, 8f, 17f, 7f, 16f, 7f)
                moveTo(16f, 13.67f)
                lineTo(13.09f, 16.59f)
                lineTo(12.67f, 17f)
                horizontalLineTo(11.33f)
                lineTo(10.92f, 16.59f)
                lineTo(8f, 13.67f)
                verticalLineTo(9.09f)
                curveTo(8f, 9.06f, 8.06f, 9f, 8.09f, 9f)
                horizontalLineTo(15.92f)
                curveTo(15.95f, 9f, 16f, 9.06f, 16f, 9.09f)
                verticalLineTo(13.67f)
                close()
            }
        }.build()

        return _PowerPlugOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PowerPlugOutline: ImageVector? = null
