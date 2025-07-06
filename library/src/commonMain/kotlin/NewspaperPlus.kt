package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NewspaperPlus: ImageVector
    get() {
        if (_NewspaperPlus != null) {
            return _NewspaperPlus!!
        }
        _NewspaperPlus = ImageVector.Builder(
            name = "NewspaperPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 14f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                moveTo(20f, 11f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                moveTo(13f, 13f)
                verticalLineTo(14.68f)
                curveTo(12.37f, 15.63f, 12f, 16.77f, 12f, 18f)
                curveTo(12f, 19.09f, 12.29f, 20.12f, 12.8f, 21f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19f)
                verticalLineTo(3f)
                lineTo(3.67f, 4.67f)
                lineTo(5.33f, 3f)
                lineTo(7f, 4.67f)
                lineTo(8.67f, 3f)
                lineTo(10.33f, 4.67f)
                lineTo(12f, 3f)
                lineTo(13.67f, 4.67f)
                lineTo(15.33f, 3f)
                lineTo(17f, 4.67f)
                lineTo(18.67f, 3f)
                lineTo(20.33f, 4.67f)
                lineTo(22f, 3f)
                verticalLineTo(13.5f)
                curveTo(20.93f, 12.58f, 19.53f, 12f, 18f, 12f)
                curveTo(16.77f, 12f, 15.63f, 12.37f, 14.68f, 13f)
                horizontalLineTo(13f)
                moveTo(11f, 19f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _NewspaperPlus!!
    }

@Suppress("ObjectPropertyName")
private var _NewspaperPlus: ImageVector? = null
