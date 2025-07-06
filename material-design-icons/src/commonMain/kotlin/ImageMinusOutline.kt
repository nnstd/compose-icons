package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageMinusOutline: ImageVector
    get() {
        if (_ImageMinusOutline != null) {
            return _ImageMinusOutline!!
        }
        _ImageMinusOutline = ImageVector.Builder(
            name = "ImageMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.4f, 14.21f)
                curveTo(14.47f, 14.91f, 13.75f, 15.88f, 13.35f, 17f)
                horizontalLineTo(6.5f)
                lineTo(9.25f, 13.47f)
                lineTo(11.21f, 15.83f)
                lineTo(13.96f, 12.29f)
                lineTo(15.4f, 14.21f)
                moveTo(5f, 19f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                curveTo(19.7f, 13f, 20.37f, 13.13f, 21f, 13.35f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(13.35f)
                curveTo(13.13f, 20.37f, 13f, 19.7f, 13f, 19f)
                horizontalLineTo(5f)
                moveTo(15f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _ImageMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ImageMinusOutline: ImageVector? = null
