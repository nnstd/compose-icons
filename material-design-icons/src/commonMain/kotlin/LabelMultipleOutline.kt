package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LabelMultipleOutline: ImageVector
    get() {
        if (_LabelMultipleOutline != null) {
            return _LabelMultipleOutline!!
        }
        _LabelMultipleOutline = ImageVector.Builder(
            name = "LabelMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 18f)
                horizontalLineTo(13f)
                lineTo(11f, 20f)
                horizontalLineTo(4f)
                curveTo(3.5f, 20f, 2.97f, 19.79f, 2.59f, 19.41f)
                curveTo(2.21f, 19.03f, 2f, 18.5f, 2f, 18f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                moveTo(17.63f, 4.84f)
                curveTo(17.27f, 4.33f, 16.67f, 4f, 16f, 4f)
                horizontalLineTo(8f)
                curveTo(6.9f, 4f, 6f, 4.9f, 6f, 6f)
                verticalLineTo(14f)
                curveTo(6f, 15.1f, 6.9f, 16f, 8f, 16f)
                horizontalLineTo(16f)
                curveTo(16.67f, 16f, 17.27f, 15.66f, 17.63f, 15.15f)
                lineTo(22f, 10f)
                lineTo(17.63f, 4.84f)
                moveTo(16f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                lineTo(19.55f, 10f)
                close()
            }
        }.build()

        return _LabelMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LabelMultipleOutline: ImageVector? = null
