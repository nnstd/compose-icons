package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SizeXs: ImageVector
    get() {
        if (_SizeXs != null) {
            return _SizeXs!!
        }
        _SizeXs = ImageVector.Builder(
            name = "SizeXs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 7f)
                horizontalLineTo(8f)
                lineTo(9f, 9.5f)
                lineTo(10f, 7f)
                horizontalLineTo(12f)
                lineTo(10f, 12f)
                lineTo(12f, 17f)
                horizontalLineTo(10f)
                lineTo(9f, 14.5f)
                lineTo(8f, 17f)
                horizontalLineTo(6f)
                lineTo(8f, 12f)
                lineTo(6f, 7f)
                moveTo(15f, 7f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                curveTo(18.11f, 11f, 19f, 11.9f, 19f, 13f)
                verticalLineTo(15f)
                curveTo(19f, 16.11f, 18.11f, 17f, 17f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                curveTo(13.9f, 13f, 13f, 12.11f, 13f, 11f)
                verticalLineTo(9f)
                curveTo(13f, 7.9f, 13.9f, 7f, 15f, 7f)
                close()
            }
        }.build()

        return _SizeXs!!
    }

@Suppress("ObjectPropertyName")
private var _SizeXs: ImageVector? = null
