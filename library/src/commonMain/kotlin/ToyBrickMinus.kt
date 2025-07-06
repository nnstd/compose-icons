package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ToyBrickMinus: ImageVector
    get() {
        if (_ToyBrickMinus != null) {
            return _ToyBrickMinus!!
        }
        _ToyBrickMinus = ImageVector.Builder(
            name = "ToyBrickMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
                verticalLineTo(20f)
                moveTo(13f, 19f)
                curveTo(13f, 15.69f, 15.69f, 13f, 19f, 13f)
                curveTo(19.7f, 13f, 20.37f, 13.13f, 21f, 13.35f)
                verticalLineTo(6f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                curveTo(19f, 3.9f, 18.11f, 3f, 17f, 3f)
                horizontalLineTo(15f)
                curveTo(13.9f, 3f, 13f, 3.9f, 13f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                curveTo(11f, 3.9f, 10.11f, 3f, 9f, 3f)
                horizontalLineTo(7f)
                curveTo(5.9f, 3f, 5f, 3.9f, 5f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 19.67f, 13f, 19.34f, 13f, 19f)
                close()
            }
        }.build()

        return _ToyBrickMinus!!
    }

@Suppress("ObjectPropertyName")
private var _ToyBrickMinus: ImageVector? = null
