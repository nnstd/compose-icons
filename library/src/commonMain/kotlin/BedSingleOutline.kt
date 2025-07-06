package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BedSingleOutline: ImageVector
    get() {
        if (_BedSingleOutline != null) {
            return _BedSingleOutline!!
        }
        _BedSingleOutline = ImageVector.Builder(
            name = "BedSingleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10f)
                verticalLineTo(7f)
                curveTo(17f, 5.9f, 16.11f, 5f, 15f, 5f)
                horizontalLineTo(9f)
                curveTo(7.9f, 5f, 7f, 5.9f, 7f, 7f)
                verticalLineTo(10f)
                curveTo(5.9f, 10f, 5f, 10.9f, 5f, 12f)
                verticalLineTo(17f)
                horizontalLineTo(6.33f)
                lineTo(7f, 19f)
                horizontalLineTo(8f)
                lineTo(8.67f, 17f)
                horizontalLineTo(15.33f)
                lineTo(16f, 19f)
                horizontalLineTo(17f)
                lineTo(17.67f, 17f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                curveTo(19f, 10.9f, 18.11f, 10f, 17f, 10f)
                moveTo(9f, 7f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                moveTo(17f, 15f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _BedSingleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BedSingleOutline: ImageVector? = null
