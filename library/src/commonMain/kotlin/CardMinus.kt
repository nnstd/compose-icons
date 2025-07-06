package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardMinus: ImageVector
    get() {
        if (_CardMinus != null) {
            return _CardMinus!!
        }
        _CardMinus = ImageVector.Builder(
            name = "CardMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
                moveTo(19f, 13f)
                curveTo(20.09f, 13f, 21.12f, 13.3f, 22f, 13.81f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.11f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 19.67f, 13f, 19.34f, 13f, 19f)
                curveTo(13f, 15.69f, 15.69f, 13f, 19f, 13f)
                close()
            }
        }.build()

        return _CardMinus!!
    }

@Suppress("ObjectPropertyName")
private var _CardMinus: ImageVector? = null
