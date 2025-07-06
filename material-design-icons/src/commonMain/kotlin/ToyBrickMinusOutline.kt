package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ToyBrickMinusOutline: ImageVector
    get() {
        if (_ToyBrickMinusOutline != null) {
            return _ToyBrickMinusOutline!!
        }
        _ToyBrickMinusOutline = ImageVector.Builder(
            name = "ToyBrickMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.09f, 20f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                curveTo(5f, 3.9f, 5.9f, 3f, 7f, 3f)
                horizontalLineTo(9f)
                curveTo(10.11f, 3f, 11f, 3.9f, 11f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                curveTo(13f, 3.9f, 13.9f, 3f, 15f, 3f)
                horizontalLineTo(17f)
                curveTo(18.11f, 3f, 19f, 3.9f, 19f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                verticalLineTo(13.35f)
                curveTo(20.37f, 13.13f, 19.7f, 13f, 19f, 13f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 18.33f, 13f, 18.66f, 13f, 19f)
                reflectiveCurveTo(13.04f, 19.67f, 13.09f, 20f)
                moveTo(23f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _ToyBrickMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ToyBrickMinusOutline: ImageVector? = null
