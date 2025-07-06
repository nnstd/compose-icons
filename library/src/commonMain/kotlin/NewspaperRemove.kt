package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NewspaperRemove: ImageVector
    get() {
        if (_NewspaperRemove != null) {
            return _NewspaperRemove!!
        }
        _NewspaperRemove = ImageVector.Builder(
            name = "NewspaperRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.12f, 14.46f)
                lineTo(21.54f, 15.88f)
                lineTo(19.41f, 18f)
                lineTo(21.54f, 20.12f)
                lineTo(20.12f, 21.54f)
                lineTo(18f, 19.41f)
                lineTo(15.88f, 21.54f)
                lineTo(14.47f, 20.12f)
                lineTo(16.59f, 18f)
                lineTo(14.47f, 15.88f)
                lineTo(15.88f, 14.47f)
                lineTo(18f, 16.59f)
                lineTo(20.12f, 14.46f)
                moveTo(20.33f, 4.67f)
                lineTo(18.67f, 3f)
                lineTo(17f, 4.67f)
                lineTo(15.33f, 3f)
                lineTo(13.67f, 4.67f)
                lineTo(12f, 3f)
                lineTo(10.33f, 4.67f)
                lineTo(8.67f, 3f)
                lineTo(7f, 4.67f)
                lineTo(5.33f, 3f)
                lineTo(3.67f, 4.67f)
                lineTo(2f, 3f)
                verticalLineTo(19f)
                curveTo(2f, 20.11f, 2.9f, 21f, 4f, 21f)
                horizontalLineTo(12.8f)
                curveTo(12.29f, 20.12f, 12f, 19.09f, 12f, 18f)
                curveTo(12f, 16.77f, 12.37f, 15.63f, 13f, 14.68f)
                verticalLineTo(13f)
                horizontalLineTo(14.68f)
                curveTo(15.63f, 12.37f, 16.77f, 12f, 18f, 12f)
                curveTo(19.53f, 12f, 20.93f, 12.58f, 22f, 13.5f)
                verticalLineTo(3f)
                lineTo(20.33f, 4.67f)
                moveTo(11f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                moveTo(20f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _NewspaperRemove!!
    }

@Suppress("ObjectPropertyName")
private var _NewspaperRemove: ImageVector? = null
