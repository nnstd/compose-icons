package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LabelMultiple: ImageVector
    get() {
        if (_LabelMultiple != null) {
            return _LabelMultiple!!
        }
        _LabelMultiple = ImageVector.Builder(
            name = "LabelMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 19f)
                horizontalLineTo(13f)
                lineTo(11f, 21f)
                horizontalLineTo(4f)
                curveTo(3.5f, 21f, 2.97f, 20.79f, 2.59f, 20.41f)
                curveTo(2.21f, 20.03f, 2f, 19.5f, 2f, 19f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                moveTo(17.63f, 5.84f)
                curveTo(17.27f, 5.33f, 16.67f, 5f, 16f, 5f)
                horizontalLineTo(8f)
                curveTo(6.9f, 5f, 6f, 5.9f, 6f, 7f)
                verticalLineTo(15f)
                curveTo(6f, 16.1f, 6.9f, 17f, 8f, 17f)
                horizontalLineTo(16f)
                curveTo(16.67f, 17f, 17.27f, 16.66f, 17.63f, 16.15f)
                lineTo(22f, 11f)
                lineTo(17.63f, 5.84f)
                close()
            }
        }.build()

        return _LabelMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _LabelMultiple: ImageVector? = null
