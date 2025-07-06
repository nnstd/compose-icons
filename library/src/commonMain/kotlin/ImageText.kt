package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageText: ImageVector
    get() {
        if (_ImageText != null) {
            return _ImageText!!
        }
        _ImageText = ImageVector.Builder(
            name = "ImageText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                moveTo(22f, 7f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                moveTo(14f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                moveTo(12f, 9f)
                verticalLineTo(15f)
                curveTo(12f, 16.1f, 11.1f, 17f, 10f, 17f)
                horizontalLineTo(4f)
                curveTo(2.9f, 17f, 2f, 16.1f, 2f, 15f)
                verticalLineTo(9f)
                curveTo(2f, 7.9f, 2.9f, 7f, 4f, 7f)
                horizontalLineTo(10f)
                curveTo(11.1f, 7f, 12f, 7.9f, 12f, 9f)
                moveTo(10.5f, 15f)
                lineTo(8.3f, 12f)
                lineTo(6.5f, 14.3f)
                lineTo(5.3f, 12.8f)
                lineTo(3.5f, 15f)
                horizontalLineTo(10.5f)
                close()
            }
        }.build()

        return _ImageText!!
    }

@Suppress("ObjectPropertyName")
private var _ImageText: ImageVector? = null
