package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardsPlayingDiamondOutline: ImageVector
    get() {
        if (_CardsPlayingDiamondOutline != null) {
            return _CardsPlayingDiamondOutline!!
        }
        _CardsPlayingDiamondOutline = ImageVector.Builder(
            name = "CardsPlayingDiamondOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 2f)
                horizontalLineTo(7f)
                curveTo(5.9f, 2f, 5f, 2.9f, 5f, 4f)
                verticalLineTo(20f)
                curveTo(5f, 21.1f, 5.9f, 22f, 7f, 22f)
                horizontalLineTo(17f)
                curveTo(18.1f, 22f, 19f, 21.1f, 19f, 20f)
                verticalLineTo(4f)
                curveTo(19f, 2.9f, 18.1f, 2f, 17f, 2f)
                moveTo(17f, 20f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                moveTo(12f, 7f)
                lineTo(9f, 12f)
                lineTo(12f, 17f)
                lineTo(15f, 12f)
                lineTo(12f, 7f)
                close()
            }
        }.build()

        return _CardsPlayingDiamondOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardsPlayingDiamondOutline: ImageVector? = null
