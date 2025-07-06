package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PowerPlugOffOutline: ImageVector
    get() {
        if (_PowerPlugOffOutline != null) {
            return _PowerPlugOffOutline!!
        }
        _PowerPlugOffOutline = ImageVector.Builder(
            name = "PowerPlugOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(6.25f, 8.14f)
                curveTo(6.1f, 8.41f, 6f, 8.7f, 6f, 9f)
                verticalLineTo(14.5f)
                lineTo(9.5f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(14.5f)
                verticalLineTo(18f)
                lineTo(15.31f, 17.2f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(13.09f, 16.59f)
                lineTo(12.67f, 17f)
                horizontalLineTo(11.33f)
                lineTo(10.92f, 16.59f)
                lineTo(8f, 13.67f)
                verticalLineTo(9.89f)
                lineTo(13.89f, 15.78f)
                lineTo(13.09f, 16.59f)
                moveTo(12.2f, 9f)
                lineTo(10.2f, 7f)
                horizontalLineTo(14f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                curveTo(17f, 7f, 18f, 8f, 18f, 9f)
                verticalLineTo(14.5f)
                lineTo(17.85f, 14.65f)
                lineTo(16f, 12.8f)
                verticalLineTo(9.09f)
                curveTo(16f, 9.06f, 15.95f, 9f, 15.92f, 9f)
                horizontalLineTo(12.2f)
                moveTo(10f, 6.8f)
                lineTo(8f, 4.8f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                verticalLineTo(6.8f)
                close()
            }
        }.build()

        return _PowerPlugOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PowerPlugOffOutline: ImageVector? = null
